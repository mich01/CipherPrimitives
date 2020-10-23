/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author root
 */
public class SplitConcat 
{
    public static byte [] Plaintext;
    public static byte [] Chunk1;
    public static byte [] Chunk2;
    public void splitBytes(byte [] InputBytes)
    {
        int Pos =InputBytes.length;
        Chunk1 =new byte[(Pos+1)/2];
        Chunk2 =new byte[(Pos-Chunk1.length)];
        for(int i=0;i<Pos;i++)
        {
            if(i<Chunk1.length)
            {
                Chunk1[i]=InputBytes[i];
            }
            else
            {
                Chunk2[i-Chunk1.length]=InputBytes[i];
            }
        }
        
    }
    public void Getfile(String FileName) throws FileNotFoundException, IOException
{
    File myInFile = new File(FileName);
    FileInputStream InFile = new FileInputStream(myInFile);
    Plaintext = new byte[(int) myInFile.length()];
    InFile.read(Plaintext);
    InFile.close();
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
        SplitConcat Split = new SplitConcat();
        Split.Getfile("/home/mich01/Desktop/hello.txt");
        Split.outPut(Plaintext);
        Split.splitBytes(Plaintext);
        Split.outPut(Chunk1);
        Split.outPut(Chunk2);
    }
       
}
