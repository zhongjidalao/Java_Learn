package DaHuaPatterns.Strategy;

public class CashRebate extends CashSuper{
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
