package modelo;
import modelo.Funcion;

public class Rodado {
	
	private static long idSiguiente=0;
	private long idRodado;
	private String dominio;
	private String marca;
	private int modelo;
	
	public Rodado(String patente, String marca, int model)throws Exception{
		
		setDominio(patente);
		setMarca(marca);
		setModelo(model);
		setId();
		}
	
	protected void setId(){
		idSiguiente++;
		setIdRodado(idSiguiente);
	}
	
	
	public boolean validarDominio(String patente){
		boolean correcto = true;
		patente = patente.toUpperCase();
		
		if(patente.length() == 6){
			for(int i=0;i<=5;i++){
				if(i==0 || i==1 || i==2){
					if(!(Funcion.validarLetra(patente.charAt(i)))){
						correcto = false;}
				}
				if(i==3 || i==4 || i==5){
					if(!(Funcion.validarNum(patente.charAt(i)))){
						correcto = false;
					}
				}
							
			}
		}else correcto=false;
		
	return correcto;
	}
	
	public void setDominio(String dominio) throws Exception {
		if(validarDominio(dominio)){
			dominio=dominio.toUpperCase();
			this.dominio=dominio;
		}else throw new Exception("Error: El dominio no es valido.");
	}
	
	public void setModelo(int modelo) throws Exception {
		if(modelo >= 1930){this.modelo = modelo;
			}else throw new Exception("Error: Modelo no valido.");
	}
	
	public void setIdRodado(long idRodado) { this.idRodado = idRodado;}
	
	public void setMarca(String marca) {this.marca = marca;	}
	
	public String toString(){
		String datos = "Dominio: "+this.dominio+"\nMarca: "+this.marca+"\nModelo: "+this.modelo;
		
		return datos;
	}
	

}
