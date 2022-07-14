package service;

import org.springframework.beans.factory.annotation.Autowired;
import respository.TransRepository;

public class TransService {
    @Autowired
    TransRepository transRepository;
}
