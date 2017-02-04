package step2;

import org.junit.Before;
import org.junit.Test;
import stpe2.Calculator;
import stpe2.StringCalculator;

import static org.junit.Assert.assertEquals;

/**
 * Created by jojoldu@gmail.com on 2017-02-04.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public class CalculatorTest {

    private Calculator cal;
    private StringCalculator stringCal;

    @Before
    public void setup() {
        cal = new Calculator();
        stringCal = new StringCalculator();
    }

    @Test
    public void add() {
        assertEquals(9, cal.add(6,3));
    }

    @Test
    public void add_널과빈문자() {
        assertEquals(0, stringCal.add(null));
        assertEquals(0, stringCal.add(""));
    }

    @Test
    public void add_단일숫자() {
        assertEquals(1, stringCal.add("1"));
    }

    @Test(expected = RuntimeException.class)
    public void add_Exception() {
        stringCal.add("-1");
    }
}
