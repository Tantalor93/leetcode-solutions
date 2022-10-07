package com.github.tantalor93;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};

public class Solution116 {
	public Node connect(Node root) {
		Map<Integer, List<Node>> map = new HashMap<>();
		connect(root, 0, map);

		for(Integer k : map.keySet()) {
			var l = map.get(k);
			for(int i = 0; i < l.size(); i++) {
				if(i+1 < l.size()) {
					l.get(i).next = l.get(i+1);
				}
			}
		}
		return root;
	}

	public void connect(Node n, int level, Map<Integer, List<Node>> map) {
		if(n == null) {
			return;
		}
		if(map.get(level) == null) {
			map.put(level, new ArrayList<>());
		}

		map.get(level).add(n);

		connect(n.left, level+1, map);
		connect(n.right, level+1, map);
	}
}
