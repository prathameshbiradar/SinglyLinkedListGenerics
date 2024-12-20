package co.bridge;

public class SearchElement<T> {
    public boolean searchElement(Node<T> head,T target)
    {
        while(head != null)
        {
            if(head.data==target)
            {
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
