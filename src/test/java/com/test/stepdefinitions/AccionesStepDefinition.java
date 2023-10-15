package com.test.stepdefinitions;

import com.test.interactions.SeleccionarOpcion;
import com.test.model.FechaYHoraModel;
import com.test.model.RegistroUsuarioModel;
import com.test.questions.VerificarFechas;
import com.test.questions.VerificarUsuarioEliminado;
import com.test.questions.VerificarUsuarioEnLista;
import com.test.questions.VerificarVentanaPrincipal;
import com.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccionesStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la pagina de ToolsQa$")
    public void queCristianIngresaALaPaginaDeToolsQa(String actor) {
        theActorCalled(actor).wasAbleTo(AbrirNavegador.enLaPagina());
    }

    @Dado("^que (.*) ingresa al registro de usuario$")
    public void queFerIngresaAlRegistroDeUsuario(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarATablaDeUsuarios.enTablaDeUsuarios());
    }

    @Cuando("^Ingresa los datos de registro$")
    public void ingresaLosDatosDeRegistro(List<RegistroUsuarioModel> registroUsuarioDataList) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuarios.enTablaDeUsuarios(registroUsuarioDataList.get(0)));
    }

    @Entonces("^al confirma el registro lo visualiza en la tabla$")
    public void alConfirmaElRegistroLoVisualizaEnLaTabla() {
        theActorInTheSpotlight().should(seeThat(VerificarUsuarioEnLista.deRegistros()));

    }
    ///**************************************************************************************************************************************************************

    @Cuando("^busca el usuario a eliminar por el correo: (.*)$")
    public void buscaElUsuarioAEliminarPorElCorreo(String email) {
        theActorInTheSpotlight().attemptsTo(EliminarUsuario.deLaTabla(email));
    }

    @Entonces("^realiza busqueda en la tabla sin encontrar el registro$")
    public void realizaBusquedaEnLaTablaSinEncontrarElRegistro() {
        theActorInTheSpotlight().should(seeThat(VerificarUsuarioEliminado.deLaTabla()));
    }

    //******************************************************************************************************************************************

    @Dado("^que (.*) ingresa al modulo de fechas$")
    public void queFerIngresaAlModuloDeFechas(String actor) {
        theActorCalled(actor).attemptsTo(IngresarAFechas.enDataPicker());
    }

    @Cuando("^seleccionar las fechas del menu$")
    public void seleccionarLasFechasDelMenu(List<FechaYHoraModel> fechaYHoraModelList) {
        theActorInTheSpotlight().attemptsTo(SeleccionarFechasYHora.enDataPicker(fechaYHoraModelList.get(0)));
    }

    @Entonces("^verifica que las fechas ingresadas correspondan a las de la prueba$")
    public void verificaQueLasFechasIngresadasCorrespondanALasDeLaPrueba() {
        theActorInTheSpotlight().should(seeThat(VerificarFechas.seleccionadas()));
    }

    ///////*************************************************************************************************************************************

    @Dado("^que (.*) abre una nueva pestania emergente$")
    public void abreUnaNuevaPestaniaEmergente(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarASeccionVentanas.paraAbrirUnNuevaPestania());
    }
    @Cuando("^selecciona la opcion del boton$")
    public void seleccionaLaOpcionDelBoton(List<String> opcion) {
        theActorInTheSpotlight().attemptsTo(AbrirVentanaEmergente.enElPortal(opcion.get(1)));

    }
    @Entonces("^Verifica haber vuelto a la pestania principal$")
    public void verificaHaberVueltoALaPestaniaPrincipal() {
        theActorInTheSpotlight().should(seeThat(VerificarVentanaPrincipal.delPortal()));
    }

    ///////*************************************************************************************************************************

    @Dado("^que (.*) ingresa al modulo de alertas$")
    public void queFerIngresaAlModuloDeAlertas(String actor) {
        theActorCalled(actor).wasAbleTo(IngresarASeccionAlertas.ParaActivarlas());

    }

    @Cuando("^selecciona un tipo de alerta$")
    public void seleccionaUnTipoDeAlerta(List<String> opcion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.emergente(opcion.get(1)));
    }
}