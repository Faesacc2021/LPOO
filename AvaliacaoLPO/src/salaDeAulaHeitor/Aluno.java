package salaDeAulaHeitor;

public class Aluno extends Pessoa  {
	private int matricula;
	private String curso;
	
	public Aluno(String nome, String cpf, int matricula, String curso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.curso = curso;
	}

	public Aluno(String nome, String cpf, Endereco endereco, int matricula,
			String curso) {
		super(nome, cpf, endereco);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public Aluno() {
		super();
		this.matricula = 0;
		this.curso = "";
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + ", nome="
				+ nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
}
