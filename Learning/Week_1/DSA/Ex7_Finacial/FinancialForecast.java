package Learning.Week_1.DSA.Ex7_Finacial;
public class FinancialForecast {
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
    }
    public static double calculateFutureValueTail(double presentValue, double rate, int years) {
        return helper(presentValue, rate, years);
    }
    private static double helper(double value, double rate, int years) {
        if (years == 0) return value;
        return helper(value * (1 + rate), rate, years - 1);
    }
}