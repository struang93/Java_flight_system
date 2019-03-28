package ScotiaFlights;
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
public class Seat {
    
    private int seatNo ;
    private Passenger occupier;
    private boolean status;
    private int type;
    private double cost;

   public Seat(int seatno){
       this.seatNo = seatNo;
	status = true;
	type=0;
	cost = 100.00;   
        
   }

  

    
   
   public void displaySeat(){
       if (status == true)
	{
		System.out.println("\nSeat "+seatNo+": Is Empty");
	}
	else
	{
		System.out.println("\nSeat "+seatNo+": ");
		occupier.DisplayDetails();
	}

   }
   
   public int returnSeatNo(){
       return seatNo;
    }
   
   public boolean returnStatus(){
       return status;   
   }
   
   public int returnType(){
       return type;   
   }
   
   public void setStatus(){
       status = false;
   }
   
   public void setType(int types){
       type = types;
   }
   
   public void setOccupier(Passenger x){
       occupier = x;
   }
   
   public void bookSeat(){
       int passengerType = 0;
       
       Scanner kboard = new Scanner(System.in);
       
       if(status==false){
           System.out.println("seat is reserved");
       }else{
           System.out.println("1. Business Passenger, 2. Island Passenger, 3. Ordinary Passenger");
           passengerType = kboard.nextInt();
           
           if(passengerType==1){
               Passenger business = new BusinessPassenger();
               occupier = business;
               status = false;
               type = 1;
           }if(passengerType==2){
               Passenger Island = new IslandPassenger();
               occupier = Island;
               status = false;
               type = 2;
           }if(passengerType==3){
               Passenger ordinary = new OrdinaryPassenger();
               occupier = ordinary;
               status = false;
               type = 3;
           }
       }
       
   }
   
   public void cancelSeat(){
       occupier = null;
       status = true;
   }
   
   public String returnName(){
       return occupier.ReturnName();
       
   }
   
   public String returnEmail(){
       return occupier.ReturnEmail();
       
   }

    String returnSeatnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String returnAccountNos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
