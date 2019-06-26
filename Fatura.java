import java.util.Date;

public class Fatura {
    Orcamento orcamento;
    Date data;

    public Fatura(Orcamento orcamento, Date data) {
        this.orcamento = orcamento;
        this.data = data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
