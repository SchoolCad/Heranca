public class Fisico extends Person {
    private String CPF;

    public Fisico(String _nome, String _sex, Date _date, String cpf) {
        super(_nome, _sex, _date);
        this.CPF = cpf;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    @Override
    public String toString() {
        return "Fisico:\nCPF: " + this.CPF + "\n" + super.toString();
    }
}
