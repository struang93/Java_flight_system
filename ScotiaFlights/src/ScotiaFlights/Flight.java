package ScotiaFlights;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author struan
 */

public class Flight 
{
private final int nosSeats = 16;	
private String flightnos;
private Seat Seats[] = new Seat[nosSeats];

public Flight(String nos)
{
	flightnos = nos;
	
	Seat S1 = new Seat(1);
	Seat S2 = new Seat(2);
	Seat S3 = new Seat(3);
	Seat S4 = new Seat(4);
	Seat S5 = new Seat(5);
	Seat S6 = new Seat(6);
	Seat S7 = new Seat(7);
	Seat S8 = new Seat(8);
	
	Seats[0] = S1;
	Seats[1] = S2;
	Seats[2] = S3;
	Seats[3] = S4;
	Seats[4] = S5;
	Seats[5] = S6;
	Seats[6] = S7;
	Seats[7] = S8;
}

public void displayCarriage()
{
	System.out.println("Flight "+flightnos);
	for (int i=0; i<4; i++)
	{
		Seats[i].displaySeat();
	}
}

public void bookSeat()
{
	int Seatnos;
	Scanner kboard = new Scanner(System.in);
	System.out.println("Please enter Seat number (1-"+nosSeats+")");
	Seatnos=kboard.nextInt();
	Seats[Seatnos-1].bookSeat();
}

public void cancelSeat()
{
	int Seatnos;
	Scanner kboard = new Scanner(System.in);
	System.out.println("Please enter Seat number (1-"+nosSeats+")");
	Seatnos=kboard.nextInt();
	Seats[Seatnos-1].cancelSeat();
	System.out.println("Seat Cancelled");
}

public void deleteExistingBookings()
{
	//ResultSet rs = null;
    Connection connection = null;
    Statement statement = null; 
    String query="";	
    query = "delete from flight where flightnos = '"+flightnos+"'";
    try {           
        connection = JDBCMySQLConnection.getConnection();
        statement = connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("File cleared");
 		} catch (SQLException e) 
 	{
	 e.printStackTrace();
 	} 
    
}

public void saveToFile()
{
	//ResultSet rs = null;
    Connection connection = null;
    Statement statement = null; 
    String query="";
    
    this.deleteExistingBookings();
    
    for (int x=0;x<nosSeats;x++)
    {
    	if (Seats[x].returnStatus()==true)
    	{
    	query = "insert into flight(flightnos,Seatnos,status) values ('"+flightnos+"',"+Seats[x].returnSeatnos()+","+Seats[x].returnStatus()+")";
     	}//end if
    	else
    	{
    		if (Seats[x].returnType()==2) //transfers info if 2nd class or 1st class
    		{
    	 	query = "insert into flight(flightnos,Seatnos,status,passengertype,passengername,passengeremail) values ('"+flightnos+"',"+Seats[x].returnSeatnos()+","+Seats[x].returnStatus()+","+2+",'"+Seats[x].returnName()+"','"+Seats[x].returnEmail()+"')";
    		}
    		else
    		{
    	 	query = "insert into flight(flightnos,Seatnos,status,passengertype,passengername,passengeremail) values ('"+flightnos+"',"+Seats[x].returnSeatnos()+","+Seats[x].returnStatus()+","+1+",'"+Seats[x].returnName()+"','"+Seats[x].returnEmail()+"')";
    		}
    	}
    	try {           
            connection = JDBCMySQLConnection.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Added Seat"+Seats[x].returnSeatnos());
     		} catch (SQLException e) 
     	{
    	 e.printStackTrace();
     	} 
    }//end for
}

public void retrieveFromFile()
{
	ResultSet rs = null;
    Connection connection = null;
    Statement statement = null;
    String query="";
   // int loopcounter = 0;
    
    query = "select * from train where flightnos = '"+flightnos+"'";
    
    try {           
        connection = JDBCMySQLConnection.getConnection();
        statement = connection.createStatement();
        rs = statement.executeQuery(query);
        
        //adding each record back into the data structures
        while (rs.next())
        {
        	if (rs.getBoolean("status")==true)
        	{
        		//do nothing because object already created in constructor 
        	}
        	else
        	{
        		if (rs.getInt("passengertype")==1)
        		{
        		Passenger business = new BusinessPassenger(rs.getString("passengerName"),rs.getString("passengerEmail"));
        		Seats[rs.getInt("Seatnos")-1].setOccupier(business);
        		Seats[rs.getInt("Seatnos")-1].setType(1);
        		Seats[rs.getInt("Seatnos")-1].setStatus();
          		}
        		if (rs.getInt("passengertype")==2)
        		{
            		Passenger ordinary = new OrdinaryPassenger(rs.getString("passengerName"),rs.getString("passengerEmail"));
            		Seats[rs.getInt("Seatnos")-1].setOccupier(ordinary);
            		Seats[rs.getInt("Seatnos")-1].setType(2);
            		Seats[rs.getInt("Seatnos")-1].setStatus();
              	}
          	} // end of outer if - Passenger exists
        }
        System.out.println("File Retrieved");
 		} catch (SQLException e) 
 	{
	 e.printStackTrace();
 	} 
 }


public void menu()
{
	int choice=0;
	Scanner kboard = new Scanner(System.in);
	this.retrieveFromFile();
	System.out.println("1. Display Seat, 2. Book Seat, 3. Cancel Seat, 6. Exit");
	choice = kboard.nextInt();
	while (choice != 6)
	{
		switch(choice)
		{
		case 1: this.displayCarriage();	break;
		case 2: this.bookSeat(); 		break;
		case 3: this.cancelSeat();		break;
		//case 4:	this.saveToFile();		break;
		//case 5: this.retrieveFromFile();break;
		}
		System.out.println("1. Display Seat, 2. Book Seat, 3. Cancel Seat, 6. Exit");
		choice = kboard.nextInt();
	}
	this.saveToFile();
} // end method

}

