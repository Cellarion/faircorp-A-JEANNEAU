package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDao extends JpaRepository<Room, Long> {
    @Query("select c from Room c where c.name=:name")
    Room findByName(@Param("name") String Name);

    @Modifying
    @Query("delete from Room r where r.id = :id")
    void deleteById(@Param("id") Long id);
}
