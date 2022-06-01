package PriorityQueueRevision;

import java.util.PriorityQueue;

public class InBuildPriorityQueue {
    public static void main(String []args){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(23);
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(7);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
