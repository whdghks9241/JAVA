package com.kh.treeMain;

/**
 ��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
 ���� ��ȸ : root(�Ѹ�)�� ���� �湮
 ���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 ���� ���� : ����Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 ���� ��ȸ : �� �� node�� ���� �Ʒ��������� ���ʴ�� �湮
 */
public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	/**
	 * insert �޼���� insertRac�޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	 */
	
	// insert : �ܺο� ����Ǵ� �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}

	// insertRec : ���� ���� �۾� �޼���
	// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
	// *����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���ǳ���.
	private TreeNode insertRec(TreeNode root, int data) {

		if (root == null) {
			root = new TreeNode(data);
			return root;
		} 
		
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
			System.out.println("����! : " + root.left.data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
			System.out.println("������! : " + root.right.data);
		}
		
		return root;
	}

	/**
	 inOder Traversal ������ȸ / �ܺο� ����Ǵ� �޼���
	 inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 ���� ����Ʈ�� ������ ������ ����Ʈ�� ������ ��� ���
	 */
	public void inOrderT() {
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
	
		if (root != null) {
			inOrderTR(root.left);
			inOrderTR(root.right);

//			System.out.println(" root.data : " + root.data + " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();

		tree.insert(400);
		tree.insert(200);
		tree.insert(220);
		tree.insert(230);
		tree.insert(240);
		tree.insert(250);
		tree.insert(260);
		tree.insert(270);
		tree.insert(280);
		tree.insert(290);
		tree.insert(300);
		tree.insert(50);
		tree.insert(40);
		tree.insert(10);
		tree.insert(100);
		tree.insert(90);
		tree.insert(80);
		tree.insert(30);
		tree.insert(70);
		tree.insert(150);
		tree.insert(60);
		tree.insert(120);
		tree.insert(130);
		tree.insert(140);
		tree.insert(150);
		tree.insert(160);
		tree.insert(170);
		tree.insert(180);
		
		System.out.println("���� Ʈ���� ������ȸ ��� : ");
		tree.inOrderT();
		
	
	}
}
