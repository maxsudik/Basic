package Config;

import main.java.FirstTest;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties prop = new Properties();


    public static void main(String[] args){

        readPropertiesFile();
        writePropertiesFile();

    }


    public static void readPropertiesFile(){

        try {
            InputStream input = new FileInputStream("src/Config/Config.properties");
            prop.load(input);
            FirstTest.browser = prop.getProperty("browser");
            System.out.println(FirstTest.browser);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writePropertiesFile(){
        try {

            OutputStream output = new FileOutputStream("src/Config/Config.properties");
            prop.setProperty("result", "pass");
            prop.store(output, null);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

