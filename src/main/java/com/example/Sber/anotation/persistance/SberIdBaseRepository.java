package com.example.Sber.anotation.persistance;

import com.example.Sber.anotation.entity.SberIdBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SberIdBaseRepository extends JpaRepository<SberIdBase, Long> {
}
