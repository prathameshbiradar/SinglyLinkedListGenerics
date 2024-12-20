package co.bridge;

public class PrintList <T>{
    public void printList(Node<T> head)
    {
        Node<T>current = head;
        while(current != null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
