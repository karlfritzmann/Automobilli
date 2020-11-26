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

//Só os Administradores podem adicionar Empregados!
public class Administrador extends Empregado{
    private static long ultimo = 0;
    private long numAdmin; //Podemos ter um nº de empregado, e um numero de admin
    
    public Administrador(Empregado x){
        super(x.getUtilizador(), x.getSalario());
        ultimo++;
        numAdmin = ultimo;
    }
    
    //GETTER
    public int getNumAdmin(){
        return numAdmin;}
    
    //SETTER
    public void setNumAdmin(int numAdmin){
        this.numAdmin = numAdmin;}

}
