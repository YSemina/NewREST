package db;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    private final Properties PROPERTIES;

    public ConfigLoader() {
        var resourcePath = "dbconfig.properties";
        PROPERTIES = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(resourcePath)) {
            if (input == null) {
                throw new RuntimeException("Configuration file not found: " + resourcePath);
            }
            PROPERTIES.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + resourcePath, e);
        }
    }

    public String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
