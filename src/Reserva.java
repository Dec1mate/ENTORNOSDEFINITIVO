
// Esta es la clase reserva, almacena el dni del cliente, la matrícula del vehículo alquilado,
// la fecha en la cual el vehículo es alquilado, el total de días que este va a ser alquilado y el precio total almacena el
// total de la reserva
public class Reserva {
	
	private  String dni;
	private  String matricula;
	private  int fecha;
	private  int total_dias;
	private  float precio_total;
	
	// Este es el constructor de la clase, inserta los datos anteriormente pasados por 
	// parámetros a los atributos corresponidientes.
	public Reserva(String dni, String matricula, int fecha, int total_dias, float precio_total) {
		this.dni = dni;
		this.matricula = matricula;
		this.fecha = fecha;
		this.total_dias = total_dias;
		this.precio_total = precio_total;
	}
	
	// Devuelve por pantalla el precio de lo que va a costar el coche durante el periodo de la reserva,
	// se calcula con los atributos de la clase vehículo, (precio_Alquiler por el total_días
	// que vaya quedarse el vehículo) + el precio_Seguro.
	public void calculo_precio_total(float precio_Alquiler, float precio_seguro) {
		float precio_total=(precio_Alquiler*this.total_dias)+precio_seguro;
		
		System.out.println("El precio total a pagar es de "+precio_total+" €");
	}
	
	// Devuelve el día que debe de devolver el vehículo de nuevo sumando la fecha con el total de días
	// que el vehículo va a estar alquilado.
	public int calculo_devolucion() {
		int devolucion=this.fecha+this.total_dias;
		return devolucion;
	}
	
	// Getters y setters correspondientes.
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getTotal_dias() {
		return total_dias;
	}

	public void setTotal_dias(int total_dias) {
		this.total_dias = total_dias;
	}

	public float getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(float precio_total) {
		this.precio_total = precio_total;
	}
	
}
