package com.sg.sportmeeting.repository;

import com.sg.sportmeeting.entity.result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface resultJpa extends JpaRepository<result,Long> {

    @Query(value = "select * from t_result r where r.t_name = ?1", nativeQuery = true)
    result findByName(String name);
}
