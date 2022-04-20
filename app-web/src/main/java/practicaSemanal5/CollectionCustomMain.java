package practicaSemanal5;

public class CollectionCustomMain {

	public static void main(String[] args) {
		
		CollectionCustom<String> genericArray = new CollectionCustom<String>(String.class, 3);
		
		// Pruebo m�todo size
		System.out.println("Tama�o de genericArray: " + genericArray.size());
		
		// Pruebo m�todo insertInPostion (no est� en la consigna)
		genericArray.insertInPosition(0, "Hello");
		genericArray.insertInPosition(1, "World");
		genericArray.insertInPosition(2, "!!!");
		System.out.println(genericArray);
		
		// Pruebo m�todo add
		genericArray.add("add");
		System.out.println(genericArray);
		
		// Pruebo m�todo addFirst
		genericArray.addFirst("addFirst");
		System.out.println(genericArray);
		
		// Pruebo m�todo addLast
		genericArray.addLast("addLast");
		System.out.println(genericArray);
		
		// Pruebo m�todo remove	
		genericArray.remove("!!!");
		System.out.println(genericArray);
		
		// Pruebo m�todo isEmpty
		String vacio = genericArray.empty() ? "SI" : "NO";
		System.out.println("Array vac�o: " + vacio);
		
		// Pruebo m�todo removeAll
		genericArray.removeAll();
		System.out.println(genericArray);
		
		// Pruebo nuevamente m�todo isEmpty
		vacio = genericArray.empty() ? "SI" : "NO";
		System.out.println("Array vac�o: " + vacio);	

	}

}
