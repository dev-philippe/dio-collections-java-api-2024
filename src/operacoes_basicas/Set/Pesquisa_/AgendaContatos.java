package operacoes_basicas.Set.Pesquisa_;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributos

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public  void  adicionarContato(String nome , int numero ){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public  Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet ){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;

            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Philippe",1234);
        agendaContatos.adicionarContato("Philippe",0);
        agendaContatos.adicionarContato("Philippe Diniz",11111);
        agendaContatos.adicionarContato("Camila Dio",   657854);
        agendaContatos.adicionarContato("Maria Silva ",111111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Philippe Diniz"));

    System.out.println("Contato Atualizado " + agendaContatos.atualizarNumeroContato("Philippe Diniz", 555555));

    agendaContatos.exibirContato();
    }

}


