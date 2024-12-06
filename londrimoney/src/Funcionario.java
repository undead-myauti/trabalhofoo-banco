public abstract class Funcionario {
    protected double saldo;
    protected String name;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Funcionario(double saldo, String name){
        this.setSaldo(saldo);
        this.setName(name);
    }

    public abstract String saque(double valor);
    public abstract String deposito(double  valor);
    public abstract void consulta();
}
