package org.example.Pagination;

public class PageMessage implements IMessage{
    private String content;
    public PageMessage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}
