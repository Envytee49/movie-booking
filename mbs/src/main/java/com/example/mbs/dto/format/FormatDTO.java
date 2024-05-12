package com.example.mbs.dto.format;

import com.example.mbs.models.Format;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormatDTO {
    private Integer formatId;
    private String formatType;
    public  FormatDTO(Format format) {
        this.formatId = format.getFormatId();
        this.formatType = format.getFormatType();
    }
}
