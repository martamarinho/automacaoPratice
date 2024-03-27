#language: pt 
@tag
Funcionalidade: Logar  e Adicionar produto no carrinho com sucesso 
  @tag1
  Cenario: Logar e adicionar produto ao carrinho
  Dado que esteje no site "http://www.automationpractice.pl/index.php"
  E clicar em logar 
  E preencher login com dados validos 
  E clicar no logo 
  E preencher no compo de pesquisa com T-shirt
  E clicar em pesquisar 
  E clicar no produto faded
  E clicar para add to cart 
  E clicar em proced
  E dar um scroll ate btn proced to checkout
  Entao sera direcionada a tela de finalizar compra 
  
  