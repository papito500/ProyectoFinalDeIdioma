package juegoidioma;

public class Usuarios {
    private String nombre;
    private String correo;
    private String contraseña;
    private String tipo;
    private int puntaje;

    public Usuarios(String nombre, String correo, String contraseña, String tipo, int puntaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
   
    
}
