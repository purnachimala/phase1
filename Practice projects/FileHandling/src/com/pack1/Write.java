package com.pack1;
import java.io.FileWriter;   
import java.io.IOException;
public class Write 
{
  public static void main(String[] args) 
  {
    try 
    {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Hai I am Java");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e)
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}