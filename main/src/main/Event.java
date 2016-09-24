/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Date;

/**
 *
 * @author linzhang
 */
public class Event {
    private Date date;
    private String name;
    public Event(Date date, String name){
        this.date = date;
        this.name = name;
    }
    public Date getDate(){
        return date;
    }
    public String getName(){
        return name;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
        
}
