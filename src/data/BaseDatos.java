package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

public abstract class BaseDatos {

    public static TreeMap<String, Usuario> leerCSVUsuarios(TreeMap<String, Usuario> listaUsuarios) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("usuarios.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] atributos = line.split(";");
                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(atributos[7]); //Para convertir el String a Date
                if (listaUsuarios.containsKey(atributos[2])) {
                    listaUsuarios.remove(atributos[2]); //Esto evita que, en caso de que haya existido cambios de datos, haya redundancia
                }
                Usuario usuarioGuardado = new Usuario(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5], atributos[6], fecha, atributos[8]);
                listaUsuarios.put(usuarioGuardado.getNick(), usuarioGuardado);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error IO");
                }
            }
        }
        return listaUsuarios;
    }

    
    
    public static void guardarUsuario(Usuario usuario, TreeMap<String, Usuario> listaUsuarios, TreeMap<String, Guia> listaGuias, TreeMap<String, Visitante> listaVisitantes) {
        listaUsuarios.put(usuario.getNick(), usuario);
        FileWriter writer = null;
        try {
            writer = new FileWriter("usuarios.csv", true);
            writer.write(usuario.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
