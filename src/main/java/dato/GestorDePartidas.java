package dato;
import modelo.*;
import java.io.*;
import java.util.Date;
public class GestorDePartidas {

    public static void leerArchivoPartida(JuegoCarioca juegoCarioca, String direccionArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(direccionArchivo))) {
            String textoArchivo;
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");

                while ((textoArchivo = br.readLine()) != null) {
                    data = textoArchivo.split(",");
                    juegoCarioca.getPartidas().add(new Partida(data[0], data[1], data[2], new Date(data[3])));
                }

            }
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo de partidas", e);
        }
    }




    public void escribirArchivo(JuegoCarioca juegoCarioca, String nombreArchivo) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            objectOutputStream.writeObject(juegoCarioca);
        }
    }

    //Metodo que verifica si el archivo existe
    public boolean existeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    //Metodo que crea un archivo de texto verificando si existe o no
    public static void crearArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    //Metodo que elimina un archivo de texto verificando si existe o no
    public void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
    }

    //Metodo que imprime el objeto de tipo JuegoCarioca
    public void imprimirJuegoCarioca(JuegoCarioca juegoCarioca) {
        System.out.println(juegoCarioca.toString());
    }

    //Metodo que imprime el objeto de tipo Jugador
    public void imprimirJugador(Jugador jugador) {
        System.out.println(jugador.toString());
    }
}
