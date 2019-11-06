package stepsShrimps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import util.Properties;

import java.util.List;

public class ShrimpsStepDefs {
    WebDriver driver;

    public static char getLetter(int dec) {

        char letter = '@';
        if (dec == 7) {
            letter = '7';
        }
        if (dec == 6) {
            letter = '6';
        }
        if (dec == 5) {
            letter = '5';
        }
        if (dec == 4) {
            letter = '4';
        }
        if (dec == 3) {
            letter = '3';
        }
        if (dec == 2) {
            letter = '2';
        }
        if (dec == 1) {
            letter = '1';
        }
        return letter;
    }

    public static String getXpath(WebElement element) {
        int n = element.findElements(By.xpath("./ancestor::*")).size();
        String path = "";
        WebElement current = element;
        for (int i = n; i > 0; i--) {
            String tag = current.getTagName();
            int lvl = current.findElements(By.xpath("./preceding-sibling::" + tag)).size() + 1;
            path = String.format("/%s[%d]%s", tag, lvl, path);
            current = current.findElement(By.xpath("./parent::*"));
        }
        return "/" + current.getTagName() + path;
    }

    @Given("soy un usuario de perfil bodeguero de la finca {string}")
    public void soy_un_usuario_de_perfil_bodeguero_de_la_finca(String string) {
        System.out.println(string);
    }

    @When("accedo a la URL raiz de la aplicacion y agregando el id {string}")
    public void accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_id(String string) {
        System.out.println(string);

    }

