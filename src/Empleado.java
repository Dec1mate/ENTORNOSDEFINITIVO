
//Esta es la clase Empleado que hereda de Gestión, tiene como atributos el horario de entrada
// el horario de salida y el sueldo.
public class Empleado extends Gestion{
	
	private int horario_entrada;
	private int horario_salida;
	private float sueldo;
	
	// Este es el constructor de la clase, inserta los datos anteriormente pasados por 
	// parámetros a los atributos corresponidientes.
	public Empleado(String usuario, String contrasenya, String nombre, String apellidos,
			String telefono, String dni, String rango, int horario_entrada, int horario_salida, float sueldo) {
		super(usuario, contrasenya, nombre, apellidos, telefono, dni, rango);
		this.horario_entrada=horario_entrada;
		this.horario_salida=horario_salida;
		this.sueldo=sueldo;
		
	}

	//Getters y setters correspondientes.
	public int getHorario_entrada() {
		return horario_entrada;
	}

	public int getHorario_salida() {
		return horario_salida;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setHorario_entrada(int horario_entrada) {
		this.horario_entrada = horario_entrada;
	}

	public void setHorario_salida(int horario_salida) {
		this.horario_salida = horario_salida;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	
}
