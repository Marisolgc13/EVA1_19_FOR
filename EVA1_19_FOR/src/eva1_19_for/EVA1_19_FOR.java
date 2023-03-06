/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_for;

/**
 *
 * @author Marisol G
 */
public class EVA1_19_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = new int [10];
        
        for (int i = 0; i < arreglo.length; i++) {
             arreglo[i] = (int)(Math.random() * 100);
        }
        // imprimir con for each sirve solo para leer
        //  for (tipo de dato del arreglo variable : arreglo)
        for(int i : arreglo){
            System.out.print("[" + i + "]");
        }
        String [] arreCade = new String [20];
        for (String string : arreCade) {
            
        }
    }
    
}
