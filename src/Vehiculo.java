public abstract class Vehiculo {

	private String matricula;
    private String nombre;
    private float km;
    private float precio_vehiculo;
    private float precio_alquiler;
    private float precio_seguro;
    
    public Vehiculo(String matricula, String nombre, float km, float precio_vehiculo, float precio_alquiler,
			float precio_seguro) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.km = km;
		this.precio_vehiculo = precio_vehiculo;
		this.precio_alquiler = precio_alquiler;
		this.precio_seguro = precio_seguro;
	}

    public String getMatricula() {
		return matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public float getKm() {
		return km;
	}

	public float getPrecio_vehiculo() {
		return precio_vehiculo;
	}

	public float getPrecio_alquiler() {
		return precio_alquiler;
	}

	public float getPrecio_seguro() {
		return precio_seguro;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public void setPrecio_vehiculo(float precio_vehiculo) {
		this.precio_vehiculo = precio_vehiculo;
	}

	public void setPrecio_alquiler(float precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}

	public void setPrecio_seguro(float precio_seguro) {
		this.precio_seguro = precio_seguro;
	}

	public void info_combustible() {

    }

}