public class LinkedListStack {

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // 스택의 최상위 노드
    private int size;

    public LinkedListStack() { // 생성자
        this.top = null;
        this.size = 0;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        top = newNode;
        newNode.next = top;
    }
    
    public String pop() {
        String tmp;
        if (isStackEmpty()) {
            return -1;
        } else if(size() == 1) {
            tmp = top.data;
            this.top = null;    
        } else {
            tmp = top.data;
            this.top = top.next;
        }
        return tmp;
    }

    public int size() {
        return this.size;
    }

    // 최상의 요소 확인
    public String peek() {
        if(isStackEmpty()) {
            return "-1";
        }
        return top.data;
    }

    // stack이 비어 있는지 확인
    public boolean isStackEmpty() {
        return top == null;
    }

    
}