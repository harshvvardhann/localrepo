import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class a {
    public static void displayList(Node first) {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node deleteMnodesAfterNnodes(int m, int n, Node first) {
        Node temp = first;
        if (temp == null) {
            System.out.println("LL is empty:");
            return null;
        }

        int mCount = 1;
        int nCount = 0;

        while (temp != null && mCount <= m) {
            System.out.print(temp.data + " ");
            mCount++;
            temp = temp.next;
        }

        while (temp != null && nCount < n) {
            nCount++;
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        System.out.println("Original linked list:");
        displayList(first);

        System.out.println("Linked list until m and after deleting n nodes:");
        Node remainingList = deleteMnodesAfterNnodes(m, n, first);
        displayList(remainingList);

        scanner.close();
    }
}
