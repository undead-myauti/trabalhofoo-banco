import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Londrina's Money\n");
        System.out.println("Por favor, selecione seu cargo: ");
        System.out.println("[1] Diretor\n[2] Operário");
        Scanner sc = new Scanner(System.in);
        int cargo = sc.nextInt();
        Menu menu = new Menu();
        menu.loadMenu(cargo);
    }
}