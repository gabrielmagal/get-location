package br.com.viacep.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ConsultaDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public String ToString() {
        return Objects.nonNull(bairro)
                ? "Bairro: " + bairro+ "\nLocalidade: " + localidade + "\nUf: " + uf + "\nLogradouro: " + logradouro
                : "Não encontrado";
    }

}
