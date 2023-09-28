package entities;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private Double salario;
	private Departamento Departamento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(Departamento departamento) {
		Departamento = departamento;
	}
	

}
