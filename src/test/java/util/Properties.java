package util;

import static java.io.File.separator;

public class Properties {
    // Proyecto Camarones Alicorp 2019-10
    //Config
    public static final int TIME_WAIT = 15;
    public static final String TIPO_DRIVER = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_PATH = "src\\driver\\chromedriver.exe";
    public static final String URL_ROOT_DEV = "frontend.dev.nicosoft.belatrix.online/?id=";
    // BD DEV
    public static final String DB_DEV_SHRIMPS_ENDPOINT = "db-nicosoft-dev.ciyuebmhm8ua.us-east-2.rds.amazonaws.com";
    public static final String DB_DEV_SHRIMPS_BD = "db-nicosoft-dev";
    public static final String DB_DEV_SHRIMPS_USER = "nicosoft-dev";
    public static final String DB_DEV_SHRIMPS_PW = "Peru123456.";

    // BD QA
    public static final String DB_QA_SHRIMPS_ENDPOINT = "db-nicosoft-qas.ciyuebmhm8ua.us-east-2.rds.amazonaws.com";
    public static final String DB_QA_SHRIMPS_BD = "db-nicosoft-qas";
    public static final String DB_QA_SHRIMPS_USER = "nicosoft-qas";
    public static final String DB_QA_SHRIMPS_PW = "Peru654321.";


    //Tetris
    public static final String LNK_AHORROS_XPATH = "/html/body/div[4]/div/a[2]/h4";
    public static final String LNK_CREDITOS_XPATH = "/html/body/div[5]/div/a[3]/h4";

    //Tetris - Ahorros
    public static final String TXT_CODIGO_UBER_XPATH = "//*[@id=\"usuario_codigo_uber\"]";
    public static final String LBL_PASO_1_XPATH = "//*[@id=\"step_1\"]";
    public static final String SLC_TIPO_DOCUMENTO_XPATH = "//*[@id=\"tipo_de_documento_code\"]";
    public static final String TXT_NUMERO_DOCUMENTO_XPATH = "//*[@id=\"numero_de_documento\"]";
    public static final String TXT_NOMBRES_XPATH = "//*[@id=\"nombres\"]";
    public static final String TXT_APELLIDO_PATERNO_XPATH = "//*[@id=\"apellido_paterno\"]";
    public static final String TXT_APELLIDO_MATERNO_XPATH = "//*[@id=\"apellido_materno\"]";
    public static final String SLC_DEPARTAMENTO_XPATH = "//*[@id=\"departamento_code\"]";
    public static final String SLC_PROVINCIA_XPATH = "//*[@id=\"provincia_code\"]";
    public static final String SLC_DISTRITO_XPATH = "//*[@id=\"distrito_code\"]";
    public static final String TXT_DIRECCION_XPATH = "//*[@id=\"direccion\"]";
    public static final String SLC_OCUPACION_XPATH = "//*[@id=\"ocupacion_code\"]";
    public static final String TXT_CELULAR_XPATH = "//*[@id=\"celular\"]";
    public static final String SLC_NACIONALIDAD_XPATH = "//*[@id=\"nacionalidad\"]";
    public static final String TXT_EMAIL_XPATH = "//*[@id=\"email\"]";
    public static final String RBT_CARGO_PUBLICO_SI_XPATH = "//*[@id=\"cargo_publico_si\"]";
    public static final String SLC_HORARIO_LLAMADA_XPATH = "//*[@id=\"horario_de_llamada_code\"]";
    public static final String CHK_ACEPTO_TERMINOS_CONDICIONES_XPATH = "//*[@id=\"agree_terms\"]";

