package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Calc.run return int")
    void t1(){
        int rs = Calc.run("");
    }
}
