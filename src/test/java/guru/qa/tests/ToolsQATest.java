package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegFromPage;
import guru.qa.restaker.TestData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class ToolsQATest extends TestBase {
    TestData data;

    {
        try {
            data = new TestData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    RegFromPage autopractform = new RegFromPage();

    @Test
    void check() {
        autopractform
                .openPage()
                .fillPageForm(data)
                .checkPageFrom(data);
    }
}


