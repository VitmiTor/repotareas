package MaestroPokemonTests;

import base.BaseTest;
import models.MaestroPokemonModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaestroPokemonTests extends BaseTest {
    private MaestroPokemonModel maestro1;
    private MaestroPokemonModel maestro2;


    @BeforeMethod
    public void agregarValores() {
        maestro1 = new MaestroPokemonModel();
        maestro2 = new MaestroPokemonModel();

        maestro1.getApellido();
        maestro1.getEdad();
        maestro1.getEmail();
        maestro1.getPeso();
        maestro1.getPais();
        maestro1.isEsHombre();

        maestro2.getApellido();
        maestro2.getEdad();
        maestro2.getEmail();
        maestro2.getPeso();
        maestro2.getPais();
        maestro2.isEsHombre();

        logs.info("Nombre Pokemon Master 1 " + maestro1.getNombre());
        logs.info("Nombre Pokemon Master 2 " + maestro2.getNombre());
        logs.info("Soy la precondición del test de MaestroPokemonTests");
    }

    @Test
    public void prueba1() {
        logs.info("Hola soy el primer test");
    }

    @Test
    public void compararNombresTest() {
        logs.info("Verificando que los nombres de los maestros pokemons sean iguales");
        var nombre1 = maestro1.getNombre();
        var nombre2 = maestro2.getNombre();
        Assert.assertEquals(nombre2, nombre1);
    }

    @Test
    public void compararEspecialidadTest() {
        logs.info("Verificando que la especialidad de los maestros pokemons sean iguales");
        var especilidad1 = maestro1.getEspecialidad();
        var especialidad2 = maestro2.getEspecialidad();
        Assert.assertEquals(especialidad2, especilidad1);
    }

    @Test
    public void compararApellidoCodigoEspecialidadTest() {
        logs.info("Verificando que las especialidades de los maestros pokemons sean iguales");
        var especilidad1 = maestro1.getEspecialidad();
        var especialidad2 = maestro2.getEspecialidad();
        softAssert.assertEquals(especialidad2, especilidad1, "Las especialidades no son iguales");
        logs.info("Verificar que el codigo de especialidad de los maestros pokemons sean iguales");
        var codigoMaestro1 = maestro1.getCodigoEspecialidad();
        var codigoMaestro2 = maestro2.getCodigoEspecialidad();
        softAssert.assertEquals(codigoMaestro1, codigoMaestro2, "Los codigos de especialidades no son iguales");

        softAssert.assertAll();
    }

    @Test
    public void validarEspecialidadPokemonTest() {
        logs.info("Verificando que el maestro pokemon 1 sea efectivamente un maestro pokemon por su especialidad");
        var especialidad1 = maestro1.getEspecialidad();
        softAssert.assertEquals(especialidad1, "Maestro Pokemon");
        logs.info("Verificando que maestro pokemon 2 sea efectivamente un maestro pokemon por su especialidad");
        var especialidad2 = maestro2.getEspecialidad();
        softAssert.assertEquals(especialidad2, "Maestro Pokemon");
        logs.info("OK ambos son Maestros pokemons según su especialidad");

        softAssert.assertAll();
    }

    @Test
    public void validaCodigoEspecialidadTest() {
        logs.info("Verificando que el Maestro pokemon 1 sea efectivamente un maestro pokemon por su codigo de " +
                " especialidad ");
        var codigo1 = maestro1.getCodigoEspecialidad();
        softAssert.assertEquals(codigo1, "PO-01");
        logs.info("Verificando que el Maestro pokemon 2 sea efectivamente un maestro pokemon por su codigo de " +
                " especialidad ");
        var codigo2 = maestro2.getCodigoEspecialidad();
        softAssert.assertEquals(codigo2, "PO-01");
        logs.info("OK ambos son Maestros pokemons según su cóodigo de especialidad");

        softAssert.assertAll();
    }

    @Test
    public void validaInformacionMaestroTest() {
        logs.info("Verificando que el maestro pokemon 1 sea efectivamente un maestro pokemon por la especiadlidad");
        var especialidad1 = maestro1.getEspecialidad();
        var codigo1 = maestro1.getCodigoEspecialidad();
        Assert.assertEquals(especialidad1, "Maestro Pokemon");
        Assert.assertEquals(codigo1, "PO-01");
    }

    @AfterMethod
    public void postcondition() {
        logs.info(maestro1.mostrarInformacion());
        logs.info(maestro2.mostrarInformacion());
        logs.info("Soy la postcondición del test de MaestroPokemonTests");
    }
}
