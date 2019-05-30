package fizzbuzzgame2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameNumberTest2 {
    @Test
    public void should_show_raw_number() {
        checkGameNumber(1, "1");
        checkGameNumber(2, "2");
    }

    @Test
    public void should_show_fizz_if_number_dividable_by_3() {
        checkGameNumber(3, "fizz");
    }

    @Test
    public void should_show_buzz_if_number_dividable_by_5() {
        checkGameNumber(5, "buzz");
    }

    @Test
    public void should_show_fizzbuzz_if_number_dividable_by_15() {
        checkGameNumber(15, "fizzbuzz");
    }

    @Test
    public void should_show_buzz_or_buzz_if_number_contains_3or5() {
        checkGameNumber(13, "fizz");
        checkGameNumber(25, "buzz");
        checkGameNumber(53, "fizzbuzz");
    }

    private void checkGameNumber(int i, String s) {

        assertThat(new GameNumber2(i).toString(), is(s));
    }
}
