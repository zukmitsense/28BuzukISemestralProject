package SemestralProject;
import java.util.Scanner;
/**
 * 1. program checks if given n vectors with n elements are orthonormal. 
 * @author ivan
 * @version 0.3 28.12.22
 */
public class OrtonormalniVektora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ortonormalniVektora();
    }
    public static void ortonormalniVektora() {
        //in
        boolean isOrtonormal = false;
        System.out.println("");
        System.out.println("Pocet vektoru");
        int n = sc.nextInt();
        if(n>0){
            
            System.out.println("Zadej vektory");
            double[][] vektors = new double[n][n];
            for (int i = 0; i < vektors.length; i++) {
                for (int j = 0; j < vektors[i].length; j++) {
                    vektors[i][j] = sc.nextDouble();
                
                }
            
            }
            
            //process
            
            boolean stav1 = stav1(vektors);
            if (stav1 == true && n != 1){
               boolean stav2 = stav2(vektors); 
               if(stav2 == true){
                   isOrtonormal = true;
               }
            }
    
           //out
            System.out.println("System vektoru " + ((isOrtonormal)? "je ":"neni ")+ "ortonormalni");
            ortonormalniVektora();
        }
        
       
        
        
    }    
      
    static boolean stav1(double[][] a){// každý vektor musí mít délku 1
        
        //in
        
        int delkana2 = 0;
        int delka;
        
        boolean DV = true;
        
        //process
        
        for (int i = 0; i < a.length && DV == true; i++) {
            for (int j = 0; j < a[i].length; j++) {
               if(a[i][j]>1){
                   DV = false;
               }
               else{
               delkana2 = (int) (delkana2 + Math.pow((a[i][j]),2)); 
               }
            }
     
            delka = (int) Math.sqrt(delkana2);
                if(delka != 1){
                    DV = false;
                }
            delkana2 = 0;
        }
        
        //return
        
        return DV;
        
    }
    static boolean stav2(double[][] a){ // všichni vzájemné bodové součiny dvojice různých vektorů se musí rovnat 0
        
          //in
          
          int soucinvektoru = 0;
          boolean soucinVektoru0 = true;
          
          //process
          
          for (int u = 0; u < a.length-1 && soucinVektoru0 == true; u++) {
              for (int v = u+1; v < a.length; v++) {
                  for (int i = 0; i < a[v].length; i++) {
                      soucinvektoru =(int) soucinvektoru + (int)(a[u][i]*a[v][i]);
                      
                   }
                   if (soucinvektoru != 0){
                        soucinVektoru0 = false;
                      
                   }
                  
              }
              
          }
          
        //return
          
        return soucinVektoru0;
      }
    }
    


