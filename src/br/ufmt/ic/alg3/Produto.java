/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3;

/**
 *
 * @author Rafael Penha
 */
public class Produto {
    
    private int codigo;
    public String nome;
    protected float preco;

    
    public int getCodigo() {
        return codigo;
    }

    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        return true;
        }
        return false; //return encerra o metodo por isso não precisa do else;
    }
/*
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 */  
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
