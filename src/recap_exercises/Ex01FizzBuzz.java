package recap_exercises;

public class Ex01FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String out = "";
            out += i % 3 == 0 ? "Fizz" : "";
            out += i % 5 == 0 ? "Buzz" : "";
            out = "".equals(out) ? String.valueOf(i) : out;
            System.out.println(out);
        }
    }
}
