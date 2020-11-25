/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automobilli;
import java.io.*;
/**
 *
 * @author Nuno
 */
public class Login {
    
    private String email;
    private String palavra_passe;
    
    public Login(String email, String palavra_passe){
        if(email != "" && palavra_passe != ""){
            this.email = email;
            this.palavra_passe = palavra_passe;
        }
    }
    
    
    public boolean login(){
        String s;
        String[] utilizador = new String[3]; // Nome, Email, Palavra-Passe
        try{
            BufferedReader br = new BufferedReader(new FileReader("cliente.dat"));
            while((s = br.readLine()) != null){
                for(int i=0;i<s.split(",").length;i++){
                    utilizador[i] = s.split(",")[i];
                }
                if(utilizador[1].equals(email) && utilizador[2].equals(palavra_passe)){
                    return true;
                }
            }
            br.close();
        }catch(Exception ex){
            return false;
        }
        
        return false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPalavra_passe() {
        return palavra_passe;
    }

    public void setPalavra_passe(String palavra_passe) {
        this.palavra_passe = palavra_passe;
    }
    
    
    public void getDadosCliente(){
        
    }
    
}
