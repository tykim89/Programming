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
}