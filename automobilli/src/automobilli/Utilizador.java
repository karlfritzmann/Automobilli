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
   
    //O Utilizador tem todas as infos dos utilizadores(pus a seguir), estes depois podem ser clientes ou empregados
    //os empregados podem ser os funcionários ou os admins.
   
    protected String morada;
    protected long contacto;
    protected int idade;
    
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
    
    //Achava que seria obrigatorio para criar uma CONTA, o NOME, o EMAIL e PASS
    public Utilizador(String email, String palavra_passe){
        this.email = email;
        this.palavra_passe = palavra_passe;
    }
    
    public Utilizador(String nome, String email, String palavra_passe, String morada, long contacto, int idade){//todas infos
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.morada = morada;
        this.contacto = contacto;
        this.idade = idade;
    }
    
    public Utilizador(String nome, String email, String palavra_passe, String morada){ //Infos obrigatorias + morada
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.morada = morada;
    }
    
     public Utilizador(String nome, String email, String palavra_passe, long contacto){//Infos obrigatorias+contacto
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.contacto = contacto;
     }
     
     public Utilizador(String nome, String email, String palavra_passe, int idade){//Infos obrigatorias+idade
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.idade = idade;
     }
     
     
     public Utilizador(String nome, String email, String palavra_passe, String morada, long contacto){ //Infos obrigatorias + morada+ contacto
       this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.morada = morada;
        this.contacto = contacto;
     }
     
     public Utilizador(String nome, String email, String palavra_passe, String morada, int idade){//Infos obrigatorias+morada+idade
         this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.morada = morada;
        this.idade = idade;
          }
     
     public Utilizador(String nome, String email, String palavra_passe, long contacto, int idade){//Infos obrigatorias+contacto +idade
        this.nome = nome;
        this.email = email;
        this.palavra_passe = palavra_passe;
        this.contacto = contacto;
        this.idade = idade;
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
   
    //GETTERS
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPalavra_passe() {
        return palavra_passe;
    }
    
    public String getMorada(){
    return morada;
    }
    
    public long getContacto(){
    return contacto;
    }
    
    public int getIdade(){
    return idade;
    }
    
    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPalavra_passe(String palavra_passe) {
        this.palavra_passe = palavra_passe;
    }
    
     public void setMorada(String morada){
    this.morada = morada;
     }
    
    public void setContacto(long contacto){
    this.contacto = contacto;
    }
    
    public void setIdade(int idade){
    this.idade = idade;
    }
    
    
}
