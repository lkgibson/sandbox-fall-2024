package com.example.cards;

public interface Deck

{

    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    int search(Card card);
    void newOrder(Deck cards);
    int size();

}
