package padaria;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private final List<Produto> produtos;

    public Padaria() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void venderProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println(STR."Venda realizada: \{quantidade} x \{produto.getNome()} por R$\{quantidade * produto.getPreco()}");
                } else {
                    System.out.println(STR."Quantidade insuficiente em estoque para o produto: \{produto.getNome()}");
                }
                return;
            }
        }
        System.out.println(STR."Produto não encontrado: \{nome}");
    }

    public void comprarProduto(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println(STR."Compra realizada: \{quantidade} x \{produto.getNome()}");
                return;
            }
        }
        System.out.println(STR."Produto não encontrado: \{nome}");
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
