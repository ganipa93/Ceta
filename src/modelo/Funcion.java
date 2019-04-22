package modelo;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Funcion {

	
	// traer año
	public static int traerAnio (GregorianCalendar anio){
		return anio.get(Calendar.YEAR);
	}
	
	//traer mes
	public static int traerMes (GregorianCalendar mes){
		return (mes.get(Calendar.MONTH))+1;
		
	}
	/*traer dia*/
	
	public static int traerDia (GregorianCalendar dia){
		return dia.get(Calendar.DAY_OF_MONTH);
	}
		
	// es bisiesto??
	
	public static boolean esBisisesto (int a){
		return ((a%4 == 0 && a%100 !=0) || a%400 ==0);
	}
	
	//es fecha valida??
	
		public static boolean fechaValida(int a, int m, int d){
			
			GregorianCalendar fechaActual= new GregorianCalendar();
			int anioActual= fechaActual.get(GregorianCalendar.YEAR);
			boolean correcto= true;
			
			if(a <= 0 || a > anioActual){
				correcto=false;}
			
			if(m<0 || m>12){
				correcto=false;
			}
			if (m==2){
					if (esBisisesto(a)){
						if(d<1 || d>29 ){
							correcto=false;
						}
					}else {if(d<1 || d>28){correcto=false;}}
			
				}
				else{
					if(m==4 || m==6 || m==9 || m==11){
						if(d<0 || d>30){
							correcto=false;
						}
						else{
							if(d<0 || d>31){
								correcto=false;
								
							}
							
						}
				}
					
			}
			
			return correcto;
		}
		
	//Traer fecha (parametros int, devuelve gregorian)
	public static GregorianCalendar traerFecha(int a, int m, int d){
		GregorianCalendar fecha=null;
		
			
		if (fechaValida(a,m,d)) fecha= new GregorianCalendar(a,m,d);
		return fecha;
		}
	
	//traer fecha (parametro Stringr, devuelve calendar)
	public static GregorianCalendar traerFecha(String fecha){
		String anio,mes,dia;
		GregorianCalendar date;
		
		dia=fecha.substring(0,2);
		mes=fecha.substring(3,5);
		anio=fecha.substring(6);
		
		if(fechaValida(Integer.parseInt(anio),Integer.parseInt(mes)-1,Integer.parseInt(dia))){
			date= new GregorianCalendar(Integer.parseInt(anio),(Integer.parseInt(mes)-1),Integer.parseInt(dia));
		}else {	System.out.println("La fecha es invalida. se usara la fecha actual");
				date = new GregorianCalendar();}
		
		return date;
		}

	
	// fecha corta(sobrecargado)
	
	public static String traerFechaCorta(){
		return (traerFechaCorta(new GregorianCalendar()));
	}
	
	//fecha corta
	public static String traerFechaCorta(GregorianCalendar obj){
		int dia= obj.get(GregorianCalendar.DATE);
		int mes= obj.get(GregorianCalendar.MONTH);
		int anio= obj.get(GregorianCalendar.YEAR);
		mes=mes+1;
		String fecha="";		
		
		if(dia<10){
			fecha+="0"+dia+"/";}
		else{
			fecha=dia+"/";}
	
		if(mes<10){
			fecha+="0"+mes+"/";}
		else{
			fecha+=mes+"/";}
		
			fecha+=anio;
				
		return fecha;
	}
	
	
	//dia Habil
	
	public static boolean esdiaHabil(GregorianCalendar f){
		int dia = f.get(GregorianCalendar.DAY_OF_WEEK);
		boolean dh = true;
		
		if( dia==1 || dia==7){dh=false;}
		
		return dh;	
		}
	
	//traer diadelasemana
	
	public static String traerDiaSemana(GregorianCalendar f){
		int dia =f.get(GregorianCalendar.DAY_OF_WEEK);
		String ds="";
		
		switch(dia){
		case 1: ds="Domingo";
				break;
		case 2: ds="Lunes";
				break;
		case 3: ds="Martes";
				break;
		case 4: ds="Miercoles";
				break;
		case 5: ds="Jueves";
				break;
		case 6: ds="Viernes";
				break;
		case 7: ds="Sabado";
				break;
		}
	return ds;
	
	}
	
	//traer mes en letras
	
	public static String traerMesenLetras(GregorianCalendar f){
		int mes =f.get(GregorianCalendar.MONTH);
		String m="";
		switch(mes){
		case 0: m="Enero";
		break;
		case 1: m="Febrero";
		break;
		case 2: m="Marzo";
		break;
		case 3: m="Abril";
		break;
		case 4: m="Mayo";
		break;
		case 5: m="Junio";
		break;
		case 6: m="Julio";
		break;
		case 7: m="Agosto";
		break;
		case 8: m="Septiembre";
		break;
		case 9: m="Octubre";
		break;
		case 10: m="Noviembre";
		break;
		case 11: m="Diciembre";
		break;
		}
	return(m);
	}
	
 //traer fecha larga
	
	public static String traerFechaLarga(GregorianCalendar f){
	String fecha="";
	
	return (fecha+= traerDiaSemana(f)+" "+traerDia(f)+" "+ traerMesenLetras(f)+" "+ traerAnio(f));
		
	}
	
// fechas iguales
	
	public static boolean sonFechasIguales(GregorianCalendar f1, GregorianCalendar f2){
		boolean correcto=true;
		
		if(traerDia(f1)!=traerDia(f2) || traerMes(f1)!=traerMes(f2) || traerAnio(f1)!=traerAnio(f2)){
				correcto=false;
			}
		
	return(correcto);	
	}

//cant de dias del mes
	
	public static int traerCantDiasDeUnMes(int m, int a){
		switch(m-1){
		case 0: m=31;
		break;
		case 1: if(esBisisesto(a)){
					m=29;}
				else m=28;
		break;			
		case 2: m=31;
		break;
		case 3: m=30;
		break;
		case 4: m=31;
		break;
		case 5: m=30;
		break;
		case 6: m=31;
		break;
		case 7: m=31;
		break;
		case 8: m=30;
		break;
		case 9: m=31;
		break;
		case 10: m=30;
		break;
		case 11: m=31;
		break;
		}
	return(m);
	}
	
	
	
	 // Aproximar 2 decimales
		public static Double aproximar2Decimal (double numero){
			int punto = 0;
			numero+=0.005;
			
			String cadena = String.valueOf(numero);
			punto = buscaChar(cadena,'.');
			cadena = cadena.substring(0,punto+3);
			numero = Double.parseDouble(cadena);
				
			return numero;
		}
		
		//Busca el punto en el decimal		
		public static int buscaChar(String cadena,char b){
			int punto=0;
			
			for(int i=0;i<cadena.length();i++){
				if(cadena.charAt(i)==b){
					punto = i;
				}
			}
			
		return punto; 
			
		}
		
		public static boolean validarNum(char c){
			char [] numero={'0','1','2','3','4','5','6','7','8','9'};
			boolean correcto = false;
			int i=0;
			
			while( i<10 && !correcto){
				if(c == numero[i]){
					correcto = true;
				}
				i++;}
			
				
			return correcto;
			}
		
		public static boolean validarLetra(char c){
			char [] letra={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			boolean correcto = false;
			int i=0;
					
			while( i<25 && !correcto){
				if(c == letra[i]){
					correcto = true;
				}
				i++;
			}
				
			
		return correcto;
		}
		
		//metodo validar DNI
		public static boolean validarDni(long dni){
			boolean correcto=true;
			String documento=Long.toString(dni);
		
				if(documento.length()!= 8){
					correcto=false;}
			return correcto;	
			}
		
	
}