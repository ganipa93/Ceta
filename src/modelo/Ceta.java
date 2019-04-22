package modelo;
import java.util.GregorianCalendar;
import modelo.Funcion;

public class Ceta {
	
	private static int idSiguiente=0;
	private long idCeta;
	private GregorianCalendar fecha;
	private double valorTransferencia;
	private Rodado auto;
	private Contribuyente comprador;
	private Contribuyente vendedor;
	
    
	//constructor1
	
	public Ceta (Contribuyente v, Contribuyente c, Rodado r, double p) throws Exception{
		setId();
		setFecha(new GregorianCalendar());
		setValorTransferencia(p);
		setRodado(r);
		setVendedor(v);
		setComprador(c);		
	}

	//constructor2
	
	public  Ceta (String [] compra, String [] vende,String [] rodad)throws Exception{
		
		setId();
		this.fecha=new GregorianCalendar();
		this.valorTransferencia=Double.parseDouble(rodad[2]);
		setRodado(rodad);
		setcomprador(compra);
		setvendedor(vende);
	}
		
	
	//getters y setters
	
	protected void setId(){
							idSiguiente++;
							setIdCeta(idSiguiente);}

	public long getIdCeta() {return idCeta;}
	
	public void setIdCeta(int valor){this.idCeta=valor;}
	
	public GregorianCalendar getFecha(){return fecha;}
	
	public void setFecha(GregorianCalendar fecha){this.fecha=fecha;}
	
	public double getValorTransferencia(){return valorTransferencia;}
	
	public void setValorTransferencia(double valorTransferencia){
		this.valorTransferencia=valorTransferencia;}
	
	public void setRodado(String [] movil)throws Exception{
		auto = new Rodado(movil[0], movil[1],Integer.parseInt(movil[3]));
	}
	
	public void setvendedor(String [] vende)throws Exception{
		this.vendedor = new Contribuyente(vende[0],vende[1],Long.parseLong(vende[4]), vende[2], vende[3].charAt(0));
	}
	
	public void setcomprador(String [] compra)throws Exception{
		this.comprador = new Contribuyente(compra[0],compra[1],Long.parseLong(compra[4]), compra[2], compra[3].charAt(0));
	}
	
	//getter y setters constructor1
	
		public void setRodado(Rodado r){
			this.auto=r;
		}
		
		public void setVendedor(Contribuyente v){
			this.vendedor=v;
			}
		
		public void setComprador(Contribuyente c) throws Exception{
			
			if(!(vendedor.equals(c))){
				throw new Exception("Error comprador y vendedor son los mismos Contribuyentes");
			}
			this.comprador=c;
		}
	
	
	// traer formulario
	
	public String traerFormulario(){
		String formulario="";
		
		formulario +="Fecha: "+Funcion.traerFechaCorta(fecha)+ "\nIdCeta: "+idCeta+"\n-----\nVendedor:  "+vendedor.toString()+ "\ncomprador: "+comprador.toString()+ 
		"\nValor de la transaferencia:"+valorTransferencia+
		"\n-----\nDatos del rodado:\n"+auto.toString();
		
	return formulario;}
	
}