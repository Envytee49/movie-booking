package com.example.mbs.payload.responses.movie.schedule;

import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.ScreenDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScreenMovie extends ScreenDTO {
    private TheatreMovie theatre;
    private FormatDTO format;
    private SpecialScreenDTO specialScreen;
}
