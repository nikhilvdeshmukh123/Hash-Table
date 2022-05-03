package com.bridgelabz;

/*
 * @author: Nikhil Deshnukh
 * Ability to find frequency of words in a large paragraph phrase “Paranoids are not
 * paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations” 
 */
import java.util.ArrayList;

public class HashTableMain {
	public static void main(String[] args) {

		MyHashTable<String, Integer> hashTable = new MyHashTable();
		String message = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid avoidable situations";

		String[] messageArray = message.toLowerCase().split(" ");

		for (String word : messageArray) {
			Integer value = hashTable.get(word);

			if (value == null)
				value = 1;
			else

				value = value + 1;
			hashTable.add(word, value);
		}
		System.out.println(hashTable);
	}
}