/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rol;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Rol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Raza personaje; 
        Partida tablero;
        
        
      
        
       
       
        
        int personajeElegido=0;
        
        System.out.println("Bienvenido a la partida de rol vas a escoger el personaje que quieres llevar");
        System.out.println("Existen estas razas, escoge una 1.Guerrero 2.Asesino 3.Curandero");
        personajeElegido=sc.nextInt();
        personaje=new Raza(personajeElegido); 
        personaje.verPersonaje();
        System.out.println("Vamos a generar los enemigos contra los que pelearas");
        personaje.dificultad();
        System.out.println("De que tamaño quieres que sea tu tablero 1.pequeño 2.mediano 3.grande");
        tablero=new Partida(sc.nextInt());
        System.out.println("Creando la partida.....");
        tablero.inicioPartida();
        tablero.mostrarTablero();
        
        
    }
    
}
