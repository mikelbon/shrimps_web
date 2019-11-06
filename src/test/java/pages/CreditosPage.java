package pages;

import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.*;
import org.sikuli.script.Pattern;

import static java.io.File.separator;
import static java.lang.Thread.sleep;

public class CreditosPage {
    WebDriver driver;
    boolean iniciador=false;
    public CreditosPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Btn Solicitar Prestamo
    @FindBy(xpath = Properties.BTN_ENTERATE_COMO_OBTENERLO_XPATH)
    public WebElement xpathBtnSolicitarPrestamo;

    public void clickBtnEnterate() {
        xpathBtnSolicitarPrestamo.click();
    }

    // Select Tipo Credito
    @FindBy(xpath = Properties.SLC_TIPO_CREDITO_XPATH)
    public WebElement xpathSlcTipoCredito;

    public void selectTipoCredito(String tipoCredito) {
        xpathSlcTipoCredito.sendKeys(tipoCredito);
        xpathSlcTipoCredito.sendKeys(Keys.TAB);
    }

    // Txt Monto
    @FindBy(xpath = Properties.TXT_MONTO_XPATH)
    public WebElement xpathTxtMonto;

    public void setMonto(String monto) {
        xpathTxtMonto.sendKeys(monto);
        xpathTxtMonto.sendKeys(Keys.TAB);
    }

    // Select Tipo Documento
    @FindBy(xpath = Properties.SLC_TIPO_DOCUMENTO_XPATH)
    public WebElement xpathSlcTipoDocumento;

    public void selectTipoDocumento(String tipoDocumento) {
        xpathSlcTipoDocumento.sendKeys(tipoDocumento);
        xpathSlcTipoDocumento.sendKeys(Keys.TAB);
    }

    // Txt Numero Documento
    @FindBy(xpath = Properties.TXT_NUMERO_DOCUMENTO_XPATH)
    public WebElement xpathTxtNumeroDocumento;

