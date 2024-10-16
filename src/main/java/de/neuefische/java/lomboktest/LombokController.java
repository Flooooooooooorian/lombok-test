package de.neuefische.java.lomboktest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LombokController {
    private final LombokService lombokService;
}
