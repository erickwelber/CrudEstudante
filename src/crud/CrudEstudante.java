package crud;

public class CrudEstudante {

    private Estudante[] alunos;
    private int proxPL = 0;
    private final int TAM = 200;

    public CrudEstudante() {
        alunos = new Estudante[TAM];
    }

    //Mandar adicionar um aluno em uma posição vazia, ou seja, vai ter que percorrer
    //o vetor até achar uma posição vazia.
    public void adicionarEstudante(Estudante adicionar) {
        if (proxPL < alunos.length) {
            if (alunos[proxPL] == null) {
                alunos[proxPL] = adicionar;
            }
        } else {
            Estudante[] temp = new Estudante[alunos.length * 2];
            for (int i = 0; i < alunos.length; i++) {
                temp[i] = alunos[i];
            }
            alunos = temp;
            alunos[proxPL] = adicionar;
        }
        proxPL++;
    }

    public void removerEstudante(Estudante remover) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if (remover.equals(alunos[i])) {
                    alunos[i] = null;
                }
            }
        }
    }

    public Estudante buscarEstudante(String cpf) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if (cpf.equals(alunos[i].getCpf())) {
                    return alunos[i];
                }
            }
        }
        return null;
    }

    public void atualizarEstudante(Estudante atualizar) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if (atualizar.equals(alunos[i])) {
                    alunos[i] = atualizar;
                }
            }
        }
    }

    public void imprimirArquivo() {
        System.out.println("Nome    Cpf"); //Opcional
        for (int i = 0; i < proxPL; i++) {
            if (alunos[i] != null) {
                System.out.println(alunos[i].getNome() + "\t" + alunos[i].getCpf());
            }
        }
    }

}
