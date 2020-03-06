/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package AnLex;

import java.io.Serializable;

/**
 *
 * @author betzy
 */
public class Linea implements Serializable{
    private String [][] pal;
    private int token[];
    private int actual;
    
    public Linea(String[][] pal, int[] token){
        this.pal=pal;
        this.token= token;
    }
    
    public int token(){
        return actual;
    }
    
    public String buscar(String pal){
        for(int i=0; i<this.pal.length; i++){
            if(pal.equals(this.pal[i][1])){
                actual=token[i];
                return this.pal[i][1];
            }
        }
        return null;
    }
}
