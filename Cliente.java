public class Cliente {

    //atributos
   private String nome;
   private boolean status;
   private String senha;

   //metodo construtor
    public Cliente(String nome, boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
    }

    //metodo gett
    public String getNome() {
        return nome;
    }

    public boolean isStatus() {
        return status;
    }

    public String getSenha() {
        return senha;
    }
}
