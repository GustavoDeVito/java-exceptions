public class App2 {
    public static void main(String[] args) {
        try {
            toTextUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException ao executar o método toTextUpperCase() " + e);
        }
    }

    private static void toTextUpperCase() throws NullPointerException {
        String text = null;
        String newText = null;

        newText = text.toUpperCase();

        System.out.println("Frase antiga: " + text);
        System.out.println("Frase nova: " + newText);
    }
}