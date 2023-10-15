# Introduction 
Se realiza solucion para el reto de automatización propuesto por Tata

## Reto técnico de automatización.
Stack Tecnológico
•	Screenplay
•	Gradle
•	Cucumber BDD
•	Serenity BDD

### Requerimiento funcional
######Product-Owner requerimiento: 
Quiero realizar las pruebas de regresión de forma
automatizada del portal https://www.demoblaze.com/ a través del Browser Chrome 
con el respectivo informe de evidencias y ruta crítica planteada, implementando
métodos y herramientas de automatización para agilizar y garantizar el correcto
funcionamiento del aplicativo.

### Escenarios para la prueba
Se deben diseñar y automatizar mínimo 4 escenarios de las pruebas de regresión
de las siguientes funcionalidades: registro de usuario, login de usuario, registro de
formulario de contacto y adición del producto MacBook Pro de la sección de
Laptops 

### Herramientas para el desarrollo de la aplicacion y complementos

 Java
 Selenium
 Cucumber
 Gerkhin
 ScreenPlay
 Serenity-BDD
 Principios SOLID
 Programación orientada a objetos
 Gradle
 El mapeo de objetos de deberá realizar a través de la función de xpath. 


# Ejecución del Proyecto

1. Clonar el proyecto de la ruta 

https://github.com/paradox-t1m3/RetoTata

2. Luego de clonado importelo en un IDE preferiblemente Intellij

3. Configurar data en el feature, para el escenario de RegistroDeUsuario ingresar un usuario nuevo en la pagina. Es opcional si desea ingresar el mismo 
usuario para el escenario de Login despues de registrarlo, pero este escenario ya cuenta con un suario existente para el caso de prueba.

4. Para ejecutar el proyecto se debe configurar un JUnit con la direccion del runner a ejecutar, version de jdk java 1.8 preferiblemente y con JavaManifest.

5. Para obtener reporte de evidencias de serenity ejecute el siguiente comando desde la terminal gradle clean test aggregate

5. Para consultar el reporte de evidencias de serenity ejecute el index.html ubicado en la ruta del proyecto target\site\serenity



