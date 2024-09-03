package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LibraryModel {
    int id_book;
    String author;
    String title;



    public List<LibraryModel> createBook() { 
        LibraryModel book1 = new LibraryModel(1,"Пушкин","Сказка о царе Салтане");
        LibraryModel book2 = new LibraryModel(2,"Бунин","Тёмные аллеи");
        LibraryModel book3 = new LibraryModel(3,"Толстой","Война и мир");
        LibraryModel book4 = new LibraryModel(4,"Пушкин","Капитанская дочка");
        LibraryModel book5 = new LibraryModel(5,"Бунин","Господин из Сан-Франциско");
        LibraryModel book6 = new LibraryModel(6,"Толстой","Анна Каренина");
        LibraryModel book7 = new LibraryModel(7,"Пушкин","Руслан и Людмила");
        LibraryModel book8 = new LibraryModel(8,"Космополитен","Выпуск Июль 2024");
        LibraryModel book9 = new LibraryModel(9,"Микрофильм","Полет на Марс");
        LibraryModel book10 = new LibraryModel(10,"Микрофильм","Вчера,Сегодня,Завтра");
        LibraryModel book11 = new LibraryModel(11,"Письмо","Как я провел лето");
        LibraryModel book12 = new LibraryModel(12,"Толстой","Детство");
        LibraryModel book13 = new LibraryModel(13,"Есенин","Стихи");
        LibraryModel book14 = new LibraryModel(14,"Космополитен","Выпуск Сентябрь 2024");
        LibraryModel book15 = new LibraryModel(15,"Маяковский","Облако в штанах");

        List<LibraryModel> books = new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12,book13,book14,book15));
        return books;
    }

    public void searchIdBook(List<LibraryModel> books) { 
        System.out.println("Введите id издания: ");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());

        for (LibraryModel book : books) {
            if (book.getId_book() == a) {
                System.out.println(book);
            }
        }
    }

    public void searchAuthor(List<LibraryModel> books) { 
        System.out.println("Введите автора издания: ");
        String b = new Scanner(System.in).nextLine();

        for (LibraryModel book : books) {
            if (book.getAuthor().equals(b)) {
                System.out.println(book);
            }
        }
    }

}
