/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaalg3jivago;
import br.ufmt.ic.alg3.CadastroProdutos;
import br.ufmt.ic.alg3.Produto;
import java.util.Scanner;
/**
 *
 * @author Rafael Penha
 */
public class AulaAlg3Jivago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hello World");
        
       // String nome;
        Aluno rafael;
        
        rafael = new Aluno();
        
        rafael.nome = "Rafael Penha";
        rafael.cpf = "36482376472";
        rafael.rga = 2013;
        rafael.cr = 7;
        
        System.out.println("Nome do Aluno: "+rafael.nome);
        System.out.println("Cpf: "+rafael.cpf);
        System.out.println("Rga: "+rafael.rga);
        */
        
        Scanner scan = new Scanner(System.in,"iso-8859-1");
        System.out.println("Quantos produtos?");
        
        int quantidade = scan.nextInt(); //faz leitura de dados e atribui a quantidade na variavel sem verificação se é string ou int;
        
        Produto[] listaProdutos = new Produto[quantidade];
        
        
        int codigoProduto;
        String nomeProduto;
        float precoProduto;
        
        for(int i = 0; i < listaProdutos.length; i++){
            
            listaProdutos[i] =  new Produto();
            
            System.out.println("Digite codigo do produto: ");
            codigoProduto = scan.nextInt();
            
            System.out.println("Digite nome do produto: ");
            nomeProduto = scan.next();
            
            System.out.println("Digite preco do produto: ");
            precoProduto = scan.nextFloat();
            
            listaProdutos[i].setCodigo(codigoProduto);
            listaProdutos[i].nome = nomeProduto;
            listaProdutos[i].setPreco(precoProduto);
        }
        
    }
    
}
