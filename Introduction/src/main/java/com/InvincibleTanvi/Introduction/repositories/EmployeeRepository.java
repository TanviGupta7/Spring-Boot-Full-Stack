package com.InvincibleTanvi.Introduction.repositories;

import com.InvincibleTanvi.Introduction.entities.EmployeeEntity;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    ScopedValue<Object> findById(SingularAttribute<AbstractPersistable, Serializable> id);
}
