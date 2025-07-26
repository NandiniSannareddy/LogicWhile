import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.next();

        System.out.print("Enter customer id: ");
        String id = sc.next();

        System.out.print("Enter no.of unit's consumed: ");
        double units = sc.nextDouble();

        double basebill = 0;

        if (units > 0 && units <= 100) {
            basebill = units * 1.50;
        } else if (units > 100 && units <= 200) {
            basebill = 100 * 1.50 + (units - 100) * 2.00;
        } else if (units > 200 && units <= 300) {
            basebill = 100 * 1.50 + 100 * 2.00 + (units - 200) * 3.00;
        } else {
            basebill = 100 * 1.50 + 100 * 2.00 + 100 * 3.00 + (units - 300) * 5.00;
        }

        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);

        double bill = basebill;

        double gst = (basebill) * 5 / 100.00;
        double service = 25.0;

        bill += gst + service;

        System.out.println("Base Bill: " + bill);
        System.out.println("GST (5 percent): " + gst);
        System.out.println("Service Charge: " + service);

        double discount = 0;

        if (bill > 500) {
            discount = basebill * (0.05);
        }

        System.out.println("Discount: " + discount);

        bill -= discount;

        System.out.println("Total Bill: " + bill);
    }
}
