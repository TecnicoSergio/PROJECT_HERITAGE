package herancaconstrutor;

public class Funcionario extends Pessoa{
	
	private String areaAtuacao;
	private String nomenclatura;

	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	void exibirOiFuncionario () {
		System.out.println("Ol�, voce est� utilizando a classe Funcionario.");
	}
	
	

}
