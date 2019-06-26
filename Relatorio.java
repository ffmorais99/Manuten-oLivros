import java.util.ArrayList;

public class Relatorio {
    String relatorio;
    Funcionario funcionario;
    ArrayList<Livro> livros;

    public Relatorio(String relatorio, Funcionario funcionario, ArrayList<Livro> livros) {
        this.relatorio = relatorio;
        this.funcionario = funcionario;
        this.livros = livros;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

}
