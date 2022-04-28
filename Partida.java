/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rol;

import java.util.Arrays;

/**
 *
 * @author Pablo
 */
public class Partida {

    int [][]tablero;
    private int tamaño;
    int posicionHeroe;
    int posicionEnemigo;
    int posicionEnemigo2;
    int posicionEnemigo3;

    public Partida() {
    }

    public Partida(int tamaño) {
        switch (tamaño) {
            case 1:
                tablero = new int[3][3];
                setTamaño(3);
                break;
            case 2:
                tablero = new int[4][4];
                setTamaño(4);
                break;
            case 3:
                tablero = new int[5][5];
                setTamaño(5);
                break;

        }

    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

  

    public void inicioPartida() {
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-1; j++) {
                tablero[i][j]=0;
            }
            
        }
        tablero[0][0]=posicionHeroe;

        int aleatorio1 = 0;
        int aleatorio2 = 0;

        aleatorio1 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);
        aleatorio2 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);

        tablero[aleatorio1][aleatorio2]=posicionEnemigo;
       
        aleatorio1 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);
        aleatorio2 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);

        tablero[aleatorio1][aleatorio2]=posicionEnemigo2;
        
        aleatorio1 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);
        aleatorio2 = (int) Math.floor(Math.random() * (tablero.length + 1 - 1) + 1);
        tablero[aleatorio1][aleatorio2]=posicionEnemigo3;
        

    }

    public void mostrarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-1; j++) {
                if (tablero[i][j] == posicionHeroe) {
                    System.out.print(1);

                }
                if (tablero[i][j] == posicionEnemigo || tablero[i][j] == posicionEnemigo2 || tablero[i][j] == posicionEnemigo3) {
                    System.out.print(8);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println(" ");
        }

    }

}
