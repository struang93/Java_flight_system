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
public class BusinessPassenger extends Passenger {
    private String Company;
    
    
    public BusinessPassenger(){
        passengerName = this.GetName();
        passengerEmail = this.GetEmail();
        discount = this.GetDiscount();
        Company = this.GetCompany();
    }
    
    public BusinessPassenger(String name, String email, float idiscount, String company){
        passengerName = name;
        passengerEmail= email;
        discount = idiscount;
        Company = company;
    }
    
    public BusinessPassenger(String name, String email, String company){
        passengerName = name;
        passengerEmail = email;
        discount= this.GetDiscount();
        Company = company;
    }

    BusinessPassenger(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String GetName() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("enter passengers full name");
        passengerName = kboard.nextLine();
        return(passengerName);
    }

    @Override
    public String GetEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("enter passngers email");
        passengerEmail = kboard.nextLine();
        return(passengerEmail);
    }

    @Override
    public float GetDiscount() {
        discount = 0.1f;
        return discount;
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
        System.out.println("passengers name: "+passengerName);
        System.out.println("passengers email: "+passengerEmail);
        System.out.println("business of employment: "+Company);
        System.out.println("passenger discount"+discount);
    }

    private String GetCompany() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("enter company name");
        Company = kboard.nextLine();
        return Company;
    }
    
    public String returnBusiness() {

		return Company;
	}
    
}
