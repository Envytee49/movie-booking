package com.example.mbs.responses.show;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
@Getter
@Setter
@NoArgsConstructor
public class Show2Response {
    private Integer showId;
    private Time startTime;
}