    public static final String BTN_ENVIAR_XPATH = "//*[@id=\"content\"]/div/div/div/form/p[2]/input";
    public static final String RBT_CRS_SI_XPATH = "//*[@id=\"agree_address_si\"]";
    public static final String RBT_CRS_NO_XPATH = "//*[@id=\"agree_address_no\"]";
    public static final String CHK_DDJJ_XPATH = "//*[@id=\"agree_address_jury\"]";
    public static final String CHK_DISTRITO_DNI_OK_XPATH = "//*[@id=\"agree_address_confirmation\"]";
    public static final String BTN_ACEPTAR_CRS_XPATH = "//*[@id=\"legal\"]/div/div/div[3]/div/div[2]/div/ul/li/button";
    //Tetris Mensajes
    public static final String MSG_AHORROS_OK_XPATH = "//*[@id=\"content\"]/div/div/div/div/div/p[2]";
    public static final String MSG_AHORROS_OK = "Sus datos han sido enviados con éxito";
    //Tetris Creditos
    public static final String BTN_SOLICITAR_PRESTAMO_XPATH = "//*[@id=\"gotoCredit\"]";
    public static final String BTN_ENTERATE_COMO_OBTENERLO_XPATH = "//button[@class='button button__accent button__accent--section']";
    public static final String SLC_TIPO_CREDITO_XPATH = "//*[@id=\"tipo_de_credito\"]";
    public static final String TXT_MONTO_XPATH = "//*[@id=\"credit_amount\"]";
    public static final String SLC_GENERO_XPATH = "//*[@id=\"gender\"]";
    public static final String BTN_SOLICITAR_PRESTAMO_FORM1_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div[1]/p/input";
    public static final String BTN_MODAL_FORM1_FORM2 = "//*[@id=\"creditPrepare\"]/div/div/div[3]/div/div/div/ul/li/button";
    public static final String BTN_ALTERNATIVO_FORM1_FORM2 = "//*[@id=\"button_submit_documents\"]";
    public static final String SLC_TIPO_DOMICILIO_XPATH = "//*[@id=\"address_type\"]";
    //public static final String TXT_DIRECCION_XPATH = "//*[@id=\"direccion\"]";
    //public static final String SLC_DISTRITO_XPATH = "//*[@id=\"distrito_code\"]";
    //public static final String SLC_PROVINCIA_XPATH = "//*[@id=\"provincia_code\"]";
    // public static final String SLC_DEPARTAMENTO_XPATH = "//*[@id=\"departamento_code\"]";
    public static final String SLC_PAIS_XPATH = "//*[@id=\"pais_code\"]";
    public static final String SLC_RELACION_XPATH = "//*[@id=\"conviviente\"]";
    //public static final String CREDIT_RBT_CARGO_PUBLICO_NO_XPATH = "(//input[@id='cargo_publico_no' and @value='no'])[2]";
    //public static final String CREDIT_RBT_CARGO_PUBLICO_SI_XPATH = "(//input[@id='cargo_publico_si' and @value='si'])[2]";
    public static final String CREDIT_RBT_CARGO_PUBLICO_SI_XPATH = "//*[@id=\"cargo_publico_si\"]";
    public static final String CREDIT_RBT_CARGO_PUBLICO_NO_XPATH = "//*[@id=\"cargo_publico_no\"]";
    public static final String CREDIT_SLC_TIPO_DOCUMENTO_CONVIVIENTE_XPATH = "//*[@id=\"tipo_de_documento_code_conviviente\"]";
    public static final String CREDIT_TXT_NRO_DOCUMENTO_CONVIVIENTE_XPATH = "//*[@id=\"numero_de_documento_conviviente\"]";
    public static final String CREDIT_TXT_REF1_NOMBRES_XPATH = "//*[@id=\"nombres_ref_1\"]";
    public static final String CREDIT_TXT_REF1_APELLIDOS_XPATH = "//*[@id=\"apellido_paterno_ref_1\"]";
    public static final String CREDIT_TXT_REF1_CELULAR_XPATH = "//*[@id=\"celular_ref_1\"]";
    public static final String CREDIT_TXT_REF2_NOMBRES_XPATH = "//*[@id=\"nombres_ref_2\"]";
    public static final String CREDIT_TXT_REF2_APELLIDOS_XPATH = "//*[@id=\"apellido_paterno_ref_2\"]";
    public static final String CREDIT_TXT_REF2_CELULAR_XPATH = "//*[@id=\"celular_ref_2\"]";
    //public static final String CREDIT_BTN_SIGUIENTE_FORM2_FORM3_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div[1]/div/div[7]/div/div[2]/input";
    public static final String CREDIT_BTN_SIGUIENTE_FORM2_FORM3_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div/div/div[1]/div[7]/div/div[2]/input";

