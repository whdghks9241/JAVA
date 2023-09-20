package com.kh.treeMain;
/**
 노드 를 나타내는 데 적절한 클래스
 */
public class TreeNode {
	// 데이터 저장
	int data; 	
	// 왼쪽 자식 노드를 참조하는 링크
	TreeNode left;
	// 오른쪽 자식 노드를 참조하는 링크
	TreeNode right;
	
	// 노드를 생성할 때 데이터를 초기화 하고 왼쪽과 오른쪽 링크를 null로 초기화 
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
