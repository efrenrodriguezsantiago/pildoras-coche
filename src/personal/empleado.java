package personal;

import java.util.Date;
import java.util.GregorianCalendar;

public class empleado {

	public static void main(String[] args) {
		/*// ES UN MODIFICADOR DE ACCESO PUBLICO
		empleado1 empleado2 = new empleado1("paco gomez",83000,1979,12,17);
		empleado1 empleado3 = new empleado1("mike gomez",85000,1994,9,01);
		empleado1 empleado4 = new empleado1("miguel gomez",990000,1996,8,12);
		
		//subiremos el sueldo de los tres empleados con
		empleado2.subesueldo(5);
		empleado3.subesueldo(5);
		empleado4.subesueldo(5);
		System.out.println("nombre "+empleado2.damenombre()+" sueldo: "+empleado2.damesueldo()+" fecha de alta: "+empleado2.damecontrato());
		System.out.println("nombre "+empleado3.damenombre()+" sueldo: "+empleado3.damesueldo()+" fecha de alta: "+empleado3.damecontrato());
		System.out.println("nombre "+empleado4.damenombre()+" sueldo: "+empleado4.damesueldo()+" fecha de alta: "+empleado4.damecontrato());
		*/
		//VAMOS A PROGRAMAR DE SEGUNDA FORMA CON ARRAYS
		
		empleado1[] misempleados = new empleado1[3];
		misempleados[0] = new empleado1("paco gomez ",8500,1994,12,17);
		misempleados[1] = new empleado1("mike gomez ",90000,1991,2,5);
		misempleados[2] = new empleado1("miguel gomez ",7500,1996,8,27);
		
		/*
		for(int i=0;i<3;i++) {
			misempleados[i].subesueldo(5);
		}
		*/
		//SUSTITUIMOS POR EL FOR MEJORADO
		
		//-------------------------------------------------------------------------------------
		for(empleado1 e: misempleados) {
			e.subesueldo(5);
		}
		/*
		for(int i=0;i<3;i++) {
			System.out.println("nombre "+misempleados[i].damenombre()+" sueldo: "+misempleados[i].damesueldo()+" fecha de alta: "+misempleados[i].damecontrato());
		}*/
		//------------------sustituimos por for mejorado
		for(empleado1 e: misempleados) {
			System.out.println("nombre "+e.damenombre()+" sueldo: "+e.damesueldo()+" fecha de alta: "+e.damecontrato());
			
		}
	}

}
	
class empleado1{//CREAMOS EL CONTRUCTOR
	public empleado1(String nomb,double suel,int anio,	int mess, int diaa) {
		nombre = nomb;
		sueldo = suel;
		//establecer fecha alta empleado
		GregorianCalendar calendario = new GregorianCalendar(anio,mess-1,diaa);//utilizamos fecha coonstructor
		altacontrato = calendario.getTime();
	}
	
	public String damenombre() {//geter
		return nombre;
	}
	public double damesueldo() {//geter
		return sueldo;
	}
	public Date damecontrato() {//geter
		return altacontrato;
	}
	
	public void subesueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
}
