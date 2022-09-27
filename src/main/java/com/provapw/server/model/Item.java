package com.provapw.server.model;

import com.jatom.anotations.Id;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@TableName("item")
public class Item {

    @Id
    private int id;

    private String image;

    private String descricao;

    private Double valor;
}
