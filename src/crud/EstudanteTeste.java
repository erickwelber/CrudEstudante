package crud;

public class EstudanteTeste {

    public static void main(String... args) {
        CrudEstudante ifba = new CrudEstudante();

        Estudante e1 = new Estudante("111", "Erick");
        ifba.adicionarEstudante(e1);

        Estudante e2 = new Estudante("222", "Joao");
        ifba.adicionarEstudante(e2);

        Estudante e3 = new Estudante("333", "Maria");
        ifba.adicionarEstudante(e3);

        System.out.println("Lista de estudantes adicionados: ");
        ifba.imprimirArquivo();
        System.out.println("");

        System.out.println("Atualizou o nome do estudante Erick para José: ");

        //Usado com o método que compara objetos
        //Estudante atualizar = new Estudante("111","José");
        //ifba.atualizarEstudante(atualizar);
        //Usado com o método que compara Strings (NÃO PRECISA USAR OVERRIDE!)
        ifba.atualizarEstudante("111", "José");
        ifba.imprimirArquivo();
        System.out.println("");

        System.out.println("Buscou o estudante de cpf 222: ");
        Estudante buscar = ifba.buscarEstudante("222");
        System.out.println(buscar);
        System.out.println("");

        System.out.println("Removeu a estudante Maria: ");
        ifba.removerEstudante(e3);
        ifba.imprimirArquivo();
        System.out.println("");

    }

}
