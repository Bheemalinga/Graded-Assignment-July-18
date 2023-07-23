// package Graded_assignment;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListMain {

    public static Node removeDuplicates(Node head) {
        if (head == null)
            return null;

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // Skip the duplicate node
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Taking the number of elements in the linked list as input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = input.nextInt();

        Node head = null;
        Node tail = null;

        // Taking data for each node in the linked list using a for loop
        for (int i = 0; i < n; i++) {
            
            int data = input.nextInt();

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        input.close();

        head = removeDuplicates(head);

        System.out.print("Linked List after removing duplicates:");
        printLinkedList(head);
    }
}
