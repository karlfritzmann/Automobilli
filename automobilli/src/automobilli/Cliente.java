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
public class Cliente extends Utilizador{
    private static long ultimo = 0;
    private long numCliente;
    private float fundos;
    private String Morada;
    
    
    public Cliente(Utilizador utz){
        super(utz.getNome(), utz.getEmail(), utz.getPalavra_passe());
        ultimo++;
        numCliente = ultimo;
    }
    
    
    public Cliente(Utilizador utz,String Morada, float fundos){
        super(utz.getNome(),utz.getEmail(),utz.getPalavra_passe());
        ultimo++;
        numCliente = ultimo;
        this.fundos = fundos;
        this.Morada = Morada;
    }
    
    public static long getUltimo() {
        return ultimo;
    }

    public static void setUltimo(long ultimo) {
        Cliente.ultimo = ultimo;
    }

    public long getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(long numCliente) {
        this.numCliente = numCliente;
    }

    public float getFundos() {
        return fundos;
    }

    public void setFundos(float fundos) {
        this.fundos = fundos;
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

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String Morada) {
        this.Morada = Morada;
    }
    
    
    
    
    public boolean GuardarCliente(){
        boolean guardado = false;
        File ficheiro = new File("cliente.dat");
        try{
            FileOutputStream os = new FileOutputStream(ficheiro);
            PrintWriter pw = new PrintWriter(os);
            pw.println(nome + "," + email + "," + palavra_passe + "," + fundos + "," + Morada);
            guardado = true;
            pw.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return guardado;
    }
}
/*
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
    }*/
    
    /*
    public boolean LerCliente(){
        boolean lido = false;
        try{
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return lido;
    }
}*/
