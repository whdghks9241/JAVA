package com.kh.Pracice;

import com.kh.GraphMain.DFSGraph;

public class DFSGraphExam {
	public static void main(String[] args) {
		
		int ver = 7;
		
		DFSGraph g = new DFSGraph(ver);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 6);
		g.addEdge(3, 0);
		g.addEdge(6, 4);
		g.addEdge(2, 5);
		
		g.DFS(0);
	}
}
