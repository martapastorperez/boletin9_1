
package boletin9_1;

import javax.swing.JOptionPane;


public class Numeros {
   
   public Numeros(){
       
   }
   public void mezcla (){
      int num,cp=0,cn=0,cc=0;
      for(int contador=0;contador<10;contador++){
          num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros"));
       
          if(num>0)
             cp++;
          
          
          else if (num<0)
                 cn++;
           
          else  
              cc++;
      }
      
       System.out.println("Números positivos"+cp);
       System.out.println("Números negativos"+cn);
       System.out.println("Ceros"+cc);
   }
}
