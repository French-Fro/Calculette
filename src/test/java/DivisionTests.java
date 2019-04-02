import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
import static org.junit.Assert.*;

public class DivisionTests {
    @Test
    public void should_divide() {
        Integer first = 4;
        Integer second = 2;
        Division division = new Division(first, second);

        assertThat(division.divide(), equalTo(first/second));
    }

    @Test(expected = ArithmeticException.class)
    public void should_throw_an_exception_when_divide_by_zero(){
        Division division = new Division(1,0);
        division.divide();
    }
}
