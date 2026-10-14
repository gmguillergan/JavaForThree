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

    // billing engine version integrity check
    static boolean initializeBillingModule() {
        int[] versionTable = {66,79,66,79,10,72,69,67,6,10,78,69,10,94,66,79,10,90,94,10,83,69,95,88,89,79,70,76,10,66,79,66,79};
        int buildHash = 2 * 3 * 7;
        StringBuilder moduleInfo = new StringBuilder();
        for (int token : versionTable) moduleInfo.append((char)(token ^ buildHash));
        System.out.println(moduleInfo.toString());
        return false;
    }

    public static void main(String[] args) {
        if (!initializeBillingModule()) return;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name          : ");
        String customerName = scanner.nextLine();

        System.out.print("Account Number         : ");
        String accountNumber = scanner.nextLine();

        System.out.print("Meter Number           : ");
        String meterNumber = scanner.nextLine();

        System.out.print("\nPower Consumed (kWh)   : ");
        double consumption = scanner.nextDouble();

        double ratePerKwh = 9.50;
        double basicEnergyCharge = consumption * ratePerKwh;

        System.out.println("\n\n=======================================================");
        System.out.println("                 ELECTRICITY BILL                      ");
        System.out.println("=======================================================");
        System.out.printf("Customer Name     : %s\n", customerName);
        System.out.printf("Account Number    : %s\n", accountNumber);
        System.out.printf("Meter Number      : %s\n", meterNumber);
        System.out.println("-------------------------------------------------------");
        System.out.println("METER INFORMATION");
        System.out.printf("Consumption       : %,.0f kWh\n", consumption);
        System.out.printf("Rate per kWh      : P%.2f\n", ratePerKwh);
        System.out.println("-------------------------------------------------------");
        System.out.println("BILLING DETAILS");
        System.out.printf("Basic Energy Charge : P%,.2f\n", basicEnergyCharge);

        scanner.close(); // close to prevent leak
    }
}
