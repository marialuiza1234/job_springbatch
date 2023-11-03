package br.com.marialuiza;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public record Transacao(
        Long id,
        Integer tipo,
        Date data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        Time hora,
        String donaDaLoja,
        String nomeDaLoja
) {

    public Transacao withValor(BigDecimal valor){
        return new Transacao(
                this.id(), this.tipo(), this.data(), valor, this.cpf(), this.cartao(), null, this.donaDaLoja().trim(), this.nomeDaLoja().trim()
        );
    }


    public Transacao withData(String data) throws ParseException {
        var dateFormart = new SimpleDateFormat("yyyyMMdd");
        var date = dateFormart.parse(data);

        return new Transacao(
                this.id(), this.tipo(), new Date(date.getTime()), this.valor(), this.cpf(), this.cartao(), this.hora(), this.donaDaLoja(), this.nomeDaLoja()
        );
    }

    public Transacao withHora(String hora) throws ParseException {
        var dateFormart = new SimpleDateFormat("HHmmss");
        var date = dateFormart.parse(hora);

        return new Transacao(
                this.id(), this.tipo(), this.data(), this.valor(), this.cpf(), this.cartao(), new Time(date.getTime()), this.donaDaLoja(), this.nomeDaLoja()
        );
    }

}
