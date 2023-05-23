package michelli.Brito;

import java.util.*;
import java.lang.*;

// classe abstrata para autenticar a senha
@FunctionalInterface    // indicar que so tem 1 metodo abstrato nessa interface funcional
public interface autenticacao {
    public  boolean autenticaSenha(String senha) ;

}
