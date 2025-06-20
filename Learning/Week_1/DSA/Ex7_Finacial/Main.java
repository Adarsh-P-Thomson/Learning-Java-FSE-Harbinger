package Learning.Week_1.DSA.Ex7_Finacial;

public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.05;   
        int years = 10;
        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value (recursive): $%.2f%n", futureValue);
        double optimizedValue = FinancialForecast.calculateFutureValueTail(presentValue, growthRate, years);
        System.out.printf("Future value (tail recursion): $%.2f%n", optimizedValue);
    }
}