    //public static final String CREDIT_RBT_CRS_SI_XPATH = "//*[@id=\"agree_address_si\"]";
    //public static final String CREDIT_RBT_CRS_NO_XPATH = "//*[@id=\"agree_address_no\"]";
    public static final String CREDIT_RBT_CRS_SI_XPATH = "(//input[@id='agree_address_si' and @value='1'])[3]";
    public static final String CREDIT_RBT_CRS_NO_XPATH = "(//input[@id='agree_address_no' and @value='0'])[3]";
    public static final String CREDIT_CHK_DDJJ_XPATH = "//*[@id=\"agree_address_jury\"]";
    public static final String CREDIT_CHK_DIRECCION_DNI_XPATH = "//*[@id=\"agree_address_confirmation\"]";
    public static final String CREDIT_BTN_ACEPTAR_XPATH = "//*[@id=\"creditLegal\"]/div/div/div[3]/div/div[2]/div/ul/li/button";
    //Imagenes a adjuntar
    public static final String CREDIT_FORM1_BTN_CONTINUAR_XPATH = "//*[@id=\"button_submit_form_1\"]";
    public static final String CREDIT_IMG1_DNI_PERSONAL_FRONTAL_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/label";

    public static final String CREDIT_IMG2_DNI_PERSONAL_REVERSO_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[2]/div/div[2]/div[2]/div[2]/label";
    public static final String CREDIT_IMG3_DNI_CONVIVIENTE_FRONTAL_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/label";
    public static final String CREDIT_IMG4_DNI_CONVIVIENTE_REVERSO_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[3]/div/div[2]/div[2]/div[2]/label";
    public static final String CREDIT_IMG5_RECIBO_SERVICIO_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[4]/div/div[2]/div[1]/div[2]/label";
    public static final String CREDIT_IMG6_RECIBO_CELULAR_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[4]/div/div[2]/div[2]/div[2]/label";
    public static final String CREDIT_IMG7_GANANCIA_SEMANA_ACTUAL_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[5]/div/div[2]/div[1]/div[2]/label";
    public static final String CREDIT_IMG7_GANANCIA_SEMANA_ACTUAL_MO_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/label";
    public static final String CREDIT_IMG8_GANANCIA_SEMANA_ANTERIOR_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[5]/div/div[2]/div[2]/div[2]/label";
    public static final String CREDIT_IMG8_GANANCIA_SEMANA_ANTERIOR_MO_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/label";

    public static final String CREDIT_IMG9_TARJETA_PROPIEDAD_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[6]/div/div[2]/div/div[2]/label";
    public static final String CREDIT_IMG10_SOAT_XPATH = "//*[@id=\"content\"]/div[7]/form/div/div/div/div/div[7]/div/div[2]/div/div[2]/label";
    public static final String CREDIT_BTN_SOLICITAR_PRESTAMO_SIN_HORA_LLAMADA_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div/div/div/div/div[8]/div/div[2]/input";
    public static final String CREDIT_BTN_SOLICITAR_PRESTAMO_CON_HORA_LLAMADA_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div/div/div/div/div[9]/div/div[2]/input";
    //public static final String CREDIT_BTN_ENTENDIDO_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div/div/div[1]/div/div/div/p[6]/input";
    public static final String CREDIT_BTN_ENTENDIDO_XPATH = "//input[@value='Entendido']";
    public static final String CREDIT_SLC_HORARIO_LLAMADA_XPATH = "//*[@id=\"horario_de_llamada_code\"]";
    public static final String CREDIT_BTN_ABRIR_CTA_AHORROS_XPATH = "//*[@id=\"content\"]/div[5]/div/div/form/div/div/div[1]/div/div/div/p[6]/input";
    public static final String CREDIT_MO_BTN_SIGUIENTE_XPATH = "//*[@id=\"buttonInfo\"]";
    public static final String CREDIT_MO_TXT_FECHA_INICIO_UBER_XPATH = "//*[@id=\"date_uber_start\"]";
    public static final String CREDIT_MO_BTN_ANIO_XPATH = "/html/body/div[10]/div[3]/table/tbody/tr/td/span[1]";
    public static final String CREDIT_MO_BTN_MES_XPATH = "/html/body/div[10]/div[2]/table/tbody/tr/td/span[1]";

