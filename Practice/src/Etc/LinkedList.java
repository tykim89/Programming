package etc;

public class LinkedList {
	private Node head;
	
	// 노드 추가 함수
	public void add(Node newNode){
		if(head == null){					// 헤드 노드가 없다면 새로 추가하는 노드가 헤드가 됨
			head = newNode;
		}else{
			Node tail = head;				// 노드의 꼬리에 기존 헤드정보를 넣고
			while(tail.nextNode != null){	// 기존 노드의 다음...... 마지막 노드를 검사
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;		// 마지막 노드 검사후 꼬리에는 새로 추가할 노드의 정보 삽입
		}
	}
	
	// 노드 추가 함수 (지정된 위치)
	public void add(Node newNode, int location){
		// 헤드 위치에 삽입될 경우
		if(location==0){
			newNode.nextNode = head;
			head = newNode;
		}else{
			Node before = head;
			// 이전 노드를 찾아 연결 
			while((--location)>0){
				before = before.nextNode;
			}
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
		}
	}
	
	// 노드 탐색
	public Node get(int location){
		Node current = head;
		
		while((--location)>0){
			current = current.nextNode;
		}
		
		return current;
	}
	
	// 노드 삭제
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
	
	// 노드 정보 출력
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
