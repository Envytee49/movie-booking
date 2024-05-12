package com.example.mbs.dto.show;

import com.example.mbs.dto.screen.ScreenDetailDTO;
import com.example.mbs.models.show.Show;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
@Data
@NoArgsConstructor
public class ShowDetailDTO {
    private Time startTime;
    private Date showDate;
    private ScreenDetailDTO screen;
    private String movieName;
    public ShowDetailDTO(Show show, String movieName) {
        System.out.println("hreererererer");

        this.movieName = movieName;
        this.startTime = show.getStartTime();
        this.showDate = show.getShowDate();
        this.screen = new ScreenDetailDTO(show.getScreen());
    }
}
