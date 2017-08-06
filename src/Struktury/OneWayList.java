package Struktury;

/**
 * Created by RENT on 2017-08-04.
 */
public class mOneWayList {
    Element _head;
    Element _iterator;
    int counter;

    public void addElementAtBeginning(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
    }


    public void addAtLast (int newElement, mOneWayList list) {
      Element p = new Element();
        p.data = newElement;
        counter++;
        _iterator = list._head;
        while (_iterator.next != null) {
            _iterator = _iterator.next;
        }
        _iterator.next = p;

    }

//    public void

}
