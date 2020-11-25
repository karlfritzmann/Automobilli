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
        String linha = "";
        ArrayList<String> dados = new ArrayList<String>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(ficheiro));
            while((linha = reader.readLine()) != null){
                dados.add(linha.trim());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        return dados;
    }
    
    
    
    //Falta Excecao ListaVazia
    public ArrayList<Cliente> LerClientes(ArrayList<String> dados){
        
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        String nome, email, palavra_passe, morada;
        
        System.out.println(dados);
        
        /*
        String[] dadosLinha = new String[dados.get(0).split(",").length];
        float fundos;
        System.out.println(dados.size());
        System.out.println(dados.get(0).split(",").length);
        for(int i=0;i<dados.size(); i++){
            dadosLinha = dados.get(i).split(",");
            nome = dadosLinha[0];
            email = dadosLinha[1];
            palavra_passe = dadosLinha[2];
            morada = dadosLinha[3];
            fundos = Float.parseFloat(dadosLinha[4]);
            
            System.out.println(nome + " " + email + " " + palavra_passe + " " + morada + " " + fundos);
            /*
            Utilizador u = new Utilizador(nome, email, palavra_passe);
            Cliente c = new Cliente(u, morada, 0.0f);
            clientes.add(c);
        }*/
        return clientes;
    }
    
    public void carregarClientes(String ficheiro){
        
    }

}
