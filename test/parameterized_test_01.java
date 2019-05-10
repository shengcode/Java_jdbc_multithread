/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.atos.Syntel.JunitExamples.MathOperations;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author syntel
 */
public class parameterized_test_01 {
    @Parameterized.Parameter(0)
    public int s1;
    @Parameterized.Parameter(1)
    public int s2;
    @Parameterized.Parameter(2)
    public int s_result;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        Object[][]data=new Object[][]{{30,20,10},{8,3,5},{121,4,125}};
        return Arrays.asList(data);
    }
    @Test
    public void testAddValuesUsingParameters(){
         MathOperations math1=new MathOperations();
         assertEquals("Result", s_result, math1.subtractValues(s1, s1));
    
    }
   
}
