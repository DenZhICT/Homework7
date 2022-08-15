package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegFromPage;
import guru.qa.restaker.TestData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;




public class ToolsQATest{
    TestData data;

    {
        try {
            data = new TestData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    RegFromPage autopractform = new RegFromPage();
    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }
    @Test
    void check(){
        autopractform
                .openPage()
                .fillPageForm(data)
                .checkPageFrom(data);
    }
}


