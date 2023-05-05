package com.kdu.JavaAssessment2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long busId;

    private String busName;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "starting_time", nullable = false)
    private LocalTime startAt;

    @Column(name = "ending_time", nullable = false)
    private LocalTime endAt;
}
