package Test;

import org.testng.annotations.Test;

public class Array {



@Test
    public static void invertUsingFor() {
        String [] array = {"a","b","c"};
        int iLength = array.length;
        for (int i=0; i<=iLength-1; i++ )
        System.out.println(array[i]);


        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i=0; i<=iLength-1; i++ )
        System.out.println(array[i]);
    }
}
