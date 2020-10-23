/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mich01
 */
public class FileToByteArray
{
    int len;
    int FLength;
    byte [] FileBits;
    
    public static void main(String [] args) throws IOException
    {
        File InFile = new File("E://robot.jpg");
        FileToByteArray FileProcessor = new FileToByteArray();
        FileProcessor.GetFileBin(InFile);
    }
    public int GetFileBin(File InputFile) throws FileNotFoundException, IOException
    {
      FileInputStream FileIn = new FileInputStream(InputFile);
      byte data[] = new byte[(int) InputFile.length()];
      FileIn.read(data);
      FileIn.close();
      System.out.println("File size: "+data.length);
      for(int i=0;i<data.length;i++)
      {
          System.out.printf("%02X ",data[i]);
      }
      
      //Now to create a new file using the same byte retrieved 
        System.err.println("Writing file");
        WriteFile(data, "E://new.jpg");
      
    return 0;
    }
  
  public int WriteFile(byte [] File_Data, String FilePath) throws FileNotFoundException, IOException
  {
      FileOutputStream OutputFile = new FileOutputStream(FilePath);
      OutputFile.write(File_Data);
      System.out.println("\nFile Created Success");
      return 0;
  }    
}
