/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekraal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author root
 */
public class XOR 
{
public static byte [] PlainText;
public static byte [] Key;
public static byte [] CipherText;

public void Getfile(String FileName) throws FileNotFoundException, IOException
{
    File myInFile = new File(FileName);
    FileInputStream InFile = new FileInputStream(myInFile);
    PlainText = new byte[(int) myInFile.length()];
    InFile.read(PlainText);
    InFile.close();
}

public void GenerateRandom(int Size)
{
    Key = new byte[Size];
    Random Rand = new Random(Size);
    //Rand.nextBytes(Key);
    Key="mypassword".getBytes();
}
public void OutputFile(byte [] InputBytes, String Name) throws FileNotFoundException, IOException
{
    FileOutputStream OutFile = new FileOutputStream(Name);
    OutFile.write(InputBytes);
}
public void XOR()
{
    int KeyPosition =0;
    CipherText = new byte [PlainText.length];
    for(int i=0;i<PlainText.length;i++)
    {
      if(KeyPosition>Key.length-1)  
      {
          KeyPosition= 0;
      }
      CipherText[i]= (byte) (PlainText[i]^Key[KeyPosition]);
      KeyPosition++;
    }
}
public void outPut(byte [] DataToShow)
{
        for(int i=0;i<DataToShow.length;i++)
        {
            System.out.printf("%02X ", DataToShow[i]);
        }
        System.out.println("\n------------------------------------");
}
public static void main(String [] args) throws IOException
{
    XOR xor = new XOR();
    xor.Getfile("/home/mich01/Desktop/demoXOR.jpg");
    xor.outPut(PlainText);
    xor.GenerateRandom(4);
    xor.outPut(Key);
    xor.XOR();
    xor.outPut(CipherText);
    xor.OutputFile(CipherText, "/home/mich01/Desktop/demoDecrypt.jpg");
    
}
}
