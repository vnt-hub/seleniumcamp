package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class FramesTest extends BaseTest {

@Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindows().clickFramesMenuItem();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected Text Doesn't Match \n");
        String actualHeaderFramesText = framesPage.getHeaderFramesText();
        String expectedHeaderFramesText = "Frames";
        Assert.assertEquals(actualHeaderFramesText, expectedHeaderFramesText,
                "\n Actual & Expected Header Text Doesn't Match \n");
    }

@Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindows().clickFramesMenuItem();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "\n Actual & Expected Text Doesn't Match \n");
        String actualHeaderFramesText = framesPage.getHeaderFramesText();
        String expectedHeaderFramesText = "Frames";
        Assert.assertEquals(actualHeaderFramesText, expectedHeaderFramesText,
                "\n Actual & Expected Header Text Doesn't Match \n");
    }
}
