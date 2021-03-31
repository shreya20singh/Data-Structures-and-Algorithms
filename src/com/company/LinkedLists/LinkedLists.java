package com.company.LinkedLists;

public class LinkedLists {

    public static void main(String args[]){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
//        list.addLast(80);

//        list.removeLast();
//        System.out.println(list.contains(30));
//        System.out.println(list.toStringArray());
//        list.reverse();
//        System.out.println(list.getKthNodeFromTheEnd(20));
//        System.out.println(list.size());
        System.out.println(list.getMiddleNode()[0]);
        System.out.println(list.getMiddleNode()[1]);
    }
}
