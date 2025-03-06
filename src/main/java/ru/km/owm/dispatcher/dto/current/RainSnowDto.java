package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RainSnowDto(
        @JsonProperty("3h")
        int threeHour,
        @JsonProperty("1h")
        int oneHour
) {
}
