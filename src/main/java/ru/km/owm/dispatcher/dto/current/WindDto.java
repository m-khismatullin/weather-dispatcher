package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WindDto(double speed, double deg, double gust) {
}
