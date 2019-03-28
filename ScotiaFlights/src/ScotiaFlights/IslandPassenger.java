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
public class IslandPassenger extends Passenger {
    private String Island;
    
    public IslandPassenger(){
        passengerName = this.GetName();
        passengerEmail = this.GetEmail();
        discount = this.GetDiscount();
        Island = this.GetIsland();
    }
    
        public IslandPassenger(String name, String email, String islandname ){
        passengerName = name;
        passengerEmail = email;
        discount = this.GetDiscount();
        Island = Island;
    }
    
    public IslandPassenger(String name, String email, float idiscount, String Island){
        passengerName = name;
        passengerEmail = email;
        discount = idiscount;
    }
    

    @Override
    public String GetName() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("please enter passengers full name");
        passengerName = kboard.nextLine();
        return (passengerName);
    }

    @Override
    public String GetEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("please enter passengers email");
        passengerEmail = kboard.nextLine();
        return(passengerEmail);
    }

    @Override
    public float GetDiscount() {
        discount = 0.25f;
        return discount;
    }
    
    
    public String GetIsland(){
        Scanner kboard = new Scanner (System.in);
        System.out.println("enter island name");
        Island = kboard.nextLine();
        return (Island);
    }

    @Override
    public String ReturnName() {
        return passengerName;
    }

    @Override
    public String ReturnEmail() {
        return passengerEmail;
    }

    @Override
    public float ReturnDiscount() {
        return discount;
    }

    @Override
    public void DisplayDetails() {
        System.out.println("passengers name is: "+passengerName);
        System.out.println("pasengers email is: "+passengerEmail);
        System.out.println("island or residence:"+Island);
        System.out.println("passengers dicount: "+discount);
    }
    
    	public String returnIsland() {
		
		return Island;
	}
}
