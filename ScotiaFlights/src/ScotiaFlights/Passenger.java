package ScotiaFlights;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author struan
 */
public abstract class Passenger {
    protected String passengerName;
    protected String passengerEmail;
    protected float discount;
    
    abstract public String GetName();
    abstract public String GetEmail();
    abstract public float GetDiscount();
    abstract public String ReturnName();
    abstract public String ReturnEmail();
    abstract public float ReturnDiscount();
    abstract public void DisplayDetails();
}
