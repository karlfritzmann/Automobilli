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

//Sรณ os Administradores podem adicionar Empregados!
public class Administrador extends Empregado{
    private static long ultimo = 0;
    private long numEmpregado;
    
    public Administrador(){
        ultimo++;
        numEmpregado = ultimo;
    }

}