    @When("accedo a la URL raiz de la aplicacion y agregando el usuario {string} password {string} e id {string}")
    public void accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_usuario_password_e_id(String string, String string2, String string3) throws InterruptedException {


        System.setProperty(Properties.TIPO_DRIVER, Properties.CHROME_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.navigate().to("http://" + string + ":" + string2 + "@" + Properties.URL_ROOT_DEV + string3);
        Thread.sleep(10000);

        // de manera predeterminada aparece la vista por fecha, cambiamos a vista por Piscina
        //Control switch para conmutar vistas
        WebElement btnCambioVista=driver.findElement(By.xpath("//*[@id=\"toggle-b\"]"));
        btnCambioVista.click();
        Thread.sleep(10000);

        //1. Se presenta la vista por Piscina, validar recorrer cad una de las piscinas
        WebElement cboPiscina = driver.findElement(By.xpath("//*[@class='arrow-down']"));
        cboPiscina.click();

        //Obtener piscinas listadas
        List<WebElement> nroPiscinas = driver.findElements(By.xpath("//body//li"));
        System.out.println("Nro de piscinas: " + nroPiscinas.size());
        for (int i = 1; i <= nroPiscinas.size(); i++) {
            WebElement nombrePiscina = driver.findElement(By.xpath("//body//li[" + i + "]"));
            System.out.println(nombrePiscina.getText());

            Thread.sleep(1000);
            nombrePiscina.click();
            Thread.sleep(10000);
            //obtener el URl para ubicar el codigo de piscina
            String urlActivo = driver.getCurrentUrl();
            System.out.println("URL Activo: " + urlActivo);
            int iPosCodPiscinaInUrlActivo = urlActivo.indexOf("piscinas/");
            System.out.println(iPosCodPiscinaInUrlActivo);
            String codigoPiscina=urlActivo.substring(iPosCodPiscinaInUrlActivo+9,iPosCodPiscinaInUrlActivo+16);
            System.out.println("Codigo de Piscina obtenido: "+codigoPiscina);
            //Thread.sleep(10000000);
            if (i != nroPiscinas.size()) {
                cboPiscina.click();
            }
            //Aqui se visualiza la tabla de Datos Productivos
            // obtener cantidad de dias del ciclo
            List<WebElement> nroDiasCiclo = driver.findElements(By.xpath("/html/body/app-root/app-wrapper/app-details/div[1]/app-table/table[1]/tbody/tr"));
            System.out.println("Nro de dias del ciclo: " + nroDiasCiclo.size());

            // iterar por todas las celdas de la tabla
            for (int ii = 1; ii <= nroDiasCiclo.size(); ii++) {
                for (int jj = 1; jj <= 2; jj++) {
                    if (jj == 2) {
                        WebElement fechaActiva = driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-details/div[1]/app-table/table[1]/tbody/tr[" + ii + "]/td[" + (jj - 1) + "]"));
                        WebElement diaCiclo = driver.findElement(By.xpath("/html/body/app-root/app-wrapper/app-details/div[1]/app-table/table[1]/tbody/tr[" + ii + "]/td[" + jj + "]"));
                        //obtener el valor de la celda activa
                        System.out.println(fechaActiva.getText() + " - " + diaCiclo.getText());
                        //llamar a funcion validaDatosProductivos(fechaActiva,diaCiclo)

                    }
                }
            }
        }



        // Determinar el numero de filas de la vista por fecha
        // 1. cambiar la fecha
        WebElement cboFecha = driver.findElement(By.xpath("//*[@class='arrow-down']"));
        cboFecha.click();
        Thread.sleep(1000);

        // Obtener cuantas filas (piscinas) se visualizan
        List<WebElement> nroPiscinasX = driver.findElements(By.xpath("//div[@class='list-pools-container__datosProductivos']//tbody//tr"));
        System.out.println("Cantidad de piscinas: " + nroPiscinasX.size());

        WebElement fechaActual = driver.findElement(By.xpath("//span[@class='selected']"));

        //Obtener el xpath de la fecha actual
        String xpath = getXpath(fechaActual);
        StringBuilder sbXpath = new StringBuilder(xpath);
        System.out.println("XPATH Fecha actual: " + sbXpath);


        int iFechaActual = Integer.parseInt(fechaActual.getText());
        System.out.println("Fecha actual: " + iFechaActual);
        Thread.sleep(1000);
        //Obtener las posiciones de los valores de filas "tr" y columnas "td"
        int iPosRows = xpath.indexOf("tr[", 1);
        int iPosColumns = xpath.indexOf("td[", 1);

        System.out.println("Posicion Fila: " + iPosRows);
        System.out.println("Posicion Columna: " + iPosColumns);

        // Valores de coordenadas de la fecha actual
        char xFechaActual = xpath.charAt(iPosRows + 3);
        char yFechaActual = xpath.charAt(iPosColumns + 3);

        System.out.println("Coordenadas Fecha Actual " + "x = " + xFechaActual);
        System.out.println("Coordenadas Fecha Actual " + "y = " + yFechaActual);

       /* char x = '@';
        char y = '#';
        sbXpath.setCharAt(iPosRows + 3, x);
        sbXpath.setCharAt(iPosColumns + 3, y);

        System.out.println("NewXPATH " + sbXpath);*/

        // WebElement btnSiQuiero=driver.findElement(By.xpath("//button[@class='modal-beforeLeaving__btn-confirm']"));
        // WebElement btnNoQuiero=driver.findElement(By.xpath("//button[@class='modal-beforeLeaving__btn-nosave']"));


        WebElement fechaConsultada;
        boolean firstSiQuiero = false;
        int jInicial = Character.getNumericValue(yFechaActual);
        for (int i = Character.getNumericValue(xFechaActual); i > 0; i--) {
            for (int j = jInicial; j > 0; j--) {
                System.out.println("x: " + i);
                System.out.println("y: " + j);
                sbXpath.setCharAt(iPosRows + 3, getLetter(i));
                sbXpath.setCharAt(iPosColumns + 3, getLetter(j));
                System.out.println("Xpath para celda: " + sbXpath);
                fechaConsultada = driver.findElement(By.xpath(sbXpath.toString()));
                fechaConsultada.click();
                Thread.sleep(2000);


                /////Agregado
//                btnSiQuiero.click();
//                Thread.sleep(1000);
                ///Agregado

                WebElement alimentoDiario = driver.findElement(By.xpath("//div[@class='list-pools-container__datosProductivos']//tr[1]//td[1]//div[1]//div[1]//div[1]//input[1]"));
                alimentoDiario.click();
                alimentoDiario.sendKeys("1000");
                Thread.sleep(1000);
                alimentoDiario.sendKeys(Keys.TAB);

                WebElement tipoAlimento = driver.findElement(By.xpath("//*[@id=\"basic-link\"][1]"));
                tipoAlimento.click();
                Thread.sleep(1000);
                WebElement itemTipoAlimento = driver.findElement(By.xpath("//a[contains(text(),'CLA 35% 2.0 AD')]"));
                itemTipoAlimento.click();
                Thread.sleep(1000);
                tipoAlimento.sendKeys(Keys.TAB);

                WebElement pesoVivo = driver.findElement(By.xpath("//div[@class='list-pools-container__datosProductivos']//tr[1]//td[5]//div[1]//div[1]//div[1]//input[1]"));
                pesoVivo.sendKeys("10");
                Thread.sleep(1000);
                pesoVivo.sendKeys(Keys.TAB);

                WebElement supervivencia = driver.findElement(By.xpath("//tr[1]//td[9]//div[1]//div[1]//div[1]//input[1]"));
                supervivencia.sendKeys("90");
                Thread.sleep(1000);

                cboFecha.click();
                Thread.sleep(1000);

                if (j == 1) {
                    jInicial = 7;
                }
            }
        }


    }


}
