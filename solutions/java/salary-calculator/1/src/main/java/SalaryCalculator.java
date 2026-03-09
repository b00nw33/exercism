public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        // throw new UnsupportedOperationException("Please implement the
        // SalaryCalculator.salaryMultiplier() method");

        return daysSkipped >= 5 ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the
        // SalaryCalculator.bonusMultiplier() method");

        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the
        // SalaryCalculator.bonusForProductsSold() method");

        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        // throw new UnsupportedOperationException("Please implement the
        // SalaryCalculator.finalSalary() method");

        double BASE_SALARY = 1000;
        double ADJ__SALARY = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return ADJ__SALARY > 2000 ? 2000 : ADJ__SALARY;
    }
}
