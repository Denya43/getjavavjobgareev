package main.java.com.getjavajob.training.gareev.init.gareev.lesson02.person;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

/**
 * Created by Denis on 01.04.2020.
 */
public class Person implements Serializable{

    private static  final long serialVrsnUID = 1L;

    @XStreamAlias("LastName")
    private String surname;
    @XStreamAlias("FirstName")
    private String name;
    @XStreamAlias("Patronymic")
    private String patronymic;

    public Person(){
    }
    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(String name){
       return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

}
