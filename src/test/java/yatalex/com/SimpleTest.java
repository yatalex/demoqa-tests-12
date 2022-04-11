package yatalex.com;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB(){
        System.out.println("### @BeforeAll");
    }
    @BeforeEach
    void openYaPage(){
        System.out.println("###     @BeforeEach");
        Selenide.open("https://ya.ru/");
    }
    @AfterEach
    void close(){
        System.out.println("###     @AfterEach");
        WebDriverRunner.closeWindow();
    }
    @AfterAll
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest0() {
        System.out.println("###         @Test 0");
    }

    @Test
    void assertTest1() {
        System.out.println("###         @Test 1");

    }

    @Test
    void assertTest2() {
        System.out.println("###         @Test 3");

    }
}
