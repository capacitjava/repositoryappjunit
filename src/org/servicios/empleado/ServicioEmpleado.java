package org.servicios.empleado;
/*
 * Las pruebas unitarias o pruebas de unidad, son un mecanismo muy efectivo para comprobar que un componente de software, por ejemplo, una función o el método de una clase se comporta de manera predecible frente a ciertos escenarios. 
 *
 * QUE BUENAS PRÁCTICAS DE DESARROLLO DE SOFTWARE REALIZASTE?
 * 
 * 1.- SEGUIR LA METODOLOGÍA.
 * 2.- ENTREGAR A TIEMPO LOS "ENTREGABLES"
 * 3.- CALIDAD DEL SOFTWARE: CLASES DUPLICADAS, METODOS DUPLICADOS,
 * REDUCCIÓN DE CODIGO, MANTENIMIENTO DE CÓDIGO, DOCUMENTAR CÓDIGO...ETC...
 * 4.- PRUEBAS UNITARÍAS: COMPROBAR EL FUNCIONAMIENTO DEL CÓDIGO.
 * 5.- TESTEAR LA APLICACIÓN: CREAR PRUEBAS DE TESTEO A NIVEL DE SERVIDOR
 * Y NIVEL DEL CLIENTE, Y PRODUCCIÓN.
 * 6.- APLICAR PATRÓN DE DISEÑO DE TESTEO.
 * 7.- SOPORTE TÉCNICO: CREAR MANUALES DE USUARIOS...ETC...
 * 8.- SOPORTE DE CÓDIGO..
 * 9.- SOPORTE DE INTEGRACIÓN DE CÓDIGO...
 *
 * DEVELOPER
 * 1.- CREAR CLASES CON NOMBRES EN BASE AL DIAGRAMA DE CLASES
 * 2.- CREAR VARIABLES Y METODOS CON NOMBRES EN BASE AL DIAGRAMA DE CLASES
 * 3.- CREAR CLASES PADRE PARA HEREDAR METODOS
 * 4.- INICIALIZAR TODAS LAS VARIABLES.
 * 5.- TODAS LAS CLASES DEBEN TENER EL METODO CONSTRUCTOR.
 * 6.- EN EL METODO CONSTRUCTOR DEBEMOS INICIALIZAR LAS VARIABLES MIEMBRO.
 * 7.- INICIALIZAR LA CLASE EN EL SUPER CONSTRUCTOR.
 * 8.- DOCUMENTACIÓN DE CÓDIGO
 * 
 */
public class ServicioEmpleado {

	public double salarioBonoEmpleado(double salario, double bono) {
		return salario + bono;
	}
	
	public double salarioPrestamoEmpleado(double salario, double prestamo) {
		return salario - prestamo;
	}
	
}



