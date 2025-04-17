package br.com.colombano.mapstructpoc.repository;

import br.com.colombano.mapstructpoc.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}