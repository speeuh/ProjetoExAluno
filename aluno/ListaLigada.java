package aluno;

public class ListaLigada {
	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void adicionaInicio(Object node) {
		Node newNode = new Node(this.head, node);
		this.head = newNode;
		
		if(this.size == 0) {
			this.tail = this.head;
		}
		
		this.size++;
	}
	
	public void adicionaFinal(Object node) {
		if(this.size == 0) {
			adicionaInicio(node);
		} 
		Node newNode = new Node(node);
		
		this.tail.setProximo(newNode);
		this.tail = newNode;
		this.size++;
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			this.head = this.head.getProximo();
			this.size--;
		}
	}
	
	public void exibir() {
		if(isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			Node aux = this.head;
			
			while(aux != null) {
				System.out.println(aux.getElemento().toString());
				aux = aux.getProximo();
			}
		}
	}
}
