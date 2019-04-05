# ioet-challenge

El ejercicio se lo realizó en el lenguaje de programación JAVA, para que funcione necesitan descargarse el proyecto y 
configurar el método uploadFile() ya que es necesario realizar la lectura del archivo txt que solicita en el ejecicio con los 
nombres de los empleados y los horarios en que trabajan para luego calcular sus salarios.

En el médoto uploadFile() se debe cambiar la dirección de donde se realiza la lectura en mi caso como se trataba en linux es la siguiente.
file = new File ("/opt/documentFile.txt");
esa línea debe ser cambiada con la dirección de donde se va ha realizar la lectura del archivo en mi caso de nombre:documentFile.txt.

el archivo documentFile.txt debe contener lo siguiente:

RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00<br/>
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00<br/>
FRANKLIN=TU11:00-17:00,WE06:00-13:00,TH08:00-17:00<br/>
SANTIAGO=FR01:00-08:00,SA18:00-24:00,SU13:00-18:00<br/>
CARLOS=MO08:00-12:00,TU08:00-12:00,TH01:00-06:00,SA14:00-18:00,SU20:00-23:00

para realizar las siguientes pruebas, cada nombre debe ir en una línea. 
