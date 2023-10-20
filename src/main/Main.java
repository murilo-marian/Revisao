package main;

import curso.Curso;
import disciplina.Disciplina;
import fase.Fase;
import pessoa.Aluno;
import pessoa.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Professor professor0 = new Professor("Rodrigo", "Curvello", "curvello@gmail.com", 13201314927l);
        Professor professor1 = new Professor("Juliano", "Sobrenome", "juliano@gmail.com", 11111111111l);

        Curso BCC = new Curso(3, "BCC", professor1);
        Fase fase4 = new Fase(3, "Fase 4");
        Disciplina poo2 = new Disciplina(1, "POO 2", "coisas", "aulinhas", true);
        poo2.adicionarProfessor(professor0);
        poo2.adicionarProfessor(professor1);

        ArrayList<Fase> fasesBCC = new ArrayList<>();
        fasesBCC.add(fase4);
        BCC.setFases(fasesBCC);

        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(poo2);
        fase4.setDisciplinas(disciplinas);

        System.out.println("Qual o cpf do professor que está a utilizar o sistema?");
        long cpf = entrada.nextLong();
        Professor usuario = new Professor();
        for (Professor prof : poo2.getProfessores()) {
            if (prof.getCpf() == cpf) {
                usuario = prof;
            }
        }

        System.out.print("Deseja fazer avaliacao[1], chamada[2] ou registrar aluno[3]? ");
        int resultado = entrada.nextInt();

        switch (resultado) {
            case 1 -> {
                Map<Aluno, Float> notas = new HashMap<>();
                System.out.print("Data: ");
                LocalDate data = LocalDate.parse(entrada.nextLine());
                System.out.println("Peso: ");
                int peso = entrada.nextInt();
                for (Aluno matriculado : poo2.getMatriculados()) {
                    System.out.println("Nota de " + matriculado.getNome() + ": ");
                    float nota = entrada.nextFloat();
                    notas.put(matriculado, nota);
                }
                poo2.fazerAvaliacao(data, usuario, notas, peso);
            }
            case 2 -> {
                Map<Aluno, Boolean> presenca = new HashMap<>();
                for (Aluno matriculado : poo2.getMatriculados()) {
                    System.out.println(matriculado.getNome() + " está presente? (S/N): ");
                    Boolean presente = entrada.nextBoolean();
                    presenca.put(matriculado, presente);
                }
                LocalDate data = LocalDate.now();
                poo2.fazerChamada(data, usuario, presenca);
            }
            case 3 -> {
                System.out.println("Selecione a fase do curso");
                ArrayList<Fase> registroAlunoFases = BCC.getFases();
                for (Fase registroAlunoFase : registroAlunoFases) {
                    System.out.println(registroAlunoFase.getNome());
                }
                int faseEscolhida = entrada.nextInt();
                entrada.nextLine();
                Fase faseSelecionada = registroAlunoFases.get(faseEscolhida - 1);

                System.out.println("Selecione a disciplina");
                ArrayList<Disciplina> registroAlunoDisciplinas = faseSelecionada.getDisciplinas();
                for (int i = 0; i < registroAlunoDisciplinas.size(); i++) {
                    System.out.println(registroAlunoDisciplinas.get(i) + " [" + i + "]");
                }
                int disciplinaSelecionada = entrada.nextInt();
                entrada.nextLine();
                Disciplina disciplina = registroAlunoDisciplinas.get(disciplinaSelecionada - 1);

                System.out.print("Nome do aluno: ");
                String nome = entrada.nextLine();

                System.out.print("Sobrenome do aluno: ");
                String sobrenome = entrada.nextLine();

                System.out.print("Email do aluno: ");
                String email = entrada.nextLine();

                System.out.println("Matricula do aluno: ");
                long matricula = entrada.nextLong();
                entrada.nextLine();

                System.out.println("CPF do aluno: ");
                long cpfAluno = entrada.nextLong();

                Aluno aluno = new Aluno(nome, sobrenome, email, matricula, BCC, cpfAluno);
                disciplina.adicionarAluno(aluno);
            }
        }
    }
}
