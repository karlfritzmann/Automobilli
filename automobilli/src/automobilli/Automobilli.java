/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobilli;

/**
 *
 * @author Nuno
 */

import myinputs.Ler;
import java.io.File;
import java.util.ArrayList;

public class Automobilli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FicheiroVazio{
        /*menu Interface = new menu();
        String[] dados = new String[3];
        Cliente c = new Cliente("Jorge Correia", "jorgecorreia@sapo.pt", "jean_pierre");
        c.GuardarUtilizador("cliente");
        c.LerUtilizador("cliente.dat");*/
        /*
        Login l = new Login("jorgecorreia@sapo.pt", "jean_pierre");
        if(l.login()){
            System.out.println("Entrei");
        }*/
        
        /*
        
        Interface.MenuLogin();
        char k = Ler.umChar();
        Interface.MenuLoginOpc(k);
        Interface.clearConsole();*/
        
        
        //menu m = new menu();
        
        
        /*
        ArrayList<String> dd = new ArrayList();
        dd.add("Jorge Correia,jorgecorreia@sapo.pt,jean_pierre");
        dd.add("Ana Oliveira,ana_oliveira@gmail.com,ana123");
        dd.add("Tatiana Sousa,tatiSousa@hotmail.com,__tatiana__");
        
        System.out.println(dd);*/
        
        CarregarDados dados = new CarregarDados();
        
        dados.LerClientes(dados.dadosFicheiro("cliente.dat")).toString();
        
        
        
        //dados.LerClientes();
        
    }
    
}
