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

CÓMO EJECUTAR EL PROYECTO
-
 1. Software necesario:
    - JAVA JDK 11 o superior (recomendamos JDK 17)
    - Git
    - Cualquier editor de texto (VS Code, por ejemplo)

 2. Verificar instalación de Java:
-     java -version
-     javac -version
  Debe mostrar algo como:
-     java version "17.0.9" 2023-10-17 LTS
      Java(TM) SE Runtime Environment (build 17.0.9+11-LTS-201)
      Java HotSpot(TM) 64-Bit Server VM (build 17.0.9+11-LTS-201, mixed mode, sharing)


DESCARGAR EL PROYECTOç
-
Opcion A: Desde GitHub
-     Clonar el reposiorio:
-     git clone https://github.com/maaxmoora/SMART-QUEUE.git

-     Entrar en la carpeta
-     cd SmartQueue

Opción B: Decargar ZIP
 1. Descargar el ZIP del repositorio
 2. Extraer la carpeta SmartQueue
 3. Abrir la carpeta en tu editor

Estructura del proyecto:
- 
Asegúrate de tener esta estructura:
-     SmartQueue/
      ├── diagramas/                    
      │   ├── diagrama_clases.png
      │   ├── diagrama_estados.png
      │   └── diagrama_flujo.png
      ├── src/                         
      │   ├── modelo/                  
      │   │   ├── Persona.java
      │   │   ├── Usuario.java
      │   │   ├── Administrador.java
      │   │   ├── Servicio.java
      │   │   ├── ServicioGratuito.java
      │   │   ├── ServicioPremium.java
      │   │   ├── Turno.java
      │   │   └── GestorCola.java
      │   ├── vista/                   
      │   │   └── MenuConsola.java
      │   ├── controlador/             
      │   │   └── Sistema.java
      │   └── Main.java               
      ├── README.md                    
      └── .gitignore                   

Compilar el proyecto:
-     # Navegar a la carpeta src
-     cd src

-     # Compilar todo el proyecto:
-     javac -d . modelo/*.java vista/*.java controlador/*.java Main.java


Ejecutar el proyecto:
-Desde linea de comandos:
-     cd src
-     java main

Script para ejecutar (Windows ejecutar.bat)
-     @echo off
      cd src
      java Main
      pause

Script para ejecutar (Mac/Linux ejecutar.sh)
-     #!/bin/bash
      cd src
      java Main
