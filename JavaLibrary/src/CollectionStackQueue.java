import java.util.*;

public class CollectionStackQueue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack);
        String out = stack.pop();
        System.out.println(out);
        String last = stack.peek();
        System.out.println(last);
        System.out.println(stack);


        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue);
        String outQ = queue.poll();
        System.out.println(outQ);
        String frontQ = queue.peek();
        System.out.println(frontQ);
        System.out.println(queue);

        Set<String> set = new HashSet<>();
        set.add(null);
        System.out.println(set);
    }
}
