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


        while (N == 0) {
            N -= 1;
            input = sc.nextLine();
            String[] tokens = input.split("\\s+");
            for (String token : tokens) {
                if (token == "push") {
                    linkedListStack.push(tokens[1]);
                } else if (token == "pop") {
                    System.out.println(linkedListStack.pop());
                } else if (token == "size") {
                    System.out.println(linkedListStack.size());
                } else if (token == "empty") {
                    linkedListStack.isStackEmpty();
                    System.out.println();
                } else if (token == "top") {
                    linkedListStack.peek();
                    System.out.println();
                }
            }
        }
    }
}