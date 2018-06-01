
// Esta es la clase persona, una clase padre que almacena el nombre de usuario, su contraseña, 
// su nombre y apellidos, su telefono, su dni y su rango.
public class Persona {

	private String usuario;
	private String contrasenya;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private String rango;
	
	// Este es el constructor de la clase, inserta los datos anteriormente pasados por 
	// parámetros a los atributos corresponidientes.
	public Persona(String usuario, String contrasenya, String nombre, String apellidos, String telefono, String dni, String rango) {
		this.usuario=usuario;
		this.contrasenya=contrasenya;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		this.dni=dni;
		this.rango=rango;
	}

	//Getters y setters correspondientes.
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

}