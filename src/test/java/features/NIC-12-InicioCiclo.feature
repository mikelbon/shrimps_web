Feature: NIC-12 Flujos Inicio Ciclo
  Como un bodeguero
  Quiero registrar el inicio basico de un ciclo
  Para organizar los datos recolectados

  @wipx
    @testcasekey=NICXXX
  Scenario Outline: ESC01 - Inicio de ciclo - flujo productivo
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
    Then deberia visualizar el mensaje Aun no has iniciado un ciclo en esta piscina
    When bodeguero selecciona una piscina sin ciclo iniciado
    And ingreso la fecha de inicio de ciclo "<fecha>"
    And ingreso la cantidad de camarones "<cantidadCamarones>"
    Then visualizo la densidad de siembra
    When ingreso el peso de siembra "<pesoSiembra>"
    And presiono el boton ingresar
    Then visualizo el panel de datos productivos para la fecha seleccionada

    Examples:
      | finca  | id_encriptado                               | fecha    | cantidadCamarones | pesoSiembra |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo | 18/10/19 | 50000             | 2           |
      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE | 18/10/19 | 50000             | 3           |
      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE | 18/10/19 | 50000             | 10          |

  Scenario Outline: ESC02 - Inicio de ciclo - flujo productivo
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
    Then deberia visualizar la cantidad correcta de piscinas de esta finca
    When bodeguero selecciona una piscina con ciclo productivo activo
    Then se debe redireccionar a la vista por piscina

    Examples:
      | finca  | id_encriptado                               |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |

  Scenario Outline: ESC03 - Inicio de ciclo - Flujos alternativos - Valida Fecha
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
    Then deberia visualizar el mensaje Aun no has iniciado un ciclo en esta piscina
    When bodeguero selecciona una piscina sin ciclo iniciado
    And ingreso la cantidad de camarones "<cantidadCamarones>"
    Then visualizo la densidad de siembra
    When ingreso el peso de siembra "<pesoSiembra>"
    Then visualizo que el boton ingresar continua inhabilitado
    Examples:
      | finca  | id_encriptado                               |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |

  Scenario Outline: ESC04 - Inicio de ciclo - Flujos alternativos - Valida Cantidad de camarones
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
    Then deberia visualizar el mensaje Aun no has iniciado un ciclo en esta piscina
    When bodeguero selecciona una piscina sin ciclo iniciado
    And ingreso la fecha de inicio de ciclo "<fecha>"
    And ingreso la cantidad de camarones "<cantidadCamarones>"
    Then visualizo la densidad de siembra
    When ingreso el peso de siembra "<pesoSiembra>"
    Then visualizo un mensaje de validacion para el campo cantidad de camarones
    Examples:
      | finca  | id_encriptado                               | fecha    | cantidadCamarones | pesoSiembra |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo | 18/10/19 | 0                 | 1           |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo | 18/10/19 | 99000001          | 10          |


