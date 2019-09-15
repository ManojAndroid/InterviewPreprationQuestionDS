package com.intervie.code.company.HaloDoc;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import sun.misc.LRUCache;

public class DesignLRU {
	static Deque<Integer> dq;
	static Set<Integer> map;
	static int cSize;

	public DesignLRU(int n) {
		dq = new LinkedList<>();
		map = new HashSet<>();
		cSize = n;
	}

	void refer(int x) {
		if (!map.contains(x)) {
			if (dq.size() == cSize) {
				int remove = dq.removeLast();
				map.remove(remove);
			}
		} else {
			int index = 0, i = 0;
			for (Integer num : dq) {
				if (num == x) {
					index = i;
					break;
				}
				i++;
			}
			map.remove(index);
		}
		dq.push(x);
		map.add(x);
	}

	public void display() {
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		DesignLRU ca = new DesignLRU(4);
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(1);
		ca.refer(4);
		ca.refer(5);
		ca.display();
	}

}
