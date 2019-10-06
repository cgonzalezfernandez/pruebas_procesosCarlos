package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_persona {
	

	public static void main(String[] args) {
		ArrayList<Persona> per = new ArrayList<Persona>();

		
		Persona usuario = new Persona("Carlos","Abascal","72589124G",32, false);
		
		per.add(usuario);
		usuario = new Persona("Paula","Postigo","74184584G",22,true);
		per.add(usuario);
		usuario = new Persona("Martín","Abascal","28589124G",72,true);
		per.add(usuario);
		usuario = new Persona("María","Barreda","1258745dG",12,false);
		per.add(usuario);
		usuario = new Persona("Juan","Morante","1578124G",62,true);
		per.add(usuario);
		per.add(new Persona("Marta","López","7258458L",45,true));
		per.add(new Persona("Luis","Arronte","74698715H",46,false));
		
		
		
		
		 System.out.print("¿Desea anular la hipoteca de algún cliente?, pulse N o S ");

		 Scanner SiNo = new Scanner (System.in); //Creación de un objeto Scanner
		 String SN = SiNo.next(); //Invocamos un método sobre un objeto Scanner
		 
		 if (SN.equalsIgnoreCase("S")) {
			 
			 System.out.print("Introduce el id de usuario a modificar, entre 0 y 6 ");
			 Scanner id_user = new Scanner (System.in); //Creación de un objeto Scanner
			 int user = id_user.nextInt(); //Invocamos un método sobre un objeto Scanner
			 per.get(user).setTiene_hipoteca(false);
			 String nombre_user = per.get(user).getNombre();
			 String apellido_user = per.get(user).getApellido();
			 System.out.print("La hipoteca del usuario "+ nombre_user+" "+ apellido_user + " ha sido anulada ");
			 
		 }else {
			 System.out.print("No existe ningún usuario que actualizar");
			 
		 }
		
		
		
	}
	

}
