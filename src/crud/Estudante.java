package crud;

public class Estudante {

    private String cpf;
    private String nome;

    public Estudante(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Estudante) {
                if (((Estudante) obj).cpf.equals(this.cpf)) {
                        return true;
                }
            }
            return false;
        }
        return false;

    }*/
    @Override
    public String toString() {
        return "Cpf: " + cpf + " Nome: " + nome;
    }

}
