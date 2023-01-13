import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * a unit test for Paycheck class
 */
public class PaycheckTest {
    private Employee p2;
    @Before
    public void setUp() {
        p2 = new Employee("Livia","1001",1.0d);
    }
    @Test
    public void testGetTotalPay() {
        //edge case test
        p2.addHoursWorked(40.0);
        Paycheck paycheck2 = p2.getWeeklyCheck();
        double p2TotalPay = paycheck2.getTotalPay();
        assertEquals(40.0, p2TotalPay,0.01);
        //nomal case
        p2.addHoursWorked(2.0);
        paycheck2 = p2.getWeeklyCheck();
        p2TotalPay = paycheck2.getTotalPay();
        assertEquals(43.0, p2TotalPay,0.01);
    }

    @Test
    public void testGetPayAfterTaxes() {
        p2.addHoursWorked(40.0);
        Paycheck paycheck2 = p2.getWeeklyCheck();
        double p2TotalPay = paycheck2.getPayAfterTaxes();
        assertEquals(36.0, p2TotalPay,0.01);
    }

    @Test
    public void testToString() {
        p2.addHoursWorked(40.0);
        Paycheck paycheck2 = p2.getWeeklyCheck();
        String s1 = "Payment after taxes: $ 36.00";
        String s2 = paycheck2.toString();
        assertEquals(s1,s2);
    }
}
