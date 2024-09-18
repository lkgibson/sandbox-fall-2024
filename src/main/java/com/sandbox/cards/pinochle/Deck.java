package com.sandbox.cards.pinochle;

/**
 * Defines the API for a deck of cards.
 * Used for extensibility for other types of decks that you may want to add later.
 */
public interface Deck {

    void cut(int index);

    Card deal();

    void newOrder(Deck cards);

    int search(Card card);

    void shuffle();

    int size();

    Card turnOver();

}
