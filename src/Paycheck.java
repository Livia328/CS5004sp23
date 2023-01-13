public class Paycheck {
    double rate;
    double hours;

    public Paycheck(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public double getTotalPay() {
        if (hours <= 40) {
            return rate * hours;
        } else {
            return rate * 40 + (hours - 40) * rate * 1.5;
        }
    }

    public double getPayAfterTaxes(){
        double totalPay = getTotalPay();
        if (totalPay < 400) {
            return totalPay * 0.9;
        } else {
            return totalPay * 0.85;
        }
    }

    @Override
    public String toString() {
        double payAfter = getPayAfterTaxes();
        String s = "Payment after taxes: $ ";
        String num = String.format("%.2f", payAfter);
        s = s + num;
        return s;
    }
}
