import java.util.Scanner;

public class InputHelper {

    public static int readIntOption(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try { return Integer.parseInt(line); }
            catch (NumberFormatException e) { System.out.println("Entrada inválida. Digite um número inteiro."); }
        }
    }

    public static double readDoubleAllowAns(Scanner sc, Double lastResult, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("ans")) {
                if (lastResult == null) {
                    System.out.println("Nenhum resultado anterior disponível. Digite um número.");
                    continue;
                } else { return lastResult; }
            }
            try {
                line = line.replace(',', '.');
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número (ou 'ans').");
            }
        }
    }
}
