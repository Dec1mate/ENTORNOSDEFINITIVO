# Proyecto Entornos De Desarrollo
*Repositorio de almacenamiento para el proyecto de Entornos de Desarrollo de la tercera evaluacion*

En este programa se gestiona una empresa de alquiler de coches, donde habra almacenados:
1. Administradores
2. Empleados
3. Clientes

Los tres tipos de usuarios comparten unos datos en concreto, y despues hay unos tipos de datos en concreto, se detallan mas abajo, y despues habrá almacenados 3 tipos de vehiculos, que son:
1. Lujo
2. Camion
3. Normal

Los vehiculos tienen comparten unos tipos de informacion, pero los valores de estos (Como el coste del alquiler o el seguro) cambian segun el tipo de coche.

Los garajes estan asignados a coches en concreto, al final estan detallado toda la informacion de los garajes.

Las reservas tambien estan asignadas a un coche, a parte de otros datos.

## Sobre el código

¡Recuerda hacer un rebase desde la rama "master" cada vez que se haya actualizado!

El codigo debe ser lo mas claro y limpio posible, y a poder ser, intentad añadir por vosotros mismos toda la documentacion sobre el programa posible, de todas maneras, yo (Álvaro) añadire toda la documentación que no se haya hecho al final del proyecto, e ire actualizando este README.md constantemente.

---

# ROADMAP

  - ~~FASE 1~~
  - ~~Añadir Documentacion Media a README.md~~ | 10 de Mayo de 2018
  - ~~Realizar whitepaper~~ | 11 de Mayo de 2018
  - ~~Presentacion ante Antonio para aprobacion y final de la fase 1~~ | 11 de Mayo de 2018
  - FASE 2
  - ~~Realizar analisis y diseño del proyecto [Álvaro]~~ | 23 de Mayo de 2018
  - ~~Realizar diseño UML [Nacho]~~ | 27 de Mayo de 2018
  - Realizar entidad-relacion [Nacho] | EN PROGRESO
  - ~~Realizar diagrama de comportamiento [Álvaro]~~ | 30 de Mayo de 2018
  - Creacion de clases padres (Personas, Vehiculo, Garaje, Reserva)
    - ~~Personas [Adri]~~ | 27 de Mayo de 2018
    - ~~Vehiculo [Álvaro]~~ | 31 de Mayo de 2018
    - ~~Garaje [Jorge]~~ | 31 de Mayo de 2018
    - ~~Reserva [Adri]~~ | 31 de Mayo de 2018
  - Creacion de clases intermedias (Gestion) [Jorge] | EN PROGRESO
  - Creacion de clases hijas (Administrador, Empleado, Cliente, Coche de Lujo, Camion, Coche Estandar)
    - Administrador [Nacho] | EN PROGRESO
    - ~~Empleado [Adri]~~ | 27 de Mayo de 2018
    - ~~Cliente [Álvaro]~~ | 31 de Mayo de 2018
    - ~~Coche de Lujo [Álvaro]~~ | 31 de Mayo de 2018
    - ~~Camion [Jorge]~~ | 31 de Mayo de 2018
    - Coche Estandar [Álvaro] | EN PROGRESO
  - Creacion de clase principal (Proyecto_Alquiler) [Álvaro] | EN PROGRESO
  - FASE 3
  - Añadir Documentacion Pesada [Global / Álvaro al final] | EN PROGRESO
  - Debugueo [Jorge y Adri] | EN PROGRESO
  - Creacion de Memoria sobre el Proyecto [Nacho] | EN PROGRESO
  - Presentacion [Global/Nacho la prepara] | EN PROGRESO
  
---

# Documentacion Media

# Programa Principal
El programa principal cargara unos usuarios, vehiculos, garajes y reservas por defecto para simular una base de datos, despues pedira un usuario y una contraseña para poder acceder al propio programa. Este menu en linea de comandos dependera del nivel de acceso de los usuarios en funcion de su rango (Admin = 2, Empleado = 1, Cliente = 0).

## Personas
Esta sera la clase padre de todas las personas, e incluira todos los datos personales de cada persona que se quiera loguear en el programa, y dependiendo de que tipo de persona sea, tendra acceso a opciones distintas, validado por su rango.

### Gestion
Esta es la clase intermedia de aquellas personas que trabajen en la empresa, se limita simplemente a incorporar la opcion de dar clientes de alta o de baja.

#### Administrador
Esta clase hija de Gestion se refiere a los administradores de la empresa, que pueden tambien dar de alta o de baja empleados, y no tienen sueldo (Sus beneficios dependen de los beneficios de las empresas.)

#### Empleado
Esta clase hija de Gestion se refiere a los empleados de la empresa, y tienen asignado un horario de entrada, un horario de salida y un sueldo.

### Cliente
Esta clase se refiere a los clientes de la empresa, y tienen registrado los años que son clientes, los alquileres que han realizado, y los dias de retraso que han tenido por cada alquiler.

---

## Vehiculo
Los vehiculos tienen una matricula, nombre, kilometros, su precio, su precio del seguro (que se calcula segun el tipo de vehiculo) y su precio de alquiler (que tambien se calcula segun el tipo de vehiculo). Tambien el nivel de combustible con el que se ha devuelto el vehiculo para cobrarlo.
  - Gasolina: 1,80 €/L
  - Diesel: 1,35 €/L

### Coche de Lujo
Estos vehiculos tienen el dato particular de sus caballos de potencia, y su seguro se calcula a partir de dividir el precio del coche entre mil y sumarle el numero de caballos. El precio de alquiler es el precio del coche dividido entre mil mas 50 € por dia.

### Camion
Estos vehiculos tienen el dato particular de cuantos ejes tienen, y su seguro se calcula a partir de dividir el precio del camion entre mil y multiplicarlo por el numero de ejes. El precio de alquiler es el precio del camion dividido entre mil mas 40 € por dia.

### Coche Estandar
Estos vehiculos tienen el dato particular de que tipo de motor tienen, y su seguro se calcula a partir de dividir el precio del camion entre mil y multiplicarlo por los siguientes valores en funcion del tipo de motor:
  - Gasolina: 1,55
  - Diesel: 1,45

El precio de alquiler es el precio del coche dividido entre mil mas 30 € por dia.

---

## Garaje
Los garajes son donde se guarda el coche, si esta ocupado, el espacio que ocupan y su precio es de 62,73€ por metro cuadrado de superficie. Tambien se almacena la localizacion de los garajes.

---

## Reserva
En las reservas se anotan datos sobre quien la ha hecho, el coche que se desea reservar, la fecha de la reserva, cuantos dias se alquilara el coche, la fecha de devolucion, la plaza en la que se devolvera el vehiculo, y el precio de la reserva. En caso de que la reserva se cancele con mas de 1 dia de antelacion, los clientes solo tendran que pagar el 10% de la reserva. Internamente se calcula la fecha de devolucion y el precio de la reserva. Se tendra en cuenta las multas que reciba el vehiculo, que se pagaran al doble de lo que ha costado a la empresa.
