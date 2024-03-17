package org.example.Pagination;

import java.util.Scanner;

public class PaginationApp {
    private Pagination pagination;
    private Scanner scanner;
    private int pageSize;

    public PaginationApp() {
        pagination = new Pagination();
        scanner = new Scanner(System.in);
    }

    public void run() {
        displayWelcomeMessage();

        while (true) {
            displayMenu();
            String command = scanner.nextLine();
            executeCommand(command);
        }
    }

    private void displayWelcomeMessage() {
        System.out.println("\nWelcome to the Java Console Pagination Program!");
        System.out.println("You can manage lists of items with pagination controls.\n");
    }

    private void displayMenu() {
        System.out.println("Menu:");
        System.out.println("  addFirst<size>      : Create a new page and define size");
        System.out.println("  add            : Create a new page");
        System.out.println("  first          : Go to the first page");
        System.out.println("  last           : Go to the last page");
        System.out.println("  next           : Go to the next page");
        System.out.println("  prev           : Go to the previous page");
        System.out.println("  goto <page_number> : Go to a specific page");
        System.out.println("  exit           : Exit the program");
        System.out.println(" ");
        System.out.println("Current Page: " + pagination.getCurrentPage() + " of " + pagination.getLists().size());
        System.out.println("-----------------------------------------------------");
        System.out.print(">");
    }

    private void executeCommand(String command) {
        String[] parts = command.split(" ");
        switch (parts[0]) {
            case "addFirst":
                addFirstPage(parts);
                break;
            case "add":
                addPage(parts);
                break;
            case "first":
                pagination.first();
                break;
            case "last":
                pagination.last();
                break;
            case "next":
                pagination.next();
                break;
            case "prev":
                pagination.prev();
                break;
            case "goto":
                pagination.goToPage(Integer.parseInt(parts[1]));
                break;
            case "exit":
                System.exit(0);
            default:
                MessageFactory.invalidCommandMessage().display();
        }
    }

    private void addFirstPage(String[] parts) {
        pageSize = Integer.parseInt(parts[1]);
        PaginatedElements firstPage = new PaginatedElements(pageSize);
        pagination.addPaginatedElements(firstPage);

        for (int i = 0; i < pageSize; i++) {
            MessageFactory.enterElementMessage().display();
            String input = scanner.nextLine();
            if (input.equals("menu")) {
                break;
            } else {
                firstPage.addElement(input);
                if (firstPage.isFull()) {
                    MessageFactory.pageIsFullMessage().display();
                    System.out.println(" ");
                    break;
                }
            }
        }
    }

    private void addPage(String[] parts) {
        if (pageSize == 0) {
            MessageFactory.addFirstCommandMessage().display();
            return;
        }
        PaginatedElements newPage = new PaginatedElements(pageSize);
        pagination.addPaginatedElements(newPage);

        for (int i = 0; i < pageSize; i++) {
            MessageFactory.enterElementMessage().display();
            String input = scanner.nextLine();
            if (input.equals("menu")) {
                break;
            } else {
                newPage.addElement(input);
                if (newPage.isFull()) {
                    MessageFactory.pageIsFullMessage().display();
                    System.out.println(" ");
                    break;
                }
            }
        }
    }
}

