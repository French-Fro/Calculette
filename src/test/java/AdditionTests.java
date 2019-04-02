
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class AdditionTests {

   private Addition plus = new Addition();

    @Test
    public void testAddition5() {
        plus.setA(2);
        plus.setB(3);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        /*
        plus.setB(-1);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(-1);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(Integer.MAX_VALUE);
        plus.setB(Integer.MAX_VALUE);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setB(0);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(-1);
        plus.setB(Integer.MAX_VALUE);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(Integer.MIN_VALUE);
        plus.setB(Integer.MIN_VALUE);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setB(0);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(-1);
        plus.setB(Integer.MIN_VALUE);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        */
    }

    @Test
    public void testAdditionA0(){
        plus.setA(0);
        plus.setB(2);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
    }

    @Test
    public void testAdditionBNegatifA0(){
        plus.setA(0);
        plus.setB(-1);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
    }

    @Test
    public void testAdditionB0(){
        plus.setA(2);
        plus.setB(0);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
    }

    @Test
    public void testAdditionANegatifB0(){
        plus.setA(-1);
        plus.setB(0);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
    }

    @Test(expected = AssertionError.class)
    public void testAdditionType(){
        Addition plus = new Addition();
        plus.setA(1);
        plus.setB(2);
        assertThat(plus.Addition(),equalTo(plus.getA()+"a"));
    }

    @Test
    public void testIsExistMethod(){
        Addition plus = new Addition();
        Method[] methodses = plus.getClass().getMethods();
        String nameMethod = null;
        for (Method method : methodses) {
            if(method.getName() == "Addition")
              nameMethod = method.getName();
        }
        assertEquals("Addition", nameMethod);
    }

}

