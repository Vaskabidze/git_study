package com.example.Sber.anotation.service;

import com.example.Sber.anotation.entity.SberIdBase;
import com.example.Sber.anotation.persistance.SberIdBaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BaseService {
    private final SberIdBaseRepository repository;

    public Long saveSberIdBase(SberIdBase sberIdBase) {
        return repository.save(sberIdBase).getId();
    }

    public SberIdBase findById(Long id) {
        String reason = "Not found custom";
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, reason));
    }

    public List<SberIdBase> findAll(){
        System.out.println("Вызов сервиса поиск всех сузностей");
        return repository.findAll();
    }

    public void deleteById(Long id) {
        SberIdBase sberIdBase = findById(id);
        repository.delete(sberIdBase);
    }

}
