package com.company.LinkedLists;

import java.util.NoSuchElementException;


public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item){
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public boolean contains(int item){
//        var temp = first;
//        while (temp != null){
//            if(temp.value == item)
//                return true;
//            temp= temp.next;
//        }
//        return false;
        return indexOf(item) != -1;
    }

    public int getKthNodeFromTheEnd(int k){
        if(first == null)
            throw new NoSuchElementException();
        if(k == 0)
            return last.value;

        var firstPointer = first;
        var secondPointer = first;
        int count = 0;
        while (firstPointer != last){
            firstPointer = firstPointer.next;
            count++;
            if(count < k)
                continue;
            secondPointer = secondPointer.next;
        }
        if(k > count+1)
            throw new IllegalArgumentException();
        return secondPointer.value;
    }

    public int[] getMiddleNode(){
        if(first == null)
            throw new NoSuchElementException();

        var firstPointer = first.next;
        var secondPointer = first;
        int result[] = {0,0};
        int count = 1;
        while (firstPointer != last){
            count++;
            if(firstPointer == null)
                break;
            firstPointer = firstPointer.next.next;
            secondPointer = secondPointer.next;
        }
        result[0] = secondPointer.value;
        if(count % 2 == 0) {
            result[1] = secondPointer.next.value;
        }
        return result;
    }

    public boolean linkedListHasLoop(){
        if(first == null)
            throw new NoSuchElementException();

        var firstPointer = first;
        var secondPointer = first;
        while (firstPointer != last){
            if(firstPointer == null)
                break;
            firstPointer = firstPointer.next.next;
            secondPointer = secondPointer.next;
            if (firstPointer == secondPointer)
                return true;
        }
        return false;
    }

    public int indexOf(int item){
        int index = 0;
        var temp = first;
        if(first == null)
            throw new NoSuchElementException();

        while (temp != null){
            if(temp.value == item){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst(){
        var temp = first;
        if(first == last) {
            first = last = null;
            return;
        }
        first = null;
        first = temp.next;
        size--;
    }

    public void removeLast(){
        var temp = first;
        if(first == null)
            throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            return;
        }
        while (temp != null){
            if (temp.next == last){
                last = temp;
                last.next = null;
            }
            temp = temp.next;
        }
        size--;
    }

    public int[] toStringArray(){
        int[] stringArray = new int[size];
        int i = 0;
        var temp = first;
        while (temp != null){
           stringArray[i++] = temp.value;
            temp = temp.next;
        }
        return stringArray;
    }

    public void reverse(){
        if (first == null)
            return;

       var previous = first;
       var current = first.next;
       while ( current != null){
           var next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
        last = first;
        last.next = null;
        first = previous;
    }

    public int size(){
        if(first == null)
            return 0;
//        return indexOf(last.value)+1;
        return size;
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

}
