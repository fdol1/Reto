#language: es

Característica: Realizar registro de uno o mas usuarios en Tools qa

  Antecedentes:
    Dado que fer ingresa a la pagina de ToolsQa

  @RutaCritica
    @RegistroDeUsuario
  Esquema del escenario: Realizar registro de usuario
    Dado que fer ingresa al registro de usuario
    Cuando Ingresa los datos de registro
      | nombre1   | nombre2   | email   | edad   | salario   | departamento   |
      | <nombre1> | <nombre2> | <email> | <edad> | <salario> | <departamento> |
    Entonces al confirma el registro lo visualiza en la tabla
    Ejemplos:
      | nombre1 | nombre2  | email         | edad | salario | departamento |
      | luis    | fernando | l1_@gmail.com | 49   | 50000   | sistemas     |

  @EliminarUsuario
  Escenario: Realizar eliminacion de usuario
    Dado que fer ingresa al registro de usuario
    Cuando busca el usuario a eliminar por el correo: kierra@example.com
    Entonces realiza busqueda en la tabla sin encontrar el registro

  @SeleccionarFechas
  Esquema del escenario: : Seleccionar fechas
    Dado que fer ingresa al modulo de fechas
    Cuando seleccionar las fechas del menu
      | mes   | anio   | dia   | hora   |
      | <mes> | <anio> | <dia> | <hora> |
    Entonces verifica que las fechas ingresadas correspondan a las de la prueba
    Ejemplos:
      | mes      | anio | dia | hora  |
      | November | 2022 | 23  | 23:45 |


  @ventanas
  Escenario: Interaccion con ventanas en el portal tool qa
    Dado que fer ingresa al modulo de Alerts, frame y windows
    Cuando interactua con la seccion de navegador y ventanas
