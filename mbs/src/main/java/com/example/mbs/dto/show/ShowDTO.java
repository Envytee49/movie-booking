package com.example.mbs.dto.show;

import com.example.mbs.dto.screen.ScreenDTO;
import com.example.mbs.models.show.Show;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
@Data
@NoArgsConstructor
public class ShowDTO {
    private Integer showId;
    private Time startTime;
//    private Date showDate;
    private ScreenDTO screen;
    public ShowDTO(Show show) {
        this.showId = show.getShowId();
        this.startTime = show.getStartTime();
//        this.showDate = show.getShowDate();
        this.screen = new ScreenDTO(show.getScreen());
    }
}
