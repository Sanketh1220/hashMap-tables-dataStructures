package com.hashtablesandtree;

public class HashMap<K, V> {
    NewLinkList<K> linkedList ;

    public HashMap() {
        this.linkedList = new NewLinkList<>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        if(mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.linkedList.append(mapNode);
        }else {
            mapNode.setValue(value);
        }
    }
//
//    @Override
//    public String toString() {
//        return "HashMapNodes{" + linkedList + '}';
//    }
}

