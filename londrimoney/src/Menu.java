import java.util.Scanner;

public class Menu {
    public String loadMenu(int cargo){
        Scanner sc = new Scanner(System.in);
        if(cargo == 1){
            Diretor diretor = new Diretor(1000, "Andersu", 1);
            String tipoConta = diretor.getTipoConta() == 1 ? "Corrente" : "Poupança";
            System.out.println("Sua conta é do tipo: " + tipoConta);
            int opt = 0;
            while(opt != 4){
                System.out.println("Selecione uma operação:");
                System.out.println("[1] Saque");
                System.out.println("[2] Deposito");
                System.out.println("[3] Consultar saldo");
                System.out.println("[4] Sair");
                opt = sc.nextInt();
                if(opt == 4) break;

                if(opt == 1){
                    System.out.println("Informe o valor para sacar");
                    double valor = sc.nextDouble();
                    diretor.saque(valor);
                }else if(opt == 2){
                    System.out.println("Informe o valor para depositar");
                    double valor = sc.nextDouble();
                    diretor.deposito(valor);
                }else if(opt == 3){
                    diretor.consulta();
                }else{
                    System.out.println("Operação inválida");
                }
            }
        }else if(cargo == 2){
            Operario operario = new Operario(1000, "Rafão", 2);
            String tipoConta = operario.getTipoConta() == 1 ? "Corrente" : "Poupança";
            System.out.println("Sua conta é do tipo: " + tipoConta);
            int opt = 0;
            while(opt != 4){
                System.out.println("Selecione uma operação:");
                System.out.println("[1] Saque");
                System.out.println("[2] Deposito");
                System.out.println("[3] Consultar saldo");
                System.out.println("[4] Sair");
                opt = sc.nextInt();
                if(opt == 4) break;

                if(opt == 1){
                    System.out.println("Informe o valor para sacar");
                    double valor = sc.nextDouble();
                    operario.saque(valor);
                }else if(opt == 2){
                    System.out.println("Informe o valor para depositar");
                    double valor = sc.nextDouble();
                    operario.deposito(valor);
                }else if(opt == 3){
                    operario.consulta();
                }else{
                    System.out.println("Operação inválida");
                }
            }
        }else{
            return "Cargo inválido";
        }
    return "";
    }
}
