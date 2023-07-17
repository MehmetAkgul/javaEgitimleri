package org.collectionFramework.VektorVeStack.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");

     /*   for (String s : stack)
            System.out.println(s);*/

    /*    Enumeration<String> enumeration = stack.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }*/

        System.out.println("Son Eleman : " + stack.peek());
        System.out.println("************** Stackteki elemanlar ");
        for (String s : stack)
            System.out.println(s);

        System.out.println("Son Eleman Cikariliyor : " + stack.pop());
        System.out.println("************** Stackteki elemanlar ");
        for (String s : stack)
            System.out.println(s);
        System.out.println("************** Stackteki bosu mu ?  ");
        System.out.println(stack.empty());
        System.out.println("************** Stackteki bosu mu ?  ");
        while (!stack.empty())
            System.out.println("Eleman Cikariliyor: "+stack.pop());

        System.out.println(stack.pop());
    }
}
