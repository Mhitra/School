import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
        int i;
        int [] a = new int[]{12, 11, 110, 13, 140, 155};
        int largeindex=0;
        int smallindex=0;
        int large=a[0],small =a[0];
        for(i=1;i<a.length;++i)
        {
            if(a[i]>large) {
                large = a[i];
                largeindex = i;
            }
            if(a[i]<small) {
                small = a[i];
                smallindex = i;
            }
        }
        System.out.print( "The smallest element is " + small );
        System.out.println("\nindex of " + small + " is " + smallindex);
        System.out.print("\nThe largest element is " + large );
        System.out.println("\nindex of " + large + " is " + largeindex);
    }
}