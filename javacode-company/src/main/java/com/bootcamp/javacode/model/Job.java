package com.bootcamp.javacode.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder


public class Job {
  
  private LocalDate startDate;

  private LocalDate deadline;

  public static void main(String[] args) {
    Job job = Job.builder() //
            .startDate(LocalDate.of(2020,12,21))//
            .deadline(LocalDate.of(2022,12,21))//
            .build();
    //No arg constructor
    Job job2 = Job.builder().build();
    
  }
}
