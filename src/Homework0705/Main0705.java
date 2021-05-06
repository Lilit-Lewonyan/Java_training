package Homework0705;

import java.util.*;

public class Main0705 {
    public static void main(String[] args) {
        String function;
        Scanner scanner = new Scanner(System.in);
        function = scanner.next();
        function.toCharArray();
        System.out.println("The function Validation is "+ isFunctionValid(function));

    }

    public static boolean isFunctionValid(String function){
        Stack<Integer> stack = new Stack<>();
        char[] charArray = function.toCharArray();
        for(int i =0; i<charArray.length; i++){
            if(charArray[i] ==40 || charArray[i] ==41 ||charArray[i] ==123 || charArray[i] ==125 || charArray[i] ==91 || charArray[i] ==93)
            //queue.add((int) charArray[i]);
                stack.push((int) charArray[i]);
        }
        //System.out.println(stack);
        for(int i =0; i<charArray.length; i++) {
            if (stack.pop() == stack.elementAt(0))
                stack.peek();

        }
        if (stack.isEmpty())
            return true;
        else
            return  false;

       // return true;
    }

}
