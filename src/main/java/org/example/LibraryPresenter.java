package org.example;

import java.util.List;

public class LibraryPresenter {
    public LibraryModel model;
    public LibraryView view;

    public LibraryPresenter(LibraryModel model,LibraryView view){
        this.model = model;
        this.view = view;
    }
    public  void performOperation (String operation, List<LibraryModel> books) {

        switch (operation) {
            case "1":
                model.searchIdBook(books);
                break;

            case "2":
                model.searchAuthor(books);
                break;
            default:
                System.out.println("Некорректная операция");
        }

    }
}
