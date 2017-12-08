
/**
@author: Alejandro Doña
@version: 01/12/2017
*/
public class Cliente extends Object {
	
	public int codigo;
	public String nombre;
	public String apellido;
	public String email;
	public long telefono;
	public boolean nuevo;
	public double cifraVentas;
	
	public Cliente() {
		//TODO Auto-generated constructor stub
	}
	
	/** @param codigo Codigo del cliente
	 * @param nombre Nombre del cliente
	 * @param email Email del cliente  
	*/
	public Cliente(int codigo, String nombre, String email){
		super(); //Object()
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
	}
	/** @param codigo Codigo del cliente
	 * @param nombre Nombre del cliente
	 * @param email Email del cliente  
	 * @param telefono Telefono del cliente
	 * @param nuevo Comprobación de si es un nuevo cliente o no
	 * @param cifraVentas Cifras de las ventas del cliente
	*/
	
	public Cliente(int codigo, String nombre, String email, long telefono, boolean nuevo, double cifraVentas) {
		super(); 
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;	
		this.telefono = telefono;
		this.nuevo = nuevo;
		this.cifraVentas = cifraVentas;
	}
	
	//acciones -> metodos
	public void mostrarDatos(){
		System.out.println("Codigo: " + codigo + "Nombre: " + nombre + "...");
	}
	
	public double verCifraVentas(){
		return cifraVentas;
	}
	
	public void cambiarTelefono(long nuevoTelefono){
		telefono = nuevoTelefono;
	}
}
