package baithuchanh2;

public class TestStack {
    public static void main(String args[]) {
        Stack stk = new Stack();

        stk.push(4);
        stk.push(2);
        stk.push(6);
        stk.push(3);

        stk.display();
        System.out.println();

        stk.pop();
        stk.display();
        System.out.println();

        System.out.println(stk.isEmpty());
        System.out.println(stk.numOfElements());
    }
}
