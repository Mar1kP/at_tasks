package itstep_aqa.unit;

import day2.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Optional;

public class FirstTest {

    @DataProvider
    public static Object[][] addingDataProvider() {

        Object[][] parametr = new Object[4][3];
        parametr[0][0] = 4.0;  parametr[0][1] = 5.0;  parametr[0][2] = 3.0;
        parametr[1][0] = 5.0;  parametr[1][1] = 6.0;  parametr[1][2] = 9.0;
        parametr[2][0] = 4.0;  parametr[2][1] = -4.0;  parametr[2][2] = 0.0;
        parametr[3][0] = 1.0;  parametr[3][1] = 2.0;  parametr[3][2] = 2.0;
        return parametr;

    }

    // divide
    @Test
    void divideTest(){
        Assert.assertEquals(Calculator.divide(1, 1), 1d, "invalid dividing operation");
    }
    // add
    @Test(dataProvider = "addingDataProvider")
    void addTest(Double a, Double b, Double expectedResult){
        Assert.assertEquals(Optional.of(Calculator.add(a, b)), expectedResult, "invalid adding operation");
    }
    // multiply
    @Test
    void mulTest(){
        Assert.assertEquals(Calculator.multiply(1, 1), 1d, "invalid multiplying operation");
    }
    // minus
    @Test
    void subTest(){
        Assert.assertEquals(Calculator.minus(1, 1), 0d, "invalid subtracting operation");
    }

}
