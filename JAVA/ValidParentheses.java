// import java.util.Stack;

// public class ValidParentheses {
//     public static void main(String[] args) {
//         String s = "()[]}";
//         System.out.println(checkValid(s));
//     }

//     private static boolean checkValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 if (c == ')' && stack.peek() != '(') {
//                     return false;
//                 }
//                 if (c == '[' && stack.peek() != ']') {
//                     return false;
//                 }
//                 if (c == '{' && stack.peek() != '}') {
//                     return false;
//                 }
//                 stack.pop();
    
//             }
//         }
//         return stack.isEmpty();
//     }
// }