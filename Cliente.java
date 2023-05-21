public class Cliente implements autenticacao {

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

    public boolean autenticaSenha(String senha) {
        if (this.senha != senha) {
            System.out.println("senha nao autenticada!");
            return false;
        }
        System.out.println("senha autenticada!");
        return true;
    }
}



