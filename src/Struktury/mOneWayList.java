package Struktury;

/**
 * Created by RENT on 2017-08-04.
 */
public class mOneWayList  {
    Element _head;
    int counter;

    public void goThroughListForward(mList list)
    {
        Element p = list._head;
        while (p.next != null)
        {
            p = p.next;
        }
    }
}
