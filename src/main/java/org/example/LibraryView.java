package org.example;

import java.util.Scanner;

public class LibraryView {
    private Scanner scanner;
    public LibraryView(){
        scanner = new Scanner(System.in);
    }

    public String getOperation(){
        System.out.println("Выберите операцию: 1 (поиск по id), 2 (поиск по автору) ");
        return scanner.nextLine();
    }

}
