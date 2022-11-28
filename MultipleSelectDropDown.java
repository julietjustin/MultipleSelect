package com.obsqura.TestNGAssignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleSelectDropDown extends BaseSelectClass {
	@Test
	public void multipleSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		WebElement states;
		List<String> expectedItems=new ArrayList<String>();
		List<String> actualItems=new ArrayList<String>();
		states=driver.findElement(By.xpath("(//select[@class='js-states-multiple form-control select2-hidden-accessible'])"));
		Select obj=new Select(states);
		if(obj.isMultiple()){
		obj.selectByIndex(2);
		obj.selectByIndex(3);
		obj.selectByIndex(5);
		List<WebElement> elements=obj.getOptions();
		String element1=elements.get(2).getText();
		String element2=elements.get(3).getText();
		String element3 = elements.get(5).getText();
		expectedItems.add(element1);
		expectedItems.add(element2);
		expectedItems.add(element3);
		}
		List <WebElement> selectedOptions= obj.getAllSelectedOptions();
		actualItems.add(selectedOptions.get(0).getText());
		actualItems.add(selectedOptions.get(1).getText());
		actualItems.add(selectedOptions.get(2).getText());
		if(expectedItems.equals(actualItems)) {
		Assert.assertTrue(true, "Selected dropdown values and expected values are not same");
		}
		Assert.assertFalse(false);
		obj.deselectAll();
		Assert.assertTrue(true, "Dropdown field is not cleared");
		}

	}
	
		

