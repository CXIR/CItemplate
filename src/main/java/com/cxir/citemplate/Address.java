package com.cxir.citemplate;

public class Address {

    private    int number;
    private String additional;
    private String street;
    private String postal;
    private String city;

    public Address(    int number,
                    String additional,
                    String street,
                    String postal,
                    String city ) {

        this.number = number;
        this.additional = additional;
        this.street = street;
        this.postal = postal;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional( String additional ) {
        this.additional = additional;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal( String postal ) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
