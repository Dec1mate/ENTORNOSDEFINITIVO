import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	public ArrayList <Empleado> ListadoEmpleados = new ArrayList<Empleado>();
	public ArrayList <Vehiculo> ListadoVehículos = new ArrayList<Vehiculo>();
	public ArrayList <Cliente> ListadoClientes = new ArrayList<Cliente>();
	public ArrayList <Administrador> ListadoAdministradores = new ArrayList<Administrador>();
	public ArrayList <Reserva> ListadoReservas = new ArrayList<Reserva>();
	
	public Empresa() {
		Administrador a=crearAdministrador("aortiz", "1234", "Adrian", "Ortiz San Esteban", "1111", "1234", "administrador");
		this.ListadoAdministradores.add(a);
		crearListadoVehiculos();
		crearListadoEmpleados();
	}

	private void crearListadoEmpleados() {
		Empleado e = new Empleado("nmacias", "1234", "Ignacio", "Macias", "null", "2345", "Empleado", 8, 20, 1500);
		this.ListadoEmpleados.add(e);
		e = new Empleado("areal", "1234", "Alvaro", "Real", "null", "3456", "Empleado", 8, 20, 1500);
		this.ListadoEmpleados.add(e);
		e = new Empleado("jgallego", "1234", "Jorge", "Gallego", "null", "4567", "Empleado", 8, 20, 1500);
		this.ListadoEmpleados.add(e);
	}

	private void crearListadoVehiculos() {
		Vehiculo e = new CocheDeLujo("1234VCB", "FERRARI CALIFORNIA", 120, 2500, 100, 100,500);
		this.ListadoVehículos.add(e);
		e = new Coche("5678XDD", "VOLSWAGEN GOLF GTI", 120, 2500, 100, 100,"Gasolina");
		this.ListadoVehículos.add(e);
		e = new Camion("1111DFG", "CAMIONPORDEFECTO", 120, 2500, 100, 100,4);
		this.ListadoVehículos.add(e);

	}

	public Administrador crearAdministrador(String usuario, String contrasenya, String nombre, String apellidos, String telefono,
			String dni, String rango) {
		Administrador a = new Administrador(usuario, contrasenya, nombre, apellidos, telefono, dni, rango);
		return a;
	}
	
	public void ImprimirMenu() {
		Scanner teclado=new Scanner(System.in);
		boolean terminar=false;
		String decision="xD";
		do {
			System.out.println("Bienvenido al programa de reserva de vehículos");
			boolean terminarAdmin=false;
			boolean encontrado=false;
			do {
				System.out.println("¿Quiere insertar ud. su login? S/N");
				decision=teclado.next();
			}while(!decision.toLowerCase().equals("s") && !decision.toLowerCase().equals("n"));
			if(decision.toLowerCase().equals("n")) {
				terminar=true;
			} else {
				System.out.println("Inserte su login");
				String login=teclado.next();
				System.out.println("Inserte su contraseña");
				String contrasenya=teclado.next();
				if(login.equals("aortiz") && contrasenya.equals("1234")) {
					System.out.println("Bienvenido Adrian");
					do {
						System.out.println("¿Que deseea hacer?");
						int decisionAdmin=0;
						do {
							System.out.println("1. Añadir empleado");
							System.out.println("2. Despedir empleado");
							decisionAdmin=teclado.nextInt();
							} while(decisionAdmin!=1 && decisionAdmin!=2);
						if(decisionAdmin==1) {
							System.out.println("Inserte los datos del empleado que quiere añadir");
							System.out.println("Login: ");
							String loginAnyadir=teclado.next();
							System.out.println("Contraseña: ");
							String contrasenyaAnyadir=teclado.next();
							System.out.println("Nombre: ");
							String nombreAnyadir=teclado.next();
							System.out.println("Apellidos: ");
							String apellidosAnyadir=teclado.next();
							System.out.println("DNI: ");
							String dniAnyadir=teclado.next();
							crearEmpleado(loginAnyadir, contrasenyaAnyadir, nombreAnyadir, apellidosAnyadir, "null", dniAnyadir, "Empleado", 8, 20, 1500);
							System.out.println("Empleado añadido exitosamente");
						} else {
							System.out.println("Inserte el dni del empleado que desee despedir");
							String empleadodni=teclado.next();
							for(int o=0;o<ListadoEmpleados.size();o++) {
								if(empleadodni.equals(this.ListadoEmpleados.get(o).getDni())){
									this.ListadoEmpleados.remove(o);
									System.out.println("Empleado borrado exitosamente");
								}
							}
						}
						String decision2="";
						do {
							System.out.println("¿Quiere realizar otra opcion?");
							decision2=teclado.next();
						} while (!decision2.toLowerCase().equals("s") && !decision2.toLowerCase().equals("n"));
						if(!decision2.toLowerCase().equals("s")) {
							terminarAdmin=true;
						}
					}while(terminarAdmin==false);
				} else {
					for(int i=0;i<ListadoEmpleados.size();i++) {
						if(login.equals(ListadoEmpleados.get(i).getUsuario())) {
							if(contrasenya.equals(ListadoEmpleados.get(i).getContrasenya())) {
								System.out.println("Bienvenido "+ListadoEmpleados.get(i).getNombre());
								encontrado=true;
							} else {
							}
						}
					}
					if(encontrado==true) {
						do {
							System.out.println("¿Que deseea hacer?");
							int decisionAdmin=0;
							do {
								System.out.println("1. Añadir cliente");
								System.out.println("2. Eliminar cliente");
								decisionAdmin=teclado.nextInt();
							} while(decisionAdmin!=1 && decisionAdmin!=2);
							if(decisionAdmin==1) {
								System.out.println("Inserte los datos del cliente que quiere añadir");
								System.out.println("Login: ");
								String loginAnyadir=teclado.next();
								System.out.println("Contraseña: ");
								String contrasenyaAnyadir=teclado.next();
								System.out.println("Nombre: ");
								String nombreAnyadir=teclado.next();
								System.out.println("Apellidos: ");
								String apellidosAnyadir=teclado.next();
								System.out.println("DNI: ");
								String dniAnyadir=teclado.next();
								crearCliente(loginAnyadir, contrasenyaAnyadir, nombreAnyadir, apellidosAnyadir,"null", dniAnyadir,
										"Cliente");
								System.out.println("Cliente añadido correctamente");
								
							} else {
								System.out.println("Inserte el dni del cliente que desee borrar");
								String empleado=teclado.next();
								for(int i=0;i<ListadoClientes.size();i++) {
									if(empleado.equals(ListadoClientes.get(i).getDni())){
										ListadoClientes.remove(i);
										System.out.println("Cliente borrado exitosamente");
									}
								}
							}
							String decision2="";
							do {
								System.out.println("¿Quiere realizar otra opcion?");
								decision2=teclado.next();
							} while (!decision2.toLowerCase().equals("s") && !decision2.toLowerCase().equals("n"));
							if(!decision2.toLowerCase().equals("s")) {
								terminarAdmin=true;
							}
						}while(terminarAdmin==false);
					} else {
						for(int i=0;i<ListadoClientes.size();i++) {
							if(login.equals(ListadoClientes.get(i).getUsuario())) {
								if(contrasenya.equals(ListadoClientes.get(i).getContrasenya())) {
									System.out.println("Bienvenido "+ListadoClientes.get(i).getNombre());
									do {
										System.out.println("¿Que deseea hacer?");
										int decisionAdmin=0;
										do {
											System.out.println("1. Realizar reserva");
											System.out.println("2. Eliminar reserva");
											decisionAdmin=teclado.nextInt();
										} while(decisionAdmin!=1 && decisionAdmin!=2);
										if(decisionAdmin==1) {
											for(int j=0;j<ListadoVehículos.size();j++) {
												System.out.println("Nombre: "+ListadoVehículos.get(j).getNombre());
												System.out.println("Nombre: "+ListadoVehículos.get(j).getMatricula());
											}
											System.out.println("Inserte la matricula del vehículo que desee");
											String matriculadeseeada=teclado.next();
											for(int j=0;j<ListadoVehículos.size();j++) {
												if(matriculadeseeada.equals(ListadoVehículos.get(j).getMatricula())) {
													realizarReserva(ListadoClientes.get(i), matriculadeseeada);
													System.out.println("Reserva realizada con exito");
												}
											}
										} else {
											System.out.println("Inserte la matricula del coche que desee eliminar la reserva");
											String matriculadeseada=teclado.next();
											for(int k=0;k<ListadoClientes.size();k++) {
												if(matriculadeseada.equals(ListadoReservas.get(k).getMatricula())){
													ListadoReservas.remove(k);
													System.out.println("Reserva borrada con exito");
												}
											}
										}
										String decision2="";
										do {
											System.out.println("¿Quiere realizar otra opcion?");
											decision2=teclado.next();
										} while (!decision2.toLowerCase().equals("s") && !decision2.toLowerCase().equals("n"));
										if(!decision2.toLowerCase().equals("s")) {
											terminarAdmin=true;
										}
									}while(terminarAdmin==false);
									encontrado=true;
								} else {
									System.out.println("Login o contraseña incorrectos");
								}
							}
						}
						if(encontrado==true) {
							
						} else {
							terminar=true;
						}
						
					}
				}
			}
		}while(terminar==false);
			
	}

	private void realizarReserva(Cliente cliente, String matriculadeseeada) {
		Reserva r = new Reserva(cliente.getDni(), matriculadeseeada, 0, 1, 100);
		ListadoReservas.add(r);
		
	}

	private void crearCliente(String loginAnyadir, String contrasenyaAnyadir, String nombreAnyadir,
			String apellidosAnyadir, String string, String dniAnyadir, String string2) {
		Cliente c = new Cliente( loginAnyadir,  contrasenyaAnyadir,  nombreAnyadir,
			 apellidosAnyadir,  string,  dniAnyadir,  string2);
		ListadoClientes.add(c);
		
	}

	private void crearEmpleado(String loginAnyadir, String contrasenyaAnyadir, String nombreAnyadir,
			String apellidosAnyadir, String string, String string2, String string3, int i, int j, int k) {
		Empleado e = new Empleado(loginAnyadir,contrasenyaAnyadir,nombreAnyadir,
			apellidosAnyadir, string, string2, string3,  i,  j,  k);
		ListadoEmpleados.add(e);
		
	}
		
}
	
