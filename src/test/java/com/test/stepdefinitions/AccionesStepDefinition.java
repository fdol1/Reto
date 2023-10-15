package com.test.stepdefinitions;

import com.test.model.FechaYHoraModel;
import com.test.model.RegistroUsuarioModel;
import com.test.questions.VerificarFechas;
import com.test.questions.VerificarUsuarioEliminado;
import com.test.questions.VerificarUsuarioEnLista;
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
    ///**************

    @Cuando("^busca el usuario a eliminar por el correo: (.*)$")
    public void buscaElUsuarioAEliminarPorElCorreo(String email) {
        theActorInTheSpotlight().attemptsTo(EliminarUsuario.deLaTabla(email));
    }

    @Entonces("^realiza busqueda en la tabla sin encontrar el registro$")
    public void realizaBusquedaEnLaTablaSinEncontrarElRegistro() {
        theActorInTheSpotlight().should(seeThat(VerificarUsuarioEliminado.deLaTabla()));
    }

    //******************

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
}