package com.ohgiraffers.jenkinsproject.service;

import com.ohgiraffers.jenkinsproject.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /* My. 기업에서는 계층간 테스트를 하는데 Service 계층 테스트는 꼭 들어가야한다. */
    public int plusTwoNumbers(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
}
