  Projeto Produtos com Herança e Tributação em Java

Descrição do Projeto

Este projeto é um programa em Java que simula o cadastro e o cálculo do valor final de três tipos de produtos: Estadual, Nacional e Importado. 
Utilizando os conceitos de Programação Orientada a Objetos (POO), especialmente a herança, o programa demonstra como classes filhas podem herdar atributos e comportamentos de uma classe base, além de adicionar suas próprias particularidades.

O objetivo principal é calcular o valor total de cada produto, levando em consideração diferentes níveis de tributação e taxas aplicadas a cada tipo.
O programa exibe um menu interativo para que o usuário possa cadastrar os produtos e visualizar um relatório detalhado.

===== Funcionalidades =====

O programa oferece as seguintes opções no menu principal:

1.  **Cadastrar Produto Estadual:** Permite ao usuário inserir a descrição, o valor base e calcular o valor final com um imposto de 10%.
2.  **Cadastrar Produto Nacional:** Permite ao usuário inserir a descrição, o valor base e calcular o valor final com um imposto de 10% e taxa de 5%.
3.  **Cadastrar Produto Importado:** Permite ao usuário inserir a descrição, o valor base e calcular o valor final com um imposto de 10%, taxa de 5% e taxa de importação de 5%.
4.  **Exibir Produtos Estaduais:** Mostra um relatório de todos os produtos do tipo Estadual cadastrados.
5.  **Exibir Produtos Nacionais:** Mostra um relatório de todos os produtos do tipo Nacional cadastrados.
6.  **Exibir Produtos Importados:** Mostra um relatório de todos os produtos do tipo Importado cadastrados.
7.  **Exibir Todos Produtos:** Apresenta um relatório completo com todos os produtos de todos os tipos.
8.  **SAIR:** Encerra o programa.

 

A estrutura de classes segue o princípio de herança, onde `ProdutoEstadual`, `ProdutoNacional` e `ProdutoImportado` herdam da classe base `Produto`.
