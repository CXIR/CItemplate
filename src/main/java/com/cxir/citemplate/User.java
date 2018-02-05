package com.cxir.citemplate;

import java.util.ArrayList;

public class User {

    private String name;
    private String first;
    private int age;
    private Address address;
    private ArrayList<Mark> marks;

    public User(  String name,
                  String first,
                     int age,
                 Address address) {

        this.name = name;
        this.first = first;
        this.age = age;
        this.address = address;

        this.marks = new ArrayList<Mark>();
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst( String first ) {
        this.first = first;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress( Address address ) {
        this.address = address;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public int addMark( Mark mark ) {
        try
        {
            this.marks.add(mark);
            return 1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    public int removeMark( Mark mark ) {
        try
        {
            this.marks.remove(mark);
            return 1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    public int editMark( Mark mark, float notation ) {

        try
        {
            this.marks.get(this.marks.indexOf(mark)).setMark(notation);
            return 1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public String toString() {
        return this.name
                + " "
                + this.first
                + " "
                + this.age
                + " "
                + this.address;
    }
}
