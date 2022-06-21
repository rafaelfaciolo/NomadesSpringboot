package br.com.nomades.nomadestour.domain.request;

import java.math.BigDecimal;

public class ViagemRequest {
    private String local;
    private String dataPartida;
    private String dataRetorno;
    private Integer vagas;
    private BigDecimal valor;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ViagemRequest{" +
                "local='" + local + '\'' +
                ", dataPartida='" + dataPartida + '\'' +
                ", dataRetorno='" + dataRetorno + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                '}';
    }
}


