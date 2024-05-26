package com.example.mbs.payload.responses.theatre.schedule;

import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.ScreenDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ScreenTheatre extends ScreenDTO {
    List<ShowTheatre> shows;
    private FormatDTO format;
    private SpecialScreenDTO specialScreen;
}
