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
	// ���� : lookup(Ʈ���� �ִ� Ư�� ����� ��ġ�� �˾Ƴ��� ����)�� ������ �����ϰ� ó��.
	// O(log n)
	// �־��� ���, �� ��尡 �ٸ� ��带 �ϳ��� ����ų ��� = ���� ����Ʈ ==> O(n)
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
	
	// ��������� ����
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
	
	// heap : ����� �� �ڽ��� ���� �ڱ� �ڽ��� �� ���Ͽ��� ��.
	// root�� �� Ʈ������ ���� ū ��, �ִ밪�� ��� �ð����� ���ϴ� �� ���� = root�� ����
	// ���԰� ������ O(log n), ����� O(n)
	
	
	// Ʈ���� ���� ���ϱ�
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