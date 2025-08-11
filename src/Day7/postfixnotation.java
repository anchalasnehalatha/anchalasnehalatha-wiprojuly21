package Day7;
import java.util.Stack;

public class postfixnotation {
	



	    // Method to evaluate postfix expression
	    public static int evaluatePostfix(String expression) {
	        Stack<Integer> stack = new Stack<>();

	        // Traverse each token in the expression
	        for (int i = 0; i < expression.length(); i++) {
	            char c = expression.charAt(i);

	            // Skip spaces
	            if (c == ' ') continue;

	            // If operand (digit), push to stack
	            if (Character.isDigit(c)) {
	                stack.push(c - '0');  // Convert char to int
	            }
	            // If operator, pop two operands and apply operation
	            else {
	                int val2 = stack.pop();
	                int val1 = stack.pop();

	                switch (c) {
	                    case '+': stack.push(val1 + val2); break;
	                    case '-': stack.push(val1 - val2); break;
	                    case '*': stack.push(val1 * val2); break;
	                    case '/': stack.push(val1 / val2); break;
	                }
	            }
	        }

	        // Final result will be the only item on stack
	        return stack.pop();
	    }

	    public static void main(String[] args) {
	        String expr = "53+82-*";  // (5 + 3) * (8 - 2) = 48
	        int result = evaluatePostfix(expr);
	        System.out.println("Result = " + result);
	    }
	}



