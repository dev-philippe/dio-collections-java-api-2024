package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public  void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public  List<Livro> pesquisarPOrAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }
        return  livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervalosAnos.add(l);

                }
            }
        }
        return livrosPorIntervalosAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPortitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortitulo = l;
                    break;
                }
            }
        }
        return  livroPortitulo;
    }

    public static void main(String[] args) {


        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1" , "Autor 1",  2020);
        catalogoLivros.adicionarLivro("livro 1" , "Autor 2",  2021 );
        catalogoLivros.adicionarLivro("livro 2" , "Autor 2",  2022);
        catalogoLivros.adicionarLivro("livro 3" , "Autor 3",  2023 );
        catalogoLivros.adicionarLivro("livro 4" , "Autor 4",  1994 );

        System.out.println(catalogoLivros.pesquisarPOrAutor(" Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(2020,2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo(" Livro 1 "));


    }

}
