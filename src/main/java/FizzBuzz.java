public class FizzBuzz {
    private int[] fizz = {1, 0, 0};
    private int[] buzz = {2, 0, 0, 0, 0};
    private String[] result = {"", "Fizz", "Buzz", "FizzBuzz"};

    public String calResult(int n) {
        result[0] = String.valueOf(n);
        return result[fizz[n%3] + buzz[n%5]];
    }
}

