package com.github.tantalor93.populatingnextrightpointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class Solution116 {
	// udelam DFS s tim ze si budu posilat uroven stromu, nasledne to prasknu do mapy, kde klic je uroven a hodnota je seznam vsech nodu na stejne urovni
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
