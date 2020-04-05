package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {
    //why protected?bc we have 4 access modifiers:
    // private->to encapsulate variables/methods/constructors make everything invisible outside of the class
    //package private(default) visible within same package
    //protected visible within same package and in the child class
    //public visible everywhere

    protected WebDriver driver=Driver.getDriver();
    //waiti sadece burada initialize etmemiz lazim diger turlu our project will be messed it out.blow out!
    protected WebDriverWait wait =new WebDriverWait(driver,20);

    public AbstractBasePage(){
        //Page Object Model it's about elements that you have on the page, and how do you
        //store ..
        //this code will be executed immidiatetly if we have constructor whenever we have object created this code
        //will be execute it.kind of short cut. this method for having the FindBy annotation and we use it to
        // initialized elements
      PageFactory.initElements(Driver.getDriver(),this);
    }
}
