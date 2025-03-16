import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;
import java.util.function.DoubleUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MatematicasTest {

    // ========== OPERACIONES CON LISTAS ==========

    @Test
    void obtenerListaPar_listaConParesEImpares() {
        // ... test code here ...
    }

    @Test
    void obtenerListaPar_listaSoloImpares() {
        // ... test code here ...
    }

    @Test
    void obtenerListaPar_listaSoloPares() {
        // ... test code here ...
    }

    @Test
    void obtenerListaPar_listaVacia() {
        // ... test code here ...
    }

    @Test
    void sumaParesLista_listaConParesEImpares() {
        // ... test code here ...
    }

    @Test
    void sumaParesLista_listaSoloImpares() {
        // ... test code here ...
    }

    @Test
    void sumaParesLista_listaSoloPares() {
        // ... test code here ...
    }

    @Test
    void sumaParesLista_listaVacia() {
        // ... test code here ...
    }

    // ========== OPERACIONES NUMÉRICAS ==========

    @Test
    void potencia_baseCero() {
        // ... test code here ...
    }

    @Test
    void potencia_exponenteCero() {
        // ... test code here ...
    }

    @Test
    void potencia_basePositiva_exponentePositivo() {
        // ... test code here ...
    }

    @Test
    void potencia_baseNegativa_exponentePositivo() {
        // ... test code here ...
    }

    @Test
    void sumaNumerosConsecutivos_nPositivo() {
        // ... test code here ...
    }

    @Test
    void sumaNumerosConsecutivos_nCero() {
        // ... test code here ...
    }

    @Test
    void sumaNumerosConsecutivos_nNegativo() {
        // ... test code here ...
    }

    @Test
    void sumaParesHasta_limitePositivoPar() {
        // ... test code here ...
    }

    @Test
    void sumaParesHasta_limitePositivoImpar() {
        // ... test code here ...
    }

    @Test
    void sumaParesHasta_limiteCero() {
        // ... test code here ...
    }

    @Test
    void sumaParesHasta_limiteNegativo() {
        // ... test code here ...
    }

    @Test
    void factorial_cero() {
        // ... test code here ...
    }

    @Test
    void factorial_uno() {
        // ... test code here ...
    }

    @Test
    void factorial_positivo() {
        // ... test code here ...
    }

    @Test
    void factorial_negativo() {
        // ... test code here ...
    }

    // ========== ESTADÍSTICA ==========

    @Test
    void media_listaConNumeros() {
        // ... test code here ...
    }

    @Test
    void media_listaVacia() {
        // ... test code here ...
    }

    @Test
    void desviacionTipica_listaConNumeros() {
        // ... test code here ...
    }

    @Test
    void desviacionTipica_listaVacia() {
        // ... test code here ...
    }

    @Test
    void desviacionTipica_listaConUnNumero() {
        // ... test code here ...
    }

    // ========== GENERACIÓN DE STREAMS ==========

    @Test
    void generarSecuenciaOf_verificaContenido() {
        // ... test code here ...
    }

    @Test
    void generarSecuenciaRange_verificaContenido() {
        // ... test code here ...
    }

    @Test
    void generarSecuenciaIterate_verificaContenido() {
        // ... test code here ...
    }

    @Test
    void generarNumerosAleatorios_verificaCantidadYRango() {
        // ... test code here ...
    }

    // ========== OPERACIONES AVANZADAS ==========

    @Test
    void productoEscalar_vectoresMismoTamano() {
        // ... test code here ...
    }

    @Test
    void productoEscalar_vectoresConNegativos() {
        // ... test code here ...
    }

    @Test
    void productoEscalar_vectoresVacios() {
        // ... test code here ...
    }

    @Test
    void integral_funcionLineal() {
        // ... test code here ...
    }

    @Test
    void integral_funcionConstante() {
        // ... test code here ...
    }

    @Test
    void integral_intervaloCero() {
        // ... test code here ...
    }

    @Test
    void integral_intervaloReverso() {
        // ... test code here ...
    }


    // ========== SUCESIÓN FIBONACCI ==========

    // mostrarFibonacci es void y imprime a consola, su testeo directo es más complejo.
    // Nos centraremos en terminoFibonacci

    @Test
    void terminoFibonacci_posicionCero() {
        // ... test code here ...
    }

    @Test
    void terminoFibonacci_posicionUno() {
        // ... test code here ...
    }

    @Test
    void terminoFibonacci_posicionDos() {
        // ... test code here ...
    }

    @Test
    void terminoFibonacci_posicionTres() {
        // ... test code here ...
    }

    @Test
    void terminoFibonacci_posicionDiez() {
        // ... test code here ...
    }

    // ========== UTILIDADES MATEMÁTICAS ==========

    @Test
    void generarPares_maximoPositivoPar() {
        // ... test code here ...
    }

    @Test
    void generarPares_maximoPositivoImpar() {
        // ... test code here ...
    }

    @Test
    void generarPares_maximoCero() {
        // ... test code here ...
    }

    @Test
    void generarPares_maximoNegativo() {
        // ... test code here ...
    }
}