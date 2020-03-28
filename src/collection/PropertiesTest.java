package collection;

import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        String f = "setting.properties";
        Properties props = new Properties();
        props.load(new java.io.FileInputStream(f));

        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval", "120");

        System.out.println(filepath);
        System.out.println(interval);
    }
}
