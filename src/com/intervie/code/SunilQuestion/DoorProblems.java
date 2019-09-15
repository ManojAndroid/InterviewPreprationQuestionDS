package com.intervie.code.SunilQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoorProblems {
	static int openDoor() {
		boolean[] doorStatus = new boolean[20+1];
		int number = 1;
		int result = 0;
		while (number <= 3) {
			
			for (int i = 1; i < doorStatus.length; i++) {
				if (number == 1) {
					doorStatus[i] = true;

				} 
				else if (number == 2 && i % 2 == 0) {
					if (doorStatus[i])
						doorStatus[i] = false;
					else
						doorStatus[i] = true;
				} else if (number == 3 && i % 3 == 0) {
					if (doorStatus[i])
						doorStatus[i] = false;
					else
						doorStatus[i] = true;
				}
			}
			number++;
		}
		for (int i = 1; i < doorStatus.length; i++) {
			if (doorStatus[i])
				result++;
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println("count " + openDoor());
		Map<String, Object> requestData = new HashMap<String, Object>();
		requestData.put("blocking", "wait");
		List<String> list=new ArrayList<String>();
		list.add("918826265216");
		requestData.put("contacts", list);
		System.out.println(requestData.toString());
	}

}
