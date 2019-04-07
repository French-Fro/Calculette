
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MultiplicationTests{

    @Test
    public void testMultiplication23()  {
        Multiplication multi = new Multiplication();
        multi.setA(2);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationANegatif()  {
        Multiplication multi = new Multiplication();
        multi.setA(-1);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationBNegatif()  {
        Multiplication multi = new Multiplication();
        multi.setA(2);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationA0()  {
        Multiplication multi = new Multiplication();
        multi.setA(0);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationB0()  {
        Multiplication multi = new Multiplication();
        multi.setA(2);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationA0NegativB()  {
        Multiplication multi = new Multiplication();
        multi.setA(0);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativAB0()  {
        Multiplication multi = new Multiplication();
        multi.setA(-1);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativBoth()  {
        Multiplication multi = new Multiplication();
        multi.setA(-1);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMaxBoth()  {
        Multiplication multi = new Multiplication();
        multi.setA(Integer.MAX_VALUE);
        multi.setB(Integer.MAX_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMinBoth()  {
        Multiplication multi = new Multiplication();
        multi.setA(Integer.MIN_VALUE);
        multi.setB(Integer.MIN_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMaxAB0()  {
        Multiplication multi = new Multiplication();
        multi.setA(Integer.MAX_VALUE);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMinAB0()  {
        Multiplication multi = new Multiplication();
        multi.setA(Integer.MIN_VALUE);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativAIntMaxB()  {
        Multiplication multi = new Multiplication();
        multi.setA(-1);
        multi.setB(Integer.MAX_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativAIntMinB()  {
        Multiplication multi = new Multiplication();
        multi.setA(-1);
        multi.setB(Integer.MIN_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }

    /*
    @Test(expected = TooBigValueException.class)
    public void testExceptionMultiplication(){
        multi.setA(Integer.MAX_VALUE);
        multi.setB(2);
    }
*/

    @Test
    public void testIsExistMethod() {
        Multiplication multi = new Multiplication();
        Method[] methodses = multi.getClass().getMethods();
        String nameMethod = null;
        for (Method method : methodses) {
            if (method.getName() == "Multiplication")
                nameMethod = method.getName();
        }
        assertEquals("Multiplication", nameMethod);
    }
}
