package herancaconstrutor;

public class Professor extends Pessoa{

		public String cursoMinistraAula;

		public String getCursoMinistraAula() {
			return cursoMinistraAula;
		}

		public void setCursoMinistraAula(String cursoMinistraAula) {
			this.cursoMinistraAula = cursoMinistraAula;
		}
		
		void exibirOiProfessor () {
			System.out.println("Ola, voc� est� utilizando a classe Professor");
		}
		
		



}
