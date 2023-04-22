package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SmoothSolarBasePage {

    public SmoothSolarBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "comp-kpmn9sqkitemsContainer")
    public List<WebElement> headerHomePageOptions;
}