    public void setNumeroDocumento(String numDocumento) throws InterruptedException {
        xpathTxtNumeroDocumento.sendKeys(numDocumento);
        xpathTxtNumeroDocumento.sendKeys(Keys.TAB);
        Thread.sleep(3000);
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

    // Select Tipo Credito
    @FindBy(xpath = Properties.SLC_GENERO_XPATH)
    public WebElement xpathSlcGenero;

    public void selectGenero(String genero) {
        xpathSlcGenero.sendKeys(genero);
    }

    // Txt Email
    @FindBy(xpath = Properties.TXT_EMAIL_XPATH)
    public WebElement xpathTxtEmail;

    public void setEmail(String email) {
        xpathTxtEmail.sendKeys(email);
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

    // Chk Acepto Terminos y Condiciones
    @FindBy(xpath = Properties.CHK_ACEPTO_TERMINOS_CONDICIONES_XPATH)
    public WebElement xpathChkAceptoTerminosCondiciones;

    public void clickAceptoTerminosCondiciones() throws InterruptedException {
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + xpathChkAceptoTerminosCondiciones.getLocation().y + ")");
        xpathChkAceptoTerminosCondiciones.click();
    }

    // Btn Solicitar Prestamo
    @FindBy(xpath = Properties.BTN_SOLICITAR_PRESTAMO_FORM1_XPATH)
    public WebElement xpathBtnSolicitarPrestamoForm1;

    public void clickBtnSolicitarPrestamoForm1() {
        xpathBtnSolicitarPrestamoForm1.click();
    }

    // Btn Documentos a Preparar
    @FindBy(xpath = Properties.BTN_MODAL_FORM1_FORM2)
    public WebElement xpathBtnDocumentosPreparar;

    public void clickBtnDocumentosPreparar() throws InterruptedException {
        Thread.sleep(5000);
        xpathBtnDocumentosPreparar.click();
    }

    // Canal Alternativo Btn Documentos a Preparar
    @FindBy(xpath = Properties.BTN_ALTERNATIVO_FORM1_FORM2)
    public WebElement xpathBtnDocPreparar;

    public void clickBtnDocPreparar() throws InterruptedException {
        Thread.sleep(15000);
        xpathBtnDocPreparar.click();
    }

    //Formulario 2
    // Select Tipo Domicilio
    @FindBy(xpath = Properties.SLC_TIPO_DOMICILIO_XPATH)
    public WebElement xpathSlcTipoDomicilio;

    public void selectTipoDomicilio(String tipoDomicilio) {
        xpathSlcTipoDomicilio.sendKeys(tipoDomicilio);
    }

    // Txt Direccion
    @FindBy(xpath = Properties.TXT_DIRECCION_XPATH)
    public WebElement xpathTxtDireccion;

    public void setDireccion(String direccion) {
        xpathTxtDireccion.sendKeys(direccion);
    }

    // Select Distrito
    @FindBy(xpath = Properties.SLC_DISTRITO_XPATH)
    public WebElement xpathSlcDistrito;

    public void selectDistrito(String distrito) {
        xpathSlcDistrito.sendKeys(distrito);
    }

    // Select Provincia
    @FindBy(xpath = Properties.SLC_PROVINCIA_XPATH)
    public WebElement xpathSlcProvincia;

    public void selectProvincia(String provincia) {
        xpathSlcProvincia.sendKeys(provincia);
    }

    // Select Departamento
    @FindBy(xpath = Properties.SLC_DEPARTAMENTO_XPATH)
    public WebElement xpathSlcDepartamento;

    public void selectDepartamento(String departamento) {
        xpathSlcDepartamento.sendKeys(departamento);
    }

    // Select Pais
    @FindBy(xpath = Properties.SLC_PAIS_XPATH)
    public WebElement xpathSlcPais;

    public void selectPais(String pais) {
        xpathSlcPais.sendKeys(pais);
    }

    // Select Relacion
    @FindBy(xpath = Properties.SLC_RELACION_XPATH)
    public WebElement xpathSlcRelacion;

    public void selectRelacion(String relacion) {
        xpathSlcRelacion.sendKeys(relacion);
    }

    // Rbt Cargo Public No
    @FindBy(xpath = Properties.CREDIT_RBT_CARGO_PUBLICO_NO_XPATH)
    public WebElement xpathRbtCargoPublicoNo;

    public void clickRbtCargoPublicoNo() {
        xpathRbtCargoPublicoNo.click();
    }

    // Rbt Cargo Public Si
    @FindBy(xpath = Properties.CREDIT_RBT_CARGO_PUBLICO_SI_XPATH)
    public WebElement xpathRbtCargoPublicoSi;

    public void clickRbtCargoPublicoSi() {
        xpathRbtCargoPublicoSi.click();
    }

    // Select Tipo Documento Conviviente
    @FindBy(xpath = Properties.CREDIT_SLC_TIPO_DOCUMENTO_CONVIVIENTE_XPATH)
    public WebElement xpathSlcTipoDocumentoConviviente;

    public void selectTipoDocumentoConviviente(String tipoDocumentoConviviente) {
        xpathSlcTipoDocumentoConviviente.sendKeys(tipoDocumentoConviviente);
    }

    // Txt Numero Documento Conviviente
    @FindBy(xpath = Properties.CREDIT_TXT_NRO_DOCUMENTO_CONVIVIENTE_XPATH)
    public WebElement xpathTxtNroDocumentoConviviente;

    public void setNroDocumentoConviviente(String nroDocumentoConviviente) {
        xpathTxtNroDocumentoConviviente.sendKeys(nroDocumentoConviviente);
    }

    // Txt Nombres Ref1
    @FindBy(xpath = Properties.CREDIT_TXT_REF1_NOMBRES_XPATH)
    public WebElement xpathTxtNombresRef1;

    public void setNombresRef1(String nombresRef1) {
        xpathTxtNombresRef1.sendKeys(nombresRef1);
    }

    // Txt Apellidos Ref1
    @FindBy(xpath = Properties.CREDIT_TXT_REF1_APELLIDOS_XPATH)
    public WebElement xpathTxtApellidosRef1;

    public void setApellidosRef1(String apellidosRef1) {
        xpathTxtApellidosRef1.sendKeys(apellidosRef1);
    }

    // Txt Celular Ref1
    @FindBy(xpath = Properties.CREDIT_TXT_REF1_CELULAR_XPATH)
    public WebElement xpathTxtCelularRef1;

    public void setCelularRef1(String celularRef1) {
        xpathTxtCelularRef1.sendKeys(celularRef1);
    }

    // Txt Nombres Ref2
    @FindBy(xpath = Properties.CREDIT_TXT_REF2_NOMBRES_XPATH)
    public WebElement xpathTxtNombresRef2;

    public void setNombresRef2(String nombresRef2) {
        xpathTxtNombresRef2.sendKeys(nombresRef2);
    }

    // Txt Apellidos Ref1
    @FindBy(xpath = Properties.CREDIT_TXT_REF2_APELLIDOS_XPATH)
    public WebElement xpathTxtApellidosRef2;

    public void setApellidosRef2(String apellidosRef2) {
        xpathTxtApellidosRef2.sendKeys(apellidosRef2);
    }

    // Txt Celular Ref1
    @FindBy(xpath = Properties.CREDIT_TXT_REF2_CELULAR_XPATH)
    public WebElement xpathTxtCelularRef2;

    public void setCelularRef2(String celularRef2) {
        xpathTxtCelularRef2.sendKeys(celularRef2);
    }

    // Btn Siguiente Form2 To Form3
    @FindBy(xpath = Properties.CREDIT_BTN_SIGUIENTE_FORM2_FORM3_XPATH)
    public WebElement xpathBtnSiguiente;

    public void clickBtnSiguiente() {
        xpathBtnSiguiente.click();
    }

    // Rbt CRS Si
    @FindBy(xpath = Properties.CREDIT_RBT_CRS_SI_XPATH)
    public WebElement xpathRbtCRSSi;

    public void clickCRSSi() {
        xpathRbtCRSSi.click();
    }

    // Rbt CRS No
    @FindBy(xpath = Properties.CREDIT_RBT_CRS_NO_XPATH)
    public WebElement xpathRbtCRSNo;

    public void clickCRSNo() {
        xpathRbtCRSNo.click();
    }

    // Chk DDJJ
    @FindBy(xpath = Properties.CREDIT_CHK_DDJJ_XPATH)
    public WebElement xpathChkDDJJ;

    public void clickDDJJ() {
        xpathChkDDJJ.click();
    }

    // Chk Direccion DNI
    @FindBy(xpath = Properties.CREDIT_CHK_DIRECCION_DNI_XPATH)
    public WebElement xpathChkDireccionDNI;

    public void clickDistritoDNI() {
        xpathChkDireccionDNI.click();
    }

    // Btn Aceptar
    @FindBy(xpath = Properties.CREDIT_BTN_ACEPTAR_XPATH)
    public WebElement xpathBtnAceptar;

    public void clickBtnAceptarCRS() {
        xpathBtnAceptar.click();
    }

    //Imagenes
    // Img DNI Personal Frontal
    @FindBy(xpath = Properties.CREDIT_IMG1_DNI_PERSONAL_FRONTAL_XPATH)
    public WebElement xpathImgDNIPersonalFrontal;

    public void clickImgDNIPersonalFrontal(String img) throws InterruptedException {
        iniciador=true;
        xpathImgDNIPersonalFrontal.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img DNI Personal Reverso
    @FindBy(xpath = Properties.CREDIT_IMG2_DNI_PERSONAL_REVERSO_XPATH)
    public WebElement xpathImgDNIPersonalReverso;

    public void clickImgDNIPersonalReverso(String img) throws InterruptedException {
        xpathImgDNIPersonalReverso.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img DNI Conviviente Frontal
    @FindBy(xpath = Properties.CREDIT_IMG3_DNI_CONVIVIENTE_FRONTAL_XPATH)
    public WebElement xpathImgDNIConvivienteFrontal;

    public void clickImgDNIConvivienteFrontal(String img) throws InterruptedException {
        xpathImgDNIConvivienteFrontal.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img DNI Conviviente Reverso
    @FindBy(xpath = Properties.CREDIT_IMG4_DNI_CONVIVIENTE_REVERSO_XPATH)
    public WebElement xpathImgDNIConvivientelReverso;

    public void clickImgDNIConvivienteReverso(String img) throws InterruptedException {
        xpathImgDNIConvivientelReverso.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img Recibo Servicio
    @FindBy(xpath = Properties.CREDIT_IMG5_RECIBO_SERVICIO_XPATH)
    public WebElement xpathImgReciboServicio;

    public void clickImgReciboServicio(String img) throws InterruptedException {
        xpathImgReciboServicio.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img Recibo Celular
    @FindBy(xpath = Properties.CREDIT_IMG6_RECIBO_CELULAR_XPATH)
    public WebElement xpathImgReciboCelular;

    public void clickImgReciboCelular(String img) throws InterruptedException {
        xpathImgReciboCelular.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img Ganancia Semana Actual
    @FindBy(xpath = Properties.CREDIT_IMG7_GANANCIA_SEMANA_ACTUAL_XPATH)
    public WebElement xpathImgGananciaSemanaActual;

    public void clickImgGananciaSemanaActual(String img) throws InterruptedException {
        xpathImgGananciaSemanaActual.click();
        sleep(1000);
        seleccionaImagen(img);
    }
    // Img Ganancia Semana Actual MO
    @FindBy(xpath = Properties.CREDIT_IMG7_GANANCIA_SEMANA_ACTUAL_MO_XPATH)
    public WebElement xpathImgGananciaSemanaActualMO;
    public void clickImgGananciaSemanaActualMO(String img) throws InterruptedException {
        //alternativo es false
        iniciador=true;
        xpathImgGananciaSemanaActualMO.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img Ganancia Semana Anterior
    @FindBy(xpath = Properties.CREDIT_IMG8_GANANCIA_SEMANA_ANTERIOR_XPATH)
    public WebElement xpathImgGananciaSemanaAnterior;

    public void clickImgGananciaSemanaAnterior(String img) throws InterruptedException {
        xpathImgGananciaSemanaAnterior.click();
        sleep(1000);
        seleccionaImagen(img);
    }
    // Img Ganancia Semana Anterior MO
    @FindBy(xpath = Properties.CREDIT_IMG8_GANANCIA_SEMANA_ANTERIOR_MO_XPATH)
    public WebElement xpathImgGananciaSemanaAnteriorMO;

    public void clickImgGananciaSemanaAnteriorMO(String img) throws InterruptedException {
        xpathImgGananciaSemanaAnteriorMO.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img Tarjeta Propiedad
    @FindBy(xpath = Properties.CREDIT_IMG9_TARJETA_PROPIEDAD_XPATH)
    public WebElement xpathImgTarjetaPropiedad;

    public void clickImgTarjetaPropiedad(String img) throws InterruptedException {
        xpathImgTarjetaPropiedad.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Img SOAT Vigente
    @FindBy(xpath = Properties.CREDIT_IMG10_SOAT_XPATH)
    public WebElement xpathImgSoatVigente;

    public void clickImgSoatVigente(String img) throws InterruptedException {
        xpathImgSoatVigente.click();
        sleep(1000);
        seleccionaImagen(img);
    }

    // Form1 Btn Continuar
    @FindBy(xpath = Properties.CREDIT_FORM1_BTN_CONTINUAR_XPATH)
    public WebElement xpathForm1BtnContinuar;

    public void clickForm1BtnContinuar() throws InterruptedException {
        xpathForm1BtnContinuar.click();
        Thread.sleep(25000);
    }

    public void ExplicitWait(WebElement element) {
        (new WebDriverWait(driver, 50)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickForm1BtnContinuarNoWait() throws InterruptedException {
        xpathForm1BtnContinuar.click();
        Thread.sleep(3000);
    }

    // Form2 Btn Continuar
    @FindBy(xpath = Properties.CREDIT_FORM2_BTN_CONTINUAR_XPATH)
    public WebElement xpathForm2BtnContinuar;

    public void clickForm2BtnContinuar() throws InterruptedException {
        xpathForm2BtnContinuar.click();
        Thread.sleep(5000);
    }

    // Form3 Btn Continuar
    @FindBy(xpath = Properties.CREDIT_FORM3_BTN_CONTINUAR_XPATH)
    public WebElement xpathForm3BtnContinuar;

    public void clickForm3BtnContinuar() throws InterruptedException {
        Thread.sleep(3000);
        xpathForm3BtnContinuar.click();
        Thread.sleep(3000);
    }

    // Form3 Btn Solicitar Prestamo
    @FindBy(xpath = Properties.CREDIT_FORM4_BTN_SOLICITAR_PRESTAMO_XPATH)
    public WebElement xpathForm4BtnSolicitarPrestamo;

    public void clickForm4BtnSolicitarPrestamo() throws InterruptedException {
        xpathForm4BtnSolicitarPrestamo.click();
        //Thread.sleep(20000);
    }

    // Btn MO Siguiente 1
    @FindBy(xpath = Properties.CREDIT_MO_BTN_SIGUIENTE_XPATH)
    public WebElement xpathBtnSiguiente1;

    public void clickBtnSiguiente1() {
        ExplicitWait(xpathBtnSiguiente1);
        xpathBtnSiguiente1.click();
    }

    // Btn MO FechaInicioUber
    @FindBy(xpath = Properties.CREDIT_MO_TXT_FECHA_INICIO_UBER_XPATH)
    public WebElement xpathTxtFechaInicioUber;

    public void clickTxtFechaInicioUber() {
        xpathTxtFechaInicioUber.click();
    }

    // Btn MO FechaInicioUber Año
    @FindBy(xpath = Properties.CREDIT_MO_BTN_ANIO_XPATH)
    public WebElement xpathBtnAnio;

    public void clickBtnAnio() {
        xpathBtnAnio.click();
    }

    // Btn MO FechaInicioUber Mes
    @FindBy(xpath = Properties.CREDIT_MO_BTN_MES_XPATH)
    public WebElement xpathBtnMes;

    public void clickBtnMes() {
        xpathBtnMes.click();
    }

    // Btn Fecha Nacimiento
    @FindBy(xpath = Properties.CREDIT_TXT_FECHA_NACIMIENTO_XPATH)
    public WebElement xpathTxtFechaNacimiento;

    public void clickTxtFechaNacimiento() throws InterruptedException {
        xpathTxtFechaNacimiento.click();
        for (int x = 0; x < 20; x++) {
            xpathTxtFechaNacimiento.sendKeys(Keys.ARROW_LEFT);
        }
        xpathTxtFechaNacimiento.sendKeys(Keys.ENTER);


    }

    // Btn Fecha Nacimiento Prev
    @FindBy(xpath = Properties.CREDIT_BTN_PREV_XPATH)
    public WebElement xpathBtnPrev;

    public void clickBtnPrev() {
        xpathBtnPrev.click();
    }

    // Btn Anio Nacimiento 1999
    @FindBy(xpath = Properties.CREDIT_BTN_ANIO99_XPATH)
    public WebElement xpathBtn99;

    public void clickBtn99() {
        xpathBtn99.click();
    }

    // Btn Mes Nacimiento Ene
    @FindBy(xpath = Properties.CREDIT_BTN_MES_ENE_XPATH)
    public WebElement xpathBtnEne;

    public void clickBtnEne() {
        xpathBtnEne.click();
    }

    // Btn 1 Ene
    @FindBy(xpath = Properties.CREDIT_BTN_1_ENE_XPATH)
    public WebElement xpathBtn1Ene;

    public void clickBtn1Ene() {
        xpathBtn1Ene.click();
    }

    // Txt Marca
    @FindBy(xpath = Properties.CREDIT_MO_TXT_MARCA_XPATH)
    public WebElement xpathTxtMarca;

    public void setMarca(String marca) {
        xpathTxtMarca.sendKeys(marca);
        xpathTxtMarca.sendKeys(Keys.TAB);
    }

    // Slc Anio Fabricacion
    @FindBy(xpath = Properties.CREDIT_MO_TXT_ANIO_FAB_XPATH)
    public WebElement xpathSlcAnioFab;

    public void setAnioFab(String anioFab) {
        xpathSlcAnioFab.sendKeys(anioFab);
        xpathSlcAnioFab.sendKeys(Keys.TAB);
    }

    // Txt Placa
    @FindBy(xpath = Properties.CREDIT_MO_TXT_PLACA_XPATH)
    public WebElement xpathTxtPlaca;

    public void setPlaca(String placa) {
        xpathTxtPlaca.sendKeys(placa);
        xpathTxtPlaca.sendKeys(Keys.TAB);
    }

    // Slc CRS Pais
    @FindBy(xpath = Properties.CREDIT_CRS_PAIS_XPATH)
    public WebElement xpathSlcCRSPais;

    public void selectCRSPais(String pais) {
        xpathSlcCRSPais.sendKeys(pais);
    }

    // Txt DOI
    @FindBy(xpath = Properties.CREDIT_DOI_XPATH)
    public WebElement xpathTxtDOI;

    public void setDOI(String doi) {
        xpathTxtDOI.sendKeys(doi);
        xpathTxtDOI.sendKeys(Keys.TAB);
    }

    // Slc Horario Llamada
    @FindBy(xpath = Properties.CREDIT_SLC_HORARIO_LLAMADA_XPATH)
    public WebElement xpathSlcHorarioLlamada;

    public void slcHorarioLlamada(String horarioLlamada) throws InterruptedException {
        xpathSlcHorarioLlamada.sendKeys(horarioLlamada);
    }


    public void seleccionaImagen(String nombreImagen) {
        if ("img001.jpg".equals(nombreImagen)) {
            nombreImagen = "img001.png";
        } else if ("img002.jpg".equals(nombreImagen)) {
            nombreImagen = "img002.png";
        } else if ("img003.jpg".equals(nombreImagen)) {
            nombreImagen = "img003.png";
        } else if ("img004.jpg".equals(nombreImagen)) {
            nombreImagen = "img004.png";
        } else if ("img005.jpg".equals(nombreImagen)) {
            nombreImagen = "img005.png";
        } else if ("img006.jpg".equals(nombreImagen)) {
            nombreImagen = "img006.png";
        } else if ("img007.jpg".equals(nombreImagen)) {
            nombreImagen = "img007.png";
        } else if ("img008.jpg".equals(nombreImagen)) {
            nombreImagen = "img008.png";
        } else if ("img009.jpg".equals(nombreImagen)) {
            nombreImagen = "img009.png";
        } else if ("img010.pdf".equals(nombreImagen)) {
            nombreImagen = "img010.png";
        }
        try {
            Screen s = new Screen();
            if (iniciador) {
                System.out.println("ENTRANDO A CONDICION y SELECCIONAR CARPETA");
                Pattern imgFolder = new Pattern("src\\img\\imgFolder.png");
                s.wait(imgFolder, 1);
                s.doubleClick(imgFolder);
            }
            Pattern imgSeleccionada = new Pattern("src\\img\\" + nombreImagen);
            s.wait(imgSeleccionada, 1);
            s.doubleClick(imgSeleccionada);
            Thread.sleep(2000);
        } catch (FindFailed e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Rbt Compartir Mb Si
    @FindBy(xpath = Properties.CREDIT_MO_SHARE_MB_SI_XPATH)
    public WebElement xpathRbtMb_Si;

    public void clickRbtCompartirMB_Si() {
        xpathRbtMb_Si.click();
    }

    // Rbt Compartir Mb No
    @FindBy(xpath = Properties.CREDIT_MO_SHARE_MB_NO_XPATH)
    public WebElement xpathRbtMb_No;

    public void clickRbtCompartirMB_No() {
        xpathRbtMb_No.click();
    }

    // Rbt Compartir MO Si
    @FindBy(xpath = Properties.CREDIT_MO_SHARE_MO_SI_XPATH)
    public WebElement xpathRbtMO_Si;

    public void clickRbtCompartirMO_Si() {
        xpathRbtMO_Si.click();
    }

    // Rbt Compartir MO No
    @FindBy(xpath = Properties.CREDIT_MO_SHARE_MO_NO_XPATH)
    public WebElement xpathRbtMO_No;

    public void clickRbtCompartirMO_No() {
        xpathRbtMO_No.click();
    }


    // Btn Solicitar Prestamo Tercer Prestamo-Cliente Con Cuenta
    @FindBy(xpath = Properties.CREDIT_BTN_SOLICITAR_PRESTAMO_SIN_HORA_LLAMADA_XPATH)
    public WebElement xpathBtnSolicitarPrestamoTercerFormConCuenta;

    // Btn Solicitar Prestamo Tercer Prestamo-Cliente Sin Cuenta
    @FindBy(xpath = Properties.CREDIT_BTN_SOLICITAR_PRESTAMO_CON_HORA_LLAMADA_XPATH)
    public WebElement xpathBtnSolicitarPrestamoTercerFormSinCuenta;

    public void clickBtnSolicitarPrestamoTercerForm(boolean noTieneCuenta) throws InterruptedException {
        sleep(8000);
        if (noTieneCuenta) {
            xpathBtnSolicitarPrestamoTercerFormSinCuenta.click();
        } else {
            xpathBtnSolicitarPrestamoTercerFormConCuenta.click();
        }
    }

    // Btn Entendido
    @FindBy(xpath = Properties.CREDIT_BTN_ENTENDIDO_XPATH)
    public WebElement xpathBtnEntendido;

    public void clickBtnEntendido() throws InterruptedException {
        sleep(5000);
        xpathBtnEntendido.click();
    }

    // Btn Abrir Cuenta de Ahorros
    @FindBy(xpath = Properties.CREDIT_BTN_ABRIR_CTA_AHORROS_XPATH)
    public WebElement xpathBtnAbrirCuentaAhorros;

    public void clickBtnAbrirCuentaAhorros() throws InterruptedException {
        sleep(5000);
        xpathBtnAbrirCuentaAhorros.click();
    }

    // CANAL ALTERNATIVO
    // Check Domicilio es alquilado
    @FindBy(xpath = Properties.CA_DOMICILIO_ES_ALQUILADO_XPATH)
    public WebElement xpathCheckDomicilioAlquilado;

    public void clickChkDomicilioAlquilado() {
        xpathCheckDomicilioAlquilado.click();
    }
    // Txt Conviviente Nombre
    @FindBy(xpath = Properties.CA_CONVIVIENTE_NOMBRE_XPATH)
    public WebElement xpathTxtConvivienteNombre;

    public void setTxtConvivienteNombre(String string) {
        xpathTxtConvivienteNombre.sendKeys(string);
    }
    // Txt Conviviente ApPaterno
    @FindBy(xpath = Properties.CA_CONVIVIENTE_APPATERNO_XPATH)
    public WebElement xpathTxtConvivienteApPaterno;

    public void setTxtConvivienteApPaterno(String string) {
        xpathTxtConvivienteApPaterno.sendKeys(string);
    }
    // Txt Conviviente ApMaterno
    @FindBy(xpath = Properties.CA_CONVIVIENTE_APMATERNO_XPATH)
    public WebElement xpathTxtConvivienteApMaterno;

    public void setTxtConvivienteApMaterno(String string) {
        xpathTxtConvivienteApMaterno.sendKeys(string);
    }
    // Slc Conviviente Tipo Documento
    @FindBy(xpath = Properties.CA_CONVIVIENTE_TIPO_DOCUMENTO_XPATH)
    public WebElement xpathSlcConvivienteTipoDocumento;

    public void setSlcConvivienteTipoDocumento(String string) {
        xpathSlcConvivienteTipoDocumento.sendKeys(string);
    }
    // Txt Conviviente NroDocumento
    @FindBy(xpath = Properties.CA_CONVIVIENTE_NRO_DOCUMENTO_XPATH)
    public WebElement xpathTxtConvivienteNroDocumento;

    public void setTxtConvivienteNroDocumento(String string) {
        xpathTxtConvivienteNroDocumento.sendKeys(string);
    }
    // Slc Conviviente Genero
    @FindBy(xpath = Properties.CA_CONVIVIENTE_GENERO_XPATH)
    public WebElement xpathSlcConvivienteGenero;

    public void setSlcConvivienteGenero(String string) {
        xpathSlcConvivienteGenero.sendKeys(string);
    }
    // Check Vehiculo no es propio
    @FindBy(xpath = Properties.CA_VEHICULO_NO_PROPIO_XPATH)
    public WebElement xpathCheckVehiculoNoPropio;

    public void clickChkVehiculoNoPropio() {
        xpathCheckVehiculoNoPropio.click();
    }

    // Txt Vehiculo Nombre Dueño
    @FindBy(xpath = Properties.CA_VEHICULO_NOMBRE_XPATH)
    public WebElement xpathTxtNombrePropietario;

    public void setTxtNombrePropietario(String string) {
        xpathTxtNombrePropietario.sendKeys(string);
    }
    // Txt Vehiculo Apellidos Dueño
    @FindBy(xpath = Properties.CA_VEHICULO_APPATERNO_XPATH)
    public WebElement xpathTxtApellidosPropietario;

    public void setTxtApellidosPropietario(String string) {
        xpathTxtApellidosPropietario.sendKeys(string);
    }
    // Txt Vehiculo Celular Dueño
    @FindBy(xpath = Properties.CA_VEHICULO_CELULAR_XPATH)
    public WebElement xpathTxtCelularPropietario;

    public void setTxtCelularPropietario(String string) {
        xpathTxtCelularPropietario.sendKeys(string);
    }

    // Landing MO - Form Crear Cuenta Banner
    @FindBy(xpath = Properties.MO_LOGIN_IMG_LOGIN_XPATH)
    public WebElement xpathLogoMO;

    public void clickLogoMO() {
        ExplicitWait(xpathLogoMO);
        xpathLogoMO.click();
    }

    // Mensaje de validacion: El monto mínimo solicitado debe ser S/ 150.
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_XPATH)
    public WebElement xpathMensajeMontoMinimo;

    public String getMsgMontoMinimo() throws InterruptedException {
        return xpathMensajeMontoMinimo.getText().trim();
    }

    // Mensaje de validacion: Por favor revise los datos solicitados. Todos los campos son obligatorios
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_DATOS_OBLIGATORIOS_XPATH)
    public WebElement xpathMensajeDatosObligatorios;

    public String getMsgDatosObligatorios() throws InterruptedException {
        return xpathMensajeDatosObligatorios.getText().trim();
    }

    // Mensaje de validacion: Esta en Base Negativa
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_ESTA_EN_BN_XPATH)
    public WebElement xpathMensajeBaseNegativa;

    public String getMsgBaseNegativa() throws InterruptedException {
        return xpathMensajeBaseNegativa.getText().trim();
    }

    // Mensaje de validacion: Seleccione tipo de crédito.
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_TIPO_CREDITO_XPATH)
    public WebElement xpathMensajeTipoCredito;

    public String getMsgTipoCredito() throws InterruptedException {
        return xpathMensajeTipoCredito.getText().trim();
    }

    // Mensaje de validacion: Monto de crédito a solicitar es requerido.
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_MONTO_XPATH)
    public WebElement xpathMensajeMonto;

    public String getMsgMonto() {
        return xpathMensajeMonto.getText().trim();
    }

    // Mensaje de validacion: Codigo UBER es requerido.
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_CODUBER_XPATH)

    public WebElement xpathMensajeCodigoUber;

    public String getMsgCodigoUber() {
        return xpathMensajeCodigoUber.getText().trim();
    }

    // Mensaje de validacion: Codigo UBER es invalido
    @FindBy(xpath = Properties.LBL_MSG_CREDITOS_CODUBER_INV_XPATH)

    public WebElement xpathMensajeCodigoUberInv;

    public String getMsgCodigoUberInv() {
        return xpathMensajeCodigoUberInv.getText().trim();
    }

    // Mensaje de validacion: Codigo UBER es invalido (MODAL)
    @FindBy(xpath = Properties.LBL_CREDITOS_MODAL_CODUBER_INVALIDO_XPATH)

    public WebElement xpathMensajeModalCodigoUberInvalido;

    public String getMsgModalCodigoUberInvalido() {
        return xpathMensajeModalCodigoUberInvalido.getText().trim();
    }

    // Mensaje de validacion: Tipo de Documento
    @FindBy(xpath = Properties.LBL_CREDITOS_TIPO_DOCUMENTO_XPATH)

    public WebElement xpathMensajeTipoDocumento;

    public String getMsgTipoDocumento() {
        return xpathMensajeTipoDocumento.getText().trim();
    }
}



