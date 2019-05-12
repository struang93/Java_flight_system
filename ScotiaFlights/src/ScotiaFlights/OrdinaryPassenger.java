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
public class OrdinaryPassenger extends Passenger{
    private boolean promotion;
    
    OrdinaryPassenger() {
		passengerName = this.GetName();
		passengerEmail = this.GetEmail();
		discount = this.GetDiscount();
	}
    OrdinaryPassenger(String name, String email, float discount) {
		passengerName= name;
		passengerEmail = email;
		discount = discount;
                
	}

    OrdinaryPassenger(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


        public String GetName() {
		Scanner kboard = new Scanner(System.in);
		System.out.println("please enter passenger's full name");
		passengerName = kboard.nextLine();
		return (passengerName);

	}
        public String GetEmail(){
            Scanner kboard = new Scanner(System.in);
            System.out.println("please enter the passenger's email");
            passengerEmail=kboard.nextLine();
            return(passengerEmail);
        }
        
        public float GetDiscount(){
            int choice = 0;
            Scanner kboard = new Scanner(System.in);
            System.out.println("is there a promotion currently on 1. Yes 2. No");
            choice = kboard.nextInt();
           do{ 
              switch(choice){
                  case 1:
                      System.out.println("Enter the discount rate");
                      
                      
                      discount = kboard.nextInt();
              
              if (discount >= 100){
                  System.out.println("this is not a valid discount rate");
                  System.out.println("enter a valid discount rate");
                  discount = kboard.nextInt();
              }
              discount = discount / 100;
              promotion = true;
              return discount;
              
              case 2:
                  discount = 0;
                  promotion =false;
                  return discount;
                  
              default:
                  System.out.println("there is no discount");
                  break;
              }
              choice = kboard.nextInt();
            }     while (choice !=1 || choice != 2 );
           return discount;
        }  
       
        public void DisplayDetails(){
            System.out.println("Passengers name is: " +passengerName);
            System.out.println("Passengers email is: " +passengerEmail);
            System.out.println("Passengers discount is: " +discount);
        }
        
        public String ReturnName(){
            return passengerName;
        }
        
        public String ReturnEmail(){
            return passengerEmail;
        }
        
        public float ReturnDiscount(){
            return discount;
        }
        }