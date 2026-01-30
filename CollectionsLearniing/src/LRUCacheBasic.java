import java.util.HashMap;

public class LRUCacheBasic {
    class Node {
        Node next;
        Node prev;
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1);

        int cap;
        HashMap<Integer, Node> mp = new HashMap<>();

        public LRUCacheBasic(int cap){
            this.cap = cap;
            head.next = tail;
            tail.prev = head;
        }
        void addNode(Node newNode){
            Node temp = head.next;
            newNode.next = temp;
            newNode.prev = head;
            head.next = newNode;
            temp.prev = newNode;
        }

        void deleteNode(Node delNode){
            Node delPrev = delNode.prev;
            Node delNext = delNode.next;
            delPrev.next = delNext;
            delNext.prev = delPrev;
        }
    public int get(int key){
       if(mp.containsKey(key)){
           Node node = mp.get(key);
           int res = node.value;
           mp.remove(key);
           deleteNode(node);
           addNode(node);
           mp.put(key,head.next);
           return res;
       }
       return -1;
    }
    public void put(int key,int value){
            if(mp.containsKey(key)){
            Node node = mp.get(key);
            node.value = value;
            addNode(node);
            deleteNode(node);
            mp.put(key,node);
        }
    }

}
