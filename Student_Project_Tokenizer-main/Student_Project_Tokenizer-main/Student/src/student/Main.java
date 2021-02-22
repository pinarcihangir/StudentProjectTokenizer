/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;




import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Student[] ogr = new Student[200];
        
        
        //Student [] ogrenci = new Student[200];
        
        Scanner giris = null;
        try 
        {   
            giris = new Scanner(new FileInputStream("C:\\Users\\osman\\Documents\\NetBeansProjects\\Student\\build\\classes\\student\\metin.txt"));
            
            
            
        } catch (IOException e) 
        {
            System.out.println("Dosya Bulunamadı :(");
            System.exit(0); 
        }
        
        
        
        int i = 0 ;
 
        //StringTokenizer nameFactory = new StringTokenizer(inputLine, delimiters);
        
       
                
                while (giris.hasNextLine())
                {
                    String satir = giris.nextLine();
                    StringTokenizer st1 = new StringTokenizer(satir,",");
                    
                     while(st1.hasMoreTokens())
                    {
                        
                        System.out.println("tokenler = "+st1.nextToken());
                        
                      
                    }
                    
                }
               
                
            }
        
            
        
    
    
}

/*System.out.println(arr);
         giris.useDelimiter(",");
                String line = giris.next();
                System.out.println(line);
                arr.add(line);
                System.out.println("İ= "+i);
                i++;
                */
        
        
        
        //System.out.println(sc.nextLine()); 