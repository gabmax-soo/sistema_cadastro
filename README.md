Projeto de sistema de cadastro de produtos, feito para minha prática de estudos sobre orientação 
à objetos, foi usado conceitos como encapsulamento, listas, construtores e métodos em POO.

O intuito do projeto é adicionar, listar, buscar e remover um certo produto, para isso foi 
criado três classes uma em um pacote aplication que é onde será aplicado a lógica do sistema
e outras duas no pacote dominio que é da onde irei importar os metodos e contrutores.

Na classe Produto foi criado três atributos privados que para atribuir valores nos mesmos foi
utilizado um construtor public, depois utilizei de métodos Get para retornar o valores deles e 
na última linha um toString para retornar uma mensagem sobre as informações do produto.

Na classe Estoque utilizei um ArrayList que vai listar obejtos do tipo Produto para listar os produtos,
nisso foi utilizado de métodos do tipo void com parâmetros para adicionar,mostrar,buscar e
remover os produtos da lista.

Na classe Main ficou a parte lógica do projeto onde foi utilizado um loop do while juntamente com o condicional switch
para criar a opção de selecionar para adicionar,listar,buscar ou remover o produto.



