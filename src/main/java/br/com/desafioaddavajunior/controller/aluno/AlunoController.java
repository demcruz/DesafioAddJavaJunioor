package br.com.desafioaddavajunior.controller.aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioaddavajunior.model.aluno.Aluno;
import br.com.desafioaddavajunior.model.escola.Endereco;
import br.com.desafioaddavajunior.model.escola.Escola;
import br.com.desafioaddavajunior.model.turma.Turma;

@RestController
@RequestMapping
public class AlunoController {

	@GetMapping("/")
	public List<Aluno> listAll() {
		List<Aluno> listAluno = new ArrayList<>();

		Endereco endereco = new Endereco("Rua Santa Luzia", "71", "Centro", "Rio de Janeiro", "RJ");

		Escola escola = new Escola(1, "Senac", endereco);

		Turma turma = new Turma(1, "701", 35, escola);

		Aluno alunoA = new Aluno(1, "Diego Cruz", LocalDate.of(1992, 03, 03), turma);
		Aluno alunoB = new Aluno(2, "Bernardo Souza", LocalDate.of(1992, 03, 03), turma);
		Aluno alunoC = new Aluno(3, "Ricardo Soares", LocalDate.of(1992, 03, 03), turma);
		Aluno alunoD = new Aluno(4, "Maria Lima", LocalDate.of(1992, 03, 03), turma);

		listAluno.add(alunoA);
		listAluno.add(alunoB);
		listAluno.add(alunoC);
		listAluno.add(alunoD);

		return listAluno;

	}

}
