package CollectionBasic;
/* CopyOnWriteArrayList class implements the List interface. It is an enhanced version of ArrayList in which all modifications (add, set, remove, etc) are
implemented by making a fresh copy. It is found in java.util.concurrent package. It is a data structure created to be used in a concurrent environment.

Here are few points about CopyOnWriteArrayList:
1)  As the name indicates, CopyOnWriteArrayList creates a Cloned copy of underlying ArrayList, for every update operation at a certain point both will be synchronized automatically, which is taken care of by JVM. Therefore, there is no effect for threads that are performing read operation.
2)  It is costly to use because for every update operation a cloned copy will be created. Hence, CopyOnWriteArrayList is the best choice if our frequent operation is read operation.
3)  The underlined data structure is a grow-able array.
4)  It is a thread-safe version of ArrayList.
5)  Insertion is preserved, duplicates, null, and heterogeneous Objects are allowed.
6)  The main important point about CopyOnWriteArrayList is the Iterator of CopyOnWriteArrayList can not perform remove operation otherwise we get Run-time exception saying UnsupportedOperationException. add() and set() methods on CopyOnWriteArrayList iterator also throws UnsupportedOperationException.
7) Also Iterator of CopyOnWriteArrayList will never throw ConcurrentModificationException.

public class CopyOnWriteArrayList<E> extends Object implements List<E>, RandomAccess, Cloneable, Serializable
 -------------- ********** Different Constructors *********** --------------------
 Constructors:

1) Creates an empty list. CopyOnWriteArrayList c = new CopyOnWriteArrayList();
2. CopyOnWriteArrayList(Collection obj): Creates a list containing the elements of the specified collection, in the order, they are returned by the collection’s iterator.

CopyOnWriteArrayList c = new CopyOnWriteArrayList(Collection obj);
3. CopyOnWriteArrayList(Object[] obj);: Creates a list holding a copy of the given array.

CopyOnWriteArrayList c = new CopyOnWriteArrayList(Object[] obj);
 */
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

        // Initial Iterator
        Iterator itr = list.iterator();
        list.add("GfG");
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

        // iterator after adding an element
        itr = list.iterator();
        System.out.println("List contains:");
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
