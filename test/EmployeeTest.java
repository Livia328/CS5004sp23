import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * a unit test for employee class
 */
public class EmployeeTest {
    private Employee p1;
    @Before
    public void setUp() {
        p1 = new Employee("Livia","1001",1.0d);
    }
    @Test
    public void testAddHoursWorked() {
        //nomal test case
        p1.addHoursWorked(4.0);
        assertEquals(4.0, p1.hours, 0.01);
        //edge test case
    }

    @Test
    public void testResetHoursWorked() {
        p1.resetHoursWorked();
        //nomal test case
        assertEquals(0.0, p1.hours, 0.01);
    }

    @Test
    public void testGetHoursWorked() {
        assertEquals(0.0, p1.getHoursWorked(), 0.01);
        p1.addHoursWorked(5.0);
        assertEquals(5.0, p1.getHoursWorked(), 0.01);
    }

    @Test
    public void testToString() {
        String s1 = "Name: Livia\nID: 1001\nPayment after taxes: $ 0.00";
        String s2 = p1.toString();
        assertEquals(s1, s2);
    }
}
