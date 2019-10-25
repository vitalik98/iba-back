package by.iba.repository;

import by.iba.entity.Subsystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface SubsystemRepository extends JpaRepository<Subsystem,Long> {

}
