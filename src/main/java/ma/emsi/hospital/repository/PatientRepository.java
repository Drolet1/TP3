package ma.emsi.hospital.repository;

import ma.emsi.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    /*Pageable = transmettre le numéro de la page et le size*/
    Page<Patient> findByNomContains(String keyword, Pageable pageable);
}
