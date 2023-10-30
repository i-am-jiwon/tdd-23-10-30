package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalcTest {

    @Test
    @DisplayName("Calc.run return int")
    void t1(){
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2(){
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }
}
