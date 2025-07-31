public class SalaryCalculator {
    private static final double BASE_MULTIPLIER = 1.00;
    private static final double PENALTY_MULTIPLIER = 0.85;
    private static final double BASE_SALARY = 1000.0;
    private static final double SALARY_CAP = 2000.0;
    private static final int PENALTY_THRESHOLD = 5;
    private static final int BONUS_THRESHOLD = 20;
    private static final int STANDARD_BONUS_RATE = 10;
    private static final int HIGH_BONUS_RATE = 13;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= PENALTY_THRESHOLD ? PENALTY_MULTIPLIER : BASE_MULTIPLIER;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= BONUS_THRESHOLD ? HIGH_BONUS_RATE : STANDARD_BONUS_RATE;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold), SALARY_CAP);
    }
}
