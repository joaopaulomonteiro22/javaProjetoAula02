package entities;

import java.util.UUID;

public class Pessoa {
	private String Nome;
	private UUID id;

	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
}
