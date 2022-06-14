public class Program {
    public static void main(String[] args) {
        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo("1");
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo()); // 1 - false
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        InteiroPositivo inteiroPositivo1 = null;

        try {
            inteiroPositivo1 = new InteiroPositivo("43");
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo()); // 43 - true
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(-1);
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo()); // Valor nao eh um valor inteiro positivo
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            inteiroPositivo1.setValor(inteiroPositivo1.getValor() + 1);
            System.out.println(inteiroPositivo1.getValor() + " - " + inteiroPositivo1.ehPrimo()); // 44 - false
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo("-3");
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo()); // Valor nao eh um valor inteiro positivo
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(379);
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo()); // 379 - true
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            InteiroPositivo inteiroPositivo = new InteiroPositivo(378);
            System.out.println(inteiroPositivo.getValor() + " - " + inteiroPositivo.ehPrimo()); // 378 - false
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}