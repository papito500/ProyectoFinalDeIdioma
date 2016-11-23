package juegoidioma;

public class Respuesta {
    
private String respuesta;
private String duda1;
private String duda2;
private String duda3;

    public Respuesta(String respuesta, String duda1, String duda2, String duda3) {
        this.respuesta = respuesta;
        this.duda1 = duda1;
        this.duda2 = duda2;
        this.duda3 = duda3;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getDuda1() {
        return duda1;
    }

    public void setDuda1(String duda1) {
        this.duda1 = duda1;
    }

    public String getDuda2() {
        return duda2;
    }

    public void setDuda2(String duda2) {
        this.duda2 = duda2;
    }

    public String getDuda3() {
        return duda3;
    }

    public void setDuda3(String duda3) {
        this.duda3 = duda3;
    }
    
    

}
