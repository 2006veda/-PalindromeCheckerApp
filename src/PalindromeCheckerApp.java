import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class UseCase6PalindromeCheckerApp{
    public static void main(String[] args){
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);     // Enqueue (FIFO)
            stack.push(c);    // Push (LIFO)
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);


    }
}
