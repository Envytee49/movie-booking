package com.example.mbs.payload.responses.movie.schedule;

import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.ShowDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import lombok.*;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowMovie extends ShowDTO {
    private ScreenMovie screens;

}
