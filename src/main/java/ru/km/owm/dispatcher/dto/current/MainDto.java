package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MainDto(
        double temp,
        double feelsLike,
        double tempMin,
        double tempMax,
        double pressure,
        double humidity,
        double seaLevel,
        double grndLevel
) {
}
