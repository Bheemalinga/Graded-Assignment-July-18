// package Graded_assignment;

import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void merge(LinkedList list) {
        if (list.head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list.head;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            while (nextNode != null) {
                if (current.data > nextNode.data) {
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}

public class Main {
    public static void main(String[] args) {

        int n1,n2;
        System.out.print("Enter the 1st LinkedList Length : ");
        Scanner input = new Scanner(System.in);
         

        LinkedList list1 = new LinkedList();
        n1 = input.nextInt();        
         for (int i=0; i<n1; i++){
            list1.append(input.nextInt());
         }


        LinkedList list2 = new LinkedList();
        System.out.print("Enter the 2nd LinkedList Length : ");
        n2 = input.nextInt();
        for(int i=0; i<n2; i++){
            list2.append(input.nextInt());
        }

        input.close();


        list1.merge(list2);
        list1.sort();

        System.out.println("Merged and Sorted Linked-List:");
        list1.display();
    }
}
