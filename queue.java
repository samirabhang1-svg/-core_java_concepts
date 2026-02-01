import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //Queue
        Queue<Integer> queue= new LinkedList<Integer>();
        queue.offer(40);
        queue.offer(25);
        queue.add(25);
        queue.add(36);
        System.out.println("queue="+queue);
        //to remove we can use remove or poll function
     queue.poll();//hear the first added element removed first
      System.out.println("queue="+queue);
      //DEqueue
      Deque<Integer>adq= new ArrayDeque<>();
      adq.offer(25);
      adq.offer(26);
      adq.offerLast(27);
      adq.offerFirst(24);
      System.out.println("Dequeue="+adq);
      System.out.println(adq.pollLast());
            //this can remove the last element in the queue
            System.out.println(adq.peekLast());  
            //priority Queue
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            pq.offer(25);
            pq.offer(54);
            pq.offer(2);
            pq.offer(5);
            System.out.println("priority queue="+pq);
            //in java by default minimum heap is created hence ti arrange the list in the way that the minimum number is alawas on the first position
             PriorityQueue<Integer>cq=new PriorityQueue<>(Comparator.reverseOrder());
                         cq.offer(25);
            cq.offer(54);
            cq.offer(2);
            cq.offer(5);
            System.out.println("priority queue="+cq);
            //by using"comparator.reverseorder()" the max heap is created


    }
    
}
