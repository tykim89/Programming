package etc;

// 템플릿으로 만든 자바용 단일 연결 리스트
// 자바에서 제너릭을 사용하여 구현하는 방법도 C/C++의 포인터와 비슷하다.
// --> 포인터 대신 레퍼런스를 쓴다는 것이 차이점.
public class ListElement<T> {
	public ListElement(T value){
		data = value;
	}
	
	public ListElement<T> next(){
		return next;
	}
	public T value(){
		return data;
	}
	public void setNext(ListElement<T> elem){
		next = elem;
	}
	public void setValue(T value){
		data = value;
	}
	
	private ListElement<T> next;
	private T data;
	
	// 머리 원소 추적 - 새로운 머리 원소에 대한 레퍼런스를 반환해야 한다.
	public ListElement<Integer> insertInFront(ListElement<Integer> list, int data){
		ListElement<Integer> l = new ListElement<Integer>(data);
		l.setNext(list);
		return l;
	}
	
	// 리스트에서 찾기, 끝인지 아닌지 확인해야 한다.
	// 리스트를 종주할 때는 반드시 연결 리스트가 끝났는지 확인해야 함.
	public ListElement<Integer> find(ListElement<Integer> head, int data){
		ListElement<Integer> elem = head;
		while(elem!=null && elem.value()!=data){	// null체크가 없으면, 찾을 객체가 리스트에 없을 때 마지막 원소를 지나치게 되어 오류
			elem = elem.next();
		}
		return elem;
	}
	
}
