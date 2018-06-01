public class Coche extends Vehiculo {

	private String tipo_motor;
	
    public Coche(String matricula, String nombre, float km, float precio_vehiculo, float precio_alquiler,
			float precio_seguro, String tipo_motor) {
		super(matricula, nombre, km, precio_vehiculo, precio_alquiler, precio_seguro);
	}

}