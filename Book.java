package com.company;

public class Book {

    private String nameBook;
    private String author;
    private String genre;;
    private double zPrice;
    private double price;
    public static Book book = new Book("Полёт", "Решеченко В.В.", "Фантастика", 250, 500);



    public Book (String nameBook, String author, String genre, double zPrice, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.genre = genre;
        this.zPrice = zPrice;
        this.price = price;
    }

    public static Book getBook() {
        return book;
    }

    public double getPrice() {
        return price;
    }

    public double getzPrice() {
        return zPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getNameBook() {
        return nameBook;
    }

    public static void setBook(Book book) {
        Book.book = book;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setzPrice(double zPrice) {
        this.zPrice = zPrice;
    }

    public void printAboutObject() {
        System.out.println("Книга: ");
        System.out.println("Название книги: " + nameBook);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Залоговая стоимость: " + zPrice);
        System.out.println("Стоимость проката: " + price);
        System.out.println();
    }
}
