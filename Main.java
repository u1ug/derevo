package com.company;
import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args){

    }
}

class Person{
    String name;
    String sname;
    int id;
    int p1;
    int p2;
    ArrayList<Person>child = new ArrayList<>();
    String sex;
    public Person(String name,String sname,int id,int p1, int p2) {
        this.name = name;
        this.sname =sname;
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }
}