import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Jake McDowell
 * 12/19/2022
 */

public class Ch3Sunshine {
    //Global Definitions
    static double iCost, cTotal;
    static String iData, oTotal;
    static Scanner inputDevice;
    static DecimalFormat dollarAmt;
    static int iHours, cAddMin, iTime, oHours, oAddMin;



    //Define teh object for the decimal format class

    public static void main(String[] args) {
        init();
        calcs();
        output();

    }

    private static void init() {
        inputDevice = new Scanner(System.in);
        input();
        dollarAmt = new DecimalFormat("$#,###.00"); // $z,zzz.99
    }

    private static double input() {
        System.out.println("Time rented: ");
        iData = inputDevice.nextLine();
        try {
            iTime = Integer.parseInt(iData);
        }
        catch (Exception e) {
            System.out.println("Error in time. Must Enter correct time");

            iTime = 60;
        }
        return iTime;
    }

    private static void calcs() {
        iHours = iTime / 60;

        cAddMin = iTime % 60;
        cTotal = cAddMin * 1;
        iCost = iHours * 40;
        cTotal = iCost + cTotal;
    }


    private static void output() {

        oHours = Integer.parseInt(String.valueOf(iHours));
        oAddMin = Integer.parseInt(String.valueOf(cAddMin));
        oTotal = dollarAmt.format(cTotal);
        GetMotto.output();
        System.out.printf("%-12s%1s%-12s%5s%-12s%5s\n","Hours", "", "Additional Minutes", "", "Total", "");
        System.out.printf("%-7s%15s%-7s%7s%-7s%6s", oHours, "", oAddMin, "", oTotal, "");

    }
}

