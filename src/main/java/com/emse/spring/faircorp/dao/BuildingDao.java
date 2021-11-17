package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BuildingDao extends JpaRepository<Building, Long> {
    @Query("select c from Building c where c.name=:name")
    Building findByName(@Param("name") String name);

    @Modifying
    @Query("delete from Building b where b.id = :id")
    void deleteById(@Param("id") Long id);
}
