package com.kdu.JavaAssessment2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_bus")
public class UserBus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookingId;
    @CreationTimestamp
    @Column(name = "booking_time", nullable = false)
    private java.sql.Timestamp bookingAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info")
    @JsonIgnore
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bus_info")
    @JsonIgnore
    private Bus bus;
}
