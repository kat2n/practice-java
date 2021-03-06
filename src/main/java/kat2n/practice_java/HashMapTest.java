package main.java.kat2n.practice_java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
  public static void main(String[] args) {

    HashMap<String, Long> hashMap = new HashMap<>();

    hashMap.put("John", 6049885689L);
    hashMap.put("Kevin", 6043345689L);
    hashMap.put("Josh", 6045675689L);
    hashMap.put("Henry", 6041235689L);
    hashMap.put("Ken", 6049652689L);
    hashMap.put("Anton", 6049995689L);

    System.out.println(hashMap.get("Henry"));
    System.out.println("");

    Set<String> keys = hashMap.keySet();
    for (String i : keys) {
      System.out.println(i + " : " + hashMap.get(i));
    }
    System.out.println("");

    Set<Entry<String, Long>> values = hashMap.entrySet();
    for (Entry<String, Long> e : values) {
      System.out.println(e.getKey() + " : " + e.getValue());
    }
  }
}
