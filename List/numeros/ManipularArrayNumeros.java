import java.util.*;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == number) {
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> list, int number) throws IllegalArgumentException {
        for (Integer integer : list) {
            if (integer == number) {
                throw new IllegalArgumentException("Numero jah contido na lista");
            }
        }
        list.add(number);
    }

    public static void removerNumero(List<Integer> list, int number) throws IllegalArgumentException {
        int index = buscarPosicaoNumero(list, number);
        if (index == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        } else {
            list.remove(index);
        }
    }

    public static void substituirNumero(List<Integer> list, int oldNumber, int newNumber) {
        int index = buscarPosicaoNumero(list, oldNumber);
        if (index == -1) {
            adicionarNumero(list, newNumber);
        } else {
            list.set(index, newNumber);
        }
    }

}
