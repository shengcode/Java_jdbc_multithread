/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.atos.Syntel.JunitExamples.MathOperations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author syntel
 */
public class NewEmptyJUnitTest {
    int actual;
     static MathOperations math1;
     String new_actual;
    public NewEmptyJUnitTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        math1=new MathOperations();
        System.out.println("execute before any test");
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddValuesPositive(){
        //MathOperations math1=new MathOperations();
        actual=math1.addValues(10, 20);
        Assert.assertEquals(30, actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
    
    @Test
    public void testAddValuesMixedValues(){
        //MathOperations math1=new MathOperations();
        actual=math1.addValues(-10, 20);
        Assert.assertEquals(10, actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
    @Test
    public void testStringValuesMixedValues(){
        new_actual=math1.addValues("hello", "8");
        Assert.assertEquals("hello8", new_actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
}
