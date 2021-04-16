package com.hashtablesandtree;

public interface INode <K> {
    K getKey();
    void setkey(K key);

    INode<K> getNext();

    void setNext(INode<K> next);
}

