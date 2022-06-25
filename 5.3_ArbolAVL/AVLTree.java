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
    private boolean height; // Si pasa a true es cambio de altura, false lo contrario

    // CONSTRUCTORES
	public AVL() {
		this.root = null;
	}

    // MÉTODOS DEL ÁRBOL
	
	// Para saber si el árbol está vacío
	public boolean isEmpty() {
		return this.root == null;
	}

	public void insert(T x) throws ItemDuplicated {
		this.height = false; // Por si el nodo no se inserta
		this.root = insertRec(x, this.root);
	}

    private Node insertRec(E x, Node current) throws ItemDuplicated {
		Node res = current;
		if(current == null) {
			// En el caso base cuando hay inserción debemos consultar el cambio de altura
			this.height = true; 
			res = new Node(x);
		}
		else {
			// resC == resultado de la comparación
			int resC = current.data.compareTo(x);
			if (resC == 0)
				throw new ItemDuplicated("El dato " + x + " ya fue insertado antes.");
			if (resC < 0) {
				res.right = insertRec(x, current.right);
				if (this.height) { // Si existe un cambio en la altura
					switch(res.fb) {// Casos de fb si insertamos por la derecha
					// En inserción si fb pasa de -1 o 1 a 0 entonces no hay cambio de altura
					case -1: res.fb = 0; this.height = false; break; // Se cancela el recálculo de altura
					case 0: res.fb = 1; this.height = true; break; // Seguimos recalculando
					case 1: //res.fb = 2; debemos balancear el árbol
						res = balanceToLeft(res);
						this.height = false; // Cuando hacemos la rotación el árbol debe quedar balanceado
					}
				}
			}
			else {
				res.left = insertRec(x, current.left);
				if(this.height) { // Si existe un cambio en la altura
					switch(res.fb) { // Casos de fb si insertamos por la derecha
					// En inserción si fb pasa de -1 o 1 a 0 entonces no hay cambio de altura
					case 1: res.fb = 0; this.height = false; break;// Se cancela el rec�lculo de altura
					case 0: res.fb = -1; this.height = true; break; // Seguimos recalculando
					case -1: //res.fb = -2; debemos balancear el árbol
						res = balanceToRight(res);
						this.height = false; // Cuando hacemos la rotación el árbol debe quedar balanceado
					}
				}
			}

		}
		return res;
	}
}
