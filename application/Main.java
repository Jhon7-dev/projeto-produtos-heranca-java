package application;

//import entities.Estadual;
//import entities.Produto;

import entities.Estadual;
import entities.Importado;
import entities.Nacional;
import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        char ch;
        do {
            System.out.println("RECEITA FEDERAL");
            System.out.println("=== Menu ===");
            System.out.println("1-Cadastrar  Produto  Estadual");
            System.out.println("2-Cadastrar  Produto e  Nacional");
            System.out.println("3-Cadastrar  Produto  Importado");
            System.out.println("4-Exibir Produtos Estaduais");
            System.out.println("5-Exibir Produtos Nacionais");
            System.out.println("6-Exibir Produtos Importados");
            System.out.println("7-Exibir Todos Produtos");
            System.out.println("9- SAIR\n");
            //System.out.println("");

            ch = scn.nextLine().charAt(0);

            switch (ch) {
                case '1': {

                    System.out.print("Cadastro de Produtos  Estadual!\n");

                    System.out.print("NOME: ");
                    String nome = scn.nextLine();

                    System.out.print("DESCRIÇÃO DO PRODUTO: ");
                    String descricao = scn.nextLine();

                    System.out.print("VALOR: ");
                    double valor = scn.nextDouble();
                    scn.nextLine();


                    Produto produto = new Estadual(nome,descricao,valor);
                    produto.calculoImposto();
                    produto.relatorio();
                    list.add(produto);
                    break;
                }
                case '2':{

                    System.out.println("Cadastro de Produtos Nacional!");
                    System.out.print("NOME: ");
                    String nome =  scn.nextLine();
                    System.out.print("DESCRIÇÃO: ");
                    String descricao = scn.nextLine();
                    System.out.print("VALOR: ");
                    double valor = scn.nextDouble();
                    scn.nextLine();

                    Produto produto = new Nacional(nome,descricao,valor);
                    produto.calculoImposto();
                    produto.relatorio();
                    list.add(produto);
                    break;

                }
                case '3':{
                    System.out.println("Cadastro de Produtos Importados!");
                    System.out.print("NOME: ");
                    String nome = scn.nextLine();
                    System.out.print("DESCRIÇÃO: ");
                    String descricao = scn.nextLine();
                    System.out.print("VALOR: ");
                    double valor = scn.nextDouble();

                    Produto produto = new Importado(nome,descricao,valor);
                    produto.calculoImposto();
                    produto.relatorio();
                    list.add(produto);
                    break;

                }
                case '4':{
                    System.out.println("PRODUTOS ESTADUAIS:");
                    for (Produto p : list){
                     if (p instanceof Estadual){
                         System.out.println("==============");
                         System.out.println("Nome: " + p.getNome());
                         System.out.println("==============");

                     }
                    }
                    break;
                }
                case '5':{
                    System.out.println("PRODUTOS NACIONAIS: ");
                    for (Produto p:list){
                        if (p instanceof  Nacional){
                            System.out.println("==============");
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("==============");

                        }
                    }
                    break;
                }
                case '6':{
                    System.out.println("PRODUTOS IMPORTADOS: ");
                    for (Produto p : list){
                        if (p instanceof  Importado){
                            System.out.println("==============");
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("==============");

                        }
                    }
                    break;
                }
                case '7':{
                    System.out.println("===== PRODUTOS CADASTRADOS ===== ");
                    int i = 1;
                    for (Produto p : list){
                        System.out.println("#" + i++);
                        System.out.println(p.getNome());
                        System.out.println(p.getDescricao());

                       // exibirProduto(p);
                    }
                    break;
                }
                case '9':{
                    System.out.println("ENCERRANDO....");
                    break;
                }

            }
        } while (ch != '9');
        System.out.println("Programa encerrado!");
    }
}