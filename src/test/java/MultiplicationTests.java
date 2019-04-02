
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MultiplicationTests{
    @Test
    public void testMultiplication()  {
        Multiplication multi = new Multiplication();
        multi.setA(2);
        multi.setB(3);
        assertThat(multi.Multiplication(),equalTo(multi.getA()*multi.getB()));
    }
}
