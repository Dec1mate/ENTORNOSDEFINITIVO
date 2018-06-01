# Analisis

Seguiremos un desarrollo en cascada con retroalimentacion principalmente, tengo unos esbozos de como deberian ser las clases para ir empezando (las clases hijas estan incluidas en esto), este finde desarrollare por completo como deben interactuar las clases entre si y tal.

- [Programa Principal](https://drive.google.com/open?id=1IxaJBISDn4fPPEiHoJ6T1-SLeUJshLLW)

El programa principal debe recibir a quien este usandolo y preguntarle su usuario y contraseña para verificar, primero comprueba si el usuario existe, y despues la contraseña, se hace en metodos distintos para asegurarse de que el usuario sepa que esta haciendo mal para loguearse, cuando el programa entra se establece un numero de autorizacion segun el tipo de usuario, generara vehiculos, garajes y reservas para asi simular una base de datos. Dependiendo del nivel de autorizacion habra mas o menos opciones.

---

- [Personas](https://drive.google.com/open?id=1qdVVqihoGVx3G17ZCSuG9-RtyzaLNzFa) 

Las personas tendran sus datos personales, es decir usuario, contraseña, nombre, apellidos, telefono, DNI y rango, aparte de despues tener mas o menos opciones en el menu dependiendo de si es una persona que se encarga de la gestion del negocio (y dependiendo de si es administrador o no) o es un cliente. En caso de ser alguien de gestion, se añade la opcion de dar clientes de alta y de baja, y un administrador puede dar de alta y de baja empleados aparte de localizar vehiculos. Si es un empleado se añade tambien el atributo de su horario de entrada y su horario de salida, aparte de su sueldo. Si es un cliente se añaden los atributos de los años que ha sido cliente y un historial de sus alquileres y sus dias de retraso al devolver el coche, tiene las opciones de alquilar y devolver un vehiculo, mas aparte el poder cancelar una reserva.

---

- [Vehiculo](https://drive.google.com/open?id=1yn6rFBfrzv5_l27XPwwr7_fZaBfiSbGk)

Todos los vehiculos almacenan la matricula, el nombre, su kilometraje, el precio del Vehiculo, el precio del Alquiler, el precio del Seguro y el nivel de combustible con el que se ha devuelto para cobrar adicionalmente el rellenado del combustible, a parte los vehiculos tienen un atributo en particular, siendo los caballos en los coches de lujo, los ejes en los camiones y el tipo de motor en los coches estandares.

---

- [Garaje](https://drive.google.com/open?id=1woiuMoegX4EzTJeqvb-WU135s4YwRXZG)

El garaje es donde se guardan los coches, almacenaremos si esta esa plaza ocupada, por que coche, el espacio, el precio (62,73€/m^2) y la localizacion de los garajes. La clase Garaje tendra el metodo de calculo del precio de la plaza del garaje.

---

- [Reserva](https://drive.google.com/open?id=1p5PiHvig-pDIWoeWOYX_Ecu3QhEjPD2l)

En las reservas se almacena el DNI del cliente, la matricula del coche a reservar, la fecha de reserva, los dias de alquiler y el precio total de la reserva. La clase Reserva tendra el metodo de calculo de fecha de devolucion (la cual tambien se almacenara por comodidad) y el metodo del calculo del precio de la reserva.

---

Para informacion algo mas detallada (como se calcula el precio total de la reserva o valores numericos ya establecidos) visitad la documentacion media del [README.md](https://github.com/Darkenend/ProyectoEntornosDeDesarrollo/blob/master/README.md).
