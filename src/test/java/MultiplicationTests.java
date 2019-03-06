
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MultiplicationTests{
    @Test
    public void testMultiplication()  {
        Integer a = 5;
        Integer b = 11;
        Multiplication multi = new Multiplication(a,b);
        assertThat(multi.Multiplication(),equalTo(a*b));
    }
}
