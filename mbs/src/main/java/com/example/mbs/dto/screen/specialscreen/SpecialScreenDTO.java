package com.example.mbs.dto.screen.specialscreen;

import com.example.mbs.models.screen.specialscreen.SpecialScreen;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpecialScreenDTO {
    private String sscreenName;

    public SpecialScreenDTO(SpecialScreen specialScreen) {
        this.sscreenName = specialScreen.getSscreenName();
    }
}
