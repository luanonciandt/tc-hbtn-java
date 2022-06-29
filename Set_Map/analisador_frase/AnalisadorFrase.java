import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> analisador = new TreeMap<>();
        String[] palavras = frase.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = palavras[i].replaceAll("[!?.]", "");
            palavras[i] = palavras[i].toLowerCase();
            if (!analisador.containsKey(palavras[i])) {
                analisador.put(palavras[i], 1);
            } else {
                analisador.put(palavras[i], analisador.get(palavras[i]) + 1);
            }
        }
        return analisador;
    }
}
