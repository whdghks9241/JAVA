package com.kh.Pracice;

import com.kh.BFS.BFSGraph;
import com.kh.GraphMain.DFSGraph;

public class PracticeGraph {

	public static void main(String[] args) {
		
		PracticeGraph ph = new PracticeGraph();
		ph.BFSPracticeMain();
	}
	
	public void BFSPracticeMain() {
		int ver = 13;
		
		BFSGraph g = new BFSGraph(ver);
		g.addEdge(0 , 1);
		g.addEdge(0	, 2);
		g.addEdge(1	, 3);
		g.addEdge(1	, 4);
		g.addEdge(2	, 5);
		g.addEdge(2	, 6);
		g.addEdge(3	, 7);
		g.addEdge(3	, 8);
		g.addEdge(4	, 9);
		g.addEdge(4	, 10);
		g.addEdge(5	, 11);
		g.addEdge(5	, 12);
		
		g.BFS(2);
	}
	
	public void DFSPracticeMain() {
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
