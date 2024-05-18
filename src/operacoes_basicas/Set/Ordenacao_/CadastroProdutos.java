package operacoes_basicas.Set.Ordenacao_;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));


    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>();
        return produtosPorNome;


    }

    public Set<Produto exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>();
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;

    }



}
