#Para criarmos um banco de dados utilizaremos o comando abaixo:
CREATE DATABASE estoque;

#coloca o banco de dados em uso, antes de criarmos uma tabela precisamos pô-la em uso.
USE estoque;
drop table produtos;
#cria a tabela e descreve quais os tipos que as variáveis serão.
CREATE TABLE produtos 
(nome varchar(50), 
quantidade int, 
tipo varchar (20), 
data_de_validade varchar (15),
preco double);

# Insere itens na tabela
insert into produtos values 
("Arroz", 50, "alimentício", "25/10/2023", '17.75'),
("Feijão", 80, "alimentício", "15/12/2024", '12.99'),
("Papel higiênico",80, "Higiene Pessoal", "Não possui", '15.00'),
("Refrigerante" ,50, "alimentício", "18/02/2024", '10.99');

select * from produtos;

select concat("Há ", quantidade , " pacotes de ",nome, " no estoque, com o valor unitário de: ", preco ) as informacao from produtos;

desc produtos;

/*2.Escolha 4 comandos do banco de dados e explique o que cada um faz, use suas palavras.
select concat -> concatena os atributos com conjunto de caracteres
Insert into (nome da tabela) values -> insere dados na tabela
select * from (nome da tabela) -> mostra na tela todos os dados da tabela
count () -> realiza a contagem de determinado atributo de uma tela

*/






