package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
@Test
    void testAdd()
    {
        Calculator myCalc = new Calculator();
        int result = myCalc.add(9,50);
        assertEquals(60,result, 0);
    }

}
