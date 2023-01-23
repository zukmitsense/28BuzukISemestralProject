/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SemestralProject;

import static SemestralProject.OrtonormalniVektora.sc;

/**
 *
 * @author ivan
 */
public class Menu {
    public static void main(String[] args){
        boolean cycle;
        cycle = true;
        while(cycle){
          menu();  
        }
        
    }
    private static void menu(){
        System.out.println("Jaky program chcete spustit?");
        System.out.println("[1] OrtonormalniVektora     [2] VanocniUloha ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> OrtonormalniVektora.ortonormalniVektora();
            case 2 -> ortonormalnivektora.ChristmasBuzukIvan.Vanocni_uloha();
            default -> System.out.println("Nevalidni vstup");
                    
                    
        }
        
    }
}
