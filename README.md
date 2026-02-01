SMARTQUEUE PRO -- Sistema Avanzado de Gestión de Turnos
-
 
  DESCRIPCIÓN DEL PROYECTO
   - 
   - Sistema completo de gestión de turnos desarrollado en Java que implementa todos los principios de Programación Orientada a Objetos (POO) y arquitectura MVC profesional.


 CARACTERÍSTICAS PRINCIPALES
   -

   - Interfaz gráfica con Swing
   - Herencia completa entre clases
   - Polimorfismo mediante clases abstractas e interfaces
   - Encapsulación
   - Gestión de excepciones personalizadas
   - Sistema de estadistica en tiempo real
   - Múltiples tipos de servicios (gratis y premium)

 
ARQUITECTURA DEL SISTEMA
-
       SMARTQUEUE PRO
       README.md
        src/
       ├── modelo/ 
       │ ├── Administrador.java
       │ ├── GestorCola.java
       │ ├── Persona.java
       │ ├── Servicio.java
       │ ├── ServicioGratuito.java
       │ ├── ServicioPremium.java
       │ ├── Turno.java
       │ ├── Usuario.java
       │
       ├── vista/
       │ ├── MenuConsola.java
       │  
       ├── controlador/
       │ ├── Sistema.java
       ├ 
       └── Main.java  

PRINCIPIOS POO IMPLEMENTADOS
-
  1. **Herencia** : Persona --> Usuario y Administrador. Servicio--> ServicioGratuito y ServicioPremium.
  2. **Polimorfismo** : Metodos abstractos, interfaces, sobrecarga de metodos.
  3. **Encapsulación** : Atributos privados/protegidos con getters y setters.
  4. **Abstracción** : Clases abstractas e interfaces.
  5. **Composición** : "GestorCola" contiene colecciones de "Turno".
