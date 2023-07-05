package com.example.application.data.service;

import com.example.application.data.entity.User1;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class User1Service {

    private final User1Repository repository;

    public User1Service(User1Repository repository) {
        this.repository = repository;
    }

    public Optional<User1> get(Long id) {
        return repository.findById(id);
    }

    public User1 update(User1 entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<User1> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<User1> list(Pageable pageable, Specification<User1> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
