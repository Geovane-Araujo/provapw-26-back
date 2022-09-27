package com.provapw.server.service;

import com.jatom.enuns.JAtomTypes;
import com.jatom.model.JAtomParameters;
import com.jatom.utils.Atom;
import org.springframework.stereotype.Repository;

@Repository
public class LocacaoService extends Atom {

    public Object getAll(){

        JAtomParameters parameters = new JAtomParameters();

        String sql = "select locacao.*, " +
                "cliente.nome," +
                "(select sum(valor) from locacao_item where iditem = locacao.id) as valorTotal " +
                "from locacao " +
                "inner join cliente on cliente.id = locacao.id_cliente";
        parameters.put(JAtomTypes.SQL,sql);// isso eu preciso melhorar
        Object ov = this.get(parameters);

        return ov;
    }

    public Object getById(int id){

        JAtomParameters parameters = new JAtomParameters();

        String sql = "select locacao.*,locacao.id_cliente as idCliente, " +
                "cliente.nome," +
                "(select sum(valor) from locacao_item where iditem = locacao.id) as valorTotal " +
                "from locacao " +
                "inner join cliente on cliente.id = locacao.id_cliente where locacao.id = " +id;

        parameters.put(JAtomTypes.SQL,sql);// isso eu preciso melhorar
        Object ov = this.get(parameters);

        return ov;
    }
}
