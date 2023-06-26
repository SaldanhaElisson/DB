

INSERT INTO tipo_fase (descricao) VALUES ('monofasico');
INSERT INTO tipo_fase (descricao) VALUES ('bifasico');
INSERT INTO tipo_fase (descricao) VALUES ('trifasico');



INSERT INTO classe (descricao, id_tipo_fase) VALUES ('RICO', 1);
--
-- INSERT INTO tipo_pessoa (descricao) VALUES ('pessoa-fisica');
-- INSERT INTO tipo_pessoa (descricao) VALUES ('pessoa-juridica');

-- INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('elisson', 09174300000, 1);

-- INSERT INTO cliente (num_documento, num_cliente, pessoa_id) VALUES ('elisson', 09174300000, 1);
-- INSERT INTO funcionario(codigo_funcional, pessoa_id) VALUES  (123123123, 1);

-- INSERT INTO rota (descricao) VALUES ('Macaranau');
-- INSERT INTO rota (descricao) VALUES ('pajacura');
-- INSERT INTO rota (descricao) VALUES ('Maranguape');


INSERT INTO poste (latitude, longitude, codigo, obervacao) VALUES ('10', '20', 'bbbbb', 'quase caindo');
INSERT INTO medidor (descricao, roda_id, poste_id) VALUES ('medidor_batata', 1, 1);

INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, class_id, cliente_id) VALUES ('Disse que era rico, mas é pobre', '2002-12-19 15:00:00-03'::timestamptz, '2002-12-19 15:00:00-03'::timestamptz, 1, 1 ,1 );



