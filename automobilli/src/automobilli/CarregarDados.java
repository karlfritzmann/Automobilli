/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automobilli;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Nuno
 */
public class CarregarDados {
    private ArrayList<Cliente> clientes;
    private ArrayList<Empregado> empregados;
    private ArrayList<Administrador> administradores;
    
    //private ArrayList<Fluidos> fluidos;
    //private ArrayList<Pneus> pneus;
    //private ArrayList<Carrocaria> carrocarias;
    //private ArrayList<Travoes> travoes;
    //private ArrayList<TravoesDisco> travoes_disco;
    
    
    
    
    public CarregarDados(){
        clientes = new ArrayList<Cliente>();
        empregados = new ArrayList<Empregado>();
        administradores = new ArrayList<Administrador>();
    }
    
    
    public long NumeroLinhas(String Ficheiro) throws FicheiroVazio{
        File ficheiro = new File(Ficheiro);
        long numeroLinhas = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ficheiro));
            while(reader.readLine() != null){
                numeroLinhas++;
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        if(numeroLinhas <= 0){
            throw new FicheiroVazio("Ficheiro está vazio");
        }else{
            return numeroLinhas;
        }
    }
    
    /*
    public String[][] dadosFicheiro(String Ficheiro) throws FicheiroVazio{
        File ficheiro = new File(Ficheiro);
        String[][] dados = new String[(int)NumeroLinhas(Ficheiro)][];
        String linha;
        int numeroDadosLinha = 0;
        int i = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ficheiro));
            while(reader.readLine() != null){
                linha = reader.readLine();
                numeroDadosLinha = reader.readLine().split(",").length;
                for(int j=0; j<numeroDadosLinha; j++){
                    dados[i][j] = linha.split(",")[j];
                }
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        return dados;
    }*/
    
    
    
    public ArrayList<String> dadosFicheiro(String Ficheiro){
        
        File ficheiro = new File(Ficheiro);
        String linha;
        ArrayList<String> dados = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ficheiro));
            while(reader.readLine() != null){
                linha = reader.readLine();
                System.out.println(linha);
                dados.add(linha);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        return dados;
    }
    
    
    
    /*
    public ArrayList<Cliente> LerClientes() throws FicheiroVazio{
        
        long numeroLinhas = NumeroLinhas("cliente.dat");
        System.out.println(numeroLinhas);
        
        /*
        Utilizador u;
        Cliente c1;
        u = new Utilizador();
        c1 = new Cliente(u);
        
        c1.setNome(nome);
        c1.setEmail(email);
        c1.setPalavra_passe(palavra_passe);
        c1.setFundos(0);
        c1.setMorada(Morada);
        
        
        for(int i=0;i <= numeroLinhas; i++){
            Cliente c = new Cliente();
        }
        
        
    }
    
    public void carregarClientes(String ficheiro){
        
    }*/

}
