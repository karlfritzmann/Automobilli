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
public class Empregado extends Utilizador {
    
    private static long ultimo = 0;
    private long numEmpregado;
    protected double salario;
    
    
    public Empregado(Utilizador x){
        super(x.getNome(), x.getEmail(), x.getPalavra_passe(), x.getMorada(), x.getContacto(), x.getIdade());
        ultimo++;
        numEmpregado = ultimo;
        salario = 0.0f;
    }
    
    public Empregado(Utilizador x, double salario){
        super(x.getNome(), x.getEmail(), x.getPalavra_passe(), x.getMorada(), x.getContacto(), x.getIdade());
        ultimo++;
        numEmpregado = ultimo;
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentagem){
        salario = (salario * (percentagem/100)) + salario;
    }
    
    //GETTER
    public Utilizador getUtilizador(){ //Não sei se isto funciona, mas uso este getUtilizador para a definição do Admin
     Utilizador novo = new Utilizador(this.getNome(), this.getEmail(), this.getPalavra_passe(), this.getMorada(), this.getContacto(), this.getIdade());
    return novo;}
    
    public long getNumEmpregado(){
    return numEmpregado;}
    
    public double getSalario(){
    return salario;}
    
    //SETTER
    public void setNumEmpregado(long numempregado){
    this.numEmpregado = numempregado;}
    
    public void setSalario(double salario){
        this.salario = salario;}
    
}
