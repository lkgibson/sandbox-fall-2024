package com.sandbox.cards.standard;

import javax.naming.OperationNotSupportedException;

/**
 * Defines the API for a deck of cards.
 * Used for extensibility for other types of decks that you may want to add later.
 */
public interface Deck {

    void shuffle();

    void cut(int index);

    Card deal();

    Card turnOver();

    int search(Card card);

    void newOrder(Deck cards);

    int size();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

}
