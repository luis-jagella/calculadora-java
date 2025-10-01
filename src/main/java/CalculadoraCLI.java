import java.util.Scanner;

public class CalculadoraCLI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Historico historico = new Historico();
        
        Double lastResult = null;
        
        int opcao;

        do {
            mostrarMenu();
            opcao = InputHelper.readIntOption(sc, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    double a1 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o primeiro número: ");
                    double b1 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o segundo número: ");
                    
                    lastResult = Operacoes.somar(a1, b1);
                    printResultado(lastResult);
                    
                    historico.add(String.format("%s + %s = %s", Operacoes.format(a1), Operacoes.format(b1), Operacoes.format(lastResult)));
                    break;
                case 2:
                    double a2 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o primeiro número: ");
                    double b2 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o segundo número: ");
                    
                    lastResult = Operacoes.subtrair(a2, b2);
                    printResultado(lastResult);
                    
                    historico.add(String.format("%s - %s = %s", Operacoes.format(a2), Operacoes.format(b2), Operacoes.format(lastResult)));
                    break;
                case 3:
                    double a3 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o primeiro número: ");
                    double b3 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o segundo número: ");
                    
                    lastResult = Operacoes.multiplicar(a3, b3);
                    printResultado(lastResult);
                    
                    historico.add(String.format("%s * %s = %s", Operacoes.format(a3), Operacoes.format(b3), Operacoes.format(lastResult)));
                    break;
                case 4:
                    double a4 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o dividendo: ");
                    double b4 = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o divisor: ");
                    
                    if (b4 == 0) {
                        System.out.println("\nErro: divisão por zero não permitida.");
                    } else {
                        lastResult = Operacoes.dividir(a4, b4);
                        
                        printResultado(lastResult);
                        historico.add(String.format("%s / %s = %s", Operacoes.format(a4), Operacoes.format(b4), Operacoes.format(lastResult)));
                    }
                    break;
                case 5:
                    double base = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite a base: ");
                    double expo = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o expoente: ");
                    
                    lastResult = Operacoes.potencia(base, expo);
                    printResultado(lastResult);
                    
                    historico.add(String.format("%s ^ %s = %s", Operacoes.format(base), Operacoes.format(expo), Operacoes.format(lastResult)));
                    break;
                case 6:
                    double v = InputHelper.readDoubleAllowAns(sc, lastResult, "Digite o número: ");
                    if (v < 0) {
                        System.out.println("\nErro: não existe raiz real para número negativo.");
                    } else {
                        lastResult = Operacoes.raizQuadrada(v);
                        printResultado(lastResult);
                        
                        historico.add(String.format("sqrt(%s) = %s", Operacoes.format(v), Operacoes.format(lastResult)));
                    }
                    break;
                case 7: historico.show(); break;
                case 8: historico.clear(); break;
                case 0: System.out.println("Encerrando a calculadora..."); break;
                default: System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n------- CALCULADORA CLI -------");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("7 - Histórico");
        System.out.println("8 - Limpar histórico");
        System.out.println("0 - Sair");
    }

    private static void printResultado(double resultado) {
        System.out.println();
        System.out.println("Resultado: " + Operacoes.format(resultado));
    }
}
