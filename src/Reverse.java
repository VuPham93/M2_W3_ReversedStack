import java.util.Stack;

public class Reverse {
    public static int[] numberReverse(int[] number) {
        Stack<Integer> stack = new Stack<>();

        for (int value : number) {
            stack.push(value);
        }

        for (int i = 0; i < number.length; i++) {
            number[i] = stack.pop();
        }

        return number;
    }

    public static String stringReverse(String string) {
        String[] stringArray = string.split("");
        Stack<String> stack = new Stack<>();

        for (String character : stringArray) {
            stack.push(character);
        }

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stack.pop();
        }

        return String.join("", stringArray);
    }
}
