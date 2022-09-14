//Dorin Tihon
public class Payroll {
    private int employeeID;
    private double grossPay;
    private double stateTax;
    private double federalTax;


    public Payroll() {
        employeeID = -1;
        grossPay = 0;
        stateTax = 0;
        federalTax = 0;
    }

    public Payroll(int id, double gross, double state, double federal ){
        employeeID = id;
        grossPay = gross;
        stateTax = state;
        federalTax = federal;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double calcStateTax(){
        return getGrossPay()/100 * getStateTax();
    }
    public double calcFederalTax(){
        return getGrossPay()/100 * getFederalTax();
    }
    public double calcNetPay(){
        grossPay = getGrossPay() - calcStateTax() - calcFederalTax();
        return grossPay;
    }

}
