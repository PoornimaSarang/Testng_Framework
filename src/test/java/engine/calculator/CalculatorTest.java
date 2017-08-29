package engine.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator test= new Calculator();

    @Test (groups = {"smoke1"})
    public void addTest(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test (groups = {"smoke"})
    public void addTest1(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test (groups = {"smoke"})
    public void addTest2(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }
}