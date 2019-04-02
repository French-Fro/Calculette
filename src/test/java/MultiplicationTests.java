
import org.junit.Test;

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
    
}
