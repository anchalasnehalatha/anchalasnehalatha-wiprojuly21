package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//one key as null
//key should be unique
//values can be any null values
//ordering-based on sorting

public class mapexample {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Amit");
		map.put(2, "Vijay");
		map.put(3, "Rahul");
		map.put(4, "null");
		map.put(5, "null");
		map.put(null, null);
		map.put(null, null);
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
