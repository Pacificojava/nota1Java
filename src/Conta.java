class Conta {
    Cliente cliente;
    int numero;
    int agencia;
    double saldo = 0.0;

//construtor
    public Conta(Cliente cliente, int numero, int agencia, double saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;

    }
    //GETTERS E SETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    //DEPOSITAR
    public void deposito(double valor) {
        if (valor > 0);
        this.saldo += saldo;
        IO.println("DEPOSITO DE: R$ \n" + valor);
    }
    //SACAR
    public void sacar(double valor) {
        if (valor >= 0 ) {
            this.saldo -= saldo;
            IO.println("SAQUE DE R$: \n" + valor);
        }
    }
/*A Classe Conta deve conter os atributos: Cliente cliente, int numero, int agencia e double saldo.- PRONTO.
Implementando:
● Um construtor que receba todos os atributos;- PRONTO.
● Métodos getters e setters;- PRONTO.
● depositar(double valor) – só permite valores positivos; - PRONTO
● sacar(double valor) – só permite valores positivos e menores ou iguais ao saldo disponível.- PRONTO */

}
