package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double tax = 0;
        if (salary <= 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println(salary * .85);
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary * .82);
        } else {
            System.out.println(salary * .8);
        }
    }
}
