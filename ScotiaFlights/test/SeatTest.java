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
public class SeatTest {
    
    public SeatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of displaySeat method, of class Seat.
     */
    @Test
    public void testDisplaySeat() {
        System.out.println("displaySeat");
        Seat instance = null;
        instance.displaySeat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnSeatNo method, of class Seat.
     */
    @Test
    public void testReturnSeatNo() {
        System.out.println("returnSeatNo");
        Seat instance = null;
        int expResult = 0;
        int result = instance.returnSeatNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnStatus method, of class Seat.
     */
    @Test
    public void testReturnStatus() {
        System.out.println("returnStatus");
        Seat instance = null;
        boolean expResult = false;
        boolean result = instance.returnStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnType method, of class Seat.
     */
    @Test
    public void testReturnType() {
        System.out.println("returnType");
        Seat instance = null;
        int expResult = 0;
        int result = instance.returnType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStaus method, of class Seat.
     */
    @Test
    public void testSetStaus() {
        System.out.println("setStaus");
        Seat instance = null;
        instance.setStaus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Seat.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        int types = 0;
        Seat instance = null;
        instance.setType(types);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupier method, of class Seat.
     */
    @Test
    public void testSetOccupier() {
        System.out.println("setOccupier");
        Passenger x = null;
        Seat instance = null;
        instance.setOccupier(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookSeat method, of class Seat.
     */
    @Test
    public void testBookSeat() {
        System.out.println("bookSeat");
        Seat instance = null;
        instance.bookSeat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelSeat method, of class Seat.
     */
    @Test
    public void testCancelSeat() {
        System.out.println("cancelSeat");
        Seat instance = null;
        instance.cancelSeat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnName method, of class Seat.
     */
    @Test
    public void testReturnName() {
        System.out.println("returnName");
        Seat instance = null;
        String expResult = "";
        String result = instance.returnName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnEmail method, of class Seat.
     */
    @Test
    public void testReturnEmail() {
        System.out.println("returnEmail");
        Seat instance = null;
        String expResult = "";
        String result = instance.returnEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
