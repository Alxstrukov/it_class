package lessons.lesson17_18_19._02_queue;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//            Deque<String> stack = new ArrayDeque<>();
//            Deque<String> queue = new ArrayDeque<>();
//            stack.push("A");// вставляет элемент в начало очереди
//            stack.push("B");
//            stack.push("C");
//            stack.push("D");
//            System.out.println(stack);
//
//            while (!stack.isEmpty()) {
//                System.out.println(stack.pop());
//            }
//            queue.add("A"); //ставляет элемент в хвост очереди
//            queue.add("B");
//            queue.add("C");
//            queue.add("D");
//            System.out.println(queue);


//        LinkedList<String> list = new LinkedList<>();
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//        list.addFirst("A");
//        list.addLast("F");
//        System.out.println(list);
//        list.remove("F");
//        list.remove(2);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list);

        Queue<String> queue1 = new PriorityQueue<>(); //очередь с приоритетом, сортирует элементы с помощью компаратора
        queue1.offer("A");
        queue1.offer("J");
        queue1.offer("E");
        queue1.offer("F");
        queue1.offer("B");

        while (queue1.size() > 0) {
            System.out.println(queue1.remove() + " ");
        }
        Queue<String> queue2 = new PriorityQueue<>(5, Collections.reverseOrder());//добавили свой компаратор
        queue2.offer("A");//добавляет элемент, если есть место
        queue2.offer("J");
        queue2.offer("E");
        queue2.offer("F");
        queue2.offer("B");
        while (queue2.size() > 0) {
            System.out.println(queue2.remove() + " ");
        }


    }
}
