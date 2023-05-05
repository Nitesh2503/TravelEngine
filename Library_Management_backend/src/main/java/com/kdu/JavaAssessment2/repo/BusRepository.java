package com.kdu.JavaAssessment2.repo;

import com.kdu.JavaAssessment2.entity.Bus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{
    @Query("select b from Bus b where b.busId = ?1")
    Bus findByBusId(long busId);

}
