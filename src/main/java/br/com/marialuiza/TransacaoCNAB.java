package br.com.marialuiza;

import java.math.BigDecimal;

public record TransacaoCNAB(
        Integer tipo,
        String data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        String hora,
        String donaDaLoja,
        String nomeDaLoja
) {
}
