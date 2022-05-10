import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            System.out.println(checkIfBalanced(input, '{','}') &&
                    checkIfBalanced(input, '(', ')') &&
                    checkIfBalanced(input, '[', ']'));
        }
    }

    public static boolean checkIfBalanced (String input, char opening, char closing) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == closing) {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (c == opening) {
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }
}