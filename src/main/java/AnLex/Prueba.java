/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnLex;

/**
 *
 * @author betzy
 */
public class Prueba {
    
    public static void main(String args[]){
       char x[]={'{', '}', '(', ')', '$', '>', '<', '+', '*', '/', '-', '-', '<'+'-', ':', '-'+'>', };
       for(int aux:x){
           System.out.println((char)aux+": "+(int)aux);
       }
    }
    
}
