package com.example.joaogomes.object;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ObjectoService {
    public List<Objecto> getObjectos() {
        return List.of(
                new Objecto(
                        1L,
                        "Objecto Teste",
                        "Description Cool 🎯",
                        LocalDate.of(2000, Month.DECEMBER, 5),
                        1
                )
        );
    }
}
