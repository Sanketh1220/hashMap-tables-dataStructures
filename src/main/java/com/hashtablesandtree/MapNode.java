package com.hashtablesandtree;

public class MapNode<K, V> implements INode<K> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setkey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue (V value) {
        this.value = value;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MapNode<K, V>) next;
    }

    public String toString() {
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MapNode{" + "K=").append(key)
                .append(" V=").append(value).append('}');
        if (next != null) {
            mapNodeString.append("->").append(next);
        }
        return mapNodeString.toString();
    }

}

