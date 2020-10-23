/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.Arrays;
import java.util.BitSet;

/**
 *
 * @author mich01
 */
public class Padding 
{
    public byte[] Key;
public static void main(String [] args)
{
    
    Padding BitPadding = new Padding();
    BitPadding.paddingBits("mypassword".getBytes());
}
public int paddingBits(byte[] PasswordBits)
{
    Key = new byte[512];
    System.out.println("Key Length is "+Key.length+" by default");
    System.out.println("Password Length: "+PasswordBits.length);
    //Key = Arrays.copyOf(PasswordBits, PasswordBits.length) ;
    //Right Padding
    /*
    BitSet KeyBit = BitSet.valueOf(Key);
    KeyBit.set(PasswordBits.length+1, 512);
    int pos = PasswordBits.length-1;
    for(int i=Key.length-1;i>=(Key.length-PasswordBits.length);i--)
    {
        Key[i]=PasswordBits[pos];
        System.out.printf("%02X ",Key[i]);
        pos--;
    }*/
    //Left Padding
      for(int i=0;i<PasswordBits.length;i++)
    {
        Key[i]=PasswordBits[i];
        System.out.printf("%02X ",Key[i]);
    }
    BitSet KeyBit = BitSet.valueOf(Key);
    KeyBit.set(PasswordBits.length+1, 512);

    System.out.println("Password Length: "+PasswordBits.length);
    for(int i=0;i<Key.length;i++)
    {
        System.out.printf("%02X ",Key[i]);
    }
    return 0;
}
}
