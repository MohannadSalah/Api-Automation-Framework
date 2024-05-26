package UsersTest.Data;

import org.testng.annotations.DataProvider;

public class dataProviders {

public dataProviders(){}
    public class DataProviderClass {
        @DataProvider(name = "userData")
        public Object[][] userData() {
            return new Object[][] {
                    {"Mostafa", "leader@gmail"},
                    {"Mahmoud", "chosen12@gmaail"},
                    {"trinity", "warrior@DataGmail"}
            };
        }
    }
}




