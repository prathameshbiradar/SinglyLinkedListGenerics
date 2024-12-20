package co.bridge;

public class Main<T> {
    public static void main(String[] args) {


        InsertElement<Integer> sl = new InsertElement<>();

        Node<Integer> head = null;
        head = sl.insertAtBegining(head,1);
        head = sl.insertAtLast(head,2);
        head = sl.insertAtPos(head,2,3);
        head= sl.insertAtBegining(head,4);
        head = sl.insertAtLast(head,5);

        PrintList<Integer> pl = new PrintList<>();
        pl.printList(head);
        System.out.println();

        DeleteElement<Integer> dl = new DeleteElement<>();
        head=dl.deleteFirstNode(head);
        head= dl.deleteElementLast(head);
        System.out.println("Elements after deleting From List");
        pl.printList(head);
        System.out.println();

        SearchElement<Integer>se = new SearchElement<>();
        System.out.println("Is element present in the list: "+se.searchElement(head,3));


    }
}
