/*
 * 스택
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * 첫번중에 주어지는 명령의 수는 N(1 <= N <= 10,000)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input;

        for (;N >= 0; N--) {
            input = sc.nextLine();
            String[] tokens = input.split(" ", -1);
            String command = tokens[0];

            for (String token : tokens) {
                if (token.equals("push")) {
                    int value = Integer.parseInt(tokens[1]);
                    linkedListStack.push(value);
                } else if (token.equals("pop")) {
                    System.out.println(linkedListStack.pop());
                } else if (token.equals("size")) {
                    System.out.println(linkedListStack.size());
                } else if (token.equals("empty")) {
                    if (linkedListStack.isStackEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if (token.equals("top")) {
                    System.out.println(linkedListStack.peek());
                }
            }
        }

        sc.close();
    }

    static class LinkedListStack {

        private class Node {
            int data;
            Node next;

            Node(int data) {
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

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            size +=1 ;
        }
        
        public int pop() {
            int tmp;
            if (isStackEmpty()) {
                return -1;
            } else if(size() == 1) {
                tmp = top.data;
                this.top = null;    
            } else {
                tmp = top.data;
                this.top = top.next;
                size -= 1;
            }
            return tmp;
        }

        public int size() {
            return this.size;
        }

        // 최상의 요소 확인
        public int peek() {
            if(isStackEmpty()) {
                return -1;
            }
            return top.data;
        }

        // stack이 비어 있는지 확인
        public boolean isStackEmpty() {
            return top == null;
        }

        
    }
}
