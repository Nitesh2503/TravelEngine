package com.kdu.JavaAssessment2.model.bus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusModel {
    @NotNull
    private String busName;
    @NotNull
    private LocalDate date;
    @NotNull
    private LocalTime startAt;
    @NotNull
    private LocalTime endAt;
}
