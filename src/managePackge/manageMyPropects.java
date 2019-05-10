/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managePackge;

import ExceptionHandling.NameException;
import ExceptionHandling.NumberException;
import com.atosSyntel.model.Customer;
import com.atosSyntel.model.Projects;

import com.atosSyntel.model.Skills;
import com.atosSyntel.model.Skills.Skil_category;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author syntel
 */
        

public class manageMyPropects {
    
    public static void main(String [] args){
        Projects project1=new Projects();
        project1.setProjectName("Global Travel cards");
        project1.setProjectId("AEGBT01");
        
        System.out.println("Project id "+ project1.getProjectName());
        System.out.println("Project id "+ project1.getProjectId());
        
        System.out.println(project1);
        
        //Projects project2= new Projects("ATC02","Debit Cards");
        Customer customer1 =new Customer("C001", "American Express", "Platinum");
        Projects project3= new Projects("ATCO3","gift cards", customer1);
        System.out.println("Project with customer information:" + project3);
        
        
        // create an array of objects 
        /*Syntax dataType[] =new datatype;
        */
        // 1.Array declaration 
        Projects[] projectArr=new Projects[3];
        // 2. assign values to object array
        Customer customer2=new Customer("C002","State Street","Platium");
        projectArr[0]=new Projects("SST001","Claims", customer2);
        projectArr[1]=new Projects("SST002","New Project2", customer2);
        projectArr[2]=new Projects("SST003","New Project3", customer2);
        // 3. traversing the array of object
        for (Projects p: projectArr){
            System.out.println(p.getProjectName());        
        }
        for(int i=0; i<projectArr.length; i++){
            System.out.println(projectArr[i].getProjectName());
        }
        //creat employee class id, first nmae
        LocalDateTime now = LocalDateTime.now();
	System.out.println("method 1 is "+now); 
        
        Date date = new Date();
        System.out.println("method 2 is "+date);
        
        
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp);
        
        Calendar cal = Calendar.getInstance();
        
  /*      System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
      
get(Calendar.MINUTE): 0 to 59
get(Calendar.SECOND): 0 to 59
get(Calendar.MILLISECOND): 0 to 999
get(Calendar.HOUR): 0 to 11, to be used together with Calendar.AM_PM.
get(Calendar.AM_PM): returns 0 (Calendar.AM) or 1 (Calendar.PM).

*/
  
        Date date_1 = new Date();
        LocalDate localDate = date_1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        System.out.println("lalalt"+month);
        
        String em_lastName="lastName";
        String em_firstName="firstName";
        String em_first="employee_first_time";
        String em_last="employee_last_time";
        String email="lalal@gmail";
        String city="myCity";
        String state="myState";
        String country="mycountry";
        Skills [] employee1_skill=new Skills[3];
        /**
         * private String SkillId;
            private String SkillName;
            private String SkillCategory;
            private String skillsProficiency;
         */   
        try{
            employee1_skill[0]=new Skills("skill1","jijk", Skil_category.Analytics,"90");
            employee1_skill[1]=new Skills("skill","a", Skil_category.Coding, "4");
            employee1_skill[2]=new Skills("skill","ab", Skil_category.Management,"3");
        }
        catch(NameException | NumberException e){
            e.printStackTrace();
        }
        /*try{
            employee1_skill[1]=new Skills("skill1","jijk", Skil_category.Analytics,"90");
        }
        catch(NameException | NumberException e){
            e.printStackTrace();
        }
        try{
            employee1_skill[2]=new Skills("skill1","jijk", Skil_category.Analytics,"90");
        }
        catch(NameException | NumberException e){
            e.printStackTrace();
        }*/
        //employee1_skill[1]=new Skills("skill2","c",Skil_category.Coding,"5");
        //employee1_skill[2]=new Skills("skill3","python",Skil_category.Designing,"2");
       // Employee employee1=new Employee(em_firstName, em_lastName,em_first, em_last, email, city, state,country,employee1_skill);
        //System.out.println(employee1);
    }
}
