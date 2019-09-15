package com.intervie.code.company.HaloDoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortNUrls {
	static void solve(String[] S, int N) {
		List<webDSite> sort = new ArrayList<>();
		Map<String, Integer> budget = new HashMap<>();

		for (String value : S) {
			if (null != budget.get(value)) {
				budget.put(value, budget.get(value) + 1);
			} else {
				budget.put(value, 1);
			}
		}
		for (Map.Entry<String, Integer> key : budget.entrySet()) {
			sort.add(new webDSite(key.getKey(), key.getValue()));
		}
		Collections.reverse(sort);
		String[] result = new String[sort.size()];
		for (int i = 0; i < sort.size(); i++) {
			webDSite value = sort.get(i);
			result[i] = value.url;
		}
		for (String str : result) {
			System.out.println(str);
		}

	}

	public static void main(String[] args) throws Exception {

		String[] strArray2 = { "https://www.hackerearth.com", "https://www.wikipedia.org", "https://www.google.com",
				"https://www.hackerearth.com", "https://www.hackerearth.com" };
		int n = strArray2.length;
		solve(strArray2, n);
	}

}

class webDSite implements Comparable<webDSite> {
	String url;
	int countVisited;

	public webDSite(String url, int count) {
		this.url = url;
		this.countVisited = count;
	}

	@Override
	public int compareTo(webDSite arg0) {
		// TODO Auto-generated method stub
		return (this.countVisited-arg0.countVisited);
	}

	
}
