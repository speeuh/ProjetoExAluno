package aluno;

public class AlunoTeste {
	public static void main (String [] args) {
		Aluno aluno = new Aluno();
		ListaLigada lista = new ListaLigada();
		
		aluno.setMatricula("123");
		aluno.setNome("Lucas");
		aluno.setDisciplina("ED");
		aluno.setP1(8);
		aluno.setP2(8);
		lista.adicionaInicio(aluno);
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setMatricula("231");
		aluno1.setNome("Joao");
		aluno1.setDisciplina("ED");
		aluno1.setP1(9);
		aluno1.setP2(7);
		lista.adicionaFinal(aluno1);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setMatricula("321");
		aluno2.setNome("Julia");
		aluno2.setDisciplina("ED");
		aluno2.setP1(10);
		aluno2.setP2(9);
		lista.adicionaInicio(aluno2);
		
		lista.remove();
		lista.exibir();
		
		
	}
}
