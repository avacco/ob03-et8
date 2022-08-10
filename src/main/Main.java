package main;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.setEdad(25);
		persona.setNombre("Andres");
		persona.setTelefono("9 8765 4321");
		
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());
	}

}
