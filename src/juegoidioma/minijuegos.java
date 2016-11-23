
package juegoidioma;


public abstract class minijuegos implements interfase{
    private int id;
    private String Palabra;
    private String traduccion;

    public minijuegos(int id, String Palabra, String traduccion) {
        this.id = id;
        this.Palabra = Palabra;
        this.traduccion = traduccion;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }
    
    @Override
    public abstract String Obtener();    
}

