package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {

		int ver = 6;
		
		DFSGraph graph = new DFSGraph(ver);
		
		graph.addEdge(0, 1); // ��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(0, 2); // ��� 0���� ��� 2�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		
		System.out.println("DFS Ž�� ��� : ");
		
		// DFS Ž���� ������ ����� ��ȣ�� ����
		// 0���� Ž��
		graph.DFS(1);
	}

}
 
/**
 DFS Ž���� �����Ͽ� �� ����� ���
 Ž������� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 */