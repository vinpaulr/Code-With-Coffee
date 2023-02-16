package com.datastructure.linkedlist;

public class SinglyLinkedList {

    Node head;
    private int size=0;

    public SinglyLinkedList(){
        this.size=0;
    }

    // Insert a node at the beginning of the Singly Linked List
    public void insertAtBeginning(Object data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        this.size++;
    }

    // Insert a node at the end of the Singly Linked List
    public void insertAtEnd(Object data) {
        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {
            Node curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        this.size++;
    }

    // Add a node at a given position in the Singly Linked List
    public void insert(Object data, int position) {
        if(position < 0)
            position = 0;

        if(position > size)
            position = size;

        Node newNode = new Node(data);

        if(head==null)
            head= newNode;
        else if(position == 0){
          newNode.next = head;
          head = newNode;
        } else {
            int pos = 0;

            Node currNode = head, prev = null;

            while(pos < position) {
                prev = currNode;
                currNode = currNode.next;
                pos++;
            }

            newNode.next = currNode;
            prev.next= newNode;
        }
         this.size++;
    }

    // Remove an element at the beginning of the Singly Linked List
    public Node removeFromBeginning() {
        if(head == null)
            return null;

        Node node = head;

        head = node.next;
        this.size--;
        return node;
    }

    // Remove an element at the end of the Singly Linked List
    public Node removeFromEnd() {
        Node node = head, prev = null;

        while(node != null && node.next != null) {
            prev = node;
            node = node.next;
        }

        prev.next = null;
        this.size--;
        return node;
    }

    //Remove an element at a given position from the Singly Linked List
    public void remove(int position) {
        if(position < 0)
            position = 0;

        if(position > size)
            position = size;

        Node node = head;

        if(position == 0) {
            head = node.next;
            node = null;
        } else {
            int pos = 0;
            Node prev = null;

            while(pos < position) {
                prev = node;
                node = node.next;
                pos++;
            }

            prev.next = node.next;
            node.next = null;
            node = null;
            this.size--;
        }
    }

    //Remove an element at a given position from the Singly Linked List
    public void removeNode(Node node) {
        if(node == null)
            return;

        Node curr = head, prev = null;

        while(curr != null && !curr.equals(node)) {
            prev = curr;
            curr = curr.next;
        }
        if(prev != null && curr != null) {
            prev.next = curr.next;
            this.size--;
        }
    }

    // get the index of the given object
    public int getPosition(Object data) {
        if(data == null)
            return Integer.MIN_VALUE;

        Node currNode = head;
        int pos = 0;

        while(currNode != null) {
            if(currNode.data.equals(data)){
                return pos;
            }
            pos++;
            currNode = currNode.next;
        }

        return Integer.MIN_VALUE;
    }

    public void clear() {
        head = null;
        this.size = 0;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("[");
        
        if(head == null)
            return result.append("]").toString();

        Node currNode = head;
            
            while(currNode != null) {
                result.append(currNode.data);
                currNode = currNode.next;
                if(currNode != null)
                    result.append(",");
            }

        result.append("]");
        return result.toString();
    }

    public int length() {
        return this.size;
    }


    // Node class
    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

}
