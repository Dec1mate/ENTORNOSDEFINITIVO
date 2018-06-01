
public class Camion extends Vehiculo{

	private int ejes;
	
	public Camion(String matricula,String nombre,float km,float precio_vehiculo,float precio_alquiler,
    				float precio_seguro,int ejes) {
		
		super(matricula,nombre,km,precio_vehiculo,precio_alquiler,precio_seguro);
		this.ejes=ejes;
		
	}
	
	public int getEjes() {
		
		return ejes;
		
	}
	
	public void setEjes(int ejes) {
		
		this.ejes = ejes;
	}
	
}