    public static final String CREDIT_TXT_FECHA_NACIMIENTO_XPATH = "//*[@id=\"birthday\"]";
    public static final String CREDIT_BTN_PREV_XPATH = "/html/body/div[11]/div[3]/table/thead/tr[2]/th[1]";
    public static final String CREDIT_BTN_ANIO99_XPATH = "/html/body/div[11]/div[3]/table/tbody/tr/td/span[1]";
    public static final String CREDIT_BTN_MES_ENE_XPATH = "/html/body/div[11]/div[2]/table/tbody/tr/td/span[1]";
    public static final String CREDIT_BTN_1_ENE_XPATH = "/html/body/div[11]/div[1]/table/tbody/tr[1]/td[5]";

    public static final String CREDIT_MO_TXT_MARCA_XPATH = "//*[@id=\"car_model\"]";
    public static final String CREDIT_MO_TXT_ANIO_FAB_XPATH = "//*[@id=\"car_year\"]";
    public static final String CREDIT_MO_TXT_PLACA_XPATH = "//*[@id=\"car_plate\"]";
    public static final String CREDIT_FORM2_BTN_CONTINUAR_XPATH = "(//button[@class=\"nextBtn\"])[3]";
    public static final String CREDIT_FORM3_BTN_CONTINUAR_XPATH = "(//button[@class=\"nextBtn\"])[4]";

    //public static final String CREDIT_FORM4_BTN_SOLICITAR_PRESTAMO_XPATH = "(//button[@class=\"nextBtn\"])[5]";
    public static final String CREDIT_FORM4_BTN_SOLICITAR_PRESTAMO_XPATH = "(//button[@class=\"submitBtn\"])";

    public static final String CREDIT_MO_SHARE_MB_SI_XPATH = "//*[@id=\"share_with_mo\"]";
    public static final String CREDIT_MO_SHARE_MB_NO_XPATH = "//*[@id=\"no_share\"]";
    public static final String CREDIT_MO_SHARE_MO_SI_XPATH = "//*[@id=\"share_with_mb\"]";
    public static final String CREDIT_MO_SHARE_MO_NO_XPATH = "//*[@id=\"no_share_mb\"]";

    public static final String CREDIT_CRS_PAIS_XPATH = "//*[@id=\"country_taxes\"]";
    public static final String CREDIT_DOI_XPATH = "//*[@id=\"doi\"]";
    //CANAL ALTERNATIVO
    public static final String CA_DOMICILIO_ES_ALQUILADO_XPATH = "//*[@id=\"is_home_owner\"]";
    public static final String CA_CONVIVIENTE_NOMBRE_XPATH = "//*[@id=\"partner_firstname\"]";
    public static final String CA_CONVIVIENTE_APPATERNO_XPATH = "//*[@id=\"partner_lastname_1\"]";
    public static final String CA_CONVIVIENTE_APMATERNO_XPATH = "//*[@id=\"partner_lastname_2\"]";
    public static final String CA_CONVIVIENTE_TIPO_DOCUMENTO_XPATH = "//*[@id=\"tipo_de_documento_code_conviviente\"]";
    public static final String CA_CONVIVIENTE_NRO_DOCUMENTO_XPATH = "//*[@id=\"numero_de_documento_conviviente\"]";
    public static final String CA_CONVIVIENTE_GENERO_XPATH = "//*[@id=\"partner_gender\"]";

