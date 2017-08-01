package Struktury;


/**
 * Created by RENT on 2017-08-01.
 */
public class mList {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(mList list) {
        Element p = list._head;


        while (p.next != null) {
            p = p.next;
        }
    }

    public void goBackListBackward(mList list) {
        Element p = list._tail;

        while (p.prev != null) {
            p = p.prev;
        }

    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;
        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;//elementemu następnymu gdzie sie wepchalismy, przypisz nas jako poprzednika jakopierwszy element.
        } else {
            list._tail = p;
        }

    }

    public void addElementAtLast(int lastElement, mList list) {
        Element p = new Element();
        p.data = lastElement;
        p.next = null;
        p.next = list._tail;
        list._tail = p;
        list.counter++;
        if (p.prev != null) {
            Element lastEl = p.prev;
            lastEl.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }
    public void printAllElement(mList list){
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void elementBeetween(int elementToAdd, mList list, int elementBefore ) {
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head) {
            list.addElementAtBeginning(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

        public void elementNextAfter(int elementToAdd, int elementAfter, mList list){
        Element after = list.getElementForward(elementAfter, list);

        if(after == list._tail) {
            list.addElementAtLast(elementToAdd, list);
        }
        else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = after;
            p.next = after.next;
            Element nextAfter = after.next;
            nextAfter.next = p;

            list.counter++;
        }
    }





}






