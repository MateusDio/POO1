package array15;

import java.util.ArrayList;

public class Array15 {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("João", 8.5));
        alunos.add(new Aluno("Maria", 9.0));
        alunos.add(new Aluno("Pedro", 7.5));
        alunos.add(new Aluno("Ana", 10.0));

        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }

        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.nota;
        }
        double mediaNotas = somaNotas / alunos.size();

        System.out.println("Média das notas: " + mediaNotas);
    }
}
