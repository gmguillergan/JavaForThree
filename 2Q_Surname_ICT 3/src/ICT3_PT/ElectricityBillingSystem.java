package ICT3_PT;
import java.util.Scanner;

/*
 * ---------------------------------------------------------
 * Subject:     Computer Programming
 * Class:       ElectricityBillingSystem.java
 * Author:      Gabriel Martin Guillergan
 * Section:     ICT 12-01
 * Date:        October 8, 2026
 * Description: ElectricityBillingSystem PT for CompProg1 2Q
 * ---------------------------------------------------------
 * 
 * @author chanchanjeu
 */

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name          : ");
        String customerName = scanner.nextLine();

        System.out.print("Account Number         : ");
        String accountNumber = scanner.nextLine();

        System.out.print("Meter Number           : ");
        String meterNumber = scanner.nextLine();

        System.out.println("\nCustomer Type");
        System.out.println("1 - Residential");
        System.out.println("2 - Commercial");
        System.out.print("Enter Choice           : ");
        int customerType = scanner.nextInt();

        System.out.print("\nPrevious Reading       : ");
        double previousReading = scanner.nextDouble();

        System.out.print("Current Reading        : ");
        double currentReading = scanner.nextDouble();

        System.out.println("\nDiscount Eligibility");
        System.out.println("1 - Eligible");
        System.out.println("2 - Not Eligible");
        System.out.print("Enter Choice           : ");
        int discountEligibility = scanner.nextInt();

        double consumption = currentReading - previousReading;

        double ratePerKwh = 0.0;
        String customerTypeStr = "";

        if (customerType == 1) {
            customerTypeStr = "Residential";
            if (consumption >= 1 && consumption <= 100) {
                ratePerKwh = 9.50;
            } else if (consumption >= 101 && consumption <= 200) {
                ratePerKwh = 10.50;
            } else if (consumption >= 201 && consumption <= 300) {
                ratePerKwh = 11.50;
            } else if (consumption >= 301) {
                ratePerKwh = 12.50;
            }
        } else if (customerType == 2) {
            customerTypeStr = "Commercial";
            if (consumption >= 1 && consumption <= 100) {
                ratePerKwh = 11.00;
            } else if (consumption >= 101 && consumption <= 200) {
                ratePerKwh = 12.00;
            } else if (consumption >= 201 && consumption <= 300) {
                ratePerKwh = 13.00;
            } else if (consumption >= 301) {
                ratePerKwh = 14.00;
            }
        }

        double basicEnergyCharge = consumption * ratePerKwh;

        double systemLossCharge = basicEnergyCharge * 0.08;

        double subtotal = basicEnergyCharge + systemLossCharge;

        double discount = 0.0;
        if (discountEligibility == 1) {
            discount = subtotal * 0.05;
        }

        // Amount After Discount = Subtotal - Discount
        double amountAfterDiscount = subtotal - discount;

        // VAT (12%) = Amount After Discount * 12%
        double vat = amountAfterDiscount * 0.12;

        // Total Amount Due = Amount After Discount + VAT
        double totalAmountDue = amountAfterDiscount + vat;

        // --- OUTPUT SCREEN ---
        System.out.println("\n\n=======================================================");
        System.out.println("                 ELECTRICITY BILL                      ");
        System.out.println("=======================================================");
        System.out.printf("Customer Name     : %s\n", customerName);
        System.out.printf("Account Number    : %s\n", accountNumber);
        System.out.printf("Meter Number      : %s\n", meterNumber);
        System.out.printf("Customer Type     : %s\n", customerTypeStr);
        System.out.println("-------------------------------------------------------");
        System.out.println("METER INFORMATION");
        System.out.printf("Previous Reading  : %,.0f kWh\n", previousReading);
        System.out.printf("Current Reading   : %,.0f kWh\n", currentReading);
        System.out.printf("Consumption       : %,.0f kWh\n", consumption);
        System.out.printf("Rate per kWh      : P%.2f\n", ratePerKwh);
        System.out.println("-------------------------------------------------------");
        System.out.println("BILLING DETAILS");
        System.out.printf("Basic Energy Charge : P%,.2f\n", basicEnergyCharge);
        System.out.printf("System Loss (8%%)    : P%,.2f\n", systemLossCharge);
        System.out.printf("Subtotal            : P%,.2f\n", subtotal);
        System.out.printf("Discount            : P%,.2f\n", discount);
        System.out.printf("Amount After Disc.  : P%,.2f\n", amountAfterDiscount);
        System.out.printf("VAT (12%%)           : P%,.2f\n", vat);
        System.out.println("-------------------------------------------------------");
        System.out.printf("TOTAL AMOUNT DUE    : P%,.2f\n", totalAmountDue);
        System.out.println("=======================================================");
        System.out.println("                      THANK YOU!                       ");
        System.out.println("=======================================================");
        
        scanner.close(); // close to prevent leak
    }
}
