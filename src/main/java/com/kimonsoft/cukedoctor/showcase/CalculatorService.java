package com.kimonsoft.cukedoctor.showcase;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CalculatorService {

    public BigInteger add(BigInteger n1, BigInteger n2) {
        return n1.add(n2);
    }
}
