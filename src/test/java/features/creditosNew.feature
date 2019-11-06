Feature: Solicitud de Prestamos

  @wipx
  #@testcasekey=T3TRIS-454 1
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Enterate como obtenerlo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    Then Driver visualiza mensaje de monto minimo permitido
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "89764568"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454 2
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    Then Driver visualiza mensaje de monto minimo permitido
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "12345678"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  @testcasekey=T3TRIS-863
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Continua Nav MO
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "40713849"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "MUJER"
    And Driver ingresa su fecha de nacimiento
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa celular "987654322"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo
    And Driver visualiza la landing de MO


  @wipx
  #@storykey=T3TRIS-454 4
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Continua Nav MO
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "MUJER"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 5
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Continua Nav MO
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "40713849"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "MUJER"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo


  @wipx
  #@storykey=T3TRIS-454 5
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Continua Nav MO
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "MUJER"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "No"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "No"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 6
  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=Si/Continua Nav MO
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 7  SE VA POR CANAL ALTERNATIVOOO , DEBE IR A AGENCIA
  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "40713849"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 8
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "89764568"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454 10
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "89764568"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 11
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 12
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente Aplica/DNI/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "89764568"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 13
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 14
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente No Aplica/DNI/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "44933922"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 15   SE VA POR CANAL ALTERNATIVOOO , DEBE IR A AGENCIA
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente Aplica/DNI/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "89764568"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "OTROS"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 16   PENDIENTE DE ENCONTRAR UN CARNET DE EXTRANJERIA (NO HAY DATA)
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    Then Driver visualiza mensaje de monto minimo permitido
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "40713849"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios


  @wipx
  #@storykey=T3TRIS-454 17
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    Then Driver visualiza mensaje de monto minimo permitido
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000730729"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454 18 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia

  @wipx
  #@storykey=T3TRIS-454 19
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000730729"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 20   (NO HAY DATA)
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia

  @wipx
  #@storykey=T3TRIS-454 21
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000730729"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 22
  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente No Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000730729"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 23   (NO HAY DATA)
  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia

  @wipx
  #@storykey=T3TRIS-454 24   (NO HAY DATA)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje monto no permitido

  @wipx
  #@storykey=T3TRIS-454 25 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje monto no permitido

  @wipx
  #@storykey=T3TRIS-454 26
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000063196"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 27 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia

  @wipx
  #@storykey=T3TRIS-454 28
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente Aplica/CE/Cargo Publico=Si/CRS=No/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000063196"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 29 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente No Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia

  @wipx
  #@storykey=T3TRIS-454 30 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente No Aplica/CE/Cargo Publico=Si/CRS=No/Continua Nav MO

  @wipx
  #@storykey=T3TRIS-454 31 (VA AL CANAL TRADICIONAL--> CORREGIR)
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente Aplica/CE/Cargo Publico=Si/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000063196"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "Sí"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 32 (NO HAY DATA)
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/Pais Otro DOI/Mensaje monto no permitido

  @wipx
  #@storykey=T3TRIS-454 33
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais PE DOI/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERIA"
    And Driver ingresa numero de documento "000730729"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "PERÚ" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454 34
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/BN Bloqueado/No Continua
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "12345678"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje No cuentas con requisitos para acceder

  @wipx
  #@storykey=T3TRIS-454 35
  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Desbloqueado/Continua Nav
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "00446712"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 36
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/BN Anulado/Continua Nav
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "01820641"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 37
  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/No BN/Continua Nav
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "40961611"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  #@storykey=T3TRIS-454 38
  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente No Aplica/DNI/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "40961611"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa celular "987654321"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo

  @wipx
  # Sprint 9
  #@storykey=T3TRIS-454 39
  Scenario: Canal Alternativo para clientes con cuenta y monto=701/Cliente Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI
  #40713849
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "01820641"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654321"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    And Driver presiona boton Aceptar del modal Continua tu Solicitud
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. Husares de Junin 8902"
    And Driver confirma que su domicilio es alquilado
    And Driver ingresa sus nombres de primera referencia "Ana Cecilia"
    And Driver ingresa los apellidos de primera referencia "Camargo Correa"
    And Driver ingresa celular de primera referencia "999222111"
    And Driver selecciona su estado civil "CASADO"
    And Driver ingresa el nombre de su conviviente "Karen"
    And Driver ingresa el apellido paterno de su conviviente "Chonta"
    And Driver ingresa el apellido Materno de su conviviente "Vivas"
    And Driver selecciona el tipo de documento de su conviviente "DNI"
    And Driver ingresa el numero de documento de su conviviente "44443333"
    And Driver selecciona el genero de su conviviente "MUJER"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver confirma que el vehiculo no es propio
    And Driver ingresa el nombre del propietario "Juan Carlos"
    And Driver ingresa lso apellidos del propietario "Hurtado Chirinos"
    And Driver ingresa el celular del propietario "999220002"
    And Driver selecciona el horario de llamada "11:00"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen frontal de DNI personal "img001.jpg"
    And Driver adjunta imagen reverso de DNI personal "img002.jpg"
    And Driver adjunta imagen frontal de DNI Conyugue o Conviviente "img003.jpg"
    And Driver adjunta imagen reverso de DNI Conyugue o Conviviente "img004.jpg"
    And Driver adjunta imagen de ultimo recibo de servicios "img005.jpg"
    And Driver adjunta imagen del plan de celular "img006.jpg"
    And Driver adjunta imagen balance de carreras semana actual "img007.jpg"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver adjunta imagen de tarjeta de propiedad "img009.jpg"
    And Driver adjunta archivo de SOAT vigente "img010.pdf"
    And Driver presiona boton Continuar del tercer formulario

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "01234107"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654321"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/Mensaje monto no permitido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "99901030"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654321"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/No BN/Continua Nav
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "01234107"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654320"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza la primera pantalla informativa
    Then Driver visualiza la segunda pantalla informativa
    And Driver ingresa su fecha de inicio en UBER
    And Driver ingresa la marca del vehiculo "NISSAN"
    And Driver ingresa selecciona el año de su vehiculo "2012"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. La Estrella 9082"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen balance de carreras semana actual "img007.png"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver presiona boton Continuar del tercer formulario
    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales "Si"
    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales "Si"
    And Driver presiona boton Solicitar prestamo
    And Driver visualiza la landing de MO

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/Anulado/Continua Nav
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "150"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "99901030"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654322"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario

  @wipx
  # Sprint 9 NO HAY DNI SIN CUENTAs QUE APLIQUE EN ESTADO DESBLOQUEADO
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente Aplica/DNI/Cargo Publico=No/CRS=Si/BN Desbloqueado/Continua Nav

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente No Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Bloqueado/No Continua
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "700"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "00437704"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654322"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje No cuentas con requisitos para acceder

  @wipx
  # Sprint 9 NO HAY DATA
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente No Aplica/DNI/Cargo Publico=No/CRS=Si/Se irá a MO

  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente Aplica/DNI/Cargo Publico=No/CRS=No/Pais Otro DOI/Se irá CanalTrad
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento "01234107"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654320"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "No"
    And Driver selecciona pais "VENEZUELA" de acuerdo al CRS
    And Driver ingresa numero DOI "10123456789"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    And Driver presiona boton Aceptar del modal Continua tu Solicitud
    And Driver selecciona distrito "ATE"
    And Driver ingresa direccion "Av. Husares de Junin 8902"
    And Driver confirma que su domicilio es alquilado
    And Driver ingresa sus nombres de primera referencia "Ana Cecilia"
    And Driver ingresa los apellidos de primera referencia "Camargo Correa"
    And Driver ingresa celular de primera referencia "999222111"
    And Driver selecciona su estado civil "CASADO"
    And Driver ingresa el nombre de su conviviente "Karen"
    And Driver ingresa el apellido paterno de su conviviente "Chonta"
    And Driver ingresa el apellido Materno de su conviviente "Vivas"
    And Driver selecciona el tipo de documento de su conviviente "DNI"
    And Driver ingresa el numero de documento de su conviviente "44443333"
    And Driver selecciona el genero de su conviviente "MUJER"
    And Driver ingresa el numero de placa "SQL-200"
    And Driver confirma que el vehiculo no es propio
    And Driver ingresa el nombre del propietario "Juan Carlos"
    And Driver ingresa lso apellidos del propietario "Hurtado Chirinos"
    And Driver ingresa el celular del propietario "999220002"
    And Driver selecciona el horario de llamada "11:00"
    And Driver presiona boton Continuar del segundo formulario
    And Driver adjunta imagen frontal de DNI personal "img001.jpg"
    And Driver adjunta imagen reverso de DNI personal "img002.jpg"
    And Driver adjunta imagen frontal de DNI Conyugue o Conviviente "img003.jpg"
    And Driver adjunta imagen reverso de DNI Conyugue o Conviviente "img004.jpg"
    And Driver adjunta imagen de ultimo recibo de servicios "img005.jpg"
    And Driver adjunta imagen del plan de celular "img006.jpg"
    And Driver adjunta imagen balance de carreras semana actual "img007.jpg"
    And Driver adjunta imagen balance de carreras semana anterior "img008.jpg"
    And Driver adjunta imagen de tarjeta de propiedad "img009.jpg"
    And Driver adjunta archivo de SOAT vigente "img010.pdf"
    And Driver presiona boton Continuar del tercer formulario


  @wipx
  # Sprint 9
  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPQUVAEMJ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "149"
    When Driver selecciona tipo de documento "CARNET DE EXTRANJERÍA"
    And Driver ingresa numero de documento "000959115"
    And Driver ingresa nacionalidad "PERÚ"
    And Driver ingresa sus nombres "nombres"
    And Driver ingresa su apellido paterno "apPaterno"
    And Driver ingresa su apellido materno "apMaterno"
    And Driver selecciona su genero "HOMBRE"
    And Driver ingresa su fecha de nacimiento
    And ingresa celular "987654320"
    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO DEPENDIENTE"
    And ingresa correo "email@email.com"
    And Driver confirma si tiene cargo publico "No"
    And Driver selecciona respuesta para las tres preguntas "Sí"
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios
#  Scenario: Canal Digital MO para clientes con cuenta y monto=149/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais PE DOI/BN Bloqueado/No Continua
#  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes con cuenta y monto=150/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Desbloqueado/Continua Nav
#  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes con cuenta y monto=700/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/No BN/Continua Nav
#  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente No Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes con cuenta y monto=701/Cliente Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/Se irá CanalTrad
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=149/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=150/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Bloqueado/Continua Nav
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente Aplica/CE/Cargo Publico=No/CRS=Si/Mensaje ir a Agencia
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Anulado/Continua Nav
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=700/Cliente No Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/BN Desbloqueado/Continua Nav
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente No Aplica/CE/Cargo Publico=No/CRS=Si/Se irá a MO
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=701/Cliente Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/Se irá CanalTrad
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=3500/Cliente Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/Se irá CanalTrad
#  Scenario: Canal Digital MO para clientes sin cuenta y monto=3501/Cliente Aplica/CE/Cargo Publico=No/CRS=No/Pais Otro DOI/Mensaje Validacion
## Escenarios de Validacion

  @wipx
  @testcasekey=T3TRIS-867
  Scenario: Validación de mensaje tipo de crédito es requerido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito ""
    Then Driver visualiza mensaje Seleccione tipo de credito
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
  #@storykey=T3TRIS-454
  Scenario: Validación de mensaje monto de crédito es requerido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto ""
    Then Driver visualiza mensaje Monto de credito a solicitar es requerido.
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
    #@storykey=T3TRIS-454
  Scenario: Validación de mensaje monto mínimo solicitado debe ser S/ 150
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "1"
    Then Driver visualiza mensaje El monto mínimo solicitado
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
 #@storykey=T3TRIS-454
  Scenario: Validación de mensaje código Uber es requerido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER ""
    When Driver selecciona el tipo de Credito ""
    Then Driver visualiza mensaje Código UBER es requerido
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
 #@storykey=T3TRIS-454
  Scenario: Validación de mensaje código Uber es corto
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "Q"
    When Driver selecciona el tipo de Credito ""
    Then Driver visualiza mensaje Código UBER es corto
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Todos los campos son obligatorios

  @wipx
 #@storykey=T3TRIS-454
  Scenario: Validación de mensaje código Uber es invalido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "ABCDEFGHIJ"
    When Driver selecciona el tipo de Credito ""
    Then Driver visualiza mensaje Codigo invalido
    And acepta terminos y condiciones
    And Driver presiona boton Continuar del primer formulario
    Then Driver visualiza mensaje Código Uber inválido, por favor revise el Código utilizado.

  @wipx
 #@storykey=T3TRIS-454
  Scenario: Validación de mensaje tipo de documento es requerido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "300"
    When Driver selecciona tipo de documento ""
    Then Driver visualiza mensaje tipo de documento es requerido

  @wipx
 #@storykey=T3TRIS-454
  Scenario: Validación de mensaje numero de documento es requerido
    Given Driver accede a la URL enviada a su celular y visualiza la Landing
    When Driver presiona el enlace Creditos
    Then Driver visualiza el formulario de Creditos
    And Driver presiona el boton Solicitar mi prestamo
    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
    When Driver selecciona el tipo de Credito "IMPREVISTOS"
    And Driver ingresa el monto "701"
    When Driver selecciona tipo de documento "DNI"
    And Driver ingresa numero de documento ""
    Then Driver visualiza mensaje numero de documento es requerido

