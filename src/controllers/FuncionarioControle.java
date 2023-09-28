package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Departamento;
import entities.Funcionario;
import repositories.FuncionarioRepository;

/*
 * classe de controle para operacoes com funcionario
 */
public class FuncionarioControle {
	public void cadastrarFuncionario() {
		try {
			System.out.println("cadastrio de funcionario");
			Funcionario funcionario = new Funcionario();
			funcionario.setId(UUID.randomUUID());
			Scanner scanner = new Scanner (System.in);
			System.out.print("nome do funcionario");
			funcionario.setNome(scanner.nextLine());
			System.out.println("CPF");
			funcionario.setCpf(scanner.nextLine());
			System.out.println("MATRICULA");
			funcionario.setMatricula(scanner.nextLine());
			System.out.println("SÁLARIO");
			funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
			funcionario.setDepartamento(new Departamento());
			funcionario.getDepartamento().setId(UUID.randomUUID());
			System.out.println("SIGLA DO DEPARTAMENTO");
			funcionario.getDepartamento().setSigla(scanner.nextLine()  );
			scanner.close();
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarParaTxt(funcionario);
			
		}
		 catch (Exception e) {
			System.out.println("erro ao cadastrar funcionario" + e.getMessage());
		}
		

	}
}
