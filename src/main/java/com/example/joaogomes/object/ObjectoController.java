package com.example.joaogomes.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path="api/v1/objecto")
public class ObjectoController {

    private final ObjectoService objectoService;

    @Autowired
    public ObjectoController(ObjectoService objectoService ) {
        this.objectoService = objectoService;
    }

    @GetMapping
    public List<Objecto> getObjectos() {
        return objectoService.getObjectos();
    }
}
