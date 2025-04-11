package com.xworkz.override.internal;

public class BookPublisher extends Publisher{
    public BookPublisher() {
        System.out.println("BookPublisher: Constructor is running");
    }

    @Override
    public void publish() {
        System.out.println("BookPublisher: Publishing printed and digital books");
    }

    public void editManuscript() {
        System.out.println("BookPublisher: Editing manuscript for publication");
    }

    public void designCover() {
        System.out.println("BookPublisher: Designing a book cover");
    }
}
