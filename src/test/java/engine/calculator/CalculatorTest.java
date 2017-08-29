package engine.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator test= new Calculator();
    @DataProvider(name = "rangeWith2DArray")
    public Object[][] rangeCalculator() {
        return new Object[][]{
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 18},
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17}

        };
    }

    @Test (groups = {"smoke1"},dataProvider = "rangeWith2DArray")
    public void addTest(int num1, int num2, int validate){
        int addValue = test.addition(num1, num2);
        Assert.assertEquals(validate, addValue);
    }

    @DataProvider(name = "rangeWith2DArray1")
    public Object[][] rangeCalculator1() {
        return test.getData();
    }
    @Test (groups = {"smoke"},dataProvider = "rangeWith2DArray1")
    public void addTest1(int num1, int num2, int validate)
    {
        int addValue = test.addition(num1, num2);
        Assert.assertEquals(validate, addValue);
    }

    @Test (groups = {"smoke"},dataProvider = "rangeWith2DArray1")
    public void addTest2(int num1, int num2, int validate)
    {
        int addValue = test.addition(num1, num2);
        Assert.assertEquals(validate, addValue);
    }
}