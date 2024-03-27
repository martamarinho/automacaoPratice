package Elementos;

import org.openqa.selenium.By;

public class ElementosdeLogin {
	
	private By btnlogar = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]");
    private By cmpEmail = By.id("email");
    private By cmpSenha = By.id("passwd");
    private By btnLogin = By.id("SubmitLogin");
    private By cmpLogo = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private By cmpPesquisa = By.id("search_query_top");
    private By btnPesquisar = By.name("submit_search");
    private By cmpProduto = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[2]/div/h5/a");
    private By btnCorAzul = By.name("Blue");
    private By btnCarrinho = By.name("Submit");
    private By btnseguir = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    private By msnValidar = By.xpath("//*[@id=\"product_1_2_0_3794\"]/td[2]/p/a");
    private By btnchekout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    
    
    
    
	public By getBtnlogar() {
		return btnlogar;
	}




	public By getCmpEmail() {
		return cmpEmail;
	}




	public By getCmpSenha() {
		return cmpSenha;
	}




	public By getBtnLogin() {
		return btnLogin;
	}




	public By getCmpLogo() {
		return cmpLogo;
	}




	public By getCmpPesquisa() {
		return cmpPesquisa;
	}




	public By getBtnPesquisar() {
		return btnPesquisar;
	}




	public By getCmpProduto() {
		return cmpProduto;
	}




	public By getBtnCorAzul() {
		return btnCorAzul;
	}




	public By getBtnCarrinho() {
		return btnCarrinho;
	}




	public By getBtnseguir() {
		return btnseguir;
	}




	public By getMsnValidar() {
		return msnValidar;
	}




	public By getBtnchekout() {
		return btnchekout;
	}

}
