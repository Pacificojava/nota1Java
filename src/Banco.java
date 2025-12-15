import java.util.ArrayList;
import java.util.List;

public class  Banco {
    //list para buscar Cliente (String cpf)- Procurar um cliente cadastrado
   private List<Cliente> listaCliente =  new ArrayList<Cliente>();

    //Lista para buscar conta (int numero, int agencia) – retorna a conta correspondente;
    List<Conta> listaContas = new ArrayList<Conta>();

    //construtor vazio
    public Banco() {
        this.listaCliente = new ArrayList<>();
        this.listaContas = new ArrayList<>();
    }
    //função para adicionar o cliente
    public void adicionarCliente(Cliente cliente){
        this.listaCliente.add(cliente);
        IO.println("CLIENTE ADICIONADO COM SUCESSO!: " + cliente.getNome());
    }


/* A Classe Banco deve conter os atributos:
List<Cliente> Clientes - PRONTO.
List<Conta> Contas - PRONTO.
Implementando:
● Um construtor vazio que inicialize as listas;- PRONTO.
● Métodos getters e setters quando necessário;
● buscarCliente(String cpf) – procura um cliente cadastrado; - FALTA.
● buscarConta(int numero, int agencia) – retorna a conta correspondente;  - FALTA.
● transferir(int numeroOrigem, int numeroDestino, double valor) – realiza uma transferência entre contas, verificando a existência e o saldo.  - FALTA. */

}
