public class Juridico extends Person {
    private String CNPJ;

    public Juridico(String _nome, String _sex, Date _date, String cnpj) {
        super(_nome, _sex, _date);
        this.CNPJ = cnpj;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String cnpj) {
        this.CNPJ = cnpj;
    }

    @Override
    public String toString() {
        return "Juridico:\nCNPJ: " + this.CNPJ + "\n" + super.toString();
    }
}
