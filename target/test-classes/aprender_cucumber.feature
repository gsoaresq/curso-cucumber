#language: pt
Funcionalidade: Aprender Cucumber

Cenario: Deve executar especificação
	Dado Criei o arquivo corretamente
	Quando executá-lo
	Entao a especificação deve finalizar com sucesso
	
Cenario: Deve implementar contador
	Dado que o valor do contador é 15
	Quando eu incrementar 3
	Entao o valor será 18
	
Cenario: Deve calcular o atraso na entrega
	Dado que a entrega eh dia 18/11/2021
	Quando a entrega atrasar 3 dias
	Entao a entrega sera efetuada 21/11/2021
	
