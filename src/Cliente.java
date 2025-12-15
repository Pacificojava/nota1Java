public class Cliente {
    String cpf;
    String nome;
    String telefone;
    String email;
//construtor
    public Cliente(String cpf, String nome, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }
    //get e set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*A Classe Cliente deve conter os atributos: String cpf, String nome, String telefone e String email. - PRONTO.
     Implementando:
● Um construtor que receba todos os atributos; - PRONTO.
● Métodos getters e setters para todos os campos (- PRONTO), com validações simples (ex.: CPF e telefone não podem ser vazios).
     */

}
