package br.com.ada.letscode.monitoramentoEolico.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String cep;
    private String logradouro;
    private String numero;
}
