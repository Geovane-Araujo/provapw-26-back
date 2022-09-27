package com.provapw.server.service;

import com.jatom.enuns.JAtomTypes;
import com.jatom.model.JAtomParameters;
import com.jatom.utils.Atom;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteService extends Atom {

    public Object getAll(){

        JAtomParameters parameters = new JAtomParameters();

        String sql = "select * from cliente";
        parameters.put(JAtomTypes.SQL,sql);// isso eu preciso melhorar
        Object ov = this.get(parameters);

        return ov;
    }
}
