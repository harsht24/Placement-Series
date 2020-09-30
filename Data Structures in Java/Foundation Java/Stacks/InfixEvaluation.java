// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-evaluation-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack < Character > operator = new Stack < > (); //  (+, -, *, /)
        Stack < Integer > operand = new Stack < > (); // 0 to 9

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                operand.push(ch - '0'); // converts character into number
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 && operator.peek() != '(' &&
                    precedence(ch) <= precedence(operator.peek())) {
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    char op = operator.pop();

                    int opval = operation(val1, val2, op);
                    operand.push(opval);
                }

                operator.push(ch);
            } else if (ch == ')') {
                while (operator.size() > 0 && operator.peek() != '(') {
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    char op = operator.pop();

                    int opval = operation(val1, val2, op);
                    operand.push(opval);
                }

                if (operator.size() > 0) {
                    operator.pop();
                }
            }
        }
        while (operator.size() > 0) {
            char optor = operator.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();

            int opv = operation(v1, v2, optor);
            operand.push(opv);
        }
        int val = operand.pop();
        System.out.println(val);

    }

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }
    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}