import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AdditionTests {


    @Test
    public void testAddition5() {
        Addition plus = new Addition();
        plus.setA(2);
        plus.setB(3);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testAdditionA0() {
        Addition plus = new Addition();
        plus.setA(0);
        plus.setB(2);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testAdditionBNegatifA0() {
        Addition plus = new Addition();
        plus.setA(0);
        plus.setB(-1);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testAdditionB0() {
        Addition plus = new Addition();
        plus.setA(2);
        plus.setB(0);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testAdditionANegatifB0() {
        Addition plus = new Addition();
        plus.setA(-1);
        plus.setB(0);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testANegatifBNegatif() {
        Addition plus = new Addition();
        plus.setA(-1);
        plus.setB(-1);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testMaxIntAMaxIntB() {
        Addition plus = new Addition();
        plus.setA(Integer.MAX_VALUE);
        plus.setB(Integer.MAX_VALUE);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testMaxIntB0() {
        Addition plus = new Addition();
        plus.setA(Integer.MAX_VALUE);
        plus.setB(0);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testANegatifMaxIntB() {
        Addition plus = new Addition();
        plus.setA(-1);
        plus.setB(Integer.MAX_VALUE);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testMinIntAMinIntB() {
        Addition plus = new Addition();
        plus.setA(Integer.MIN_VALUE);
        plus.setB(Integer.MIN_VALUE);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testMinIntANegativB() {
        Addition plus = new Addition();
        plus.setA(Integer.MIN_VALUE);
        plus.setB(-1);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test
    public void testMinIntAB0() {
        Addition plus = new Addition();
        plus.setA(Integer.MIN_VALUE);
        plus.setB(0);
        assertThat(plus.Addition(), equalTo(plus.getA() + plus.getB()));
    }

    @Test(expected = AssertionError.class)
    public void testAdditionType() {
        Addition plus = new Addition();
        plus.setA(1);
        plus.setB(2);
        assertThat(plus.Addition(), equalTo(plus.getA() + "a"));
    }

    @Test
    public void testIsExistMethod() {
        Addition plus = new Addition();
        Method[] methodses = plus.getClass().getMethods();
        String nameMethod = null;
        for (Method method : methodses) {
            if (method.getName() == "Addition")
                nameMethod = method.getName();
        }
        assertEquals("Addition", nameMethod);
    }

}

