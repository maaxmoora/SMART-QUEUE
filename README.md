# SMART-QUEUE
SmartQueue - Sistema de Gestión de Turnos
1. DESCRIPCION DEL PROYECTO

SmartQueue es una aplicación de escritorio desarrollada en Java que digitaliza la gestión de turnos en establecimientos comerciales, centros médicos y servicios públicos.
El sistema asigna números de turno automáticamente, gestiona colas de espera y notifica a los usuarios cuando son llamados.

Objetivo Principal

Digitalizar la gestión tradicional de colas mediante un sistema automático que:

Asigna turnos

Gestiona colas FIFO

Notifica a los usuarios

mejorando la eficiencia operativa y la experiencia del cliente.


2. COMO EJECUTAR EL PROYECTO
   
Requisitos
Java JDK 11 o superior

Terminal o IDE (VS Code, IntelliJ, Eclipse)

Pasos de Ejecucion

1. Navegar a la carpeta src/:
cd src

2. Compilar todos los archivos JAVA:

   javac -d . modelo/*.java vista/*.java controlador/*.java Main.java

3. Ejecturar la aplicación:

   java Main

3. ARQUTECTURA DEL SISTEMA

Patrón Modelo–Vista–Controlador (MVC)

El proyecto sigue estrictamente el patrón arquitectónico MVC para garantizar modularidad, mantenibilidad y escalabilidad.

Modelo (modelo/)

Clases de dominio y lógica de negocio:

-Usuario.java: Representa a un usuario/cliente

-Servicio.java: Define los servicios disponibles

-Turno.java: Gestiona el estado y ciclo de vida del turno

-GestorCola.java: Implementa la lógica FIFO de la cola

Vista (vista/)
Interfaz de usuario:

-VistaConsola.java: Interfaz por consola con menús interactivos

Controlador (controlador/)
Lógica de aplicación:

-Controlador.java: Coordina las interacciones entre modelo y vista

src/
├── modelo/           # Clases de dominio y lógica de negocio
├── vista/            # Interfaz de usuario
├── controlador/      # Lógica de aplicación
└── Main.java         # Punto de entrada
