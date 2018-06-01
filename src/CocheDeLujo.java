public class CocheDeLujo extends Vehiculo {

	private int CV;
	
    public CocheDeLujo(String matricula, String nombre, float km, float precio_vehiculo, float precio_alquiler,
			float precio_seguro, int cv) {
		super(matricula, nombre, km, precio_vehiculo, precio_alquiler, precio_seguro);
		this.CV=cv;
	}

}
