package collection_hash_table;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
       Hashtable<Integer, String> hashTable = new Hashtable<>();
       
       hashTable.put(1, "Monika");
       hashTable.put(2,  "Divyanshi");
       hashTable.put(3, "Avighnaa");
       hashTable.put(4, "YuvRaj Rathod");
       
       
       String divya = hashTable.get(2);
       String yuvi = hashTable.get(4);
       System.out.println(divya);
       System.out.println(yuvi);
       
    }
}
