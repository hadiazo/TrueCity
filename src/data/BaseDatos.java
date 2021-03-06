package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import java.util.Arrays;

//Karl Weierstrass — 'When I wrote this, only God and I understood what I was doing. Now, God only knows.'

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
            System.out.println("Error al leer usuarios.csv");
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error IO de usuarios.csv");
                }
            }
        }
        return listaUsuarios;
    }

    public static TreeMap<String, Guia> leerCSVGuias (TreeMap<String, Usuario> listaUsuarios, TreeMap<String, Guia> listaGuias) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("guias.csv"));
            String line = br.readLine();
            while (null != line) {
                String[] atributos = line.split(";");
                if (listaGuias.containsKey(atributos[0])) {
                    listaGuias.remove(atributos[0]); //Esto evita que, en caso de que haya existido cambios de datos, haya redundancia
                }
                Usuario usuario;
                usuario = listaUsuarios.get(atributos[0]);
                Guia guia = new Guia (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
                guia.setTipoGuia(atributos[1]);
                guia.setNumCelular(atributos[2]);
                guia.setDescripcion(atributos[3]);
                listaGuias.put(guia.getNick(), guia);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error al leer guias.csv");
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error IO de guias.csv");
                }
            }
        }
        return listaGuias;
    }
    
    public static TreeMap<String, Visitante> leerCSVInteresesVisitantes (TreeMap<String, Usuario> listaUsuarios, TreeMap<String, Visitante> listaVisitantes) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("interesesVisitantes.csv"));
            String line = br.readLine();
            while (null != line) {
                ArrayList <String> atributos = new ArrayList <> (Arrays.asList(line.split(";")));
                ArrayList <String> interesesVisitante = new ArrayList <> ();
                String nick;
                nick = atributos.get(0);
                if (listaVisitantes.containsKey(atributos.get(0))) {
                    listaVisitantes.remove(atributos.get(0)); //Esto evita que, en caso de que haya existido cambios de datos, haya redundancia
                }
                Usuario usuario;
                usuario = listaUsuarios.get(nick);
                Visitante visitante = new Visitante (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
                for (int i=1; i<atributos.size(); i++) {
                    interesesVisitante.add(atributos.get(i));
                }
                visitante.setInteresesTuristicos(interesesVisitante);
                visitante.setNumCelular(atributos.get(atributos.size()-1));
                listaVisitantes.put(visitante.getNick(), visitante);
                line = br.readLine();
            }
        }  catch (Exception e) {
            System.out.println("Error al leer interesesVisitantes.csv");
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error IO de interesesVisitantes.csv");
                }
            }
        }
        return listaVisitantes;
    }
    
    /*public static void leerCSVVisitantesInteresados(TreeMap<String, Usuario> listaUsuarios, TreeMap<String, Guia> listaGuias) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("interesesVisitantes.csv"));
            String line = br.readLine();
            while (null != line) {
                ArrayList <String> atributos = new ArrayList <> (Arrays.asList(line.split(";")));
                ArrayList <String> visitantesInteresados = new ArrayList <> ();
                String nick;
                nick = atributos.get(0);
                if (listaGuias.containsKey(atributos.get(0))) {
                    listaGuias.remove(atributos.get(0)); //Esto evita que, en caso de que haya existido cambios de datos, haya redundancia
                }
                Usuario usuario;
                usuario = listaUsuarios.get(nick);
                Guia guia = new Guia (usuario.getNombre(), usuario.getApellido(), usuario.getNick(), usuario.getEmail(), usuario.getClave(), usuario.getCiudad(), usuario.getGenero(), usuario.getFechaNacimiento(), usuario.getRespuestaSeguridad());
                for (int i=1; i<atributos.size(); i++) {
                    visitantesInteresados.add(atributos.get(i));
                }
                
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error al leer visitantesInteresados.csv");
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error IO de visitantesInteresados.csv");
                }
            }
        }
    }*/
    
    public static void guardarUsuario(Usuario usuario, TreeMap<String, Usuario> listaUsuarios/*, TreeMap<String, Guia> listaGuias, TreeMap<String, Visitante> listaVisitantes*/) {
        listaUsuarios.put(usuario.getNick(), usuario);
        FileWriter writer = null;
        try {
            writer = new FileWriter("usuarios.csv", true);
            writer.write(usuario.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Error en usuarios.csv");
        }
    }
    
    public static void guardarGuias(Guia guia, TreeMap<String, Guia> listaGuias) {
        listaGuias.put(guia.getNick(), guia);
        FileWriter writer = null;
        try {
            writer = new FileWriter("guias.csv", true);
            writer.write(guia.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Error en guias.csv");
        }
    }
    
    public static void guardarIntereses(Visitante visitante, TreeMap<String, Visitante> listaVisitantes) {
        listaVisitantes.put(visitante.getNick(), visitante);
        FileWriter writer = null;
        try {
            writer = new FileWriter("interesesVisitantes.csv", true);
            writer.write(visitante.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("Error en interesesVisitantes.csv");
        }
    }
    
    /*public static void guardarVisitantesInteresados(Guia guia, ArrayList <Visitante> visitantesInteresados) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("visitantesInteresados.csv", true);
            writer.write(guia.toString(visitantesInteresados));
            writer.close();
        } catch (Exception e) {
            System.out.println("Error en visitantesInteresados.csv");
        }
    }*/
}
