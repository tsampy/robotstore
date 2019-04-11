package com.javamaster.springwithjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

public interface robotSQLRepository extends JpaRepository<robotSQL, Long> {

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM robots r WHERE r.id = :robotID", nativeQuery = true)
    void deleteRobot(@Param("robotID") int robot_ID);
}