package etc;

public class BinaryNode {
	private BinaryNode left;
	private BinaryNode right;
	private int value;
	
	public BinaryNode(BinaryNode left, BinaryNode right, int value){
		this.left = left;
		this.right = right;
		this.value = value;
	}
	
	public BinaryNode getLeft(){
		return left;
	}
	public BinaryNode getRight(){
		return right;
	}
	public int getValue(){
		return value;
	}
	
	// Binary Search Tree
	// 장점 : lookup(트리에 있는 특정 노드의 위치를 알아내는 연산)을 빠르고 간단하게 처리.
	// O(log n)
	// 최악의 경우, 각 노드가 다른 노드를 하나씩 가리킬 경우 = 연결 리스트 ==> O(n)
	BinaryNode findNode(BinaryNode root, int value){
		while(root!=null){
			int currval = root.getValue();
			if(currval==value){
				break;
			}
			if(currval<value){
				root = root.getRight();
			}else{	// currval>value
				root = root.getLeft();
			}
		}
		
		return root;
	}
	
	// 재귀적으로 구현
	BinaryNode findReculNode(BinaryNode root, int value){
		if(root==null){
			return null;
		}
		int currval = root.getValue();
		if(currval==value){
			return root;
		}
		if(currval<value){
			return findReculNode(root.getRight(), value);
		}else{
			return findReculNode(root.getLeft(), value);
		}
	}
	
	// heap : 노드의 각 자식의 값은 자기 자신의 값 이하여야 함.
	// root는 그 트리에서 가장 큰 값, 최대값을 상수 시간으로 구하는 것 가능 = root값 리턴
	// 삽입과 삭제는 O(log n), 룩업은 O(n)
	
	
	// 트리의 높이 구하기
	public static int treeHeight(BinaryNode n){
		if(n==null){
			return 0;
		}
		return 1+Math.max(treeHeight(n.getLeft()), treeHeight(n.getRight()));
	}
	
	// Pre-order
	public void preorderTraversal(BinaryNode root){
		if(root==null){
			return;
		}
		root.getValue();
		preorderTraversal(root.getLeft());
		preorderTraversal(root.getRight());
	}
	
	// In-order
	public void inorderTraversal(BinaryNode root){
		if(root==null){
			return;
		}
		inorderTraversal(root.getLeft());
		root.getValue();
		inorderTraversal(root.getRight());
	}
	
	// Post-order
	public void postorderTraversal(BinaryNode root){
		if(root==null){
			return;
		}
		postorderTraversal(root.getLeft());
		postorderTraversal(root.getRight());
		root.getValue();
	}
}