import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> duplicados = new TreeSet<>();
        for (int numero : numeros) {
            if (set.contains(numero)) {
                duplicados.add(numero);
            }
            set.add(numero);
        }
        return duplicados;
    }
}
