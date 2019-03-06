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
}
