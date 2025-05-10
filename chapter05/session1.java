import java.util.Queue;
import java.util.LinkedList;

public class session1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // ---- Adding Elements ----
        System.out.println("Adding elements:");
        queue.add("Apple");  // add() throws exception if it fails
        queue.offer("Banana"); // offer() returns false if it fails
        System.out.println("Queue after add/offer: " + queue); // [Apple, Banana]

        // ---- Peeking at Elements ----
        System.out.println("\nPeeking elements:");
        System.out.println("element(): " + queue.element()); // Returns head, throws if empty
        System.out.println("peek(): " + queue.peek());       // Returns head, null if empty

        // ---- Removing Elements ----
        System.out.println("\nRemoving elements:");
        System.out.println("remove(): " + queue.remove()); // Removes head, throws if empty
        System.out.println("poll(): " + queue.poll());     // Removes head, null if empty

        // ---- Check queue after removals
        System.out.println("Queue now: " + queue); // []

        // ---- Try methods on an empty queue ----
        System.out.println("\nWhen queue is empty:");
        try {
            System.out.println("remove(): " + queue.remove()); // Will throw exception
        } catch (Exception e) {
            System.out.println("remove() threw: " + e);
        }

        System.out.println("poll(): " + queue.poll());       // null
        try {
            System.out.println("element(): " + queue.element()); // Will throw exception
        } catch (Exception e) {
            System.out.println("element() threw: " + e);
        }

        System.out.println("peek(): " + queue.peek());       // null
    }
}