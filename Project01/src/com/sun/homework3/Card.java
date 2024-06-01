package com.sun.homework3;

public class Card {
    private String decor;
    private String number;
    public Card(String decor,String number)
    {
        this.decor=decor;
        this.number=number;
    }
    public void showCard()
    {
        System.out.println(decor+number);
    }
}
