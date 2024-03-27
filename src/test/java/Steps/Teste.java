package Steps;

import java.io.IOException;

import Elementos.ElementosdeLogin;
import Metodos.MetodosdeLogin;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class Teste {

	ElementosdeLogin el = new ElementosdeLogin();
	MetodosdeLogin met = new MetodosdeLogin();

	@Dado("que esteja no site {string}")
	public void que_esteja_no_site(String string) {
		met.abrirNavegador(string);
	}

	@Dado("clicar pra logar")
	public void clicar_pra_logar() {
		met.clicar(el.getBtnlogar());
	}

	@Dado("preencher login e senha validas")
	public void preencher_login_e_senha_validas() {
		met.preencher(el.getCmpEmail(), "testeturma18@gmail.com");
		met.preencher(el.getCmpSenha(), "123456789");
		met.clicar(el.getBtnLogin());
	}

	@Entao("é logado com sucesso")
	public void é_logado_com_sucesso() throws IOException, InterruptedException {
		met.pausar(2000);
		met.tirarPrint("logado com sucesso");
	}

	@Dado("que esteje no site {string}")
	public void que_esteje_no_site(String string) {
		met.abrirNavegador(string);
	}

	@Dado("clicar em logar")
	public void clicar_em_logar() {
		met.clicar(el.getBtnlogar());
	}

	@Dado("preencher login com dados validos")
	public void preencher_login_com_dados_validos() {
		met.preencher(el.getCmpEmail(), "testeturma18@gmail.com");
		met.preencher(el.getCmpSenha(), "123456789");
		met.clicar(el.getBtnLogin());
	}

	@Dado("clicar no logo")
	public void clicar_no_logo() {
		met.clicar(el.getCmpLogo());
	}

	@Dado("preencher no compo de pesquisa com T-shirt")
	public void preencher_no_compo_de_pesquisa_com_t_shirt() {
		met.preencher(el.getCmpPesquisa(), "T-shirt");

	}

	@Dado("clicar em pesquisar")
	public void clicar_em_pesquisar() {
		met.clicar(el.getBtnPesquisar());
	}

	@Dado("clicar no produto faded")
	public void clicar_no_produto_faded() throws IOException {
		met.clicar(el.getCmpProduto());
		met.tirarPrint("produto selecionado");
		met.clicar(el.getBtnCorAzul());
	}

	@Dado("clicar para add to cart")
	public void clicar_para_add_to_cart() {
		met.clicar(el.getBtnCarrinho());
	}

	@Dado("clicar em proced")
	public void clicar_em_proced() throws InterruptedException {
		met.pausar(3000);
		met.clicar(el.getBtnseguir());
		//met.scroll(el.getMsnValidar());
		met.validartexto(el.getMsnValidar(), "Faded Short Sleeve T-shirts");
	}

	@Dado("dar um scroll ate btn proced to checkout")
	public void dar_um_scroll_ate_btn_proced_to_checkout() {
		met.scroll(el.getBtnchekout());
		met.clicar(el.getBtnchekout());
	}

	@Entao("sera direcionada a tela de finalizar compra")
	public void sera_direcionada_a_tela_de_finalizar_compra() throws IOException {
		met.tirarPrint("campo de compra");
	}

}
