/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automobilli;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import myinputs.Ler;

/**
 *
 * @author Nuno
 */
public class menu {
    
    public menu(){
        
    }
    
    public void MenuLoja(String Utilizador){
        System.out.println("Na Loja");
    }
    /*
    public void MenuLogin(){
        char k;
        System.out.println("1 - Iniciar Sessão");
        System.out.println("2 - Criar Conta");
        System.out.println("3 - Esqueceu a Palavra-Passe");
        System.out.println("4 - Voltar");
        System.out.print(">");
        
        k = Ler.umChar();
        while(k != '4'){
            switch(k){
            case '1':
                String email = "", password = "";
                char opt = '0';
                Login l;
                while((email.equals("") && password.equals("")) || (opt != '2')){
                    System.out.println("email: ");
                    email = Ler.umaString();
                    System.out.println("password");
                    password = Ler.umaString();
                    l = new Login(email, password);
                    
                    if(l.login()){
                        MenuLoja();
                    }else{
                        System.out.println("Palavra-passe ou email incorreto");
                        System.out.println("1) Tentar de Novo");
                        System.out.println("2) Voltar");
                        System.out.println("?>");
                        opt = Ler.umChar();
                        if(opt == '1'){
                            email = "";
                            password = "";
                        }
                    }
                }
                break;
            case '2':
                System.out.println("Criar Conta");
                break;
            case '3':
                System.out.println("");
                break;
            case '4':
                System.out.println("Voltar");
                break;
            }
        }
    }
    
    public void MenuLoginOpc(char k){
        if(k == 4){
            clearConsole();
            for(int i=0; i<99999; i++){
                
            }
        }
        MenuLoja();
    }
    
    public boolean CriarContaCliente(){
        
        String nome, email, palavra_passe, cpalavra_passe, morada;
        System.out.println("Nome: ");
        nome = Ler.umaString();
        System.out.println("Morada: ");
        morada = Ler.umaString();
        System.out.println("Email: ");
        email = Ler.umaString();
        System.out.println("Palavra-Passe: ");
        palavra_passe = Ler.umaString();
        System.out.println("Confirmar Palavra-Passe: ");
        cpalavra_passe = Ler.umaString();
        
        while(palavra_passe != cpalavra_passe){
            System.out.println("Palavra-Passe: ");
            palavra_passe = Ler.umaString();
            System.out.println("Confirmar Palavra-Passe: ");
            cpalavra_passe = Ler.umaString();
        }
        Utilizador e1 = new Utilizador(nome, email, palavra_passe);
        Cliente e = (Cliente)e1;
        return true;
    }
    
    
    public boolean CriarContaEmpregado(){
        return true;
    }
    
    public boolean iniciarSessao(){
        //chamar classe login
        return true;
    }
    
    public void limparEcra() throws IOException{
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
        } catch (AWTException ex) {
            System.out.println("Erro!");
        }
    }
    
   public final void clearConsole(){
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
}
    
*/
}
