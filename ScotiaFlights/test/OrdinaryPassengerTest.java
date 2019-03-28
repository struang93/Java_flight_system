/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author struan
 */
public class OrdinaryPassengerTest {
    
    public OrdinaryPassengerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of GetName method, of class OrdinaryPassenger.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        String expResult = "";
        String result = instance.GetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEmail method, of class OrdinaryPassenger.
     */
    @Test
    public void testGetEmail() {
        System.out.println("GetEmail");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        String expResult = "";
        String result = instance.GetEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDiscount method, of class OrdinaryPassenger.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("GetDiscount");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        float expResult = 0.0F;
        float result = instance.GetDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayDetails method, of class OrdinaryPassenger.
     */
    @Test
    public void testDisplayDetails() {
        System.out.println("DisplayDetails");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        instance.DisplayDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnName method, of class OrdinaryPassenger.
     */
    @Test
    public void testReturnName() {
        System.out.println("ReturnName");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        String expResult = "";
        String result = instance.ReturnName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnEmail method, of class OrdinaryPassenger.
     */
    @Test
    public void testReturnEmail() {
        System.out.println("ReturnEmail");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        String expResult = "";
        String result = instance.ReturnEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnDiscount method, of class OrdinaryPassenger.
     */
    @Test
    public void testReturnDiscount() {
        System.out.println("ReturnDiscount");
        OrdinaryPassenger instance = new OrdinaryPassenger();
        float expResult = 0.0F;
        float result = instance.ReturnDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
