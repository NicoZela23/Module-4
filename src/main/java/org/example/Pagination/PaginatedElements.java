package org.example.Pagination;

public class PaginatedElements<T> {
    private T[] items;
    private int size;

    private int fixedSize;

    public PaginatedElements(int sizeItems) {
        this.items = (T[]) new Object[sizeItems];
        this.size = 0;
        this.fixedSize = sizeItems;
    }

    public int getFixedSize() {
        return fixedSize;
    }

    public void addElement(T item) {
        if (size >= items.length) {
            MessageFactory.pageIsFullMessage().display();
        } else {
            items[size] = item;
            size++;
        }
    }


    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
        System.out.println(" ");
    }

    public boolean isFull() {
        return size == items.length;
    }
}
