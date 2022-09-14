//Dorin Tihon

//import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        int ID = -1;
        Scanner scnr = new Scanner(System.in);

        while (ID != 0) {
            System.out.println("Enter employee's ID:");
            ID = scnr.nextInt();
            if(ID == 0 ){
                break;
            }
            System.out.println("Enter gross pay:");
            double gross = scnr.nextDouble();
            System.out.println("Enter state tax:");
            double state = scnr.nextDouble();
            if (state < 0){
                System.out.println("You entered a negative value, " +
                        "enter a positive value:");
                state = scnr.nextDouble();
            }
            System.out.println("Enter federal tax:");
            double federal = scnr.nextDouble();
            if (federal < 0){
                System.out.println("You entered a negative value, " +
                        "enter a positive value:");
                federal = scnr.nextDouble();
            }
            Payroll employee = new Payroll(ID, gross, state, federal);


            double netPay = employee.calcNetPay();
            if(netPay < 0){
                System.out.println("ERROR: You got a negative value for net pay");
                System.out.println("Please try again");
                System.out.println("");
               continue;
            }
            System.out.println("ID: " + employee.getEmployeeID());
            System.out.println("Net pay: " + employee.getGrossPay());
            System.out.println("");
        }


    }
}
