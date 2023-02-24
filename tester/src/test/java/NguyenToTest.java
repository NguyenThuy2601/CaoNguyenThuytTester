
import com.thuy.service.PowerService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class NguyenToTest {
    @BeforeAll
    public static void testBeforeAll()
            {
                System.out.println("before");
            }
    @AfterAll
    public static void testAfterAll()
            {
                System.out.println("after");
            }
    @BeforeEach
    public void testEach() {
        System.out.println("before each");
    }
    @Test
    @DisplayName("kiem tra so nto chan")
    public void testNtoChan() {
        System.out.println("chan");
    }

    @Test
    @DisplayName("kiem tra so nto le")
    public void testNtoLe() {
        System.out.println("le");
    }
    
    @Test
    public void test1() {
        int n = 0;
        double x = 3;
        double expected = 1.0;
        double actual = PowerService.Power(x, n);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test2() {
        int n = 3;
        double x = 0.1;
        double expected = 0.001;
        double actual = PowerService.Power(x, n);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test3() {
        int n = 3;
        double x = 1;
        double expected = 1;
        double actual = PowerService.Power(x, n);
        Assertions.assertEquals(expected,actual);
    }
    
    @Test
    public void test4() {
        int n = -3;
        double x = 2;
        double expected = 30.125;
        double actual = PowerService.Power(x, n);
        Assertions.assertEquals(expected,actual);
    }
}
