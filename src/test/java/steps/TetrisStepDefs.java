package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import pages.*;
import util.Properties;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ScreenShots;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static java.io.File.separator;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class TetrisStepDefs {
    Scenario scenario;
    WebDriver driver;
    String tipoOperacion = "";
    boolean noTieneCuenta = false;
    boolean validarError = false;
    boolean alternativo = false;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }


    /*@Given("soy un usuario de perfil bodeguero de la finca {string}")
    public void soy_un_usuario_de_perfil_bodeguero_de_la_finca(String string) {
        System.out.println("Primer paso, usuario de la finca " + string);
    }

    @When("accedo a la URL raiz de la aplicacion y agregando el id {string}")
    public void accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_id(String id) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            HomePage objHomePage = new HomePage(driver);
            System.out.println("STEP accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_id");
            driver = objHomePage.setup(id);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_id");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP accedo_a_la_URL_raiz_de_la_aplicacion_y_agregando_el_id");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("la aplicacion pide mi usuario {string} y password {string}")
    public void la_aplicacion_pide_mi_usuario_y_password(String string, String string2) throws FindFailed, AWTException, InterruptedException {
        System.out.println("Step ingreso de credenciales: "+string +" "+string2);
        // Login
        *//*try{
            System.out.println("A1");
            Screen s = new Screen();
            Pattern imgUser = new Pattern("src\\img\\txtUser.png");

            s.wait(imgUser, 8000);
            s.click(imgUser,0);
            s.type(string);
            System.out.println("A2");
        }catch(FindFailed e){
            System.out.println("ERROR ================================");
            e.printStackTrace();
        }*//*






    }*/


    @Then("deberia visualizar la cantidad correcta de piscinas de esta finca")
    public void deberia_visualizar_la_cantidad_correcta_de_piscinas_de_esta_finca() {

    }

    @When("bodeguero cambia a la vista por fecha")
    public void bodeguero_cambia_a_la_vista_por_fecha() {

    }

    @When("visualiza los datos por fecha para cada piscina")
    public void visualiza_los_datos_por_fecha_para_cada_piscina() {

    }


   /* @Given("Driver accede a la URL enviada a su celular y visualiza la Landing")
    public void driver_accede_a_la_URL_enviada_a_su_celular_y_visualiza_la_Landing() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            HomePage objHomePage = new HomePage(driver);
            System.out.println("STEP Driver accede a la URL enviada a su celular y visualiza la Landing");
            driver = objHomePage.setup();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver accede a la URL enviada a su celular y visualiza la Landing");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver accede a la URL enviada a su celular y visualiza la Landing");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }*/

   /* @After
    @When("Driver presiona el enlace Ahorros")
    public void driver_presiona_el_enlace_Ahorros() {
        tipoOperacion = "1";
        ScreenShots objScreenShots = new ScreenShots();
        try {
            HomePage homePage = new HomePage(driver);
            System.out.println("Metodo cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            homePage.clickLnkAhorros();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }*/

    /*@When("Driver presiona el enlace Creditos")
    public void driver_presiona_el_enlace_Creditos() {
        tipoOperacion = "2";
        ScreenShots objScreenShots = new ScreenShots();
        try {
            HomePage homePage = new HomePage(driver);
            System.out.println("STEP Driver presiona el enlace Creditos");
            homePage.clickLnkCreditos();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el enlace Creditos");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el enlace Creditos");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }*/

    /*@Then("Driver visualiza el formulario de Ahorros")
    public void cliente_visualiza_el_formulario_de_Ahorros() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza el formulario de Creditos")
    public void driver_visualiza_el_formulario_de_Creditos() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza el formulario de Creditos");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza el formulario de Creditos");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza el formulario de Creditos");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver presiona el boton Enterate como obtenerlo")
    public void driver_presiona_el_boton_Enterate_como_obtenerlo() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presiona el boton Enterate como obtenerlo");
            creditosPage.clickBtnEnterate();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Enterate como obtenerlo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Enterate como obtenerlo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el codigo UBER {string}")
    public void driver_ingresa_el_codigo_UBER(String codigoUber) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("STEP Driver ingresa el codigo UBER");
            ahorrosPage.setCodigoUber(codigoUber);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el codigo UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el codigo UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje de espera mientras Landing valida el codigo UBER")
    public void driver_visualiza_mensaje_de_espera_mientras_Landing_valida_el_codigo_UBER() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza mensaje de espera mientras Landing valida el codigo UBER");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de espera mientras Landing valida el codigo UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de espera mientras Landing valida el codigo UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona tipo de documento {string}")
    public void driver_selecciona_tipo_de_documento(String tipoDocumento) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.selectTipoDocumento(tipoDocumento);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.selectTipoDocumento(tipoDocumento);
            }
            System.out.println("STEP Driver selecciona tipo de documento");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona tipo de documento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso STEP Driver selecciona tipo de documento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }


    @When("Driver selecciona el tipo de Credito {string}")
    public void driver_selecciona_el_tipo_de_Credito(String tipoCredito) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona el tipo de Credito");
            creditosPage.selectTipoCredito(tipoCredito);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el tipo de Credito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el tipo de Credito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el monto {string}")
    public void driver_ingresa_el_monto(String monto) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el monto");
            creditosPage.setMonto(monto);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el monto");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el monto");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje de monto minimo permitido")
    public void driver_visualiza_mensaje_de_monto_minimo_permitido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje de monto minimo permitido");
            System.out.println("MENSAJE: " + creditos.getMsgMontoMinimo());
            assertTrue(creditos.getMsgMontoMinimo().equals(Properties.MSG_CREDITOS_MONTO_MIN), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de monto minimo permitido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de monto minimo permitido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa numero de documento {string}")
    public void driver_ingresa_numero_de_documento(String numeroDocumento) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setNumeroDocumento(numeroDocumento);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setNumeroDocumento(numeroDocumento);
            }
            System.out.println("STEP Driver ingresa numero de documento");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa numero de documento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa numero de documento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa sus nombres {string}")
    public void driver_ingresa_sus_nombres(String nombres) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setNombres(nombres);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setNombres(nombres);
            }
            System.out.println("STEP Driver ingresa sus nombres");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa su apellido paterno {string}")
    public void driver_ingresa_su_apellido_paterno(String apellidoPaterno) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setApellidoPaterno(apellidoPaterno);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setApellidoPaterno(apellidoPaterno);
            }
            System.out.println("STEP Driver ingresa su apellido paterno");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su apellido paterno");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su apellido paterno");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa su apellido materno {string}")
    public void driver_ingresa_su_apellido_materno(String apellidoMaterno) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setApellidoMaterno(apellidoMaterno);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setApellidoMaterno(apellidoMaterno);
            }
            System.out.println("STEP Driver ingresa su apellido materno");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su apellido materno");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso STEP Driver ingresa su apellido materno");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona departamento {string}")
    public void driver_selecciona_departamento(String departamento) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("STEP Driver selecciona departamento");
            ahorrosPage.selectDepartamento(departamento);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona departamento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona departamento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona provincia {string}")
    public void driver_selecciona_provincia(String provincia) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("STEP Driver selecciona provincia");
            ahorrosPage.selectProvincia(provincia);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona provincia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona provincia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona distrito {string}")
    public void driver_selecciona_distrito(String distrito) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("STEP Driver selecciona distrito");
            ahorrosPage.selectDistrito(distrito);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona distrito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona distrito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa direccion {string}")
    public void driver_ingresa_direccion(String direccion) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("STEP Driver ingresa direccion");
            ahorrosPage.setDireccion(direccion);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa direccion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso STEP Driver ingresa direccion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    //Canal Alternativo
    @When("Driver confirma que su domicilio es alquilado")
    public void driver_confirma_que_su_domicilio_es_alquilado() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver confirma que su domicilio es alquilado");
            creditos.clickChkDomicilioAlquilado();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma que su domicilio es alquilado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma que su domicilio es alquilado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    //Canal Alternativo
    @When("Driver selecciona su estado civil {string}")
    public void driver_selecciona_su_estado_civil(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.selectRelacion(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el nombre de su conviviente {string}")
    public void driver_ingresa_el_nombre_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.setTxtConvivienteNombre(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el apellido paterno de su conviviente {string}")
    public void driver_ingresa_el_apellido_paterno_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.setTxtConvivienteApPaterno(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el apellido Materno de su conviviente {string}")
    public void driver_ingresa_el_apellido_Materno_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.setTxtConvivienteApMaterno(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona el tipo de documento de su conviviente {string}")
    public void driver_selecciona_el_tipo_de_documento_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.setSlcConvivienteTipoDocumento(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el numero de documento de su conviviente {string}")
    public void driver_ingresa_el_numero_de_documento_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.setTxtConvivienteNroDocumento(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona el genero de su conviviente {string}")
    public void driver_selecciona_el_genero_de_su_conviviente(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona el genero de su conviviente");
            creditosPage.setSlcConvivienteGenero(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en Driver selecciona el genero de su conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en Driver selecciona el genero de su conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona ocupacion {string}")
    public void driver_selecciona_ocupacion(String ocupacion) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("Metodo cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            ahorrosPage.selectOcupacion(ocupacion);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Continuar del segundo formulario")
    public void driver_presiona_boton_Continuar_del_segundo_formulario() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Continuar del segundo formulario");
            creditos.clickForm2BtnContinuar();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar del segundo formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa nacionalidad {string}")
    public void driver_ingresa_nacionalidad(String nacionalidad) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.selectNacionalidad(nacionalidad);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.selectNacionalidad(nacionalidad);
            }
            System.out.println("STEP Driver ingresa nacionalidad");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa nacionalidad");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa nacionalidad");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("ingresa celular {string}")
    public void ingresa_celular(String celular) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setCelular(celular);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setCelular(celular);
            }
            System.out.println("STEP ingresa celular");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP ingresa celular");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP ingresa celular");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("ingresa correo {string}")
    public void ingresa_correo(String email) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.setEmail(email);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.setEmail(email);
            }
            System.out.println("STEP ingresa correo");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP ingresa correo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP ingresa correo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("confirma si tiene cargo publico {string}")
    public void confirma_si_tiene_cargo_publico(String cargoPublico) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("Metodo cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            if (cargoPublico.equalsIgnoreCase("Si")) {
                ahorrosPage.clickCargoPublicoSi();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("selecciona horario de llamada {string}")
    public void selecciona_horario_de_llamada(String horarioLlamada) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("Metodo selecciona_horario_de_llamada");
            ahorrosPage.selectHorarioLlamada(horarioLlamada);
            ahorrosPage.selectHorarioLlamada(Keys.TAB + "");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("acepta terminos y condiciones")
    public void acepta_terminos_y_condiciones() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.clickAceptoTerminosCondiciones();
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.clickAceptoTerminosCondiciones();
            }
            System.out.println("STEP acepta terminos y condiciones");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP acepta terminos y condiciones");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP acepta terminos y condiciones");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje revise los datos solicitados")
    public void driver_visualiza_mensaje_revise_los_datos_solicitados() {

    }

    @When("presiona boton Enviar")
    public void presiona_boton_Enviar() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("Metodo cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            ahorrosPage.clickBtnEnviar();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Solicitar prestamo")
    public void driver_presiona_boton_Solicitar_prestamo() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Solicitar prestamo");
            creditosPage.clickForm4BtnSolicitarPrestamo();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Solicitar prestamo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Solicitar prestamo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza la landing de MO")
    public void driver_visualiza_la_landing_de_MO() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza la landing de MO");
            creditosPage.clickLogoMO();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la landing de MO");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la landing de MO");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza un mensaje de espera")
    public void driver_visualiza_un_mensaje_de_espera() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza un mensaje de espera");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("STEP Driver visualiza un mensaje de espera");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("STEP Driver visualiza un mensaje de espera");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza popup con los documentos a preparar")
    public void driver_visualiza_popup_con_los_documentos_a_preparar() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza popup con los documentos a preparar");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza popup con los documentos a preparar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza popup con los documentos a preparar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza popup con las preguntas de la CRS")
    public void driver_visualiza_popup_con_las_preguntas_de_la_CRS() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
            }
            System.out.println("STEP Driver visualiza popup con las preguntas de la CRS");

            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza popup con las preguntas de la CRS");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza popup con las preguntas de la CRS");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }


    @Then("Driver selecciona respuesta para las tres preguntas {string}")
    public void driver_selecciona_respuesta_para_las_tres_preguntas(String respuestaCRS) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver selecciona respuesta para las tres preguntas");
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                if (respuestaCRS.equalsIgnoreCase("Sí")) {
                    ahorrosPage.clickCRSSi();
                } else {
                    ahorrosPage.clickCRSNo();
                }
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                if (respuestaCRS.equalsIgnoreCase("Sí")) {
                    creditosPage.clickCRSSi();
                } else {
                    creditosPage.clickCRSNo();
                }
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona respuesta para las tres preguntas");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona respuesta para las tres preguntas");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona pais {string} de acuerdo al CRS")
    public void driver_selecciona_pais_de_acuerdo_al_CRS(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza la segunda pantalla informativa");
            creditos.selectCRSPais(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa numero DOI {string}")
    public void driver_ingresa_numero_DOI(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza la segunda pantalla informativa");
            creditos.setDOI(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver confirma la informacion proporcionada como DDJJ")
    public void driver_confirma_la_informacion_proporcionada_como_DDJJ() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.clickDDJJ();
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.clickDDJJ();
            }
            System.out.println("STEP Driver confirma la informacion proporcionada como DDJJ");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma la informacion proporcionada como DDJJ");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma la informacion proporcionada como DDJJ");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver confirma de Distrito es la de su DNI")
    public void driver_confirma_de_Distrito_es_la_de_su_DNI() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            if (tipoOperacion.equalsIgnoreCase("1")) {
                AhorrosPage ahorrosPage = new AhorrosPage(driver);
                ahorrosPage.clickDistritoDNI();
            } else {
                CreditosPage creditosPage = new CreditosPage(driver);
                creditosPage.clickDistritoDNI();
            }
            System.out.println("STEP Driver confirma de Distrito es la de su DNI");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma de Distrito es la de su DNI");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma de Distrito es la de su DNI");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Aceptar del modal CRS")
    public void driver_presiona_boton_Aceptar_del_modal_CRS() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Aceptar del modal CRS");
            creditosPage.clickBtnAceptarCRS();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Aceptar del modal CRS");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Aceptar del modal CRS");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza tercer formulario")
    public void driver_visualiza_tercer_formulario() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver visualiza tercer formulario");
            CreditosPage creditosPage = new CreditosPage(driver);
            sleep(3000);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza tercer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza tercer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen frontal de DNI personal {string}")
    public void driver_adjunta_imagen_frontal_de_DNI_personal(String img) {
        alternativo = true;
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgDNIPersonalFrontal(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver adjunta imagen frontal de DNI personal");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI personal");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI personal");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen reverso de DNI personal {string}")
    public void driver_adjunta_imagen_reverso_de_DNI_personal(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgDNIPersonalReverso(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver adjunta imagen frontal de DNI personal");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI personal");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI personal");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen frontal de DNI Conyugue o Conviviente {string}")
    public void driver_adjunta_imagen_frontal_de_DNI_Conyugue_o_Conviviente(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen frontal de DNI Conyugue o Conviviente");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgDNIConvivienteFrontal(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI Conyugue o Conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen frontal de DNI Conyugue o Conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen reverso de DNI Conyugue o Conviviente {string}")
    public void driver_adjunta_imagen_reverso_de_DNI_Conyugue_o_Conviviente(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen reverso de DNI Conyugue o Conviviente");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgDNIConvivienteReverso(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen reverso de DNI Conyugue o Conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen reverso de DNI Conyugue o Conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen de ultimo recibo de servicios {string}")
    public void driver_adjunta_imagen_de_ultimo_recibo_de_servicios(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen de ultimo recibo de servicios");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgReciboServicio(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen de ultimo recibo de servicios");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen de ultimo recibo de servicios");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen del plan de celular {string}")
    public void driver_adjunta_imagen_del_plan_de_celular(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen del plan de celular");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgReciboCelular(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen del plan de celular");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen del plan de celular");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen balance de carreras semanales semana actual {string}")
    public void driver_adjunta_imagen_balance_de_carreras_semanales_semana_actual(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen balance de carreras semanales semana actual");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgGananciaSemanaActual(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semanales semana actual");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semanales semana actual");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen balance de carreras semanales semana anterior {string}")
    public void driver_adjunta_imagen_balance_de_carreras_semanales_semana_anterior(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen balance de carreras semanales semana anterior");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgGananciaSemanaAnterior(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semanales semana anterior");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semanales semana anterior");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta imagen de tarjeta de propiedad {string}")
    public void driver_adjunta_imagen_de_tarjeta_de_propiedad(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta imagen de tarjeta de propiedad");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgTarjetaPropiedad(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen de tarjeta de propiedad");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen de tarjeta de propiedad");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver adjunta archivo de SOAT vigente {string}")
    public void driver_adjunta_archivo_de_SOAT_vigente(String img) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver adjunta archivo de SOAT vigente");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickImgSoatVigente(img);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta archivo de SOAT vigente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta archivo de SOAT vigente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver selecciona el horario de llamada {string}")
    public void driver_selecciona_el_horario_de_llamada(String horarioLlamada) {
        noTieneCuenta = true;
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver selecciona el horario de llamada");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.slcHorarioLlamada(horarioLlamada);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el horario de llamada");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el horario de llamada");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Solicitar prestamo del tercer formulario")
    public void driver_presiona_boton_Solicitar_prestamo_del_tercer_formulario() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver presiona boton Solicitar prestamo del tercer formulario");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickBtnSolicitarPrestamoTercerForm(noTieneCuenta);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Solicitar prestamo del tercer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Solicitar prestamo del tercer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza un mensaje de revision de solicitud")
    public void driver_visualiza_un_mensaje_de_revision_de_solicitud() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza un mensaje de revision de solicitud");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza un mensaje de revision de solicitud");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza un mensaje de revision de solicitud");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza un mensaje de Casi Listo con la opcion de Apertura de Cuenta de Ahorros")
    public void driver_visualiza_un_mensaje_de_Casi_Listo_con_la_opcion_de_Apertura_de_Cuenta_de_Ahorros() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza un mensaje de Casi Listo con la opcion de Apertura de Cuenta de Ahorros");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza un mensaje de Casi Listo con la opcion de Apertura de Cuenta de Ahorros");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza un mensaje de Casi Listo con la opcion de Apertura de Cuenta de Ahorros");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver presiona el boton Abrir mi cuenta de ahorros")
    public void driver_presiona_el_boton_Abrir_mi_cuenta_de_ahorros() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver presiona el boton Abrir mi cuenta de ahorros");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickBtnAbrirCuentaAhorros();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Abrir mi cuenta de ahorros");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Abrir mi cuenta de ahorros");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver presiona el boton entendido")
    public void driver_presional_el_boton_entendido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            System.out.println("STEP Driver presiona el boton entendido");
            CreditosPage creditosPage = new CreditosPage(driver);
            creditosPage.clickBtnEntendido();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton entendido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton entendido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Aceptar")
    public void driver_presiona_boton_Aceptar() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Aceptar");
            creditosPage.clickBtnDocumentosPreparar();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Aceptar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso STEP Driver presiona boton Aceptar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje de felicitaciones con su nombre")
    public void driver_visualiza_mensaje_de_felicitaciones_con_su_nombre() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            objScreenShots.capturar_pantalla_json(scenario, driver);
            System.out.println("STEP Driver visualiza mensaje de felicitaciones con su nombre");
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de felicitaciones con su nombre");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de felicitaciones con su nombre");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona el tipo de domicilio {string}")
    public void driver_selecciona_el_tipo_de_domicilio(String tipoDomicilio) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona el tipo de domicilio");
            creditosPage.selectTipoDomicilio(tipoDomicilio);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el tipo de domicilio");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona el tipo de domicilio");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona pais {string}")
    public void driver_selecciona_pais(String pais) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona pais");
            creditosPage.selectPais(pais);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona pais");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona pais");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona relacion {string}")
    public void driver_selecciona_relacion(String relacion) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona relacion");
            creditosPage.selectRelacion(relacion);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona relacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver confirma si tiene cargo publico {string}")
    public void driver_confirma_si_tiene_cargo_publico(String cargoPublico) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver confirma si tiene cargo publico");
            if (cargoPublico.equalsIgnoreCase("Sí")) {
                creditosPage.clickRbtCargoPublicoSi();
            } else {
                creditosPage.clickRbtCargoPublicoNo();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma si tiene cargo publico");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver confirma si tiene cargo publico");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona tipo de documento de conviviente {string}")
    public void driver_selecciona_tipo_de_documento_de_conviviente(String tipoDocumentoConviviente) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona tipo de documento de conviviente");
            creditosPage.selectTipoDocumentoConviviente(tipoDocumentoConviviente);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona tipo de documento de conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona tipo de documento de conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa numero de documento de conviviente {string}")
    public void driver_ingresa_numero_de_documento_de_conviviente(String numeroDocumentoConviviente) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa numero de documento de conviviente");
            creditosPage.setNroDocumentoConviviente(numeroDocumentoConviviente);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa numero de documento de conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa numero de documento de conviviente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa sus nombres de primera referencia {string}")
    public void driver_ingresa_sus_nombres_de_primera_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa sus nombres de primera referencia");
            creditosPage.setNombresRef1(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa los apellidos de primera referencia {string}")
    public void driver_ingresa_los_apellidos_de_primera_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa los apellidos de primera referencia");
            creditosPage.setApellidosRef1(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa los apellidos de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa los apellidos de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa celular de primera referencia {string}")
    public void driver_ingresa_celular_de_primera_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa celular de primera referencia");
            creditosPage.setCelularRef1(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa celular de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa celular de primera referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa sus nombres de segunda referencia {string}")
    public void driver_ingresa_sus_nombres_de_segunda_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa sus nombres de segunda referencia");
            creditosPage.setNombresRef2(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa sus nombres de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa los apellidos de segunda referencia {string}")
    public void driver_ingresa_los_apellidos_de_segunda_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa los apellidos de segunda referencia");
            creditosPage.setApellidosRef2(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa los apellidos de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa los apellidos de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa celular de segunda referencia {string}")
    public void driver_ingresa_celular_de_segunda_referencia(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa celular de segunda referencia");
            creditosPage.setCelularRef2(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa celular de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa celular de segunda referencia");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presionar el boton Siguiente")
    public void driver_presionar_el_boton_Siguiente() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presionar el boton Siguiente");
            creditosPage.clickBtnSiguiente();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presionar el boton Siguiente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presionar el boton Siguiente");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }


    @Then("Driver visualiza un mensaje de confirmacion")
    public void driver_visualiza_un_mensaje_de_confirmacion() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorrosPage = new AhorrosPage(driver);
            System.out.println("Metodo driver_visualiza_un_mensaje_de_confirmacion");
            ahorrosPage.getMsgAhorrosOK();
            System.out.println("MENSAJE: " + ahorrosPage.getMsgAhorrosOK());
            assertTrue(ahorrosPage.getMsgAhorrosOK().equals(Properties.MSG_AHORROS_OK), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en paso cliente_ingresa_al_HomeBanking_del_ambiente_de_y_visualiza_el_Login");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    //Creditos
    @Then("Driver presiona el boton Solicitar mi prestamo")
    public void driver_presiona_el_boton_Solicitar_mi_prestamo() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver presiona el boton Solicitar mi prestamo");
            //creditosPage.clickBtnSolicitarPrestamo();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Solicitar mi prestamo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona el boton Solicitar mi prestamo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    ////CAMBIOS FORMULARIOS ACTUALIZADOS
    @When("Driver selecciona su genero {string}")
    public void driver_selecciona_su_genero(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditosPage = new CreditosPage(driver);
            System.out.println("STEP Driver selecciona su genero");
            creditosPage.selectGenero(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona su genero");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona su genero");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver selecciona su ocupacion {string}")
    public void driver_selecciona_su_ocupacion(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            AhorrosPage ahorros = new AhorrosPage(driver);
            System.out.println("STEP Driver selecciona su ocupacion");
            ahorros.selectOcupacion(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona su ocupacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver selecciona su ocupacion");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver presiona boton Continuar del primer formulario")
    public void driver_presiona_boton_Continuar_del_primer_formulario() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Continuar del primer formulario");
            if (validarError) {
                creditos.clickForm1BtnContinuarNoWait();
            } else {
                creditos.clickForm1BtnContinuar();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar del primer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar del primer formulario");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Todos los campos son obligatorios")
    public void driver_visualiza_mensaje_Todos_los_campos_son_obligatorios() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje Todos los campos son obligatorios");
            assertTrue(creditos.getMsgDatosObligatorios().equals(Properties.MSG_CREDITOS_DATOS_OBLIGATORIOS), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de monto minimo permitido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje de monto minimo permitido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Seleccione tipo de credito")
    public void driver_visualiza_mensaje_Seleccione_tipo_de_credito() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje Seleccione tipo de credito");
            assertTrue(creditos.getMsgTipoCredito().equals(Properties.MSG_CREDITOS_TIPO_CREDITO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Seleccione tipo de credito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Seleccione tipo de credito");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Monto de credito a solicitar es requerido.")
    public void driver_visualiza_mensaje_Monto_de_credito_a_solicitar_es_requerido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP visualiza mensaje Monto de credito a solicitar es requerido");
            assertTrue(creditos.getMsgMonto().equals(Properties.MSG_CREDITOS_MONTO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP visualiza mensaje Monto de credito a solicitar es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP visualiza mensaje Monto de credito a solicitar es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje El monto mínimo solicitado")
    public void driver_visualiza_mensaje_El_monto_mínimo_solicitado() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP visualiza mensaje Monto de credito a solicitar es requerido");
            assertTrue(creditos.getMsgMonto().equals(Properties.MSG_CREDITOS_MONTO_MINIMO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP visualiza mensaje Monto de credito a solicitar es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP visualiza mensaje Monto de credito a solicitar es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Código UBER es requerido")
    public void driver_visualiza_mensaje_Código_UBER_es_requerido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje Código UBER es requerido\"");
            assertTrue(creditos.getMsgCodigoUber().equals(Properties.MSG_CREDITOS_CODUBER_REQUERIDO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código UBER es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código UBER es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Código UBER es corto")
    public void driver_visualiza_mensaje_Código_UBER_es_corto() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje Código UBER es requerido\"");
            assertTrue(creditos.getMsgCodigoUber().equals(Properties.MSG_CREDITOS_CODUBER_CORTO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código UBER es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código UBER es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Codigo invalido")
    public void driver_visualiza_mensaje_Codigo_invalido() {
        validarError = true;
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje Codigo invalido");
            assertTrue(creditos.getMsgCodigoUberInv().equals(Properties.MSG_CREDITOS_CODUBER_INVALIDO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Codigo invalido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Codigo invalido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado.")
    public void driver_visualiza_mensaje_Código_Uber_inválido_por_favor_revise_el_Código_utilizado() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            assertTrue(creditos.getMsgModalCodigoUberInvalido().equals(Properties.MSG_CREDITOS_MODAL_CODUBER_INVALIDO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje tipo de documento es requerido")
    public void driver_visualiza_mensaje_tipo_de_documento_es_requerido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            assertTrue(creditos.getMsgTipoDocumento().equals(Properties.MSG_CREDITOS_TIPO_DOCUMENTO_REQUERIDO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje numero de documento es requerido")
    public void driver_visualiza_mensaje_numero_de_documento_es_requerido() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("Driver visualiza mensaje numero de documento es requerido");
            assertTrue(creditos.getMsgTipoDocumento().equals(Properties.MSG_CREDITOS_TIPO_DOCUMENTO_REQUERIDO), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje numero de documento es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje numero de documento es requerido");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver visualiza mensaje No cuentas con requisitos para acceder")
    public void driver_visualiza_mensaje_No_cuentas_con_requisitos_para_acceder() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza mensaje No cuentas con requisitos para acceder");
            assertTrue(creditos.getMsgBaseNegativa().equals(Properties.MSG_CREDITOS_ESTA_EN_BN), "No se muestra el mensaje esperado");
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje No cuentas con requisitos para acceder");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza mensaje No cuentas con requisitos para acceder");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    //Canal Alternativo - MiBanco
    @When("Driver presiona boton Aceptar del modal Continua tu Solicitud")
    public void driver_presiona_boton_Aceptar_del_modal_Continua_tu_Solicitud() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Aceptar del modal Continua tu Solicitud");
            creditos.clickBtnDocPreparar();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Aceptar del modal Continua tu Solicitud");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Aceptar del modal Continua tu Solicitud");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    // Canal Digital MO
    @When("Driver visualiza la primera pantalla informativa")
    public void driver_visualiza_la_primera_pantalla_informativa() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza la primera pantalla informativa");
            creditos.clickBtnSiguiente1();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la primera pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la primera pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver visualiza la segunda pantalla informativa")
    public void driver_visualiza_la_segunda_pantalla_informativa() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver visualiza la segunda pantalla informativa");
            creditos.clickBtnSiguiente1();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver visualiza la segunda pantalla informativa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver visualiza la segunda pantalla de la Landing MB")
    public void driver_visualiza_la_segunda_pantalla_de_la_Landing_MB() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Driver ingresa su fecha de inicio en UBER")
    public void driver_ingresa_su_fecha_de_inicio_en_UBER() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa su fecha de inicio en UBER");
            creditos.clickTxtFechaInicioUber();
            creditos.clickBtnAnio();
            creditos.clickBtnMes();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su fecha de inicio en UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su fecha de inicio en UBER");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa su fecha de nacimiento")
    public void driver_ingresa_su_fecha_de_nacimiento() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa su fecha de nacimiento");
            creditos.clickTxtFechaNacimiento();
//            creditos.clickBtnPrev();
//            creditos.clickBtn99();
//            creditos.clickBtnEne();
//            creditos.clickBtn1Ene();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su fecha de nacimiento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa su fecha de nacimiento");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa la marca del vehiculo {string}")
    public void driver_ingresa_la_marca_del_vehiculo(String marca) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa la marca del vehiculo");
            creditos.setMarca(marca);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa la marca del vehiculo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa la marca del vehiculo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa selecciona el año de su vehiculo {string}")
    public void driver_ingresa_selecciona_el_año_de_su_vehiculo(String anioFab) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa selecciona el año de su vehiculo");
            creditos.setAnioFab(anioFab);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa selecciona el año de su vehiculo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa selecciona el año de su vehiculo");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el numero de placa {string}")
    public void driver_ingresa_el_numero_de_placa(String placa) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el numero de placa");
            creditos.setPlaca(placa);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver confirma que el vehiculo no es propio")
    public void driver_confirma_que_el_vehiculo_no_es_propio() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el numero de placa");
            creditos.clickChkVehiculoNoPropio();
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el nombre del propietario {string}")
    public void driver_ingresa_el_nombre_del_propietario(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el numero de placa");
            creditos.setTxtNombrePropietario(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa lso apellidos del propietario {string}")
    public void driver_ingresa_lso_apellidos_del_propietario(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el numero de placa");
            creditos.setTxtApellidosPropietario(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver ingresa el celular del propietario {string}")
    public void driver_ingresa_el_celular_del_propietario(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver ingresa el numero de placa");
            creditos.setTxtCelularPropietario(string);
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver ingresa el numero de placa");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }


    @When("Driver visualiza la tercera pantalla de la Landing MB")
    public void driver_visualiza_la_tercera_pantalla_de_la_Landing_MB() {

    }

    @When("Driver adjunta imagen balance de carreras semana actual {string}")
    public void driver_adjunta_imagen_balance_de_carreras_semana_actual(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver adjunta imagen balance de carreras semana actual");
            if (alternativo) {
                creditos.clickImgGananciaSemanaActual(string);
            } else {
                System.out.println("ENTRANDO AL CANAL DIGITAL");
                creditos.clickImgGananciaSemanaActualMO(string);
            }

            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semana actual");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver adjunta imagen balance de carreras semana anterior {string}")
    public void driver_adjunta_imagen_balance_de_carreras_semana_anterior(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver adjunta imagen balance de carreras semana anterior");
            if (alternativo) {
                creditos.clickImgGananciaSemanaAnterior(string);
            } else {
                System.out.println("Click imagen para MO");
                creditos.clickImgGananciaSemanaAnteriorMO(string);
            }

            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semana anterior");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver adjunta imagen balance de carreras semana anterior");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver presiona boton Continuar del tercer formulario")
    public void driver_presiona_boton_Continuar_del_tercer_formulario() {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver presiona boton Continuar");
            if (alternativo) {
                creditos.clickForm2BtnContinuar();
            } else {
                creditos.clickForm3BtnContinuar();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver presiona boton Continuar");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales {string}")
    public void driver_autoriza_a_Mibanco_para_que_pueda_compartir_con_MO_sus_datos_personales(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales");
            if (string.equalsIgnoreCase("Si")) {
                creditos.clickRbtCompartirMB_Si();
            } else {
                creditos.clickRbtCompartirMB_No();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @Then("Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales {string}")
    public void driver_autoriza_a_MO_para_que_pueda_compartir_con_Mibanco_sus_datos_personales(String string) {
        ScreenShots objScreenShots = new ScreenShots();
        try {
            CreditosPage creditos = new CreditosPage(driver);
            System.out.println("STEP Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales");
            if (string.equalsIgnoreCase("Si")) {
                creditos.clickRbtCompartirMO_Si();
            } else {
                creditos.clickRbtCompartirMO_No();
            }
            objScreenShots.capturar_pantalla_json(scenario, driver);
        } catch (NotFoundException e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        } catch (Exception e) {
            System.out.println("***********************************");
            System.out.println("SE OBTUVO ERROR en STEP Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales");
            System.out.println(e.getMessage());
            System.out.println("***********************************");
            Assert.fail();
            objScreenShots.capturar_pantalla_json(scenario, driver);
            driver.quit();
        }
    }

    @When("Driver visualiza la cuarta pantalla de la Landing MB")
    public void driver_visualiza_la_cuarta_pantalla_de_la_Landing_MB() {

    }

    @When("Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales")
    public void driver_autoriza_a_Mibanco_para_que_pueda_compartir_con_MO_sus_datos_personales() {

    }

    @When("Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales")
    public void driver_autoriza_a_MO_para_que_pueda_compartir_con_Mibanco_sus_datos_personales() {

    }

    @When("Driver visualiza el formulario de MO Crear Cuenta")
    public void driver_visualiza_el_formulario_de_MO_Crear_Cuenta() {
        System.out.println("HOLAAAAA");
    }*/
}
