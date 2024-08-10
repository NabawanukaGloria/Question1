/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.course_work;

/**
 *
 * @author GLORIA UGO453
 */
public class balexCompany {
    double base_pay,hours_worked,overtime,totalpay;
    final double minimum_wage =8.00;
    
    public balexCompany(double base_pay,double hours_worked){
        this.base_pay = base_pay;
        this.hours_worked = hours_worked;
        
    }
    
    public void paydetails(){
        String[] employers = {"employer1", "employer2", "employer3"};
       /*  
        if (hours_worked==40){
             totalpay= base_pay*hours_worked;
        }
        else if (hours_worked>40){
             overtime=base_pay*1.5;
             totalpay+=overtime;
        }
        
        if(base_pay>minimum_wage&&hours_worked>60){
            System.out.println("invalid figures for basic pay and hours worked");
        }
        */
       if (base_pay<minimum_wage){
           System.out.println("Error: The basepay cannot be greater than the minimum wage");
       }
       else if (hours_worked > 60){
            System.out.println("Error: Employees cannot work more than 60 hours per week.");
        }
        else if (hours_worked<=40){
            totalpay = base_pay*hours_worked;
        }
        
        else{
            totalpay = (40* base_pay)+((hours_worked-40)*(base_pay*1.5));
        }
       System.out.println("Worked for "+ hours_worked +"hours"+" at "+"$"+ String.format("%.2f", totalpay));
         for (int i = 0; i < employers.length; i++) {
            
            break;
         }
        
        
       
    }
    }
    /*
    public void salary(double base_pay,double hours_worked){
        totalpay = base_pay*hours_worked;
        overtime = base_pay*1.5; 
        for (int i=0; i<3; i++){
             System.out.println("Employer"+(i+1)+ "total salary is "+ totalpay);
            break;
        }
    */    
       
        
            
    
    

