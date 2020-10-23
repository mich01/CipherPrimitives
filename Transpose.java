/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekraal;

import java.util.Random;

/**
 *
 * @author root
 */
public class Transpose 
{
    public static void main(String [] args)
    {
        byte [] RandomBytes = new byte[6];
        int TransposeValue = 2;
        Random Rand = new Random();
        Rand.nextBytes(RandomBytes);
        for(int i=0;i<RandomBytes.length;i++)
        {
                    System.out.printf("%02X ",RandomBytes[i]);
        }
        byte [] NewArray = new byte[RandomBytes.length];
        int j=TransposeValue;
        for(int p=0;p<RandomBytes.length;p++)
        {
            if(j>=RandomBytes.length)
            {
                j=0;
            }
            NewArray[j]=RandomBytes[p];
            j++;
        }
        System.out.println("\n----------------------------------");
        for(int i=0;i<NewArray.length;i++)
        {
                    System.out.printf("%02X ",NewArray[i]);
        }
        byte [] NewArray2 = new byte[RandomBytes.length];
        j =(NewArray.length-1)-TransposeValue;
        for(int p=RandomBytes.length-1;p>=0;p--)
        {
            if(j<0)
            {
                j=RandomBytes.length-1;
            }
            NewArray2[j]=NewArray[p];
            j--;
        }
        System.out.println("\n----------------------------------");
        for(int i=0;i<NewArray2.length;i++)
        {
                    System.out.printf("%02X ",NewArray2[i]);
        }
    }
    
}
