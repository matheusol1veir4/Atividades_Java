/*
para cria um banco de dados devemos usar o comanod CREATE DATABASE + nome do banco
apos a criação devemos colocar o banco em uso usando o comando USE + nome do banco;
para a criação de tabelas devemos usar o comando CREATE TABLE + nome da tabela abrir e fechar PARENTSES e ponto e virgula apos o fecha parenteses;
dentro das chaves colocamos em primeiro o nome do atributo, depois o seu tipo caso hajam mais atributos eles devem ser separados por virgula;
para realizar uma inserção de dados, usamos o comando INSERT INTO + NOME DA TABELA + VALUES ();
dentro do parenteses, a inseção dos dados deve segui a mesma ordem da criação da tabela;
para realizar a consulta de uma tabela usamos o comando SELECT * FROM + NOME DA TABELA 
*/

/*2.Escolha 4 comandos do banco de dados e explique o que cada um faz, use suas palavras.
select concat -> concatena os atributos com conjunto de caracteres
Insert into (nome da tabela) values -> insere dados na tabela
select * from (nome da tabela) -> mostra na tela todos os dados da tabela
count () -> realiza a contagem de determinado atributo de uma tela

*/

/* 3. crie um banco de dados para salvar dados de produto a tabela produto deve possuir
a tabela produto deve possuir: descrição, unidade de medida, valor unitário, quantidade.
Cadastre 5 produtos
Mostrar uma mensagem concatenando os atributos*/

create database exercicio_produto;
use exercicio_produto;

create table produto ( 
descricao varchar (100),
unidade_medida enum ("und", "lts","mts"),
valor_unitario double,
quantidade int);

insert into produto values 
("pendrine", 1, 15.00,10), ("leite", 2,6.56,100),
("todinho", "lts", 2.50,200), ("Chá verde", 2,6.00, 350);

select * from produto;

select concat("há ", quantida
de, " ", descricao, "no estoque com o estoque com o valor de " , valor_unitario, " reais ")
as "mostrar dados"from produto;

#concat: o produto * tem a unidade de media *
select concat("o produto ", descricao, " tem a unidade de medida: ", unidade_medida) as informacao from produto;

																																																																																																																															