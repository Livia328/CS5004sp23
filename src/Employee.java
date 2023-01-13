public class Employee {
    String name;
    String employeeID;
    double hours;
    double rate;

    public Employee(String name, String ID, double rate) {
        this.name = name;
        this.employeeID = ID;
        this.rate = rate;
        this.hours = 0;
    }

    public void addHoursWorked(double c) {
        hours += c;
        // however the total number of hours worked for the week cannot drop below 0.
        if(hours < 0)
            hours = 0;
    }

    public void resetHoursWorked(){
        hours = 0;
    }

    public double getHoursWorked(){
        return hours;
    }

    public Paycheck getWeeklyCheck() {
        return new Paycheck(rate, hours);
    }

    @Override
    public String toString() {
        String s = "Name: " + name + "\n";
        s += "ID: " + employeeID + "\n";
        Paycheck currentpay = getWeeklyCheck();
        s += currentpay.toString();
        return s;
    }
}
