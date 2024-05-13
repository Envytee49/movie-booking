package com.example.mbs.responses.show;

import com.example.mbs.responses.screen.ScreenResponse;
import com.example.mbs.models.show.Show;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
@Data
@NoArgsConstructor
public class ShowResponse {
    private Integer showId;
    private Time startTime;
//    private Date showDate;
    private ScreenResponse screen;
    public ShowResponse(Show show) {
        this.showId = show.getShowId();
        this.startTime = show.getStartTime();
//        this.showDate = show.getShowDate();
        this.screen = new ScreenResponse(show.getScreen());
    }
}
