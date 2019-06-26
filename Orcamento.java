import java.util.ArrayList;

public class Orcamento {
    Perito perito;
    ArrayList<Livro> livros;
    float valor;
    String estado;

    public Orcamento(Perito perito, ArrayList<Livro> livros, float valor, String estado) {
        this.perito = perito;
        this.livros = livros;
        this.valor = valor;
        this.estado = estado;
    }

    public Perito getPerito() {
        return perito;
    }

    public void setPerito(Perito perito) {
        this.perito = perito;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
