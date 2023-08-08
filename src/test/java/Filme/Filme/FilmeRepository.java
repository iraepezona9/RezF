package Filme.Filme;

import org.springframework.stereotype.Repository;

@Repository
    public interface FilmeRepository extends CrudRepository<Filme, Long>
    {

    }

