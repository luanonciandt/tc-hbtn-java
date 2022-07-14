import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> list) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List desserializar() {
        List desserializedObjects = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            desserializedObjects = (List) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return desserializedObjects;
    }
}