#  Scenario: Validación de mensaje numero de documento es muy corto
#  Scenario: Validación de mensaje nombres es requerido
#  Scenario: Validación de mensaje nombres es muy corto
#  Scenario: Validación de mensaje nombres es invalido, solo debe contener letras
#  Scenario: Validación de mensaje apellido paterno es requerido
#  Scenario: Validación de mensaje apellido paterno es muy corto
#  Scenario: Validación de mensaje apellido paterno es invalido, solo debe contener letras
#  Scenario: Validación de mensaje apellido materno es requerido
#  Scenario: Validación de mensaje apellido materno es muy corto
#  Scenario: Validación de mensaje apellido materno es invalido, solo debe contener letras
#  Scenario: Validación de mensaje correo electrónico es requerido
#  Scenario: Validación de mensaje correo electrónico es invalido
#  Scenario: Validación de mensaje celular es requerido
#  Scenario: Validación de mensaje celular es invalido, empieza con 9 y debe tener solo números
#  Scenario: Validación de mensaje celular es muy corto
#  Scenario: Validación de mensaje por favor acepte los términos y condiciones
#  Scenario: Validación de mensajes en modal CRS - Driver no marca ninguna opción
#  Scenario: Validación de mensajes en modal CRS - Driver marca Si y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca Si,DDJJ y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca Si,Distrito y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca DDJJ y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca Distrito y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca No y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca No,DDJJ y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca No,Distrito y Acepta
#  Scenario: Validación de mensajes en modal CRS - Driver marca No,DDJJ, Distrito y Acepta
#  Scenario: Validación de mensaje genero es requerido
#  Scenario: Validación de mensaje fecha de nacimiento es requerido
#  Scenario: Validación de mensaje dirección es requerido
#  Scenario: Validación de mensaje dirección es muy corto
#  Scenario: Validación de mensaje distrito es requerido
#  Scenario: Validación de mensaje provincia es requerido
#  Scenario: Validación de mensaje departamento es requerido
#  Scenario: Validación de mensaje país es requerido
#  Scenario: Validación de mensaje ocupación es requerido
#  Scenario: Validación de mensaje fecha de inicio en Uber es requerido
#  Scenario: Validación de mensaje modelo de carro es requerido
#  Scenario: Validación de mensaje modelo de carro es muy corto
#  Scenario: Validación de mensaje anio de fabricación es requerido
#  Scenario: Validación de mensaje numero de placa es requerido
#  Scenario: Validación de mensaje numero de placa es muy corto
#  Scenario: Validación de carga de documento - semana actual es requerido
#  Scenario: Validación de carga de documento - semana anterior es requerido
#  Scenario: Validación de mensaje Horario de llamada es requerido
#  Scenario: Validación de autorización a mibanco para compartir datos y abandona la solicitud
#  Scenario: Validación de autorización a mibanco para compartir datos y No abandona la solicitud
#  Scenario: Validación de autorización a MO para compartir datos y abandona la solicitud
#  Scenario: Validación de autorización a MO para compartir datos y No abandona la solicitud
#  Scenario: Validación de mensaje tipo de domicilio es requerido
#  Scenario: Validación de mensaje dirección es requerido
#  Scenario: Validación de mensaje dirección es muy corto
#  Scenario: Validación de mensaje distrito es requerido
#  Scenario: Validación de mensaje provincia es requerido
#  Scenario: Validación de mensaje departamento es requerido
#  Scenario: Validación de mensaje estado civil es requerido
#  Scenario: Validación de mensaje nombres de Ref1 es requerido
#  Scenario: Validación de mensaje nombres de Ref1 es muy corto
#  Scenario: Validación de mensaje nombres de Ref1 es invalido, solo debe contener letras
#  Scenario: Validación de mensaje apellidos de Ref1 es requerido
#  Scenario: Validación de mensaje apellidos de Ref1 es muy corto
#  Scenario: Validación de mensaje apellidos de Ref1 es invalido, solo debe contener letras
#  Scenario: Validación de mensaje celular de Ref2 es requerido
#  Scenario: Validación de mensaje celular de Ref2 es invalido, empieza con 9 y debe tener solo números
#  Scenario: Validación de mensaje celular de Ref2 es muy corto
#  Scenario: Validación de mensaje por favor acepte los términos y condiciones
#  Scenario: Validación de carga dni frontal es requerido
#  Scenario: Validación de carga dni reverso es requerido
#  Scenario: Validación de carga recibo de luz o agua es requerido
#  Scenario: Validación de carga recibo de celular es opcional
#  Scenario: Validación de carga ganancia semana actual es requerido
#  Scenario: Validación de carga ganancia semana anterior es requerido
#  Scenario: Validación de carga tarjeta de propiedad es requerido
#  Scenario: Validación de carga soat vigente es requerido



















