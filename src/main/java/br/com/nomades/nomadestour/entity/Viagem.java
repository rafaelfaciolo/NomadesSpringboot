package br.com.nomades.nomadestour.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Viagem {
    @Override
    public String toString() {
        return "Viagem{" +
                "idViagem=" + idViagem +
                ", local='" + local + '\'' +
                ", dataPartida='" + dataPartida + '\'' +
                ", dataRetorno='" + dataRetorno + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                '}';
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idViagem;
    @Column(nullable = false, unique = true)
    private String local;
    private String dataPartida;
    private String dataRetorno;
    private Integer vagas;
    private BigDecimal valor;

    public Long getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(Long idViagem) {
        this.idViagem = idViagem;
    }

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
}
