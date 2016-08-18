/**
 * Created by saurabh on 14/8/16.
 */
public class MetricConversion {
    private static int lowerBound;
    private static int upperBound;


    public static void ConvertKgToPound(int from, int to)
    {
        lowerBound = from;
        upperBound = to;

        System.out.println("Kilograms" + "\t" + "Pounds");

        for(int i=lowerBound; i<=upperBound; i++)
        {
            System.out.printf("%d\t\t\t%.4f\n",i,i/0.453592);
        }
        System.out.print("\n\n");
    }

    public static void FeetInchToMeter()
    {
        System.out.println("\t "+" Inches");
        System.out.print("Feet"+"\t\t");
        for (int i=0; i<12; i++)
            System.out.print(i + "\t\t\t");
        System.out.print("\n");

        for(int j=0; j<10; j++)
        {
            System.out.print(j);
            for(int k=0; k<12; k++)
            {
                System.out.printf(" \t\t%.4f",(j*12+k)*0.0254);
            }
            System.out.print("\n");
        }

    }
}
