package Pamoka03;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }
    protected int sum() {
        return firstNumber + secondNumber;
    }
    protected int atimtis() {
        return firstNumber - secondNumber;
    }
    protected double dalyba() {
        return firstNumber / secondNumber;
    }
    protected double daugyba() {
        return firstNumber * secondNumber;
    }
    protected double laipsnis() {
        return Math.pow(firstNumber,  secondNumber);
    }
}
