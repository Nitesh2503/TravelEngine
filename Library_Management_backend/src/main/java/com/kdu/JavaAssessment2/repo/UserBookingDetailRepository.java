package com.kdu.JavaAssessment2.repo;

import com.kdu.JavaAssessment2.entity.UserBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserBookingDetailRepository extends JpaRepository<UserBus,Long>{
    @Query("select u from UserBus u where u.bus.busId = ?1")
    List<UserBus> findByBus_BusId(String busId);

//    @Query("select u from UserBus u where u.bookingId = ?1")
    @Query("SELECT ub, b FROM UserBus ub JOIN ub.bus b WHERE ub.bookingId = ?1")
    List<Object[]> findByBookingId(Long bookingId);

    @Query("select u from UserBus u where u.bus.startAt = ?1 and u.bus.date = ?2")
    List<UserBus> findByBus_StartAtAndBus_Date(Timestamp startAt, LocalDate date);


}
