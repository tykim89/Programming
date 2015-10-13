package etc;

// ���ø����� ���� �ڹٿ� ���� ���� ����Ʈ
// �ڹٿ��� ���ʸ��� ����Ͽ� �����ϴ� ����� C/C++�� �����Ϳ� ����ϴ�.
// --> ������ ��� ���۷����� ���ٴ� ���� ������.
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
	
	// �Ӹ� ���� ���� - ���ο� �Ӹ� ���ҿ� ���� ���۷����� ��ȯ�ؾ� �Ѵ�.
	public ListElement<Integer> insertInFront(ListElement<Integer> list, int data){
		ListElement<Integer> l = new ListElement<Integer>(data);
		l.setNext(list);
		return l;
	}
	
	// ����Ʈ���� ã��, ������ �ƴ��� Ȯ���ؾ� �Ѵ�.
	// ����Ʈ�� ������ ���� �ݵ�� ���� ����Ʈ�� �������� Ȯ���ؾ� ��.
	public ListElement<Integer> find(ListElement<Integer> head, int data){
		ListElement<Integer> elem = head;
		while(elem!=null && elem.value()!=data){	// nullüũ�� ������, ã�� ��ü�� ����Ʈ�� ���� �� ������ ���Ҹ� ����ġ�� �Ǿ� ����
			elem = elem.next();
		}
		return elem;
	}
	
}
