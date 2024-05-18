public class App3 {
    public static void main(String[] args) throws NotContainsNumberException {
        String text = "Sou um teste!";

        if (!text.contains("0") && !text.contains("1") && !text.contains("2") && !text.contains("3")
                && !text.contains("4") && !text.contains("5") && !text.contains("6") && !text.contains("7")
                && !text.contains("8") && !text.contains("9")) {
            throw new NotContainsNumberException(
                    String.format("Não contem nenhum número no seguinte texto: '%s'", text));
        }
    }
}
