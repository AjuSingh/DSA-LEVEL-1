package linkedList;

public class Main {
public static void main(String[] args) {
    LL list  = new LL(); 
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.deleteFirst();
    list.deleteFirst();
    list.deleteEnd();
    list.print();
}

 
}
