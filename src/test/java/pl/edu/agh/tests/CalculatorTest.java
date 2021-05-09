package pl.edu.agh.tests;

import com.airhacks.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldEqualsWIthCorrectSum() {
        int a = 5;
        int b = 6;
        int correctSum = 11;
        Assert.assertEquals(calculator.sum(a,b), correctSum);
    }

    @Test
    public void shouldNotEqualsWithWrongSum() {
        int a = 5;
        int b = 6;
        int wrongSum = 13;
        Assert.assertNotEquals(calculator.sum(a,b), wrongSum);
    }

}
