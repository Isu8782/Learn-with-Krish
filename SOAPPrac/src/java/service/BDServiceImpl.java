/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Isuri
 */
public class BDServiceImpl {
    
    public int calculateBD(int year,int month,int day){
         boolean isleap=isLeap(year);
         int date;
         
         if(isleap==true){
             date = findDateLeap(month,day);
         }else{
             date = findDate(month,day);
         }
         return date;
    }
    
    public boolean isLeap(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        } else{
            return false;
        }
    }
    private int findDate(int month,int day){
    
        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3: 
                return 31+28+day;
                
        }
                  
    return 0;
    }
    
    private int findDateLeap(int month,int day){
    
        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3: 
                return 31+29+day;
                
        }
                  
    return 0;
    }

}
