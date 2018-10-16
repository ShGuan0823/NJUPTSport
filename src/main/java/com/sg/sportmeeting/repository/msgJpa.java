package com.sg.sportmeeting.repository;

import com.sg.sportmeeting.entity.message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface msgJpa extends JpaRepository<message, Long> {
}
