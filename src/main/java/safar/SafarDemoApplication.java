package safar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class SafarDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SafarDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(System.getProperty("user.home"));
        File file = Paths.get(System.getProperty("user.home")
                + "/data.txt").toFile();
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis.available());
    }
}
