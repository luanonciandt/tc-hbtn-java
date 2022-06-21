public class Numero {

    public static void dividir(int a, int b) {
        int div = 0;
        try {
            if (b == 0) throw new IllegalArgumentException("Nao eh possivel dividir por zero");
            div = a / b;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("%d / %d = %d\n", a, b, div);
        }
    }
}
