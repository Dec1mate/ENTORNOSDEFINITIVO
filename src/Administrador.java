import java.util.ArrayList;


public class Administrador extends Gestion{

    public Administrador(String usuario, String contrasenya, String nombre, String apellidos, String telefono,
			String dni, String rango) {
		super(usuario, contrasenya, nombre, apellidos, telefono, dni, rango);
	}

	public void ingresar_trabajador(Empresa e1, Empleado e){

        e1.ListadoEmpleados.add(e);

    }

    public void eliminar_trabajador(Empresa e1, Empleado e) {

    	e1.ListadoEmpleados.remove(e);

    }

    public void info_vehiculo(Vehiculo v) {
        System.out.println("Nombre: "+v.getNombre());
        System.out.println("Matricula: "+v.getMatricula());
    }
}