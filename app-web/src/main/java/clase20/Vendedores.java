package clase20;

import java.util.*;

public class Vendedores {

	private Collection<String> vendores;
	
	public Vendedores() {
		vendores = new HashSet<String>();
		
		//primera liena del archivo 
		vendores.add("id|nombre|sucursal");
		
		//cada vendedor
		vendores.add("1|juan|1");
		vendores.add("2|pedro|1");
		vendores.add("3|nico|2");
		vendores.add("4|santiago|3");
	}
	
	//necesito un metodo publico
	public Collection<Vendedor> getVendedores() {
		//que necesito hacer?
		//parsear
		for(int i = 1;i < this.vendores.size();i++) {
			
		}
		
		//otra forma
		Iterator<String> itVendedores = this.vendores.iterator();
		Collection<Vendedor> vendedores = new HashSet<Vendedor>();
		if(itVendedores.hasNext()) {
			String primerLinea = itVendedores.next();//id|nombre|sucursal
			while(itVendedores.hasNext()) {
				String siguienteLinea = itVendedores.next();//1|juan|1
				String[] arrayVendedor = siguienteLinea.split("\\|");
				Vendedor v = new Vendedor(Long.parseLong(arrayVendedor[0]), arrayVendedor[1], arrayVendedor[2]);
				vendedores.add(v);
			}
		}
		return vendedores;
	}
}
