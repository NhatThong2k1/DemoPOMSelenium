package data;

import core.JsonHelper;
import org.testng.annotations.DataProvider;

public class ActionBlockData {
	@DataProvider(name = "DataFromJsonFile")
    public Object[][] dataFromJsonFile() {
     return  JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\Desktop\\AUT_JAVA\\bt_mau\\DemoSeleniumOnTap\\src\\main\\resources\\data.json");
		//return JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\eclipse-workspace\\POMMarcoAndroid\\src\\main\\resources\\testData.json");
    }
}
