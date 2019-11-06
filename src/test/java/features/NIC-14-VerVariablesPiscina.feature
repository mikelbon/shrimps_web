Feature: NIC-14 Flujos para visualizar variables de piscina
#  Como un bodeguero
#  Quiero visualizar las variables de cada piscina visto por fecha
#  Para validar la data registrada

  @wipx
  #@testcasekey=NICXXX
  Scenario: ESC01 - Ver variables de cada piscina por fecha
    Given soy un usuario de perfil bodeguero de la finca "finca1"
    When accedo a la URL raiz de la aplicacion y agregando el id "97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo"
    #Then la aplicacion pide mi usuario "nicosoft" y password "password"
    #Then deberia visualizar la cantidad correcta de piscinas de esta finca
   # When bodeguero cambia a la vista por fecha
    #And visualiza los datos por fecha para cada piscina

   # Examples:
     # | usuario  | password | finca  | id_encriptado                               |
     # | nicosoft | password | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
      #| nicosoft | password | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
      #| nicosoft | password | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |

#  Scenario Outline: ESC02 - Validar calendario para fechas futuras se encuentre deshabilitado
#    Given soy un usuario de perfil bodeguero de la finca "<finca>"
#    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
#    Then deberia visualizar la cantidad correcta de piscinas de esta finca
#    When bodeguero cambia a la vista por fecha
#    And visualiza los datos por fecha para cada piscina
#    When presiono la fecha de Hoy
#    Then deberia mostrarse el calendario del mes
#    And deberia mostrarse la fecha de mañana en modo deshabilitado
#
#    Examples:
#      | finca  | id_encriptado                               |
#      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
#      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
#      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |
#
#  Scenario Outline: ESC03 - Validar calendario para fechas anteriores, la informacion debe ser correcta
#    Given soy un usuario de perfil bodeguero de la finca "<finca>"
#    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
#    Then deberia visualizar la cantidad correcta de piscinas de esta finca
#    When bodeguero cambia a la vista por fecha
#    And visualiza los datos por fecha para cada piscina
#    When presiono la fecha de Hoy
#    Then deberia mostrarse el calendario del mes
#    When cambio a la fecha de ayer
#    Then deberia verse la data de cada piscina para la fecha seleccionada
#
#    Examples:
#      | finca  | id_encriptado                               |
#      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
#      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
#      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |
#
#  Scenario Outline: ESC04 - Validar variables de los datos productivos
#    Given soy un usuario de perfil bodeguero de la finca "<finca>"
#    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
#    Then deberia visualizar la cantidad correcta de piscinas de esta finca
#    And visualiza los datos por piscina
#    When ingreso o actualizo datos productivos de Alimento diario para la fecha de hoy "<alimentoDiario>"
#    And ingreso o actualizo datos productivos de Tipo Alimento para la fecha de hoy "<tipoAlimento>"
#    And ingreso o actualizo datos productivos de Peso Vivo para la fecha de hoy "<pesoVivo>"
#    And ingreso o actualizo datos productivos de Supervivencia  para la fecha de hoy "<supervivencia>"
#    And espero "<cantidadMinutos>" minutos para que se graben los datos
#    Then valido que los datos productivos fueron grabados al cambiar de vista y volver
#
#    Examples:
#      | finca  | id_encriptado                               | alimentoDiario | tipoAlimento | pesoVivo | supervivencia | cantidadMinutos |
#      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo | 1              | 2            | 3        | 4             | 3               |
#      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE | 1              | 2            | 3        | 4             | 2               |
#      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE | 1              | 2            | 3        | 4             | 1               |
#
#  Scenario Outline: ESC05 - Validar variables de los parametros
#    Given soy un usuario de perfil bodeguero de la finca "<finca>"
#    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
#    Then deberia visualizar la cantidad correcta de piscinas de esta finca
#    And visualiza los datos por piscina
#    When ingreso o actualizo parametros de OxigenoAM "<oxigenoAM>"
#    And ingreso o actualizo parametros de OxigenoPM "<oxigenoPM>"
#    And ingreso o actualizo parametros de TemperaturaAM "<temperaturaAM>"
#    And ingreso o actualizo parametros de TemperaturaPM "<temperaturaPM>"
#    And ingreso o actualizo parametros de Salinidad "<salinidad>"
#    And ingreso o actualizo parametros de Transparencia "<transparencia>"
#    And ingreso o actualizo parametros de PH "<PH>"
#    And ingreso o actualizo parametros de Alcalinidad "<alcalinidad>"
#    And espero "<cantidadMinutos>" minutos para que se graben los datos
#    Then valido que los datos de parametros fueron grabados al cambiar de vista y volver
#
#    Examples:
#      | finca  | id_encriptado                               | oxigenoAM | oxigenoPM | temperaturaAM | temperaturaPM | salinidad | transparencia | PH | alcalinidad |
#      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo | 1         | 2         | 3             | 4             | 4         | 4             | 4  | 4           |
#      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE | 1         | 2         | 3             | 4             | 4         | 4             | 4  | 4           |
#      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE | 1         | 2         | 3             | 4             | 4         | 4             | 4  | 4           |
