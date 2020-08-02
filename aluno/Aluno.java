package aluno;

public class Aluno {
	private String matricula;
	private String nome;
	private String disciplina;
	private float p1;
	private float p2;
	private float sub;
	private float exame;

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = p2;
	}

	public float getSub() {
		return sub;
	}

	public void setSub(float sub) {
		this.sub = sub;
	}

	public float getExame() {
		return exame;
	}

	public void setExame(float exame) {
		this.exame = exame;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Matricula: ");
		sb.append(this.getMatricula());
		sb.append("\nNome: ");
		sb.append(this.getNome());
		sb.append("\nDisciplina: ");
		sb.append(this.getDisciplina());
		sb.append("\nNota p1: ");
		sb.append(this.getP1());
		sb.append("\nNota p2: ");
		sb.append(this.getP2());
		
		sb.append("\n");
		
		return sb.toString();
	}
}
