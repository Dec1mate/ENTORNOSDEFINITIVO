
public class Garaje {

	private int plazas_totales;
	private int plazas_ocupadas;
	private double tamaño;
	private int numero;
	private double precio;
	private String nombre_coche;
	
	
	public Garaje(int plazas_totales, int plazas_ocupadas, double tamaño, int numero, double precio, String nombre_coche) {
		
		this.plazas_totales=plazas_totales;
		this.plazas_ocupadas=plazas_ocupadas;
		this.tamaño=tamaño;
		this.numero=numero;
		this.precio=precio;
		this.nombre_coche=nombre_coche;

}
	
	public int getPlazas_totales() {
		return plazas_totales;
	}

	public void setPlazas_totales(int plazas_totales) {
		this.plazas_totales = plazas_totales;
	}

	public int getPlazas_ocupadas() {
		return plazas_ocupadas;
	}

	public void setPlazas_ocupadas(int plazas_ocupadas) {
		this.plazas_ocupadas = plazas_ocupadas;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre_coche() {
		return nombre_coche;
	}

	public void setNombre_coche(String nombre_coche) {
		this.nombre_coche = nombre_coche;
}
	
	/*Este metodo calcula el precio de la plaza con una simple multiplicacion*/
	
	public void calcularPrecio(double tamaño) {
		double precio;
		
		precio=62.73*tamaño;
		System.out.println("El precio de la plaza es de: "+precio+"€");
		
	}
	
	/*Este metodo enseña por pantalla las plazas libres y ocupadas de un garaje*/
	
	public void info_plazas(int plazas_totales,int plazas_ocupadas) {
		
		int ocupadas;
		int libres;
		
		libres=plazas_totales-plazas_ocupadas;
		ocupadas=plazas_ocupadas;
		
		System.out.println("Ahi "+libres+" plazas libres en el garaje");
		System.out.println("Ahi "+ocupadas+" plazas ocupadas en el garaje");

		
		
	}
	
}
