//Guardados aqui, los importare en la clase principal
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona {
    private int tiempo_cliente;
    private String[] historial_alquiler;
    private int[] historial_retrasos;
    
    public Cliente(String usuario, String contrasenya, String nombre, String apellidos, String telefono, String dni,
			String rango) {
		super(usuario, contrasenya, nombre, apellidos, telefono, dni, rango);
		this.tiempo_cliente = tiempo_cliente;
		this.historial_alquiler = historial_alquiler;
		this.historial_retrasos = historial_retrasos;
	}

    public void crear(Empresa e1, Reserva r, Vehiculo v) {
       e1.ListadoReservas.add(r);
       e1.ListadoVehículos.remove(v);
    }

    public void cancelar(Empresa e1, Reserva r, Vehiculo v) {
    	e1.ListadoReservas.remove(r);
        e1.ListadoVehículos.add(v);
    }

    public void devolver_vehiculo(Empresa e1, Reserva r, Vehiculo v) {
    	e1.ListadoReservas.remove(r);
        e1.ListadoVehículos.add(v);
    }

}