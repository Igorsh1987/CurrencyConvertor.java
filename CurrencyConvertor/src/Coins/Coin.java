package Coins;

public abstract class Coin implements ICalculate {
    public double calculate(double value) {
        return value;
    }

    abstract double getValue();
}
