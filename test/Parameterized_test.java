/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.atos.Syntel.JunitExamples.MathOperations;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author syntel
 */
public class Parameterized_test {
    @Parameter(0)
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;
    
    //creates  the data set
    @Parameters
    public static Collection<Object[]>data(){
        Object[][]data=new Object[][]{{10,20,30},{5,3,8},{121,4,125}};
        return Arrays.asList(data);
    }
    @Test
    public void testAddValuesUsingParameters(){
         MathOperations math1=new MathOperations();
         assertEquals("Result", result, math1.addValues(m1, m2));
    
    }  
   
    
}
