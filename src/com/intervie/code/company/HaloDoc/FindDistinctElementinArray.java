package com.intervie.code.company.HaloDoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDistinctElementinArray {
	
	
	
	/*select count(e.empno), d.deptno, d.dname 
	from emp e, dep d
	where e.DEPTNO = d.DEPTNO 
	group by d.deptno, d.dname;*/
	
	static void distinct(int arr[]) {
		int length = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// if (entry.getValue() == 1)
			System.out.println("digit " + entry.getKey() + " value" + entry.getValue());
		}

	}

	public static void main(String args[])

	{
		int ar[] = { 10, 5, 3, 4, 3, 5, 6 };
		distinct(ar);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			hm.put(ar[i], i);
		}
		System.out.println(hm.keySet());

	}

}
