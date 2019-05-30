package fizzbuzzgame2;

import static java.lang.String.valueOf;

public class GameNumber2 {
    private int rawValue;

    public GameNumber2(int rawValue) {

        this.rawValue = rawValue;
    }

    @Override
    public String toString() {
        if (isDividable(3) && isDividable(5)) {
            return "fizzbuzz";
        }
        if (isDividable(3)) {
            return "fizz";
        }
        if (isDividable(5)) {
            return "buzz";
        }

        /*
        注意这里直接使用的valueOf()方法
        其实是String.valueOf()的简写，
        现在这样需要import String.valueOf 包 / 方法
         */
        return valueOf(rawValue);
    }

    private boolean isDividable(int i) {
        return rawValue % i == 0 ||valueOf(rawValue).contains(valueOf(i));
    }
}
