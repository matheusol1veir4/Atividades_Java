
# cria o banco de dados
CREATE DATABASE banco_teste;

#coloca o banco de dados em uso
USE banco_teste;

#cria a tabela
CREATE TABLE pessoa (
nome VARCHAR (50),
idade INT ,
sexo CHAR (1),
peso DOUBLE
);

#descreve a tabela
DESC pessoa;

#insere o produto na tabela
INSERT INTO pessoa VALUES ("MATHEUS OLIVEIRA", 25, 'M', 65.00);

INSERT INTO pessoa VALUES ("MARIA DE LOURDES", 30, 'F', 70.00);

INSERT INTO pessoa(nome,idade) VALUES ("KAREN" , 22);

INSERT INTO pessoa VALUES ("Jose", 65,'M',70) , 
("Maria",70, 'F',98),
("Cristiano Ronaldo", 35, 'M',110);

#pesquisa todos os dados da tabela
SELECT * FROM pessoa;

CREATE TABLE produto (
    descricaoProduto VARCHAR(100),
    
    #quando há parenteses indica a quantidade de casas (total) e quabtidade de números após a vírgulaque será mostrado
    preco DOUBLE(6 , 2 ),
    
    # ENUM é um tipo de dados comopções pré definidas
    status_pedido ENUM('entregue', 'preparando', 'saiu para entrega')
);
#para acessar o dado do enum, podemos podemos usar o nome sa opção ou a casa que ele ocupa (indice)
insert into produto values ("Sanduba", 15.56, 3);
select * from produto;

# selecione apenas o campo nome na tabela pessoa onde a idade for igual a 33
select nome from pessoa where idade = 33;

select sexo from pessoa where nome like "%LOURDES%";

select * from pessoa where sexo = 'M' or idade > 33;
select * from pessoa where sexo = 'M' and idade > 33;

select count(*) as "Quantidade de Pessoas" from pessoa;

select (2+4);
