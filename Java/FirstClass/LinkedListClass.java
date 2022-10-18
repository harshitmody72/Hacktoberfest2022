public class LinkedListClass {
    Node head;
    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.details();
        System.out.println(list.delete(20));
        list.details();
        list.insert(2,60);
        list.details();
        System.out.println(list.delete(40));
        list.details();
        list.insert(3,40);
        list.details();
        System.out.println(list.delete(40));
        list.details();
        System.out.println(list.delete(10));
        list.details();

    }
    public void details(){
        Node current = head;
        if(head == null){
            System.out.println("Empty List");
        }else {
            System.out.print("List{ ");
            while (current.next != null) {
                System.out.print(current.value+ "->");
                current = current.next;
            }
            System.out.println(current.value + " }");
        }

    }

    public int delete(int value){
        Node current = head;
        Node previous = null;
        if (current != null && head.value == value) {
            head = head.next;
            return value;
        }

        while (current != null && current.value != value) {
            previous = current;
            current = current.next;
        }
        if(current != null && current.value == value) {
            previous.next = current.next;
            return value;
        }
        if (current == null)
            return -1;
        return -1;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void insert(int index , int value){
        Node newNode = new Node(value);
        Node currentNode = head;
        Node temp = null;


        if(currentNode != null && index == 0 ){
            head = newNode;
            head.next = currentNode;
            System.out.println("Done");
            return;
        }

        for(int i = 0 ; i < index; i ++){
            if(currentNode != null) {
                temp = currentNode;
                currentNode = currentNode.next;
            }else {
                System.out.println("Index Out of Bound");
                return;
            }
        }
        temp.next = newNode;
        newNode.next = currentNode;
        System.out.println("Done");

    }
}

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
}
