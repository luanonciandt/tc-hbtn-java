public class PrintStringConcat {
    public static void main(String[] args) {
        String texto1 = "Holberton";
        String texto2 = "School";
        String textoConcat = texto1.concat(" " + texto2);
        System.out.printf("Bem vindo a %s!\n", textoConcat);
    }
}
