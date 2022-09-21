package lista03;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	LinkedList<Professor> listaProfessor = new LinkedList<Professor>();
	LinkedList<Aluno> listaAluno = new LinkedList<Aluno>();
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);

	for (int i = 0; i < 3; i++) {
		Professor N = new Professor();
		System.out.println(" informar nome do professor: ");
		N.setNome(ler.nextLine());
		System.out.println(" informar data de Nasc: ");
		N.setDatanasc(LocalDate.of(Integer.valueOf(ler.nextLine()), Integer.valueOf(ler.nextLine()),
				Integer.valueOf(ler.nextLine())));
		System.out.println("Digite o cpf: ");
		N.setCpf(Long.valueOf(ler.nextLine()));
		System.out.println(" informar o Siape: ");
		N.setSiape(Long.valueOf(ler.nextLine()));
		listaProfessor.add(N);

	}

	for (int i = 0; i < 3; i++) {
		Aluno X = new Aluno();
		System.out.println(" nome do aluno: ");
		X.setNome(ler.nextLine());
		System.out.println(" data de Nasc: ");
		X.setDatanasc(LocalDate.of(Integer.valueOf(ler.nextLine()), Integer.valueOf(ler.nextLine()),
				Integer.valueOf(ler.nextLine())));
		System.out.println(" cpf ");
		X.setCpf(Long.valueOf(ler.nextLine()));
		System.out.println("informe  matricula: ");
		X.setMatricula(Long.valueOf(ler.nextLine()));
		listaAluno.add(X);

	}
	for (Professor professor : listaProfessor) {
		System.out.println(professor.getNome());
		System.out.println(professor.getCpf());
		System.out.println(professor.getDatanasc());
		System.out.println(professor.getSiape());
	}

	for (Aluno aluno : listaAluno) {
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCpf());
		System.out.println(aluno.getDatanasc());
		System.out.println(aluno.getMatricula());

	}

}

}