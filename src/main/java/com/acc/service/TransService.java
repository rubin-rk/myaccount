package com.acc.service;

import com.acc.respository.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TransService {
    @Autowired
    TransRepository transRepository;
}
