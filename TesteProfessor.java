package herancaconstrutor;

public class TesteProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor sergio;
		sergio = new Professor();
		
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		sergio.setNome("Sergio Santos");
		sergio.setCpf("123.211.321.32");
		sergio.setCursoMinistraAula("Curso Cyber Segurança");
		sergio.setSalario(6.255);
		
		
		funcionario.setAreaAtuacao("Técnico de Redes:");
		funcionario.setNomenclatura("TR");
		funcionario.setSalario(10.258);
		funcionario.setCpf("222.555.555.21");
		
		System.out.println("Ola vc esta na classe Professor: " + "\n "+ "Nome: " + sergio.getNome() + "\n " + "CPF: " + sergio.getCpf() + "\n " + " CURSO MINISTRADO: " 
		+ "\n " + sergio.getCursoMinistraAula() + "\n " + " " + " Salario: " + "R$ " + sergio.getSalario() + "\n " + "=====" );
		
		System.out.println("Ola vc esta na classe Funcionario: " + "\n " + "Função: " + funcionario.getAreaAtuacao() + "\n" 
		+ "Nomenclatura da Função: " + funcionario.getNomenclatura() + "\n " + "Salario: " 
				+ funcionario.getSalario() + "\n " + "CPF: " + funcionario.getCpf() + "\n ");

	}
	
	
	

}
