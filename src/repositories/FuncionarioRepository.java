package repositories;
/*
 * classe de repositório de dados para funcionario
 */

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	/*
	 * metodo para receber um objeto funcionario e gravar os seus dados em um
	 * arquivo TxT
	 *
	 */
	public void exportarParaTxt(Funcionario funcionario) {
		try {
			/*
			 * criando um arquivo txt
			 */
			PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId());
			// escrevendo os dados do funcionario dentro do arquivo
			printWriter.write("/n Id do funcionario" + funcionario.getId());
			printWriter.write("nome" + funcionario.getNome());
			printWriter.write("CPF" + funcionario.getCpf());
			printWriter.write("matricula" + funcionario.getMatricula());
			printWriter.write("salário" + funcionario.getSalario());
			printWriter.write("sigla"+ funcionario.getDepartamento().getSigla());
			printWriter.write("n descriçao" + funcionario.getDepartamento().getDescricao());
			printWriter.flush();
			printWriter.close();
			System.out.println("arquivo txt gravado com sucesso !");
			
			
			

		} catch (Exception e) {
			System.out.println("falha ao gravar arquivo");
			System.out.println("erro" + e.getMessage());
		}

	}

}
