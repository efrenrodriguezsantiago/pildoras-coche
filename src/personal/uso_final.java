package personal;

public class uso_final {

	public static void main(String[] args) {
		// crear objeto empleados
		empleados trabajador1 = new empleados("paco");
		empleados trabajador2 = new empleados("jose");
		empleados trabajador3 = new empleados("toni");
		empleados trabajador4 = new empleados("mario");
		//vamos a cambiar de seccion del trabajador ya sea que ascendio o no
		trabajador1.cambioseccion("RRHH");
		
		System.out.println(trabajador1.devuelvedatos());
		System.out.println(trabajador2.devuelvedatos());
		System.out.println(trabajador3.devuelvedatos());
		System.out.println(trabajador4.devuelvedatos());
		
	}

}


class empleados{
	//constructor
	//para que no se modifique el nombre no puede ser cambiado
	public empleados(String nom) {
		nombre = nom;
		seccion = "administracion";
		//this.id = id;-------la borramos por que vamos a establecer automaticamente el id
		id = idsiguiente;
		
	}
	
	
	//seter
	public void cambioseccion(String seccion) {//cambiamos de secciom
		this.seccion= seccion;
	}
	
	
	//geters*******************************************************************************************************************************************
	public String devuelvedatos() {
		return "el nombre es "+nombre+" y la seccion es "+ seccion+" el ide es= "+id;
	}
	
	
	
	private final String nombre;//-----------------final ----------------porque es una constante
	private String seccion; 
	private int id;//creamos nuevo elemento id--de forma automatica en cursiva
	private static int idsiguiente = 1;///variable estatica
}
