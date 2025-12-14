import java.util.ArrayList;
import java.util.List;

public class  Banco {
    //list para cliente
    List<Cliente> Clientes =  new ArrayList<Cliente>();

    //construtor list cliente
    public Banco(List<Cliente> clientes) {
        Clientes = clientes;
    }


    //conta
    List<Conta> Contas = new ArrayList<Conta>();

   /* Um construtor vazio que inicialize as listas;
● Métodos getters e setters quando necessário;
● buscarCliente(String cpf) – procura um cliente cadastrado;
● buscarConta(int numero, int agencia) – retorna a conta correspondente;
● transferir(int numeroOrigem, int numeroDestino, double valor) – realiza uma transferência entre contas, verificando a existência e o saldo.
     */

}
