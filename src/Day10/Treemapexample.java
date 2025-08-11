package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemapexample {
	public static void main(String[] args) {
		//An object that maps keys to values
		//A map cannot contain duplicate keys
		//each key can map to atmost one value
		//The map is sorted according to the naturalorder
		//Values can be duplicated
		//no null as key is allowed
		//Multiple null values are followed
		//This implementation is not Synchronize.
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"Amit");
		map.put(2, "Vijay");
		map.put(3, "Rahul");
		map.put(4, "raju");
		map.put(5, "null");
		//if keys are duplicate values are getting replaced by latest.
		map.put(4, "ravi");
		
		//System.out.println(map);
		//converting the map to the set
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
