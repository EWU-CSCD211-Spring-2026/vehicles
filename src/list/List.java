
package list;

/**
 * List API
 */
public interface List<T> {

    /**
     * Add to the beginning of the list
     * @param element the element to add
     */
    void addFirst(T element);

    /**
     * Add to the end of the list
     * @param element the element to add
     */
    void addLast(T element);

    /**
     * Add at a specific index, such that after the add operation, the element is at the index
     * @param element the element to add
     * @param index the index where the element should be
     */
    void addAtIndex(T element, int index);

    /**
     * return the size of the list
     * @return the size of the list
     */
    int size();

    /**
     * Search the list and return whether the element is in the list
     * @return true if list contains element, false otherwise
     */
    boolean contains(T element);

    /**
     * Remove the first element found in the list
     * @param element the element to remove
     */
    void removeFirst(T element);

    /**
     * Retern whether the list is empty
     * @return true if empty, false otherwise
     */
    boolean isEmpty();


}
