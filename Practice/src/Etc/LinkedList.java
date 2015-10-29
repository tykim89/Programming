package etc;

public class LinkedList {
	private Node head;
	
	// ��� �߰� �Լ�
	public void add(Node newNode){
		if(head == null){					// ��� ��尡 ���ٸ� ���� �߰��ϴ� ��尡 ��尡 ��
			head = newNode;
		}else{
			Node tail = head;				// ����� ������ ���� ��������� �ְ�
			while(tail.nextNode != null){	// ���� ����� ����...... ������ ��带 �˻�
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;		// ������ ��� �˻��� �������� ���� �߰��� ����� ���� ����
		}
	}
	
	// ��� �߰� �Լ� (������ ��ġ)
	public void add(Node newNode, int location){
		// ��� ��ġ�� ���Ե� ���
		if(location==0){
			newNode.nextNode = head;
			head = newNode;
		}else{
			Node before = head;
			// ���� ��带 ã�� ���� 
			while((--location)>0){
				before = before.nextNode;
			}
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
		}
	}
	
	// ��� Ž��
	public Node get(int location){
		Node current = head;
		
		while((--location)>0){
			current = current.nextNode;
		}
		
		return current;
	}
	
	// ��� ����
	public void remove(int location){
		
		if(location==0){
			head = head.nextNode;
		}else{
			Node before = head;
			while((--location)>0){
				before = before.nextNode;
			}
			
			Node after = before.nextNode.nextNode;
			
			if(after!=null){
				before.nextNode = after;
			}else{
				before.nextNode = null;
			}
		}
	}
	
	// ��� ���� ���
	public void print(){
		StringBuffer sb = new StringBuffer();
		Node current = head;
		int size = 0;
		
		while(current.nextNode!=null){
			sb.append(current.data);
			sb.append(", ");
			current = current.nextNode;
			size++;
		}
		sb.append(current.data);
		size++;
		
//		int i = sb.lastIndexOf(", ");
//		sb.delete(i, i+2);
		
		System.out.println("[ " + sb + "]");
		System.out.println("size : " + size);
	}
	
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		
		for(int i=0; i<5; i++){
			list.add(new Node(i));
		}
		
		list.print();
		
		System.out.println("\nDelete Node from index : 2\n");
		list.remove(2);
		list.print();
		
		System.out.println("\nInsert Node(100) to index : 2");
		System.out.println("Insert Node(200) to index : 2\n");
		list.add(new Node(100), 2);
		list.add(new Node(200), 2);
		list.print();
		
		System.out.println("\nRemove Node from index : 0\n");
		list.remove(0);
		list.print();
	}
}
