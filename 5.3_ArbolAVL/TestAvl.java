
public class TestAvl {

	public static void main(String[] args) {
		AVL<Integer> b = new AVL<Integer>();
		
		try {
			b.insert(50);
			b.insert(80);
			b.insert(30);
			b.insert(100);
			b.insert(15);
			
			System.out.println(b);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
