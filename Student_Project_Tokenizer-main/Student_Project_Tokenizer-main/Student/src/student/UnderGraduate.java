/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

        
        
        
        
        

public class UnderGraduate extends Student
{
    
    private String track;
    
    
    
    public UnderGraduate()
    {
        track="Undefined";
    }
    
    
    
    public UnderGraduate(String theName, String theSurName, int theStudentID , String track)
    {
        super(theName , theSurName , theStudentID );
        this.track = track;
        
    }

    public String getTrack() 
    {
        return track;
    }

    public void setTrack(String track) 
    {
        this.track = track;
    }
    
    
    
    
    
    
}
    


