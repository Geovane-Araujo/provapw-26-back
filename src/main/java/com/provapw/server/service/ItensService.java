package com.provapw.server.service;

import com.jatom.enuns.JAtomTypes;
import com.jatom.exceptions.ServiceException;
import com.jatom.model.JAtomParameters;
import com.jatom.security.Security;
import com.jatom.utils.Atom;
import com.provapw.server.dto.LoginData;
import org.springframework.stereotype.Repository;

@Repository
public class ItensService extends Atom {

    public Object getAll(){

        JAtomParameters parameters = new JAtomParameters();

        parameters.put(JAtomTypes.SQL,"select * from item");// isso eu preciso melhorar
        Object ov = this.get(parameters);

        return ov;
    }
}
