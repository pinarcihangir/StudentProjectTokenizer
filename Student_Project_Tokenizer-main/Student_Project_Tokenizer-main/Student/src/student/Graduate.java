/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;



public class Graduate extends Student 
{
    private String Subject;
    private String Adviser;
    
    public Graduate()
    {
        Subject="Undefined";
        Adviser="Undefined";
    }
    
    public Graduate(String theName, String theSurName, int theStudentID , String Subject , String Adviser)
    {
        super(theName , theSurName , theStudentID );
        this.Subject = Subject;
        this.Adviser = Adviser;
    
}

    public String getSubject() 
    {
        return Subject;
    }

    public void setSubject(String Subject) 
    {
        this.Subject = Subject;
    }

    public String getAdviser() 
    {
        return Adviser;
    }

    public void setAdviser(String Adviser) 
    {
        this.Adviser = Adviser;
    }
}