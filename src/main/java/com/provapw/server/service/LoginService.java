package com.provapw.server.service;

import com.jatom.enuns.JAtomTypes;
import com.jatom.exceptions.ServiceException;
import com.jatom.model.JAtomParameters;
import com.jatom.security.Security;
import com.jatom.utils.Atom;
import com.provapw.server.dto.LoginData;
import org.springframework.stereotype.Repository;

@Repository
public class LoginService extends Atom {

    Security sec = new Security();

    public String verifyLogin(LoginData login){

        JAtomParameters parameters = new JAtomParameters();
        String cleanEmail = login.getEmail();
        String cleanSenha = login.getSenha();
        parameters.put(JAtomTypes.SQL,"select * from usuario where email = '"+cleanEmail+"' and senha = '" +cleanSenha+ "'");// isso eu preciso melhorar
        Object ov = this.get(parameters);

        if(ov == null){
            throw new ServiceException("BAD_REQUEST", "Usuário ou senha incorretos",null);
        } else {
            return sec.generateToken(login.getEmail());
        }

    }
}
