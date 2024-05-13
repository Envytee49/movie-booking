package com.example.mbs.responses.show;

import com.example.mbs.requests.ShowRequest;
import com.example.mbs.responses.screen.ScreenDetailResponse;
import com.example.mbs.models.show.Show;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
@Getter
@Setter
@NoArgsConstructor
public class ShowDetailResponse {
    private String theatreName;
    private String screenName;
    private String movieTitle;
    private Date showDate;
    private Time startTime;
    private ScreenDetailResponse screen;
    public ShowDetailResponse(Show show, ShowRequest showRequest) {
        this.theatreName = showRequest.getTheatreName();
        this.screenName = showRequest.getScreenName();
        this.movieTitle = showRequest.getMovieTitle();
        this.startTime = showRequest.getStartTime();
        this.showDate = showRequest.getShowDate();
        this.screen = new ScreenDetailResponse(show.getScreen(), show.getShowId());
    }
}
