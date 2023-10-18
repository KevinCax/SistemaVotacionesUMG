package ProyectoFinal;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class ProyectoInicial {
	
private static int opcionCreacion;

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombreYApellidos = null;
 		String correoElectronico = null;
 		String password = null;
 		String rol = null;
		
		int administrador = 1;
		int registrador = 2;
		int votante = 3;
		
		System.out.println("Bienvenido al sistema, elija una opcion");
		
		System.out.println("1. Ingresar como administrador");
		System.out.println("2. Ingresar como registrador");	
		System.out.println("3. Ingresar como votante");
		
		//opciones del sistema de usario
        int opcionSistema = teclado.nextInt();
	   	 int opcionAdmin = teclado.nextInt();

	   	 
       int contraseniaAdmin = 5267;
		
   	 switch (administrador) {
   	 case 1:
	       System.out.println("Bienvenido al sistema\n");
	       System.out.println("Ingrese la contrasenia maestra");
	       contraseniaAdmin = teclado.nextInt();
	       Object contraseniaIngresada = 5267;
		if(contraseniaIngresada.equals(contraseniaAdmin)) {
	    	   System.out.println("Bienvenido al sistema");
    	       System.out.println("Ingrese una opcion\n");
    	       System.out.println("1. Crear usuario del sistema");
    	       System.out.println("2. Modificar usuario del sistema");
    	       System.out.println("3. Reiniciar contrasenia");
    	       
		}else{ 
			System.out.println("Contraseña incorrecta \n");
		     System.out.println("Ingrese la contrasenia maestra");
		     contraseniaAdmin = teclado.nextInt();
		     contraseniaIngresada = contraseniaAdmin;
			   System.out.println("Bienvenido al sistema");
	  	       System.out.println("Ingrese una opcion\n");
	  	       System.out.println("1. Crear usuario del sistema");
	  	       System.out.println("2. Modificar usuario del sistema");
	  	       System.out.println("3. Reiniciar contrasenia");
	  	       
	  	     int opcionCreacion = teclado.nextInt();
	  	      
		}if(opcionCreacion == 1) {
      			 System.out.println("Ingrese nombres y apellidos");
      			 nombreYApellidos = teclado.next();
      			 System.out.println("Agregue un correo electronico");
      			 correoElectronico = teclado.next();
      		
      			 System.out.println("Agregue una contrasena");
      			 password = teclado.next();
      			 System.out.println("Indique que rol le dara al usuario");
      			 rol = teclado.next();
    	    	   
    	       
			     } 
   	 }
   	 
	}

}
