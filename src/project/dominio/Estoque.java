package project.dominio;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
        System.out.println("Produto adicionado!!!");
    }

    public void listarProdutos(){
        if (produtos.isEmpty()){
            System.out.println("O estoque está vazio!!!");
        }
        else{
            System.out.println("Lista de produtos: ");
            for(Produto p : produtos){
                System.out.println(p);
            }
        }
    }

    public void buscarProduto(String nome){
        for (Produto p : produtos){
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + p);
                return;}


        }
        System.out.println("Produto não encontrado");
    }

    public void removerProduto(String nome){
       for(Produto p: produtos) {
           if (p.getNome().equalsIgnoreCase(nome)) {
               produtos.remove(p);
               System.out.println("Produto removido com sucesso!");
               return;
           }
       }
        System.out.println("Produto não encontrado!!");
    }
}
