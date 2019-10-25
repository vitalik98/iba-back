package by.iba.repository;

import by.iba.entity.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CommandRepository extends JpaRepository<Command, Long> {
 }
