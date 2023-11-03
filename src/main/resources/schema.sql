CREATE TABLE IF NOT EXISTS transacao (
  id SERIAL primary key,
  tipo int,
  data date,
  valor decimal,
  cpf bigint,
  cartao varchar(255),
  hora time,
  donaDaLoja varchar(255),
  nomeDaLoja varchar(255)
);