package com.provapw.server.model;

import com.jatom.anotations.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@TableName("locacao")
public class Locacao {

    @Id
    private int id;

    @Alias("num_nota")
    private int numeroNota;

    private Timestamp data;

    @Alias("id_cliente")
    private int idCliente;

    @Join(reference = Cliente.class,columnName = "nome",columnReference = "id_cliente")
    @Ignore
    private String nomecliente;

    @ListObject
    private List<LocacaoItem> itensLocacao;
}
