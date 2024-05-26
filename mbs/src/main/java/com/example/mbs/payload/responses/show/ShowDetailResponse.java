package com.example.mbs.payload.responses.show;

import com.example.mbs.payload.dto.ShowDTO;
import com.example.mbs.payload.responses.screen.ScreenDetailResponse;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ShowDetailResponse extends ShowDTO {
    private String movieTitle;
    private Date showDate;
    private ScreenDetailResponse screen;
}
