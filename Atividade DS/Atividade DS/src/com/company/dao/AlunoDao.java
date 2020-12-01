package com.company.dao;


import com.company.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDao {

    //	conectando
    Connection con	=	new	ConnectionFactory().getConnection();

    public void inserirDado(Aluno aluno) throws SQLException {
        //Preparando o Statement
        String	sql	=	"insert	into Emds.Aluno"	+
                "	(rm, nome, email, telefone, endereco, curso)"	+
                "	values	(?,?,?,?,?,?)";
        PreparedStatement stmt	=	con.prepareStatement(sql);

        //preenche valores
        stmt.setInt(1, aluno.getRm());
        stmt.setString(2, aluno.getNome());
        stmt.setString(3, aluno.getEmail());
        stmt.setString(4, aluno.getTelefone());
        stmt.setString(5, aluno.getEndereço());
        stmt.setString(6, aluno.getCurso().toString());

        //executa
        stmt.execute();
        stmt.close();

    }
}
