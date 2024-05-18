public class App1 {
    public static void main(String[] args) {
        String text = null;
        String newText = null;

        try {
            newText = text.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println(
                    "O frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default.");

            text = "Frase vazia";
        } finally {
            newText = text.toUpperCase();
        }

        System.out.println("Frase antiga: " + text);
        System.out.println("Frase nova: " + newText);
    }
}
