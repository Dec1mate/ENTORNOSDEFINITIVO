
public class Gestion extends Persona{

	public Gestion(String usuario, String contrasenya, String nombre, String apellidos, String telefono, String dni,
			String rango) {
		super(usuario, contrasenya, nombre, apellidos, telefono, dni, rango);
	}
	
	public void ingresar_cliente(Empresa e1, Cliente c){
		
		e1.ListadoClientes.add(c);
		
    }

    public void eliminar_ingresa_cliente(Empresa e1, Cliente c) {

    	e1.ListadoClientes.remove(c);
       
    }
}
