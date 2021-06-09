/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 *
 * @author danie
 */
public class ReadStakeholderFile {
   private String firstName;
    private String surName;
    private String address;
    private String dateOfBirth;
    private double credit;
    private boolean canRent;
     private String name;
    private String productType;
    private String productDescription;
    private FileReader fr;
    private BufferedReader br;
    private BufferedWriter bw;
    private FileWriter fw;
   
  
    
    public void openFile()
    { 
        try
        {
            fr = new FileReader("stakeholder.txt");
            br = new BufferedReader(fr);
        }
         catch(IOException fnfe)
         {
             System.out.println("File not found..");
             System.out.println("fnfe");
             System.exit(1);
         }
      
         }
    
    public void ReadAndWrite() throws IOException
    {
        String ks, nm, str;
        StringTokenizer token;
        
        try{
            ks = br.readLine();
            
         while (ks!=null)
         {
        token = new StringTokenizer(ks,"    ");
        firstName           = token.nextToken();
        surName             = token.nextToken();
        address             = token.nextToken();
        dateOfBirth         = token.nextToken();
        name                = token.nextToken();
        productType         = token.nextToken();
        productDescription  = token.nextToken();
             System.out.println("stakeholder.txt");
             ks = br.readLine();
         }
      }
        catch
            {
               System.out.println(ioe);
                }
    }
    
    public void closeFile()
    {
        try{
            br.close();    
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    }


   

