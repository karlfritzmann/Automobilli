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
    
    
    public Empregado(){
        ultimo++;
        numEmpregado = ultimo;
        salario = 0.0f;
    }
    
    public Empregado(double salario){
        ultimo++;
        numEmpregado = ultimo;
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentagem){
        salario = (salario * (percentagem/100)) + salario;
    }
    
}
