package week2.day3;

import java.util.*;
import java.util.Map.Entry;

public class PrintMap_4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		iterator
		.forEachRemaining((eachEntry)->System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue()));
	}
}