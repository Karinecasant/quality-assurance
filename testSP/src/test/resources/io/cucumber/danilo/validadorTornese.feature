# language: pt
Funcionalidade: Pesquisando no site https://www.torneseumprogramador.com.br/
	Testando o campo de pesquisa do site Torne-se um Programador
		
	Cenario: Testando pesquisa de TDD
		Dado que eu acesso o site do torne-se um programador 
		E busco pelo conteudo "tdd"
		E clico no botao pesquisar
	  Entao devo ver o resultado da busca

	Cenario: Testando pesquisa de BDD
		Dado que eu acesso o site do torne-se um programador 
		E busco pelo conteudo "bdd"
		E clico no botao pesquisar
	  Entao devo ver o resultado da busca