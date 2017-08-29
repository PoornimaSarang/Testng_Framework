package engine.calculator;

public class Calculator {

    public String sayHello(){
        return "Hello";
    }

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public Object[][] getData(){
        return new Object[][]{
                {1, 2, 3},
                {4, 6, 10},
                {7, 10, 17}
        };
    }
}
