package br.com.nomades.nomadestour.repository;

import br.com.nomades.nomadestour.entity.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long >{

}
