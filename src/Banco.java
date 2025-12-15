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


/* Um construtor vazio que inicialize as listas;
● Métodos getters e setters quando necessário;
● transferir(int numeroOrigem, int numeroDestino, double valor) – realiza uma transferência entre contas, verificando a existência e o saldo.
     */

}
