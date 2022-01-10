package Coins;

class USD extends Coin{
    final double value = 3.52;

    @Override
    double getValue() {
        return value;
    }
    @Override
    public double calculate(double input){
        // Call getValue() method from calculate()
        getValue();
        return input * getValue();
    }
}
