package project.aplication;

import project.dominio.Estoque;
import project.dominio.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao;

        do {
            System.out.println("%n --- Sistema de Cadastro de Produtos ---");
            System.out.println("1. Adicionar Produto ");
            System.out.println("2. Listar Produtos ");
            System.out.println("3. Buscar Produto ");
            System.out.println("4. Remover Produto ");
            System.out.println("5. Sair ");
            System.out.println("Escolha uma  opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: R$ ");
                    double preco = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    estoque.adicionarProdutos(new Produto( nome,  preco, quantidade));
                    break;

                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o nome do produto para buscar: ");
                    String nomeBusca = sc.nextLine();
                    estoque.buscarProduto(nomeBusca);
                    break;
                case 4:
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    estoque.removerProduto(nomeRemover);
                    break;
                case 5:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        }while (opcao != 5);
        sc.close();
    }

}
