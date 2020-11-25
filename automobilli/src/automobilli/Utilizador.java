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
public class Utilizador {
    
    protected String nome;
    protected String email;
    protected String palavra_passe;
    
    public Utilizador(){
        nome = "";
        email = "";
        palavra_passe = "";
    }
    
    public Utilizador(String nome, String email, String palavra_passe){
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
    }
    
    public Utilizador(String email, String palavra_passe){
        this.email = email;
        this.palavra_passe = palavra_passe;
    }
    
    
    public boolean GuardarUtilizador(String tipo){
        boolean guardado = false;
        File ficheiro = new File(tipo + ".dat");
        try{
            FileOutputStream os = new FileOutputStream(ficheiro);
            PrintWriter pw = new PrintWriter(os);
            pw.println(nome + "," + email + "," + palavra_passe);
            guardado = true;
            pw.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return guardado;
    }
    
    public String[] LerUtilizador(String tipo){
        String linha;
        String[] dados = new String[3];
        File ficheiro = new File(tipo + ".dat");
        try{
            FileReader fr = new FileReader(ficheiro);
            BufferedReader br = new BufferedReader(fr);
            linha = br.readLine();
            dados = linha.split(",");
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        return dados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    
    
}
