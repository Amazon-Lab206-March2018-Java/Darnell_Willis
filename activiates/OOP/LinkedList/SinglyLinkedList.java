/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    private Node head; 

    public void SinglyLinkedList() {
        this.head=null;
    }

    public SinglyLinkedList add(int addNode) {
        Node head = new Node(addNode);
        Node node = this.head;
        while (node.next != null) {
            System.out.println(node.toString());
            node = node.next;
        }
        return addNode;
    }


}