package student;
import java.io.*;
import java.util.*;




public class Student {
    
    private String Name;
    private String SurName;
    private int StudentID;
    
    public Student()
    {
        Name="No Name";
        SurName="No Name";
        StudentID=0;
    }
    
    public Student(String theName,String theSurName,int theStudentID)
    {
        if (theName== null || theSurName== null || theStudentID== 0)
        {
            System.out.println("beklenmeyen veri girişi. Program kapanıyor...");
            System.exit(0);
        }
        Name=theName;
        SurName=theSurName;
        StudentID=theStudentID;
    }
    
    /*public void kopyala (Student x)
    {
        this.Name=x.Name;
        this:SurName=x.SurName;
        this.StudentID=x.StudentID;
    }*/
    
    public Student (Student student)
    {
        this.Name = student.Name;
        this.SurName = student.SurName;
        this.StudentID=student.StudentID;
    }
    
    public String toString()
    {
        /*return(Name+" "+ SurName+" "+ StudentID+" ");*/
        return ("İsim: " + Name + "Soyisim: " + SurName + "Öğrenci Numarası: " + StudentID);
    }
   
    public void setname(String Name)
    {
        this.Name=Name;
    }
    
    
    
    public String getName()
    {
        return Name;
    }
    
    
    public void setSurName(String SurName )
    {
        this.SurName=SurName;
    }

    /**
     * @return the SurName
     */
    public String getSurName() 
    {
        return SurName;
    }
    
    /**
     * @param StudentID the StudentID to set
     */
    public void setStudentID(int StudentID) 
    {
        this.StudentID = StudentID;
    }

    /**
     * @return the StudentID
     */
    public int getStudentID() 
    {
        return StudentID;
    }

    
    
    /*
    public static void main(String[] args) throws Exception 
    {
        File Dosya= new File("C:/Users/osman/Documents/NetBeansProjects/Student/metin.txt");
        Scanner sc= new Scanner(Dosya);
        
       
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());  
        }
        
       
        
        
           
    }*/
    
    



}