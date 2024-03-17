package org.example.Pagination;

import java.util.ArrayList;
import java.util.List;

public class Pagination {
    private List<PaginatedElements> lists;
    private int currentPage;

    public Pagination() {
        this.lists = new ArrayList<>();
        this.currentPage = 0;
    }
    public void addPaginatedElements(PaginatedElements elementsList){
        lists.add(elementsList);
    }

    public void goToPage(int pageNumber) {
        if (!isEmpty()) {
            if (pageNumber >= 1 && pageNumber <= lists.size()) {
                PaginatedElements displayedList = lists.get(pageNumber - 1);
                displayedList.displayElements();
                currentPage = pageNumber;
            } else {
                MessageFactory.invalidPageNumberMessage().display();
            }
        } else {
            MessageFactory.listEmptyMessage().display();
        }
    }

    public void first() {
        if (!isEmpty()) {
            goToPage(1);
        } else {
            MessageFactory.listEmptyMessage().display();
        }
    }

    public void last() {
        if (!isEmpty()) {
            goToPage(lists.size());
        } else {
            MessageFactory.listEmptyMessage().display();
        }
    }

    public void next() {
        if (!isEmpty()) {
            if (currentPage < lists.size()) {
                goToPage(currentPage + 1);
            } else {
                MessageFactory.noNextPageMessage().display();
            }
        } else {
            MessageFactory.listEmptyMessage().display();
        }
    }

    public void prev() {
        if (!isEmpty()) {
            if (currentPage > 1) {
                goToPage(currentPage - 1);
            } else {
                MessageFactory.alreadyFirstPageMessage().display();
            }
        } else {
            MessageFactory.listEmptyMessage().display();
        }
    }
    public boolean isEmpty(){
        return lists.isEmpty();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public List<PaginatedElements> getLists() {
        return lists;
    }
}

