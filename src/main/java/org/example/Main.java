package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LibraryView view = new LibraryView();
        LibraryModel model = new LibraryModel();

        LibraryPresenter presenter = new LibraryPresenter(model,view);

        String operation = view.getOperation();
        List<LibraryModel> books = model.createBook();
        presenter.performOperation(operation, books);

    }
}