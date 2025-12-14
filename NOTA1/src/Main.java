
public class Main  {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("054.037.094-54", "chris bumbsted", "98 98475-6961", "cbam7xchampions@outloock.com");

        //tela
        System.out.println("_________________DADOS DO CLIENTE________________");
        System.out.println("cpf do cliente: " +cliente1.cpf);
        System.out.println("Nome do cliente: " +cliente1.nome);
        System.out.println("Telefone do cliente: " +cliente1.telefone);
        System.out.println("Email do cliente: " +cliente1.email);



    }

}
