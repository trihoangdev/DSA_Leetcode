package LyThuyet.HashTable;

import java.util.ArrayList;

public class MyHashMap {
    private class Data{
        int key;
        int value;
        Data (int key,int value){
            this.key = key;
            this.value = value;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Data){
                return this.key == ((Data)obj).key;
            }
            return false;
        }
        
    }
    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];
    public MyHashMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex>=0){
            bucket.get(keyIndex).value = value;
        }else{
            bucket.add(newData);
        }
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDeleteData = new Data(key, 0);
        bucket.remove(myDeleteData);
    }

    private int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if(keyIndex>=0)
            return bucket.get(keyIndex).value;
        return -1;
    }
}

