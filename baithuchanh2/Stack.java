package baithuchanh2;

final class Node {
    int item;
    Node next;

    public Node () {

    }
    public Node (Node node) {
        this.item = node.item;
        if(node.next ==  null) return;
        this.next = new Node(node.next);
    }
    public Node (int value) {
        this.item = value;
        this.next = new Node();
    }
}

public class Stack {
    private Node top;
    private int size;

    public Stack () {

    }
    public Stack (Stack stk) {
        this.top = new Node(stk.getTop());
        this.size = stk.getSize();
    }
    
    public Node getTop () {
        return new Node(top);
    }
    public int getSize () {
        return size;
    }
    public void setTop (Node top) {
        this.top = new Node(top);
    }
    public void setSize (int size) {
        this.size = size;
    }

    //method
    public void push (int value) {
        Node node = new Node(value);
        node.next = this.getTop();
        this.top = node;
        size++;
    }

    public int pop () {
        if(size <= 0) return -1;
        int value = top.item;
        top = top.next;
        size--;
        return value;
    }
    public boolean isEmpty () {
        return size <= 0;
    }
    public int numOfElements () {
        return size;
    }
    public void display () {
        Stack stk = new Stack(this);
        while(stk.getTop() != null) {
            System.out.print(stk.getTop().item + " ");
            stk.setTop(stk.getTop().next);
        }
    }


}
