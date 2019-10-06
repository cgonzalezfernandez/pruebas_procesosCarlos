package poo;

public class Persona {
	

	//Parámetros
	String nombre;
	String DNI;
	String apellido;
	int edad;
	Boolean tiene_hipoteca;
	
	public Persona(String nombre, String apellido, String dNI, int edad, Boolean tiene_hipoteca) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.apellido = apellido;
		this.edad = edad;
		this.tiene_hipoteca = tiene_hipoteca;
	}
	
	public Persona() {
		super();
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}



	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}



	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}



	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the tiene_hipoteca
	 */
	public Boolean getTiene_hipoteca() {
		return tiene_hipoteca;
	}

	/**
	 * @param tiene_hipoteca the tiene_hipoteca to set
	 */
	public void setTiene_hipoteca(Boolean tiene_hipoteca) {
		this.tiene_hipoteca = tiene_hipoteca;
	}



	






}
