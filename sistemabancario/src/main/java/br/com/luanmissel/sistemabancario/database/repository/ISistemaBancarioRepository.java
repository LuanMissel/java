package br.com.luanmissel.sistemabancario.database.repository;

import br.com.luanmissel.sistemabancario.database.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ISistemaBancarioRepository extends JpaRepository<Conta, UUID> {

}
