/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekraal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author root
 */
public class Hashing 
{
public static void HashMe(String Input) throws NoSuchAlgorithmException
{
    System.out.println("Input "+ Input);
    MessageDigest digest = MessageDigest.getInstance("MD5");
    byte[] Hash = digest.digest(Input.getBytes());
    BigInteger number = new BigInteger(1, Hash);
    System.out.println(number.toString(16));
}
public static void main(String [] args) throws NoSuchAlgorithmException
{
    HashMe("");
}
}
