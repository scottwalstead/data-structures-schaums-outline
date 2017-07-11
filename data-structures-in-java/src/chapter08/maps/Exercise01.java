package chapter08.maps;
import java.util.*;
/** Exercise 8.01
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */
public class Exercise01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Tag","day");
		map.put("Hut","hat");
		map.put("Uhr","clock");
		map.put("Rad","wheel");
		map.put("Ohr","ear");
		map.put("Tor","gate");
		map.put("Ast","gate");
		map.put("Eis","ice");
		map.put("Hof","court, yard, farm");
		map.put("Hut","hat");
		map.put("Lob","praise");
		map.put("Mal","mark, signal");
		map.put("Mut","courage");
		map.put("Ohr","ear");
		map.put("Ost","east");
		map.put("Rad","wheel");
		map.put("Rat","advice, counsel");
		map.put("Tag","day");
		map.put("Tor","gate");
		map.put("Uhr","clock");
		map.put("Wal","whale");
		map.put("Zug","procession, train");
		System.out.println("map=" + map);
		System.out.println("map.size()=" + map.size());
		System.out.println("map.keySet()=" + map.keySet());
		System.out.println("map.values()=" + map.values());
		System.out.println("map.get(\"Uhr\")=" + map.get("Uhr"));
		System.out.println("map.remove(\"Rad\")=" + map.remove("Rad"));
		System.out.println("map.get(\"Rad\")=" + map.get("Rad"));
		System.out.println("map=" + map);
		System.out.println("map.size()=" + map.size());

	}

}
