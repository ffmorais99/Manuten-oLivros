import java.util.ArrayList;

public class Repositorio {

    ArrayList<Utilizador> utilizadores=new ArrayList<>();
    ArrayList<TipoUtilizador> tipoutilizadores = new ArrayList<>();
    ArrayList<Requisicao> requisicoes=new ArrayList<>();
    ArrayList<Copia> copias=new ArrayList<>();
    ArrayList<Livro> livros=new ArrayList<>();
    ArrayList<Emprestimo> emprestimos=new ArrayList<>();
    ArrayList<Notificacao> notificacoes=new ArrayList<>();
    ArrayList<Devolucao> devolucoes=new ArrayList<>();
    ArrayList<Coima> coimas=new ArrayList<>();
    ArrayList<Encomenda> encomendas=new ArrayList<>();
    ArrayList<EntradaNovoLivro> entradasnovoslivros=new ArrayList<>();
    ArrayList<PropostaAquisicao> propostasrequisicoes=new ArrayList<>();
    ArrayList<RequisicaoCompra> requisicoescompras=new ArrayList<>();


    public Repositorio() {
    }

    public void adicionaUtilizador(Utilizador utilizador){
        utilizadores.add(utilizador);
    }
    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        tipoutilizadores.add(tipo);

    }
    public void adicionaRequisicao(Requisicao requisicao){
        requisicoes.add(requisicao);
    }
    public void adicionaCopia(Copia copia){
        copias.add(copia);

    }
    public void adicionaLivro(Livro livro){
        livros.add(livro);
    }
    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        notificacoes.add(notificacao);
    }
    public void adicionaDevolucao(Devolucao devolucao){
        devolucoes.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        coimas.add(coima);
    }

    public void adicionaEncomenda(Encomenda encomenda){
        encomendas.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){
        entradasnovoslivros.add(entradaNovoLivro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta){
        propostasrequisicoes.add(proposta);

    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){
        requisicoescompras.add(requisicaoCompra);
    }


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){

        Emprestimo emprestimo;


        for(int i=0;i<emprestimos.size();i++){

           emprestimo=emprestimos.get(i);


            if(emprestimo.requisicao==r)
                return emprestimo;
        }

        return  null;
    }


}
