package hr_digital.directorio.directorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr_digital.directorio.directorio.entity.contacto;

@Repository
public interface contactoRepository extends JpaRepository<contacto, Integer> {
    
}
