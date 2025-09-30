import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<String> itens = new ArrayList<>();

    public void add(String s) { itens.add(s); }

    public void show() {
        if (itens.isEmpty()) { System.out.println("\nNenhuma operação registrada."); return; }
        System.out.println("\n=== Histórico de Operações ===");
        for (int i = 0; i < itens.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, itens.get(i));
        }
    }

    public void clear() {
        itens.clear();
        System.out.println("Histórico limpo.");
    }
}
