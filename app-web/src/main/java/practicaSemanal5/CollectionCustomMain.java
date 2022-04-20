package practicaSemanal5;

public class CollectionCustomMain {

	public static void main(String[] args) {
		
		CollectionCustom<String> genericArray = new CollectionCustom<String>(String.class, 3);
		
		// Pruebo método size
		System.out.println("Tamaño de genericArray: " + genericArray.size());
		
		// Pruebo método insertInPostion (no está en la consigna)
		genericArray.insertInPosition(0, "Hello");
		genericArray.insertInPosition(1, "World");
		genericArray.insertInPosition(2, "!!!");
		System.out.println(genericArray);
		
		// Pruebo método add
		genericArray.add("add");
		System.out.println(genericArray);
		
		// Pruebo método addFirst
		genericArray.addFirst("addFirst");
		System.out.println(genericArray);
		
		// Pruebo método addLast
		genericArray.addLast("addLast");
		System.out.println(genericArray);
		
		// Pruebo método remove	
		genericArray.remove("!!!");
		System.out.println(genericArray);
		
		// Pruebo método isEmpty
		String vacio = genericArray.empty() ? "SI" : "NO";
		System.out.println("Array vacío: " + vacio);
		
		// Pruebo método removeAll
		genericArray.removeAll();
		System.out.println(genericArray);
		
		// Pruebo nuevamente método isEmpty
		vacio = genericArray.empty() ? "SI" : "NO";
		System.out.println("Array vacío: " + vacio);	

	}

}
