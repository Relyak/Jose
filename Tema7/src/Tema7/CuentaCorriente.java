package Tema7;


public class CuentaCorriente {
	String nombre;
	String apellidos;
	String dni;
	String direccion;
	long numCuenta;
	double saldo;
	
	public CuentaCorriente() {
		
	}
	public CuentaCorriente(String nombre, String apellidos, String dni, String direccion, long numCuenta, double saldo ) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.direccion=direccion;
		this.numCuenta=numCuenta;
		this.saldo=saldo;
	}
	public void sacarDinero(double sacar) {
		saldo-=sacar;
	}
	public void ingresarDinero(double ingresos) {
		saldo+=ingresos; 
	}
	public void consultar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Dni: "+ dni);
		System.out.println("Direccion: "+ direccion);
		System.out.println("Numero de cuenta: "+ numCuenta);
		System.out.println("Saldo: "+ saldo);
		
	}
	public void modificar() {
		
		
	}
	
	
	
	
}

