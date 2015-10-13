package etc;

public abstract class Node {
	private Node[] children;
	
	public Node(Node[] children){
		this.children = children;
	}
	
	public int getNumChildren(){
		return children.length;
	}
	
	public Node getChild(int index){
		return children[index];
	}
	
	
	
	public class IntNode extends Node{
		private int value;
		
		public IntNode(Node[] children, int value) {
			super(children);
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
	}
		
}
