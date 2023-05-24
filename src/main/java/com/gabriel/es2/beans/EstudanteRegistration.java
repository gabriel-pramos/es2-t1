package com.gabriel.es2.beans;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EstudanteRegistration extends CrudRepository<Estudante, Integer> {
    // @Query("SELECT e FROM Estudante e WHERE e.nome LIKE %?1%")
    List<Estudante> findByNomeContaining(String nome);
}
