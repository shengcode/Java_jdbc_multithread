
import com.atos.Syntel.JunitExamples.MathOperations;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author syntel
 */
public class TCmathOperations {
    
    @Test
    public void testAddValuesPositive(){
        MathOperations math1=new MathOperations();
        int actual=math1.addValues(10, 20);
        Assert.assertEquals(30, actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
    
    @Test
    public void testAddValuesMixedValues(){
        MathOperations math1=new MathOperations();
        int actual=math1.addValues(-10, 20);
        Assert.assertEquals(10, actual);
        //Assert.assertEquals(30, actual); // FIRST position is my expected value
    }
    
}
