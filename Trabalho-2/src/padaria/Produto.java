package padaria;
public class Produto {
    private final String nome;
    private int quantidade;
    private final double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return STR."Produto: \{nome}, Quantidade: \{quantidade}, Preço: R$\{preco}";
    }
}
