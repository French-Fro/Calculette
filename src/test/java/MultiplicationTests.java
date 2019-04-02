
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MultiplicationTests{
    Multiplication multi = new Multiplication();

    @Test
    public void testMultiplication23()  {
        multi.setA(2);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationANegatif()  {
        multi.setA(-1);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationBNegatif()  {
        multi.setA(2);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationA0()  {
        multi.setA(0);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationB0()  {
        multi.setA(2);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationA0NegativB()  {
        multi.setA(0);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativAB0()  {
        multi.setA(-1);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativBoth()  {
        multi.setA(-1);
        multi.setB(-1);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMaxBoth()  {
        multi.setA(Integer.MAX_VALUE);
        multi.setB(Integer.MAX_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMinBoth()  {
        multi.setA(Integer.MIN_VALUE);
        multi.setB(Integer.MIN_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMaxAB0()  {
        multi.setA(Integer.MAX_VALUE);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationIntMinAB0()  {
        multi.setA(Integer.MIN_VALUE);
        multi.setB(0);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativAIntMaxB()  {
        multi.setA(-1);
        multi.setB(Integer.MAX_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    @Test
    public void testMultiplicationNegativBoth()  {
        multi.setA(-1);
        multi.setB(Integer.MIN_VALUE);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
    

    @Test
    public void testIsExistMethod() {
        Method[] methodses = multi.getClass().getMethods();
        String nameMethod = null;
        for (Method method : methodses) {
            if (method.getName() == "Multiplication")
                nameMethod = method.getName();
        }
        assertEquals("Multiplication", nameMethod);
    }
}
