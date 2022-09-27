package com.provapw.server.model;

import com.jatom.anotations.Id;
import com.jatom.anotations.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@TableName("cliente")
public class Cliente {

    @Id
    private int id;

    private String nome;

    private String cpf;
}
