import java.util.*;

class Main {

    static int postfix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] arr = exp.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (isNumber(s)) {
                st.push(Integer.parseInt(s));
            } else {
                int b = st.pop();
                int a = st.pop();
                st.push(calc(a, b, s));
            }
        }

        return st.pop();
    }

    static int prefix(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] arr = exp.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            String s = arr[i];

            if (isNumber(s)) {
                st.push(Integer.parseInt(s));
            } else {
                int a = st.pop();
                int b = st.pop();
                st.push(calc(a, b, s));
            }
        }

        return st.pop();
    }

    static boolean isNumber(String s) {
        return Character.isDigit(s.charAt(0));
    }

    static int calc(int a, int b, String op) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        if (op.equals("/")) return a / b;
        return 0;
    }

    public static void main(String[] args) {
        String post = "10 5 + 3 *";
        String pre = "* + 10 5 3";

        System.out.println(postfix(post));
        System.out.println(prefix(pre));
    }
}