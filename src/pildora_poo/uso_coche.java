package pildora_poo;

public class uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coche nissan = new coche();//se pone coche para instanciar constructor es el coche
		
		
		System.out.println(nissan.dime_largo());
		
		
		//MODULArizaACION ES DIVIDIR LOS PROGRAMAS EN JAVA 
		
		//ENCAPSULACION es poner private
		
		//aqui se coloca para que impprima metdodo geters y seters
		nissan.establece_color();
		System.out.println(nissan.dime_color());
		
	}

}
