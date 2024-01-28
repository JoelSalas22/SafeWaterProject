package com.waterquality.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.reflect.Parameter;

@Transactional
@Repository
public interface ParameterRepository  extends JpaRepository<Parameter, Long>{


}
