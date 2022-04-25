package application;

import java.util.HashMap;
import java.util.Map;

public class SavingsCalculatorLogic {
    private int yearsOfSaving;
    private double yearlyInterestRate;
    private double monthlySavings;
    private Map<Integer, Double> yearlySavings;

    public SavingsCalculatorLogic(double yearlyInterestRate) {
        this.yearsOfSaving = 30;
        this.yearlyInterestRate = 1 + yearlyInterestRate / 100;
        this.monthlySavings = 50;
        this.yearlySavings = new HashMap<>();
    }

    public SavingsCalculatorLogic() {
        this.yearsOfSaving = 30;
        this.yearlyInterestRate = 1;
        this.monthlySavings = 50;
        this.yearlySavings = new HashMap<>();
    }

    public Map<Integer, Double> calculateSavingsAfterAYears() {
        double sumOfSavings = 0.0;
        yearlySavings.put(0, 0.0);
        System.out.println(yearlyInterestRate);
        for (int year = 1; year <= yearsOfSaving; year++) {
            sumOfSavings = (sumOfSavings + 12 * monthlySavings) * yearlyInterestRate;
            yearlySavings.put(year, sumOfSavings);
        }
        return yearlySavings;
    }

    public Map<Integer, Double> getYearlySavings() {
        return yearlySavings;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public int getYearsOfSaving() {
        return yearsOfSaving;
    }

    public void setYearlyInterestRate(double yearlyInterestRate) {
        this.yearlyInterestRate = 1 + yearlyInterestRate / 100;
    }

    public void setYearsOfSaving(int yearsOfSaving) {
        this.yearsOfSaving = yearsOfSaving;
    }

    public void printSavings() {
        for (Integer key : yearlySavings.keySet()) {
            System.out.println(yearlySavings.get(key));
        }
    }
}
