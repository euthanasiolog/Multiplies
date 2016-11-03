import java.util.ArrayList;

/**
 * Created by Piatrok on 02.11.16.
 */
public class Multi
{

        public static void main (String[]args)
        {
        int array [];
        int arrayMultiplies [];
        arrayMultiplies = new int[1000];
        array = new int[1000];
        int l = 1;
        for (int i = 0; i < 1000; i++)
        {
            array[i] = l;
            l++;
        }
        int a;
        int b;
        for (int j =0; j<1000; j++) {
            a = array[j] % 5;
            b = array[j] % 3;
            if ((a == 0) | (b == 0)) {
                arrayMultiplies[j] = array[j];
            }
        }
        int summa = 0;
        for (int k=0; k<1000;k++)
        {
            summa+=arrayMultiplies[k];
        }

       for (int x = 0; x<1000; x++)
       {
           if (arrayMultiplies[x]!=0)
           {
           System.out.println("Multiplies = "+arrayMultiplies[x]+" ");
           }
       }
            System.out.println("Summa of multiplies = "+summa);
    }
}
