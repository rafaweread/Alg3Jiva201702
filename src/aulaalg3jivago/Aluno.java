/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaalg3jivago;
import java.util.Date;

/**
 *
 * @author Rafael Penha
 */
public class Aluno  {

    int rga;
    float cr;
    String nome;
    String cpf;
    Date nascimento;

    void solicitarMatricula(){
        
    }
    
    boolean numeroDisciplinasMatriculado(){
        if (cr >= 5 ){
        return true; 
      }  
        return false;
    }
    
}//
