public class AVLTree <T extends Comparable<T>> {

    class Node {
		// No es necesario que Node tenga <T> Ya que esta clase (Node) está inculuida en una clase genérica
		protected T data;
		protected Node left;
		protected Node right;
		protected int fb; // Factor de balance
		
		public Node(T data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
			this.fb = 0;
		}
	
		// Para los nuevos nodos hoja (No tienen hijos)
		public Node(T data) {
			// Llamamos al constructor
			this(data, null, null);
		}
	}

    // ATRIBUTO DE LA CLASE AVL
	private Node root;

    // CONSTRUCTORES
	public AVL() {
		this.root = null;
	}

    // MÉTODOS DEL ÁRBOL
	
	// Para saber si el árbol está vacío
	public boolean isEmpty() {
		return this.root == null;
	}

    public void insert(T x) throws ItemDuplicated{
		
	}
}
