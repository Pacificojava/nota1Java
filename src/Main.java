
public class Main  {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("054.037.094-54", "Chris bumbsted", "98 98475-6961", "cbam7xchampions@outloock.com");
        Cliente cliente2 = new Cliente("010.000.087-53", "Ramon dino", "98 98475-6961", "ramon1xchampions@outloock.com");

        //inicialização do banco e adicinando clientes:
        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        /*//tela
        System.out.println("_________________DADOS DO CLIENTE________________");
        System.out.println("--> CPF: " +cliente1.cpf);
        System.out.println("--> NOME: " +cliente1.nome);
        System.out.println("--> TELEFONE: " +cliente1.telefone);
        System.out.println("--> EMAIL: " +cliente1.email);
        System.out.println("___________________________________________________");
        */

    }

}
