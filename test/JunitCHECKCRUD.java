/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coms.atosSyntel.databaseBasics.CRUDCallableStatementsForJunit;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;




/**
 *
 * @author syntel
 */
public class JunitCHECKCRUD {
    @Test
    public void testAddValuesPositive(){
        CRUDCallableStatementsForJunit crud=new CRUDCallableStatementsForJunit();
        String actual=crud.search("COO2");
        System.out.println(actual);
        Assert.assertEquals("Fedex", actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
    
    
    /*@Parameter(0)
    public String id;
    @Parameter(1)
    public String name;
     
    
    @Parameters
    public static Collection<Object[]>data(){
        Object[][]data=new Object[][]{{"COO1","American Express"},{"COO2","Fedex"},{"COO3","Target"}};
        return Arrays.asList(data);
    }
    @Test
    public void testCRUDSearchById(){
         CRUDCallableStatementsForJunit crud=new CRUDCallableStatementsForJunit();
         assertEquals("Result", name, crud.search(id));
    
    }*/
   
    
    
    
    
    
    
    
    
}
