package pages;

import util.Properties;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class AhorrosPage {
    WebDriver driver;

    public AhorrosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Txt Codigo UBER
    @FindBy(xpath = Properties.TXT_CODIGO_UBER_XPATH)
    public WebElement xpathTxtCodigoUber;


    public void setCodigoUber(String codigoUber) {
        xpathTxtCodigoUber.sendKeys(codigoUber);
        clickLblPaso1();
    }
    //Lbl Step1
    @FindBy(xpath = Properties.LBL_PASO_1_XPATH)
    public WebElement xpathLblPaso1;


    public void clickLblPaso1() {
        xpathLblPaso1.click();
    }

    // Select Tipo Documento
    @FindBy(xpath = Properties.SLC_TIPO_DOCUMENTO_XPATH)
    public WebElement xpathSlcTipoDocumento;

    public void selectTipoDocumento(String tipoDocumento) {
        xpathSlcTipoDocumento.sendKeys(tipoDocumento);
    }

    // Txt Numero Documento
    @FindBy(xpath = Properties.TXT_NUMERO_DOCUMENTO_XPATH)
    public WebElement xpathTxtNumeroDocumento;
    public void setNumeroDocumento(String numeroDocumento) {
        xpathTxtNumeroDocumento.sendKeys(numeroDocumento);
    }

    // Txt Nombres
    @FindBy(xpath = Properties.TXT_NOMBRES_XPATH)
    public WebElement xpathTxtNombres;
    public void setNombres(String nombres) {
        xpathTxtNombres.sendKeys(nombres);
    }

    // Txt Apellido Paterno
    @FindBy(xpath = Properties.TXT_APELLIDO_PATERNO_XPATH)
    public WebElement xpathTxtApellidoPaterno;
    public void setApellidoPaterno(String apellidoPaterno) {
        xpathTxtApellidoPaterno.sendKeys(apellidoPaterno);
    }

    // Txt Apellido Materno
    @FindBy(xpath = Properties.TXT_APELLIDO_MATERNO_XPATH)
    public WebElement xpathTxtApellidoMaterno;
    public void setApellidoMaterno(String apellidoMaterno) {
        xpathTxtApellidoMaterno.sendKeys(apellidoMaterno);
    }

    // Select Departamento
    @FindBy(xpath = Properties.SLC_DEPARTAMENTO_XPATH)
    public WebElement xpathSlcDepartamento;

    public void selectDepartamento(String departamento) {
        xpathSlcDepartamento.sendKeys(departamento);
    }

    // Select Provincia
    @FindBy(xpath = Properties.SLC_PROVINCIA_XPATH)
    public WebElement xpathSlcProvincia;

    public void selectProvincia(String provincia) {
        xpathSlcProvincia.sendKeys(provincia);
    }

    // Select Distrito
    @FindBy(xpath = Properties.SLC_DISTRITO_XPATH)
    public WebElement xpathSlcDistrito;

    public void selectDistrito(String distrito) {
        xpathSlcDistrito.sendKeys(distrito);
    }

    // Txt Direccion
    @FindBy(xpath = Properties.TXT_DIRECCION_XPATH)
    public WebElement xpathTxtDireccion;
    public void setDireccion(String direccion) {
        xpathTxtDireccion.sendKeys(direccion);
    }

    // Select Ocupacion
    @FindBy(xpath = Properties.SLC_OCUPACION_XPATH)
    public WebElement xpathSlcOcupacion;

    public void selectOcupacion(String ocupacion) {
        xpathSlcOcupacion.sendKeys(ocupacion);
    }

    // Txt Celular
    @FindBy(xpath = Properties.TXT_CELULAR_XPATH)
    public WebElement xpathTxtCelular;
    public void setCelular(String celular) {
        xpathTxtCelular.sendKeys(celular);
    }

    // Select Nacionalidad
    @FindBy(xpath = Properties.SLC_NACIONALIDAD_XPATH)
    public WebElement xpathSlcNacionalidad;

    public void selectNacionalidad(String nacionalidad) {
        xpathSlcNacionalidad.sendKeys(nacionalidad);
    }

    // Txt Email
    @FindBy(xpath = Properties.TXT_EMAIL_XPATH)
    public WebElement xpathTxtEmail;
    public void setEmail(String email) {
        xpathTxtEmail.sendKeys(email);
    }

    // Radio Cargo Publico Si
    @FindBy(xpath = Properties.RBT_CARGO_PUBLICO_SI_XPATH)
    public WebElement xpathRbtCargoPublicoSi;
    public void clickCargoPublicoSi() {
        xpathRbtCargoPublicoSi.click();
    }

    // Select Horario Llamada
    @FindBy(xpath = Properties.SLC_HORARIO_LLAMADA_XPATH)
    public WebElement xpathSlcHorarioLlamada;

    public void selectHorarioLlamada(String horarioLlamada) {
        xpathSlcHorarioLlamada.sendKeys(horarioLlamada);
    }

    // Chk Acepto Terminos y Condiciones
    @FindBy(xpath = Properties.CHK_ACEPTO_TERMINOS_CONDICIONES_XPATH)
    public WebElement xpathChkAceptoTerminosCondiciones;
    public void clickAceptoTerminosCondiciones() {
        xpathChkAceptoTerminosCondiciones.click();
    }

    // Btn Enviar
    @FindBy(xpath = Properties.BTN_ENVIAR_XPATH)
    public WebElement xpathBtnEnviar;
    public void clickBtnEnviar() {
        xpathBtnEnviar.click();
    }

    // Rbt CRS Si
    @FindBy(xpath = Properties.RBT_CRS_SI_XPATH)
    public WebElement xpathRbtCRSSi;
    public void clickCRSSi() {
        xpathRbtCRSSi.click();
    }

    // Rbt CRS No
    @FindBy(xpath = Properties.RBT_CRS_NO_XPATH)
    public WebElement xpathRbtCRSNo;
    public void clickCRSNo() {
        xpathRbtCRSNo.click();
    }

    // Chk DDJJ
    @FindBy(xpath = Properties.CHK_DDJJ_XPATH)
    public WebElement xpathChkDDJJ;
    public void clickDDJJ() {
        xpathChkDDJJ.click();
    }

    // Chk Distrito DNI
    @FindBy(xpath = Properties.CHK_DISTRITO_DNI_OK_XPATH)
    public WebElement xpathChkDistritoDNI;
    public void clickDistritoDNI() {
        xpathChkDistritoDNI.click();
    }


    // Btn Aceptar CRS
    @FindBy(xpath = Properties.BTN_ACEPTAR_CRS_XPATH)
    public WebElement xpathBtnAceptar;
    public void clickBtnAceptar() {
        xpathBtnAceptar.click();
    }


    // Mensaje de validacion: Sus datos han sido enviados con éxito
    @FindBy(xpath = Properties.MSG_AHORROS_OK_XPATH)
    public WebElement xpathMensajeAhorrosOK;


    public String getMsgAhorrosOK() throws InterruptedException {
        sleep(3000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + xpathMensajeAhorrosOK.getLocation().y + ")");
        xpathMensajeAhorrosOK.click();
        return xpathMensajeAhorrosOK.getText().trim();
    }

}