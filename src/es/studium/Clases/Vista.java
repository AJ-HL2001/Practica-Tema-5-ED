package es.studium.Clases;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;

public class Vista extends Frame
{
	private static final long serialVersionUID = 1L;

	// Crear la Barra de Men�
	MenuBar barraMenu = new MenuBar();

	// Crear el apartado Empleados
	Menu empleados = new Menu("Empleados");

	// Crear las opciones del submen� de Empleado
	MenuItem nuevo = new MenuItem("Nuevo Empleado");
	MenuItem eliminar = new MenuItem("Eliminar Empleado");
	MenuItem consultar = new MenuItem("Consultar Empleado");
	MenuItem modificar = new MenuItem("Modificar Empleado");

	// Di�logo de Nuevo Empleado
	Dialog dialogoNuevo = new Dialog(this, "Nuevo Empleado", true);	
	Label lblNombreEmpleado = new Label("Nombre:");
	TextField txtNombreEmpleado = new TextField(20);
	Button btnNuevoEmpleado = new Button("Acepta");
	Button btnCancelarNuevoEmpleado = new Button("Cancelar");

	// Di�logo de Eliminar Empleado
	Dialog dialogoEliminar = new Dialog(this, "Eliminar Empleado", true);
	Label lblEliminarEmpleado = new Label("Empleado a borrar:");
	Choice choEmpleado = new Choice();
	Button btnEliminarEmpleado = new Button("Borrar");
	Button btnCancelarEliminarEmpleado = new Button("Cancelar");

	// Di�logo de Consultar Empleado
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	Dialog dialogoConsultar = new Dialog(this, "Consultar Empleado", true);
	Label lblIdEmpleado = new Label("Introducir n�mero de empleado:");
	TextField txtIdEmpleado = new TextField(5);
	TextField txtIdEmpleado2 = new TextField(5);
	TextField txtNombreEmpleado2 = new TextField(20);
	Button btnConsultarEmpleado = new Button("Consultar");
	Button btnSalirConsultarEmpleado = new Button("Salir");

	// Di�logo de Modificar Empleado
	Dialog dialogoModificar = new Dialog(this, "Modificar Empleado", true);
	Label lblModificarEmpleado = new Label("Empleado a modificar:");
	Choice choEmpleadoModificar = new Choice();
	Label lblNombreEmpleadoModificar = new Label("Nombre empreado a MODIFICAR:");
	Button btnModificarEmpleado = new Button("Modificar");
	Button btnCancelarModificarEmpleado = new Button("Cancelar");

	// Di�logo de Informar Resultado

	Dialog dialogoInformar = new Dialog(this,"Informaci�n", true);
	Label lblEtiqueta1 = new Label();	
	Button btnSalir = new Button("Salir");		

	public Vista() 
	{
		setLayout(new FlowLayout());	
		setTitle("Men�");
		setMenuBar(barraMenu);		

		empleados.add(nuevo);	
		empleados.addSeparator();	
		empleados.add(eliminar);	
		empleados.addSeparator();	
		empleados.add(consultar);
		empleados.addSeparator();	
		empleados.add(modificar);

		//A�adimos las opciones de men� a la barra de men�
		barraMenu.add(empleados);

		setSize(350,200);
		setLocationRelativeTo(null);
		setVisible(true);

		//Establecemos el layout y el tama�o del di�logo Nuevo Empleado 
		dialogoNuevo.setLayout(new FlowLayout());	
		dialogoNuevo.setSize(300,150);
		dialogoNuevo.setLocationRelativeTo(null);

		//Establecemos el layout y el tama�o del di�logo Eliminar Empleado
		dialogoEliminar.setLayout(new FlowLayout());	
		dialogoEliminar.setSize(220,150);
		dialogoEliminar.setLocationRelativeTo(null);

		//Establecemos el layout y el tama�o del di�logo Consultar Empleado 
		dialogoConsultar.setLayout(new FlowLayout());	
		dialogoConsultar.setSize(300,200);
		dialogoConsultar.setLocationRelativeTo(null);

		//Establecemos el layout y el tama�o del di�logo Modificar Empleado 
		dialogoModificar.setLayout(new FlowLayout());	
		dialogoModificar.setSize(250,200);
		dialogoModificar.setLocationRelativeTo(null);

		//Establecemos el layout y el tama�o del di�logo Modificar Empleado
		dialogoInformar.setLayout(new FlowLayout());	
		dialogoInformar.setSize(230,150);
		dialogoInformar.setLocationRelativeTo(null);
	}	

}
