/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnLex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author betzy
 */
public class Archivo {

    static final String NOMFILE = "PalabrasReservadas.dat";

    public static void crear() throws IOException {
        int token[] = new int[18];
        String[][] pal = {{"main", "inicio programa"},
        {"var", "declara variable"},
        {"const", "declara variable constante"},
        {"int", "variable(s) entera(s)"},
        {"float", "variable(s) real(es)"},
        {"char", "variable(s) caracter(es)"},
        {"string", "variable(s) cadena(s)"},
        {"bool", "variable(s) booleano(s)"},
        {"true", "Verdadero"},
        {"false", "Falso"},
        {"if", "Estructura Condicional"},
        {"else", "Estructura Condicional"},
        {"for", "Estructura Iterarativa"},
        {"class", "Declara clase"},
        {"read", "Lee pantalla"},
        {"print", "Imprime en pantalla"},
        {"void", "vacio"}
        };

        for (int i = 0; i < pal.length; i++) {
            token[i] = i + 100;
        }
        Archivo.guardar(NOMFILE, new Linea(pal, token));

    }

    public static Linea recuperar() throws IOException, ClassNotFoundException {
        return Archivo.recuperar(NOMFILE, null);
    }

    public static <T extends Serializable> void guardar(String nomArch, T a)
            throws IOException {
        FileOutputStream file = new FileOutputStream(nomArch);
        ObjectOutputStream salida = new ObjectOutputStream(file);

        salida.writeObject(a);
        salida.close();
    }

    public static <T extends Serializable> T recuperar(String nomArch, T a)
            throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(nomArch);
        ObjectInputStream entrada = new ObjectInputStream(file);

        a = (T) entrada.readObject();
        entrada.close();

        return a;
    }

}
