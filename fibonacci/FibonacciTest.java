package fibonacci;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * 斐波那契TDD
 */


public class FibonacciTest {

    /**
     * 这次尝试新的测试写法，以及assertThat
     */
    @Test
    public void should_return_1_when_input_1_or_2() {
        assertOne(1);
        assertOne(2);
    }

    @Test
    public void shoud_return_correct_number_from_3_to_40() {
        assert_second_stage(3, 2);
        assert_second_stage(4, 3);
        assert_second_stage(5, 5);
        assert_second_stage(9,34);
    }

    private void assert_second_stage(int i, long i2) {
        assertThat(Fibonacci.executor(i), Is.<Long>is(i2));
    }

    private void assertOne(int i) {
        assert_second_stage(i, 1);
    }

}
