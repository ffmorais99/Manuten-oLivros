public class Perito {
    String nome;
    int licenca;
    boolean disponivel;

    public Perito(int licenca, String nome, boolean disponivel) {
        this.licenca = licenca;
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public int getLicenca() {
        return licenca;
    }

    public void setLicenca(int licenca) {
        this.licenca = licenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}