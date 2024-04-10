package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class CalculatorServiceTest {
        
        private Calculator calculator;
        private CalculatorService service;
        
        @BeforeEach
        public void setup() {
            //テスト前にCalculatorのaddメソッドとCalculatorSeriviceのaddAndReportメソッドが正しく連携するかテスト
            calculator = new Calculator();
            service = new CalculatorService(calculator);
        }
            @Test
            public void testAddAndReport() {
            //CalculatorのaddメソッドとCaluculatorServiceのaddAndReportメソッドが正しく連携するかテスト
                assertEquals("Result: 5", service.addAndReport(2, 3));
        }
        
        
            @Test
            public void testSubtractAndReport() {
                //CalculatorのaddメソッドとcalculatorServiceのaddAndReportメソッドが正しく連携するかテスト
                assertEquals("Result: 1", service.subtractAndReport(3,2));
            }
        }
