public class hour {
    public static void main(String[] args) {
        double maleSalary = calculateSalary("Male", 55);
        System.out.println("Male Salary for 55 hours :" + maleSalary);

        double femaleSalary = calculateSalary("Female", 68);
        System.out.println("Female Salary for  68 hours:" + femaleSalary);
    }

    private static double calculateSalary(String gender, int hoursWorked) {

        double maleHourlyRate = 400.00;
        double femaleHourlyRate = 300.00;

        double bonus1 = (gender.equals("Male")) ? 0.125 : 0.10; // 40 - 50
        double bonus2 = (gender.equals("Male")) ? 0.25 : 0.20; // 50 - 60
        double bonus3 = (gender.equals("Male")) ? 0.375 : 0.30; // 60 - 70 

        if (hoursWorked <= 40) {
            return hoursWorked * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate);
        } else if (hoursWorked <= 50) {
            return 40 * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate)
                    + (hoursWorked - 40) * (1 + bonus1) * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate);
        } else if (hoursWorked <= 60) {
            return 40 * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate)
                    + (hoursWorked - 40) * (1 + bonus2) * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate);
        } else {
            return 40 * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate)
                    + (hoursWorked - 40) * (1 + bonus3) * ((gender.equals("Male")) ? maleHourlyRate : femaleHourlyRate);
        }
    }
}
