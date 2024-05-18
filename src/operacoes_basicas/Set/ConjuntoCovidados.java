package operacoes_basicas.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoCovidados {

    //atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoCovidados(   ) {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome , int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCandidatosPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite()==codigoConvite){
                convidadoParaRemover = c;
                break;
            }

        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoCovidados conjuntoCovidados = new ConjuntoCovidados();
        System.out.println("Existem " + conjuntoCovidados.contarConvidados() + " Convidados dentro do Set convidado");

        conjuntoCovidados.adicionarConvidado("Convidado 1" , 1234);
        conjuntoCovidados.adicionarConvidado("Convidado 2" , 1235);
        conjuntoCovidados.adicionarConvidado("Convidado 3" , 1235);
        conjuntoCovidados.adicionarConvidado("Convidado 4" , 1236);

        conjuntoCovidados.exibirConvidados();

        System.out.println("Existem " + conjuntoCovidados.contarConvidados() + " dentro do Set convidado");

        conjuntoCovidados.removerCandidatosPorCodigoConvite(1236);

        System.out.println("Existem " + conjuntoCovidados.contarConvidados() + " dentro do Set convidado");

        conjuntoCovidados.exibirConvidados();


    }
}


