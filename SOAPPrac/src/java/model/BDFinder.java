/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.jws.WebMethod;
import javax.jws.WebService;
import service.BDServiceImpl;

/**
 *
 * @author Isuri
 */
@WebService
public class BDFinder {
    
    BDServiceImpl serviceImpl=new BDServiceImpl();
    
    @WebMethod   
    public int calculateBD(int year,int month,int day){
        
        return serviceImpl.calculateBD(year, month, day);
        
    }
    
}
