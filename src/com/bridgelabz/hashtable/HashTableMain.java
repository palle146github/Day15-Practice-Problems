package com.bridgelabz.hashtable;

import java.util.Hashtable;

public class HashTableMain {

    public static void main(String[] args) {

        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] paraArray = paragraph.split(" ");
        HashTable<String,Integer> hashTable = new HashTable<>(7);
        for (String word : paraArray) {
            System.out.println(word + " => " + hashTable.getIndex(word));
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null) {
                hashTable.add(word, 1);
            } else {
                currentFrequency += 1;
                hashTable.add(word, currentFrequency);
            }
        }
        System.out.println(hashTable);




//        Hashtable<String,String> ht = new Hashtable<>();
//        ht.put("ABC","abc");
//        ht.put("BCD","bcd");
    }
}
