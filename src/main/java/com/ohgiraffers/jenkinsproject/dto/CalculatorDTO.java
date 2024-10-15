package com.ohgiraffers.jenkinsproject.dto;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {

    /* My. @RequiredArgsConstructor 매개변수 생성 두 가지 방식이 있다.
    *   1. NonNull
    *   2. final -> 추천하지 않음(값을 미리 설정해주어야 한다.)
    *               (@NoArgsConstructor 사용하지 않으면 가능???????)
    * */
    @NonNull
    private int num1;
    @NonNull
    private int num2;
    private int sum;
}
