# PresupuestoPacoCS
En este ejercicio se debe hacer una aplicación de una aseguradaora con la que se podrá asegurar el continente y/o el contenido del inmueble/edificio. Los valores vienen ya predefinidos, dándole al usuario la opción de cambiarlos a sus necesidades. El usuario elegirá qué desea asegurar, si no quiere asegurar nada, volverá al formulario incial, si quiere sólo asegurar el continente o por el contrario sólo el contenido, o las dos cosas. Dependiendo de su elección la aplicación lo redirigirá al formulario correspondiente (el de contenido y/o continente) para que rellene los datos de su vivienda a asegurar. Una vez rellenado todos los datos, se le mostrará el presupuesto de su prima.

*Commit 16/10/2018 a las 14:40 horas. He dado estilo a la aplicación. He realizado los archivos beans y los models. Intentando redirigir con el archivo Eleccion.java (servlet) a la página edificio.jsp. Si el checkbox "seguro de edificios" está seleccionado debe ir al formulario que está en edificio.jsp.

*Commit 17/10/2018 a las 11:45 horas. Estoy intentando que el controlador Eleccion, redirija a los formularios/elección que esten marcados, es decir, si el usuario tiene marcadas las dos opciones, primero debe ir a edificio.jsp y después a contenido.jsp.

*Commit 17/10/2018 a las 11:51 horas. He redirigido al formulario que corresponde si una de las dos opciones no está seleccionada. Por ejemplo si no selecciona el seguro de edificios pero sí selecciona el seguro de contenido, al darle a eviar iremos al formulario del contenido.

*Commit 17/10/2018 a las 14:09 horas. He realizado el controlador de Edificio pero no redirige a ninguna página, en la barra del navegador aparece como null.

*Commit 17/10/2018 a las 21:39 horas. La redirección entre las páginas funciona, hay algún fallo en el modelo de CalcularCuota. Tampoco calcula las dos cuotas, sólo una de ellas.

*Commit 18/10/2018 a las 14:02 horas. El funcionamiento es correcto. Debo comprobar que los cálculos sean los correctos. Cuando muestra los datos del seguro de edificio, en el tipo de construcción se muestra siempre un "on", debo cambiarlo para que aparezca "madera" u "hormigón".

*Commit 18/10/2018 a las 14:12 horas. Se ha hecho un cambio en como se muestra la franquicia del contenido para que salga la palabra Ninguna en caso de que sea igual a 0. El funcionamiento es correcto. Debo comprobar que los cálculos sean los correctos. Cuando muestra los datos del seguro de edificio, en el tipo de construcción se muestra siempre un "on", debo cambiarlo para que aparezca "madera" u "hormigón".
