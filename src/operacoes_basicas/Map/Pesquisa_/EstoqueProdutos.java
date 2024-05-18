package operacoes_basicas.Map.Pesquisa_;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();


    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo, new Produto(nome,preco,quantidade));
    }

    public  void exibirProdutos(){
        System.out.println(estoqueProdutosMap);

    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }
}