    public static final String CA_VEHICULO_NO_PROPIO_XPATH = "//*[@id=\"is_car_owner\"]";
    public static final String CA_VEHICULO_NOMBRE_XPATH = "//*[@id=\"nombres_ref_2\"]";
    public static final String CA_VEHICULO_APPATERNO_XPATH = "//*[@id=\"apellido_paterno_ref_2\"]";
    public static final String CA_VEHICULO_CELULAR_XPATH = "//*[@id=\"celular_ref_2\"]";
    //MO
    public static final String MO_LOGIN_IMG_LOGIN_XPATH = "/html/body/app-root/div/div/app-request/div[2]/div/div[1]/div[1]/img";
    // Mensajes de validacion
    public static final String LBL_MSG_CREDITOS_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[4]/div[2]/div[2]/p";
    public static final String MSG_CREDITOS_MONTO_MIN = "El monto mínimo solicitado debe ser S/ 150.";

    public static final String LBL_MSG_CREDITOS_DATOS_OBLIGATORIOS_XPATH = "//*[@id=\"jackResponse\"]/div/div/div[2]/b";
    public static final String MSG_CREDITOS_DATOS_OBLIGATORIOS = "Por favor revise los datos solicitados. Todos los campos son obligatorios.";
    public static final String LBL_MSG_CREDITOS_ESTA_EN_BN_XPATH = "//*[@id=\"jackResponse\"]/div/div/div[2]/b";
    public static final String MSG_CREDITOS_ESTA_EN_BN = "Hola, actualmente no cuentas con los requisitos para acceder a este producto. Visítanos en nuestras agencias a nivel nacional y te asesoraremos para poder trabajar contigo en el futuro.";

    //Tipo de Credito
    public static final String LBL_MSG_CREDITOS_TIPO_CREDITO_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[4]/div[1]/div/p";
    public static final String MSG_CREDITOS_TIPO_CREDITO = "Seleccione tipo de crédito.";

    //Monto de Credito
    public static final String LBL_MSG_CREDITOS_MONTO_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[4]/div[2]/div/p";
    public static final String MSG_CREDITOS_MONTO = "Monto de crédito a solicitar es requerido.";
    public static final String MSG_CREDITOS_MONTO_MINIMO = "El monto mínimo solicitado debe ser S/ 150.";

    //Codigo Uber
    public static final String LBL_MSG_CREDITOS_CODUBER_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[1]/div[2]/div/p";
    public static final String LBL_MSG_CREDITOS_CODUBER_INV_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[1]/div[2]/div[2]/p";
    public static final String MSG_CREDITOS_CODUBER_REQUERIDO = "Código UBER es requerido.";
    public static final String MSG_CREDITOS_CODUBER_CORTO = "Código UBER muy corto.";
    public static final String MSG_CREDITOS_CODUBER_INVALIDO = "Código inválido.";
    public static final String MSG_CREDITOS_MODAL_CODUBER_INVALIDO = "Código Uber inválido, por favor revise el Código utilizado.";
    public static final String LBL_CREDITOS_MODAL_CODUBER_INVALIDO_XPATH = "//*[@id=\"jackResponse\"]/div/div/div[2]/b";

    //Tipo de Documento
    public static final String LBL_CREDITOS_TIPO_DOCUMENTO_XPATH = "//*[@id=\"content\"]/div[7]/form/div[1]/div/div[5]/div[1]/div/p";
    public static final String MSG_CREDITOS_TIPO_DOCUMENTO_REQUERIDO = "Seleccione Tipo de Documento.";


}
