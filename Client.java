package com.company;

public class Client {

    private String name;
    private String surname;
    private String midName;;
    private int number;
    private String address;
    public static Client client = new Client("Степа", "Степченко", "Петрович", 2, "пр.Ватутина 3");


    public Client (String name, String surname, String midName, int number, String address) {
        this.name = name;
        this.surname = surname;
        this.midName = midName;
        this.number = number;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getMidName() {
        return midName;
    }
    public void setMidName(String midName) {
        this.midName = midName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAboutObject() {
        System.out.println("Данные о клиенте: ");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Отчество: " + midName);
        System.out.println("Номер телефона: " + number);
        System.out.println("Адрес: " + address);
        System.out.println();
    }

}
