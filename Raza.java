/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rol;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Raza extends Partida {
    Scanner sc=new Scanner (System.in);
    
    private int vida;
    private int ataque;
    private int movilidad;
    private String raza;


    
 

    public Raza(int eleccion) {
        switch(eleccion){
            case 1:
                this.setVida(10);
                this.setAtaque(8);
                this.setMovilidad(6);
                this.setRaza("Guerrero");
            break;  
            
            case 2:
                this.setVida(7);
                this.setAtaque(9);
                this.setMovilidad(8);
                this.setRaza("Asesino");
            break;
            case 3:
                this.setVida(5);
                this.setAtaque(10);
                this.setMovilidad(3);
                this.setRaza("Mago");
            break;
            
        }          
        }

    public Raza(boolean enemigo,int dificultad) {
        
    
         switch(dificultad){
            case 1:
                this.setVida(20);
                this.setAtaque(3);
                
            break;  
            
            case 2:
                 this.setVida(30);
                this.setAtaque(6);
                
            break;
            case 3:
               this.setVida(35);
                this.setAtaque(8);
               
            break;
        
        
    }
    }
    
    
    

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @param movilidad the movilidad to set
     */
    public void setMovilidad(int movilidad) {
        this.movilidad = movilidad;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }


    
    
    public void dificultad() {
        System.out.println("Que dificultad quieres en la partida? nivel 1 nivel 2 o nivel 3");
        int dificultad=sc.nextInt();
        Raza[] enemigos = new Raza[3];
        for (int i = 0; i < enemigos.length; i++) {
           enemigos[i]=new Raza(true,dificultad); 
        } 
        
    }
    
    public void verPersonaje(){
        System.out.println("Has escogido un: ");
        System.out.println(this.raza+" el cual tiene las siguientes caracteristicas:");  
        System.out.println("Ataque: "+this.ataque);
        System.out.println("Vida: "+this.vida);
        System.out.println("Movilidad: "+this.movilidad);
        
    }
     public void setEnemigos(){
        int numeroR1=0;
        numeroR1=(int) Math.floor(Math.random()*(+1-1)+1);
        
        
        
    }


   
    
    }
    
    
    

