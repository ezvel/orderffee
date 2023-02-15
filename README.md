# Orderffee
## Introducción
Sistema de comandas para una cafetería, donde se registrará todo el proceso con respecto a la carga de órdenes de pedidos por los clientes.
Se pensó en un hipotético caso en el que un dueño de un pequeña cafetería solicita un sistema a medida para su negocio.
El mismo consta de 9 mesas, 2 camareros, 1 barista y un operador que se encargará de operar el sistema.

## Desarrollo
El sistema comenzará con el registro y logueo de los empleados que utilizarán el sistema. 
Los empleados son el operador y el supervisor. El operador tendrá facultades que el supervisor no tendrá, y el supervisor tendrá facultades que 
el operador no tendrá. Todas estas restricciones necesarias según los requerimientos son suplidas por Orderffee.

Primero el camarero hace anota la orden en la mesa ocupada en ese momento.
Segundo, el mismo es recibido por el operador quien será el encargado del siguiente proceso:


<ol>
  <li>Buscar los productos solicitados.</li>
  <li>Seleccionar la cantidad.</li>
  <li>Cargar la comanda.</li>
  <li>Dar por entregado si el pedido fue entregado.</li>
  <li>Dar por finalizado si el cliente pagó</li>
</ol>

En la interfaz gráfica, las mesas se activarán o se desactivarán según esta dinámica.

Nota importante: El operador es el único que tiene la posibilidad de realizar este desarrollo. El supervisor no las tendrá. Solamente podrá
observar el historial de comandas realizadas.

### Seleccionar mesa
![selmesa](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/selmesa.PNG)

### Selecciona productos
![selprod](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/selprod.PNG)

### Generar comanda
![gencom](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/gencom.PNG)

### Ver mis comandas actuales
![miscom](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/miscom.PNG)

### Ver mis comandas finalizadas
![comfin](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/comfin.PNG
)
## Configuraciones
En la sección configuraciones se podrá buscar, modificar, agregar y eliminar productos (hecho solo por el supervisor).
En la sección operadores se podrá modificar los datos del operador o supervisor conectado en ese momento. Por otro lado, se podrá eliminar operadores en caso
de renuncia o despido, cuya labor de elimnación del sistema solo será hecho por el supervisor. De la misma manera con los supervisores, a diferencia, que el supervisor
solo puede eliminarse a si mismo.

### Operador
![ope](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/ope.PNG)

### Supervisor
![sup](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/sup.PNG)

## Modelo de base de datos
![modeloBdd](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/ModeloBdd.png)

## Diagrama de clases
![digramaDeClases](https://github.com/ezvel/orderffee/blob/main/src/Imagenes/diagramaDeClases.jpg)
