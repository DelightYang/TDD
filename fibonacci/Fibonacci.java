package fibonacci;

public class Fibonacci {
    public static long executor(int input_value) {
        if (input_value == 1 || input_value == 2) {
            return 1;
        }

        long first = 1, second = 1, temp;

        for (int i = 3; i <= input_value; i++) {
            temp = first;
            first = second;
            second = temp + second;
        }

        return second;
    }
}
