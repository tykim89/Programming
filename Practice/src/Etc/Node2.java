package etc;

public abstract class Node2 {
	private Node2[] children;
	
	public Node2(Node2[] children){
		this.children = children;
	}
	
	public int getNumChildren(){
		return children.length;
	}
	
	public Node2 getChild(int index){
		return children[index];
	}
	
	
	
	public class IntNode extends Node2{
		private int value;
		
		public IntNode(Node2[] children, int value) {
			super(children);
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
	}
		
}
