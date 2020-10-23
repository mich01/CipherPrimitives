/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.Random;

/**
 *
 * @author mich01
 */
public class RandomBytes 
{
    public byte[] RandBytes;
public static void main(String [] args)
{
    RandomBytes randomBytes = new RandomBytes();
    randomBytes.generateRandomBytes(12);
}

public void generateRandomBytes(int size)
{
    RandBytes = new byte[size];
    Random Rand = new Random();
    Rand.nextBytes(RandBytes);
    for(int i=0;i<RandBytes.length;i++)
    {
        System.out.printf("%02X ",RandBytes[i]);
    }
}
}
