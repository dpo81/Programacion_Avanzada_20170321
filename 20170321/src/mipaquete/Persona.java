package mipaquete;

public class Persona {
	private String nombre; // String con S mayuscula por ser una clase
	private String apellido;
	private int dni; // int con i minuscula porque es un tipo de dato primitivo
	
	public Persona(){
		
	}
	
	public Persona(String nombre, String apellido, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;		
	}
	
	@Override // la anotación override puede no incluirse, si Java encuentra un metodo con el mismo nombre (case sensitive) en la clase padre, la sobreescribe
	public String toString(){		
		return this.apellido + ", " + this.nombre + " (DNI: " + this.dni + ")";		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public void setDNI(int dni){
		this.dni=dni;
	}
	
	public int getDNI(){
		return this.dni;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean ret = false;
		
		//if (obj instanceof Persona){ // valido que el parámetro pueda castearse
		if (obj.getClass().equals(this.getClass())){ // otra forma de validar que el parámetro pueda castearse, esta es más pro
			Persona x = (Persona) obj;
			
			if (nombre != null) {
				if (x.nombre != null){
					ret = this.nombre.equals(x.nombre); // no necesito usar el getter por que estoy dentro de la clase, el modificador private funciona hacia afuera
				} else {
					ret = false;
				}
			}
				
			if (nombre != null & x.nombre != null) {
				ret = this.nombre.equals(x.nombre); // no necesito usar el getter por que estoy dentro de la clase, el modificador private funciona hacia afuera
			}
			
			if (apellido != null & x.apellido != null) {
				ret &= this.apellido.equals(x.apellido);
			}
			
			ret &= this.dni == x.dni;	
		}		
		
		return ret;
	}
	
	@Override
	public int hashCode(){
		int ret = 1; // inicializo con 1 porque el primer paso es múltiplicar por la base
		int base = 31;  // número primo al azar 
				
		// base * ret + X -> algoritmo mágico 
		
		ret = base * ret + dni;
				
		if (nombre != null) {
			ret = base * ret + nombre.hashCode();
		}
		
		if (apellido != null) {
			ret = base * ret + apellido.hashCode();
		}
							
		return ret;
	}
		
}
