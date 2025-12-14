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

    //getters
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double valor) {
        if (valor > 0);
        this.saldo += saldo;
        IO.println("DEPOSITO DE: R$ \n" + valor);
    }
    public void sacar(double valor) {
        if (valor >= 0 ) {
            this.saldo -= saldo;
            IO.println("SAQUE DE R$: \n" + valor);
        }
    }
}
