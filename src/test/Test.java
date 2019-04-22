package test;

import modelo.Ceta;
import modelo.Contribuyente;
import modelo.Rodado;

public class Test {

	public static void main(String[] args){
		
		try{
			System.out.println("Escenario 1: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Rodriguez","Cristian","203246174000","m","32461740"};
			String [] valoresvendedor={"Dominguez","Nicolas","27356861818","m","87654310"};
			Ceta escenario1 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario1.traerFormulario());
			System.out.println("Creacion correcta!\n============");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 2: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Rodriguez","Cristian","203246174000","m","32461740"};
			String [] valoresvendedor={"Dominguez","Nicolas","27356861818","m","87654310"};
			Ceta escenario2 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario2.traerFormulario());
			System.out.println("Creacion correcta!\n\n\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 3: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Rodriguez","Cristian","203246174000","m","32461740"};
			String [] valoresvendedor={"Dominguez","Nicolas","27356861818","m","87654310"};
			Ceta escenario3 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario3.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 4: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Rodriguez","Cristian","20324617400","y","32461740"};
			String [] valoresvendedor={"Dominguez","Nicolas","20356861818","m","876543105"};
			Ceta escenario4 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario4.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 5: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Rodriguez","Cristian","20324617400","y","32461740"};
			String [] valoresvendedor={"Rodriguez","Cristian","20324617400","y","32461740"};
			Ceta escenario4 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario4.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("\nEscenario 6: ");
			Contribuyente vende= new Contribuyente("Pruebapellido", "Cosme", 12345678, "20356861818", 'm');
			Contribuyente compra1= new Contribuyente("Pruebapellido2", "Cosme2", 12345678, "20356861818", 'm');
			Contribuyente compra2= new Contribuyente("Pruebapellido3", "Cosme3", 12345678, "20324617400", 'm');
			Rodado rod= new Rodado("kas123", "Ford", 1982);
			Ceta ce= new Ceta(vende, compra1, rod, 12341.32);
			System.out.println(ce.traerFormulario());
			
			if(vende.equals(compra1)){System.out.println("Son iguales.");}else System.out.println("Son distintos.");
			if(vende.equals(compra2)){System.out.println("Son iguales.");}else System.out.println("Son distintos.");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
	}

}
