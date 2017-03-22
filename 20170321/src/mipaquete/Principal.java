package mipaquete;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona miPersona1 = new Persona();
		Persona miPersona2 = new Persona("Demetrio", "Lopez Garcia", 123456);
		
		miPersona1.setNombre("Demetrio");
		miPersona1.setApellido("Lopez Garcia");
		miPersona1.setDNI(123456);
		
		System.out.println(miPersona1);
		System.out.println(miPersona2);
		
		if(miPersona1 == miPersona2){
			System.out.println("son iguales");
		} else{
			System.out.println("son distintos");
		}
		
		if(miPersona1.equals(miPersona2)){
			System.out.println("objetos iguales");
		} else{
			System.out.println("objetos desiguales");
		}
		
		if(miPersona1.hashCode() == miPersona2.hashCode()){
			System.out.println("hashcode iguales");
		} else{
			System.out.println("hashcode desiguales");
		}
		
		System.out.println(miPersona1.hashCode());
		System.out.println(miPersona2.hashCode());
	}
}
