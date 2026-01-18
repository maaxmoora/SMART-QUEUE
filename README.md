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
   
   -Navegar a la carpeta src/:
   cd src
   
   -Compilar todos los archivos JAVA:
   
      javac -d . modelo/*.java vista/*.java controlador/*.java Main.java
   
   -Ejecturar la aplicación:
   
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
   
   -Estructura del proyecto 
   
   src/modelo   Clases de dominio y lógica de negocio
   
   src/vista   Interfaz de usuario
   
   src/controlador   Lógica de aplicación
   
   src/main.java   Punto de entrada
   
4. Funcionalidades Principales
      
   Solicitud de Turnos
      -Selección entre múltiples servicios
   
      -Asignación automática de número de turno
   
      -Registro de usuario
   
   Gestión de Colas
   
      -Sistema FIFO (First-In, First-Out)
   
      -Visualización del estado actual de la cola
   
      -Gestión de múltiples turnos en espera
   
   Llamada de Turnos
   
      -Notificación cuando un turno es llamado
   
      -Cambio automático de estados:
   
          PENDIENTE → LLAMADO → ATENDIDO
   
      -Gestión de turnos atendidos
   
   Validación y Control de Errores
   
      -Validación de selección de servicios
   
      -Manejo de colas vacías
   
      -Control de entradas de usuario

5. Diagramas UML
   La carpeta diagramas/ contiene:
   
   -Diagrama de Clases
   
   Muestra la estructura estática del sistema, las relaciones entre clases y sus atributos y métodos principales.
   
   -Diagrama de Estados
   
   Representa los estados por los que pasa un turno:
   
   PENDIENTE → LLAMADO → ATENDIDO
   
   -Diagrama de Flujo
   
   Ilustra el proceso completo desde la solicitud del turno hasta que el usuario es atendido.

6. Uso de Inteligencia Artificial
   
   Asistencia en el Desarrollo
   
   El proyecto utilizó asistencia de IA para:
   
   -Diseño de Arquitectura
   
   -Definición del patrón MVC
   
   -Organización de paquetes y dependencias
   
   -Implementación de Lógica Compleja:
   
   Algoritmo FIFO en GestorCola.java
   
   Gestión de estados en Turno.java
   
   Validación de entradas en Controlador.java
   
   -Optimización de Código
   
   -Mejora de legibilidad y mantenibilidad
   
   -Aplicación de buenas prácticas POO
   
   -Manejo de errores y casos límite
   
   -Documentación
   
   -Estructura del README
   
   -Comentarios en el código
   
   -Explicación de decisiones de diseño
   
   Justificación del Uso
   
   La IA se utilizó como herramienta de asistencia técnica, pero todo el código fue:
   
   Revisado y comprendido por el equipo
   
   Adaptado a las necesidades del proyecto
   
   Probado exhaustivamente
   
   Documentado adecuadamente

7. Principios de Programación Orientada a Objetos Implementados
   -Encapsulación:
   
   Atributos con acceso controlado
   
   Métodos públicos para la interacción entre clases
   
   Ocultamiento de implementación interna
   
   -Composición:
   
   GestorCola contiene una lista de objetos Turno
   
   Turno contiene referencias a Usuario y Servicio
   
   Relaciones “tiene-un” bien definidas
   
   Abstracción:
   
   Clases que representan entidades del mundo real
   
   Interfaces claras entre componentes
   
   Simplificación de la complejidad del sistema
   
   Gestión de Estados:
   
   Estados predefinidos para los turnos
   
   Transiciones controladas
   
   Validación de cambios de estado


