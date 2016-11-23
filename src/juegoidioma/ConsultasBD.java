package juegoidioma;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasBD {

    MySqlBD baseDatos = new MySqlBD().conectar("localhost", "usuarios", "root", "");

    public ArrayList<Usuarios> consultarPacientes() {
        ArrayList<Usuarios> result = new ArrayList<>();
        ResultSet rs = baseDatos.consultar("SELECT * FROM Usuario");
        if (rs != null) {
            try {
                while (rs.next()) {
                    result.add(new Usuarios(rs.getString("nombre"),
                            rs.getString("correo"),
                            rs.getString("contraseña"),
                            rs.getString("tipo"),
                            rs.getInt("puntaje")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public Usuarios buscarPorUsuario(String UsuarioP) {
        Usuarios pac = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM Usuario" + " where nombre='" + UsuarioP+"'");
        if (rs != null) {
            try {
                while (rs.next()) {
                    pac = new Usuarios(rs.getString("nombre"),
                            rs.getString("correo"),
                            rs.getString("contraseña"),
                            rs.getString("tipo"),
                            rs.getInt("puntaje")
                    );
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pac;
    }

    public void insertarUsuario(String nombre, String correo, String contraseña, String tipo, int puntaje) {
        if (baseDatos.ejecutar("INSERT INTO Usuario VALUES('" + nombre + "','" + correo + "', '" + contraseña + "', '" + tipo + "', " + puntaje + ")")) {
            System.out.println("Ejecucion correxta!");
        } else {
            System.out.println("Ocurrio un problema al insertar!");
        }
    }

    public void modificarUsuario(String nombre, String correo, String contraseña, String tipo, int puntaje) {
        String sql = "UPDATE Usuario SET puntaje= '" + puntaje       
                
                + " where nombre= '" + nombre+"'";
        if (baseDatos.ejecutar(sql)) {
            System.out.println("Ejecucion correcta!");
        } else {
            System.out.println("ocurrio un problema al modificar!");
        }
    }

    public void borrar(int idPaciente) {
        if (baseDatos.ejecutar("DELETE FROM Pacientes WHERE" + " idPaciente= " + idPaciente)) {
            System.out.println("Ejecucion Correcta!");
        } else {
            System.out.println("Ocurrio un problema al borrar!");
        }
    }
}
