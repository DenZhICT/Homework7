package guru.qa.tests;

import guru.qa.pages.RegFormPage;
import guru.qa.restaker.TestData;
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

    RegFormPage autopractform = new RegFormPage();

    @Test
    void check() {
        autopractform
                .openPage()
                .fillPageForm(data)
                .checkPageForm(data);
    }
}


