import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificaPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();
        System.out.println("Digite o nome e o sexo da pessoa no seguinte formato(ex:Daniel-M ou Adriana-F) e digite 'fim' para encerrar: ");
        String dadoEntrada;
        while (true) {
            dadoEntrada = sc.nextLine();
            if (dadoEntrada.equalsIgnoreCase("fim")) {
                break;
            }
            String[] divisao = dadoEntrada.split("-");
            if (divisao.length == 2) {
                String nome = divisao[0].trim();
                String sexo = divisao[1].trim();
                if (sexo.equalsIgnoreCase("M")) {
                    masculino.add(nome);

                } else if (sexo.equalsIgnoreCase("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo ou formato inválido");
                }

            }

        }

        sc.close();
        System.out.println("Masculino:" +masculino);
        System.out.println("Feminino:" +feminino);
    }
}