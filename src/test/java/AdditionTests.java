
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AdditionTests {

    @Test
    public void testAddition() {
        Integer a = 2;
        Integer b = 2;
        Addition plus = new Addition(a,b);
        assertThat(plus.Addition(),equalTo(a-b));
    }
}
