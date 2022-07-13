package tela;

import java.util.Scanner;

public class GetNomeFilme {
    public static String getNomeFilme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual título do filme deseja entrar?");
        return scanner.nextLine().replaceAll("\\s", "+");
    }
}
