import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW15 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://ya.ru");

        String titleYandex = driver.getTitle();
        if(titleYandex == "Яндекс — быстрый поиск в интернете") {
            System.out.println("good");
        }else {
            System.out.println("not good");
            System.out.println(titleYandex);
        }
        driver.quit();
    }
}
