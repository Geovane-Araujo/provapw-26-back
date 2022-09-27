package com.provapw.server.model;

import com.jatom.anotations.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@TableName("locacao_item")
public class LocacaoItem {

    @Id
    private int id;

    @Alias("iditem")
    private int iditem;

    @Ignore
    @Join(reference = Item.class,columnName = "descricao",columnReference = "iditem")
    private String descricao;

    @Fk("id")
    private int idlocacao;

    private Double valor;

}
