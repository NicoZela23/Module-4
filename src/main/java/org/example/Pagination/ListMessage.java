package org.example.Pagination;

public class ListMessage implements IMessage{
    private String content;

    public ListMessage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}
