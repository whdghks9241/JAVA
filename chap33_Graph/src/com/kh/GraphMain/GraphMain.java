package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {

		int ver = 6;
		
		DFSGraph graph = new DFSGraph(ver);
		
		graph.addEdge(0, 1); // 노드 0에서 노드 1로 방향이 있는 엣지를 추가
		graph.addEdge(0, 2); // 노드 0에서 노드 2로 방향이 있는 엣지를 추가
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		
		System.out.println("DFS 탐색 결과 : ");
		
		// DFS 탐색을 시작할 노드의 번호를 전달
		// 0으로 탐색
		graph.DFS(1);
	}

}
 
/**
 DFS 탐색을 시작하여 그 결과를 출력
 탐색결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
 */
