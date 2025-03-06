package ru.km.owm.dispatcher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.km.owm.dispatcher.dto.ResponseDto;
import ru.km.owm.dispatcher.dto.current.CurrentDto;
import ru.km.owm.dispatcher.feign.OwmClient;

@RestController
public class Controller {
    private final OwmClient owmClient;

    public Controller(OwmClient owmClient) {
        this.owmClient = owmClient;
    }

    @GetMapping("/test")
    public ResponseDto<CurrentDto> getCurrent() {
        CurrentDto currentDto = owmClient.getCurrent(
                "",
                "54.867",
                "55.750");
        return new ResponseDto<>(
                "ok",
                currentDto
        );
    }
}
