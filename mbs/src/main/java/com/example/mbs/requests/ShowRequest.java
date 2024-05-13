package com.example.mbs.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
@Getter
@Setter
@NoArgsConstructor
public class ShowRequest {
    private String movieTitle;
    private String theatreName;
    private Date showDate;
    private Time startTime;
    private String screenName;
}
