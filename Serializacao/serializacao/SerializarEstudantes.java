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

    public List<Estudante> desserializar() {
        List<Estudante> desserializedObjects = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            while(objectInputStream.available() > 0) {
                Estudante e = (Estudante) objectInputStream.readObject();
                desserializedObjects.add(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return desserializedObjects;
    }
}
