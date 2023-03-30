package personalAssignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SortHashMap {

	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String args[]) {
	map.put("Rebu",10);
	map.put("Arjun",12);
	map.put("Suresh", null);
	map.put(null, null);
	map.put(null, 12);
	map.put(null,13);
	map.put("Siddhu",15);
	Set<String> s = new HashSet<String>(map.keySet());
	Iterator itr = s.iterator();
	while(itr.hasNext())
		System.out.println("Key : " + itr.next());
	System.out.println("Given values " + map);//.toString());
	}
}
