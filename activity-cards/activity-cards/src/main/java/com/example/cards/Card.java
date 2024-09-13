package com.example.cards;

public class Card implements Comparable<Card>

{

    private Suit suit;
    private FaceValue faceValue;

    private Card()
    {

    }

    public Card(Suit suit, FaceValue faceValue)
    {

    }

    public Suit getSuit()
    {
        return suit;
    }

    public FaceValue getFaceValue()
    {
        return faceValue;
    }

    @Override
    public int compareTo(Card o)
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Card{" +
                "suit=" + suit +
                ", faceValue=" + faceValue +
                '}';
    }
}
