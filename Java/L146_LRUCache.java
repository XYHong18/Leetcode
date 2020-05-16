import java.util.Hashtable;

public class L146_LRUCache {
    class DoublyLinkedNode {
        int key;
        int value;
        DoublyLinkedNode prev;
        DoublyLinkedNode next;
    }
    
    
    private Hashtable<Integer, DoublyLinkedNode> map;
    private DoublyLinkedNode head, tail;
    private int count, capacity;
    
    
    public LRUCache(int capacity) {
        map = new Hashtable<Integer, DoublyLinkedNode>();
        count = 0;
        this.capacity = capacity;
        head = new DoublyLinkedNode();
        tail = new DoublyLinkedNode();
        head.next = tail;
        tail.prev = head;
    }
    
    
    private void deleteNode(DoublyLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
    }
    
    private void addNode(DoublyLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    
    public int get(int key) {
        DoublyLinkedNode node = map.get(key);
        
        if (node != null) {
            int res = node.value;
            deleteNode(node);
            addNode(node);
            return res;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        DoublyLinkedNode node = map.get(key);
        
        if (node == null) {
            DoublyLinkedNode newNode = new DoublyLinkedNode();
            newNode.key = key;
            newNode.value = value;
            
            if (count < capacity) {
                count++;
            } else {
                DoublyLinkedNode lastNode = tail.prev;
                deleteNode(lastNode);
                int lastKey = lastNode.key;
                map.remove(lastKey);
            }
            
            addNode(newNode);
            map.put(key, newNode);
        } else {
            node.value = value;
            deleteNode(node);
            addNode(node);
        }
    }
}

/* 
Complexity Analysis:
1. Time Complexity: O(1) both for put and get;
2. Space Complexity: O(capacity).
*/