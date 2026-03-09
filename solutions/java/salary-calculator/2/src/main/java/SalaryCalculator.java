public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {

        return daysSkipped >= 5 ? .85 : 1;
    }

    public int bonusMultiplier(int productsSold) {

        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {

        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double BASE_SALARY = 1000;
        double ADJ__SALARY = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        double SALARY_CAP = 2000;

        return ADJ__SALARY > SALARY_CAP ? SALARY_CAP : ADJ__SALARY;
    }
}
