public class LinkedList {
     Node head;
    public static class Node {

        int data;
        Node next;

        public Node(int d){
            data = d;
        }
    }
    public Node InsertAtHead(int data) {
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node temp2 = new Node(data);
        temp.next = temp2;
        return head;
    }
}

