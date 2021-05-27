package com.company;

public class BuyBook {

    private int ID_Client;;
    private String timeOne;
    private String timeTwo;
    public static BuyBook buyBook = new BuyBook(070112,"Второе марта", "Двадцатое марта");



    public BuyBook (int ID_Client, String timeOne, String timeTwo) {
       this.ID_Client = ID_Client;
       this.timeOne = timeOne;
       this.timeTwo = timeTwo;
    }

    public static BuyBook getBuyBook() {
        return buyBook;
    }

    public static void setBuyBook(BuyBook buyBook) {
        BuyBook.buyBook = buyBook;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public String getTimeOne() {
        return timeOne;
    }

    public String getTimeTwo() {
        return timeTwo;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    public void setTimeOne(String timeOne) {
        this.timeOne = timeOne;
    }

    public void setTimeTwo(String timeTwo) {
        this.timeTwo = timeTwo;
    }
    public void printAboutObject() {
        System.out.println("Взятая книга: ");
        System.out.println("ID Клиента: " + ID_Client);
        System.out.println("Дата выдачи: " + timeOne);
        System.out.println("Дата возврата: " + timeTwo);

        System.out.println();
    }
}
