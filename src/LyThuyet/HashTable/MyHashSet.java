package LyThuyet.HashTable;

import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];

    MyHashSet() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    //return value
    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        if(keyIndex>=0){
            bucket.remove(keyIndex);
        }
    }

    private boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex>=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(5001);
        mySet.add(2);
        mySet.add(4);
        mySet.add(0);
        mySet.add(20);
        System.out.println(mySet.contains(0));
        mySet.remove(0);
        System.out.println(mySet.contains(0));
    }
}
