package com.example.AULA_18_Trainer.service.impl;

import com.example.AULA_18_Trainer.model.Trainer;
import com.example.AULA_18_Trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {


    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }

}
