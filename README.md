# SMART-QUEUE
SmartQueue - Sistema de Gestión de Turnos
1. DESCRPCIÓN DEL PROYECTO
   
SmartQueue es una aplicación de escritorio desarrollada en Java que digitaliza la gestión de turnos en establecimientos comerciales, centros médicos y servicios públicos. El sistema asigna números de turno automáticamente, gestiona colas de espera y notifica a los usuarios cuando son llamados.

Objetivo Principal

Digitalizar la gestión tradicional de colas mediante un sistema automático que asigna turnos, gestiona colas FIFO y notifica a los usuarios, mejorando la eficiencia y experiencia del cliente.

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

3. ARQUITECTURA DEL SISTEMA

Modelo-Vista-Controlador (MVC)

El proyecto sigue estrictamente el patron arquitectonico MVC:

Modelo (modelo/)
Contiene las clases de dominio y logica de negocio:

Usuario.java: Representa a un usuario/cliente del sistema

Servicio.java: Define los diferentes servicios disponibles

Turno.java: Gestiona el estado y ciclo de vida de un turno

GestorCola.java: Implementa la logica FIFO para gestion de colas

Vista (vista/)
Maneja la interfaz de usuario:

VistaConsola.java: Interfaz por consola con menus interactivos

Controlador (controlador/)
Coordina el flujo de la aplicacion:

Controlador.java: Gestiona las interacciones entre modelo y vista


