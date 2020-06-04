# Contador de Lineas

Este programa permite contar el número de lineas que tiene un archivo determinado, existen dos tipos de lectura:  
para archivos con comentarios y con saltos de linea o sólo contar las lineas de código.

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/Primer-Repositorio-ARSW.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```
Una vez compilado el programa esta listo para su uso, el último paso es ejecutar el programa por medio del siguiente comando en consola:

```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.linecounter.LineCounter "Modo de conteo" "Ruta del archivo a contar"

```

A continuación un ejemplo:

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/ejemplo.png)

### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Diagrama de clases


![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/diagrama.png)


El diseño esta compuesto por una clase llamada "LineCounter" que es donde se llaman los demás métodos que se encargaran 
de las funciones lógicas entre los cuales estan: Reader, Counter, PHYLineCounter y LOCLineCounter.

Los Cuales Se encargarán de leer los archivos y contar las lineas de los mismos dependiendo el tipo que el usuario haya decidido utilizar.

## Reporte de pruebas

A continuación se muestra un reporte de las pruebas realizadas en el programa las cuales se ejecutan a través del siguiente comando en consola:

```
mvn test
```

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/pruebas.png)




## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management


## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 3 de junio del 2020_ 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
