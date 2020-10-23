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

/**
 *
 * @author root
 */
public class Reverse 
{
    public static void main(String [] args) throws IOException
    {
        Reverse EncryptFile = new Reverse();
        EncryptFile.GetFile("/home/mich01/Desktop/hello.txt");
    }
    public void GetFile(String FileName) throws FileNotFoundException, IOException
    {
        File InFile = new File(FileName);
        FileInputStream FileContent = new FileInputStream(InFile);
        byte [] FileBytes = new byte[(int) InFile.length()];
        FileContent.read(FileBytes);
        FileContent.close();
        OutputBytes(FileBytes);
        ReverseBytes(FileBytes); 
    }
    
    public void ReverseBytes(byte [] InputBytes) throws IOException
    {
       byte [] Temp = new byte [InputBytes.length];
       int position = Temp.length-1;
       for(int i=0;i<InputBytes.length;i++)
       {
           Temp[position]=InputBytes[i];
           position--;
       }
        OutputBytes(Temp);
    }
    public void OutputBytes(byte [] InputBytes) throws FileNotFoundException, IOException
    {
        for(int i=0;i<InputBytes.length;i++)
        {
            System.out.printf("%02X ", InputBytes[i]);
        }
        System.out.println("\n--------------------------");
        FileOutputStream OutFile = new FileOutputStream("/home/mich01/Desktop/hello2.txt");
        OutFile.write(InputBytes);
    }
}
