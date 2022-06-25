public class AVLTree <E extends Comparable<E>> {
    
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

    public void insert(E x) throws ItemDuplicated{
		
	}
}
