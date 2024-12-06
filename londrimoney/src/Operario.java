public class Operario extends Funcionario {

    public int getTipoConta() {
        return tipoConta;
    }

    private int tipoConta;
    public Operario(double saldo, String name, int tipoConta){
        super(saldo, name);
        this.tipoConta = tipoConta;
    }

    public String saque(double valor){
        if(this.tipoConta == 1){
            System.out.println("Para esse tipo de conta, temos uma taxa de 3% no saque");
            valor += valor * 0.3;
            if(valor > this.saldo){
                return "O valor de saque é maior que o saldo";
            }
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Para esse tipo de conta, temos uma taxa de 1% no saque");
            valor += valor * 0.1;
            if(valor > this.saldo){
                return "O valor de saque é maior que o saldo";
            }
            this.saldo = this.saldo - valor;
        }

        return "Saque realizado no valor de " + valor + "\n" + "Seu novo saldo é: " + this.saldo;
    }

    public String deposito(double valor){
        if(valor <= 0) {
            return "Valor inválido para depósito";
        }
        if(tipoConta == 2){
            double rendimento = valor * 0.1;
            System.out.println("O rendimento para esse tipo de conta é de 1% do valor depositado");
            this.saldo += valor + rendimento;
        }else{
            this.saldo = this.saldo + valor;
        }
        return "Deposito realizado no valor de " + valor + "\n" + "Seu novo saldo é: " + this.saldo;
    }

    public void consulta(){
        System.out.println("Saldo atual: " + this.saldo);
    }
}
