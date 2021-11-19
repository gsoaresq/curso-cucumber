package cursocucumber;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	@Dado("Criei o arquivo corretamente")
	public void crieiOArquivoCorretamente() {
	}
	@Quando("executá-lo")
	public void executáLo() {
	}
	@Entao("a especificação deve finalizar com sucesso")
	public void aEspecificaçãoDeveFinalizarComSucesso() {
	}
	
	private int contador = 0;
	
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int int1) {
		contador = int1;
	}
	@Quando("eu incrementar {int}")
	public void euIncrementar(int int1) {
		contador+=int1;
	}
	@Entao("o valor será {int}")
	public void oValorSerá(int int1) {
		assertEquals(int1, contador);
	}

	
	private LocalDate data;
	
	@Dado("que a entrega eh dia {int}\\/{int}\\/{int}")
	public void queAEntregaEhDia(Integer dia, Integer mes, Integer ano) {
		data = LocalDate.of(ano, mes, dia);
	}
	@Quando("a entrega atrasar {int} dias")
	public void aEntregaAtrasarDias(Integer dias) {
		data = data.plusDays(dias+1);
	}
	@Entao("a entrega sera efetuada {int}\\/{int}\\/{int}")
	public void aEntregaSeraEfetuada(Integer dia, Integer mes, Integer ano) {
		LocalDate novaData = LocalDate.of(ano, mes, dia);
		assertEquals(novaData, data);
	}
	
}
