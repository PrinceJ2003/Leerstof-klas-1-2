import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void calculate_givenNull_returnZero()
    {
        int res=StringCalculator.calculate("");
        assertEquals(0,res);
    }

    @Test
    void calculate_givenNull_returnNumber()
    {
        int res=StringCalculator.calculate("13");
        assertEquals(13,res);
    }

    @Test
    void calculate_givenCommaSeparatedNumbers_returnSum() {
        assertEquals(3, StringCalculator.calculate("1,2"));
        assertEquals(30, StringCalculator.calculate("10,20"));
    }

    @Test
    void calculate_givenNewlineSeparatedNumbers_returnSum() {
        assertEquals(3, StringCalculator.calculate("1\n2"));
    }

    @Test
    void calculate_givenBothSeparatedNumbers_returnSum() {
        assertEquals(10, StringCalculator.calculate("1\n2,3\n4"));
    }




}