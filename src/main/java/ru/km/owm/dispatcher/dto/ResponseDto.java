package ru.km.owm.dispatcher.dto;

public record ResponseDto<T>(String message, T data) {
}
