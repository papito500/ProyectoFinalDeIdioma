
package juegoidioma;

import java.util.Random;


public abstract class  minijuego1 extends minijuegos{
    public String completar;

    public minijuego1(int id, String Palabra, String traduccion,String completar) {
        super(id, Palabra, traduccion);
        this.completar=completar;       
    }
    
    
    @Override
    public String Obtener(){
        String salida = "";
        Random rnd = new Random();
        int b = (int) (rnd.nextDouble() * 2 + 0); //define donde empezara a modificarse

        for (int i = 0; i < completar.length(); i++) {
            if (completar.substring(i, i + 1).equals(" ")) {
                salida += " ";
                b += 3;
            } else if (i == b) {
                salida += "-";
                b += 3;
            } else {
                salida += completar.substring(i, i + 1);
            }
        }
        return salida;
    }
    
}
