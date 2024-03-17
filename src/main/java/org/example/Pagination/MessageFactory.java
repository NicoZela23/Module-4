package org.example.Pagination;

public class MessageFactory {

    public static IMessage pageIsFullMessage(){
        return new PageMessage("Page is full");
    }
    public static IMessage invalidPageNumberMessage(){
        return new PageMessage("Invalid page number.");
    }
    public static IMessage noNextPageMessage(){
        return new PageMessage("There is no next page.");
    }

    public static IMessage alreadyFirstPageMessage(){
        return new PageMessage("You are already on the first page");
    }
    public static IMessage enterElementMessage(){
        return new PageMessage("Enter element to add:");
    }
    public static IMessage invalidCommandMessage(){
        return new PageMessage("Invalid command.");
    }
    public static IMessage addFirstCommandMessage(){
        return new PageMessage("Please use 'addFirst' command to specify page size first.");
    }
    public static IMessage listEmptyMessage(){
        return new ListMessage("Pagination list is empty. Nothing to show");
    }
}
