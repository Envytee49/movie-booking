package com.example.mbs.responses;

import com.example.mbs.models.Format;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormatResponse {
    private Integer formatId;
    private String formatType;
    public FormatResponse(Format format) {
        this.formatId = format.getFormatId();
        this.formatType = format.getFormatType();
    }
}
