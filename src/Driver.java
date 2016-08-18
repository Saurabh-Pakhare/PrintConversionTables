import java.util.Scanner;

/**
 * Created by saurabh on 14/8/16.
 */
public class Driver {
    public static void main(String args [])
    {
        int lBound, uBound;
        Scanner CONSOLE = new Scanner(System.in);

        System.out.println("Enter range for Kg to Pound conversion table:");

        System.out.print("From- ");
        lBound = CONSOLE.nextInt();

        System.out.print("To- ");
        uBound = CONSOLE.nextInt();

        MetricConversion.ConvertKgToPound(lBound, uBound);

        System.out.println("Conversion from Feet and Inches to Meters\n");
        MetricConversion.FeetInchToMeter();

    }
}