#    # Flujo Canal Digital MO
#  # Escenario N#1
#  @wip
#    #@storykey=T3TRIS-454
#  Scenario: Flujo Principal de Solicitud de Prestamos por Canal Digital MO para clientes con cuenta y monto=149/Cliente Aplica
#
#    # Escenario N#1
#  @wip
#    #@storykey=T3TRIS-454
#  Scenario: Flujo Principal de Solicitud de Prestamos por Canal Digital MO para clientes con cuenta y monto=149/Cliente No Aplica
#
#  # Escenario N#2
#  @wip
#   #@storykey=T3TRIS-454
#  Scenario: Flujo Principal de Solicitud de Prestamos por Canal Digital MO para clientes con cuenta y monto=150/Cliente Aplica
#    Given Driver accede a la URL enviada a su celular y visualiza la Landing
#    When Driver presiona el enlace Creditos
#    Then Driver visualiza el formulario de Creditos
#    And Driver presiona el boton Solicitar mi prestamo
#    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
#    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
#    When Driver selecciona el tipo de Credito "IMPREVISTOS"
#    And Driver ingresa el monto "150"
#    When Driver selecciona tipo de documento "DNI"
#    And Driver ingresa numero de documento "89764568"
#    And Driver ingresa nacionalidad "PERÚ"
#    And Driver ingresa sus nombres "nombres"
#    And Driver ingresa su apellido paterno "apPaterno"
#    And Driver ingresa su apellido materno "apMaterno"
#    And Driver selecciona su genero "HOMBRE"
#    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
#    And ingresa celular "987654321"
#    And ingresa correo "email@email.com"
#    And Driver confirma si tiene cargo publico "Sí"
#    And Driver selecciona respuesta para las tres preguntas "Sí"
#    And acepta terminos y condiciones
#    And Driver presiona boton Continuar
#    And Driver visualiza la primera pantalla informativa
#    And Driver visualiza la segunda pantalla informativa
#    And Driver visualiza la segunda pantalla de la Landing MB
#    And Driver ingresa su fecha de inicio en UBER "01/2009"
#    And Driver ingresa la marca del vehiculo "NISSAN"
#    And Driver ingresa selecciona el año de su vehiculo "2012"
#    And Driver ingresa el numero de placa "SQL-200"
#    And Driver selecciona su distrito "ATE"
#    And Driver ingresa su direccion de domicilio "Av. La Estrella 9082"
#    And Driver presiona boton Continuar
#    And Driver visualiza la tercera pantalla de la Landing MB
#    And Driver adjunta imagen balance de carreras semana actual "img007.png"
#    And Driver adjunta imagen balance de carreras semana anterior "img008.png"
#    #Si el Driver no tiene cuenta aparecera el control para el horario de llamada
#    And Driver presiona boton Continuar
#
#    And Driver visualiza la cuarta pantalla de la Landing MB
#    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales
#    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales
#    And Driver presiona boton Solicitar prestamo
#    And Driver visualiza el formulario de MO Crear Cuenta
#
#    # Escenario N#X
#  @wip
#   #@storykey=T3TRIS-454
#  Scenario: Flujo Principal de Solicitud de Prestamos por Canal Alternativo para clientes con cuenta y monto=701/Cliente Aplica
#    Given Driver accede a la URL enviada a su celular y visualiza la Landing
#    When Driver presiona el enlace Creditos
#    Then Driver visualiza el formulario de Creditos
#    And Driver presiona el boton Solicitar mi prestamo
#    When Driver ingresa el codigo UBER "DPPPXAZSJQ"
#    Then Driver visualiza mensaje de espera mientras Landing valida el codigo UBER
#    When Driver selecciona el tipo de Credito "IMPREVISTOS"
#    And Driver ingresa el monto "701"
#    When Driver selecciona tipo de documento "DNI"
#    And Driver ingresa numero de documento "89764568"
#    And Driver ingresa nacionalidad "PERÚ"
#    And Driver ingresa sus nombres "nombres"
#    And Driver ingresa su apellido paterno "apPaterno"
#    And Driver ingresa su apellido materno "apMaterno"
#    And Driver selecciona su genero "HOMBRE"
#    And Driver selecciona su ocupacion "TRANSPORTE PRIVADO INDEPENDIENTE"
#    And ingresa celular "987654321"
#    And ingresa correo "email@email.com"
#    And Driver confirma si tiene cargo publico "Sí"
#    And Driver selecciona respuesta para las tres preguntas "Sí"
#    And acepta terminos y condiciones
#    And Driver presiona boton Continuar
#    And Driver visualiza el modal Continua con tu Solicitud con los requisitos a reunir
#    And Driver selecciona el tipo de domicilio "ALOJADO"
#    And Driver ingresa su direccion de domicilio "Av. Primavera 8902 Surco"
#    And Driver selecciona su distrito "ATE"
#    And Driver selecciona provincia "LIMA"
#    And Driver selecciona departamento "LIMA"
#    And Driver selecciona pais "PERÚ"
#    And Driver selecciona estado civil "CONVIVIENTE"
#    And Driver selecciona tipo de documento de conviviente "DNI"
#    And Driver ingresa numero de documento de conviviente "44444444"
#
#    And Driver visualiza la segunda pantalla informativa
#    And Driver visualiza la segunda pantalla de la Landing MB
#    And Driver ingresa su fecha de inicio en UBER "01/2009"
#    And Driver ingresa la marca del vehiculo "NISSAN"
#    And Driver ingresa selecciona el año de su vehiculo "2012"
#    And Driver ingresa el numero de placa "SQL-200"
#
#    And Driver ingresa su direccion de domicilio "Av. La Estrella 9082"
#    And Driver presiona boton Continuar
#    And Driver visualiza la tercera pantalla de la Landing MB
#    And Driver adjunta imagen balance de carreras semana actual "img007.png"
#    And Driver adjunta imagen balance de carreras semana anterior "img008.png"
#    #Si el Driver no tiene cuenta aparecera el control para el horario de llamada
#    And Driver presiona boton Continuar
#
#    And Driver visualiza la cuarta pantalla de la Landing MB
#    And Driver autoriza a Mibanco para que pueda compartir con MO sus datos personales
#    And Driver autoriza a MO para que pueda compartir con Mibanco sus datos personales
#    And Driver presiona boton Solicitar prestamo
#    And Driver visualiza el formulario de MO Crear Cuenta












