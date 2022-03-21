package baithuchanh7;

public class Node {
    private char key;
    private Node leftNode;
    private Node rightNode;

    public char getKey () {
        return key;
    }
    public Node getLeftNode () {
        return leftNode;
    }
    public Node getRightNode () {
        return rightNode;
    }

    public void duyet (int order) { // 0 tien thu tu, 1 trung thu tu, 2 hau thu tu
        if(this == null) return;
        switch (order) {
            case 0:
                System.out.print(this.getKey() + " ");
                this.getLeftNode().duyet(order);
                this.getRightNode().duyet(order);
                break;
            case 1:
                this.getLeftNode().duyet(order);
                System.out.print(this.getKey() + " ");
                this.getRightNode().duyet(order);
                break;
            case 2:
                this.getLeftNode().duyet(order);
                this.getRightNode().duyet(order);
                System.out.print(this.getKey() + " ");
                break;
            default:
                return;
        }

    }
}
