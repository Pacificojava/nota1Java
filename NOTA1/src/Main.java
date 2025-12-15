
public class Main  {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("054.037.094-54", "chris bumbsted", "98 98475-6961", "cbam7xchampions@outloock.com");

        //tela
        System.out.println("_________________DADOS DO CLIENTE________________");
        System.out.println("--> CPF: " +cliente1.cpf);
        System.out.println("--> NOME: " +cliente1.nome);
        System.out.println("--> TELEFONE: " +cliente1.telefone);
        System.out.println("--> EMAIL: " +cliente1.email);
        System.out.println("___________________________________________________");


    }

}
