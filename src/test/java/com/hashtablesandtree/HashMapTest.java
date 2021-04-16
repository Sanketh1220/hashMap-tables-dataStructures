package com.hashtablesandtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    @Test
    public void givenASentence_WhenWordsAre_AddedToList_ShouldReturn_WordFrequency() {
        String sentence = "To be or not to be";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
                hashMap.add(word, value);
            }
            int frequency = hashMap.get("to");
            System.out.println(hashMap);
            Assertions.assertEquals(2, frequency);
        }
    }
}
