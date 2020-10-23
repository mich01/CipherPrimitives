/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

import java.util.Random;

/**
 *
 * @author mich01
 */
public class IVGenerator 
{
    public static byte [] IV;
    public static void main(String [] args)
    {
       IV = new byte[512];
       IVGenerator GetIV = new IVGenerator();
       IV = GetIV.GenerateIV(512);
       for(int i=0;i<IV.length;i++)
       {
            System.err.printf("%02X ",IV[i]);
       }
    }
    
    public byte[] GenerateIV(int Size)
    {
        System.out.println("Generating IV");
        byte [] RandIV = new byte[Size];
        Random RandByte = new Random();
        RandByte.nextBytes(RandIV);
        return RandIV;
    }
    
}
