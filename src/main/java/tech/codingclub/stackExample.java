package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        System.out.println("naman" + new Date().toString());

        Stack<String> stack = new Stack<String>();
        Stack<Integer> stackInteger = new Stack<Integer>();

        stackInteger.push(2);
        stackInteger.push(5);
        stackInteger.push(10);
        stackInteger.push(101);

        int topElementPopped = stackInteger.pop();

        System.out.println(stackInteger.peek());

        int index = stackInteger.search(5);
        int find200 = stackInteger.search(200);
        System.out.println(index);
        System.out.println(find200);

        Iterator integerIterator = stackInteger.iterator();
        while (((Iterator) integerIterator).hasNext()) {
            System.out.println("integer showing element" + ((Iterator) integerIterator).next());
        }

        while (!stackInteger.empty()) {
            int topElement = stackInteger.pop();
            System.out.println("popped:" + topElement);
        }


    }
}
