package models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person>{
    static int idCount = 1;
    int id;
    String name, surname;

    public Person(){
        id = idCount++;
        name = "";
        surname = "";
    }

    public Person(String name, String surname){
        id = idCount++;
        this.name = name;
        this.surname = surname;
    }

    public int getId(){
        return id;
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

    @Override
    public String toString() {
        return id + ". " + name + ", " + surname;
    }
    public abstract String getPosition();

    public String printData(){
        return toString() + " earns " + getPaymentAmount() + " tenge";
    }
}