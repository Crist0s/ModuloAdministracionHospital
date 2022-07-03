/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmoduloadministracion;


import java.util.Scanner;
/**
 *
 * @author Cristobal
 */
public class HospitalModuloAdministracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in); // scanner para poder leer el input de texto
        
        System.out.println("que operacion desea realizar?: "
                + "\n" + "[1] -Eliminar "
                + "\n" + "[2] -Registrar "
                + "\n" + "[3] -Modificar "
                + "\n" + "[4] -Consultar "
        ); //menu con opciones para el administrador
    
        System.out.println("En que Base de datos desea realizar la operacion:" 
                + "\n" + "[1] -Enfermedades "
                + "\n" + "[2] -Medicamentos "
                + "\n" + "[3] -Veredas "
                + "\n" + "[4] -Usuarios "
                + "\n" + "[5] -Personal_Medico "
                    
        ); //menu con opciones para el administrador
       
}
}
