import dominio.Matematicas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MatematicasTest {

    // ========== OPERACIONES CON LISTAS ==========

    @Test
    void obtenerListaPar_listaConParesEImpares() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> outputEsperado = Arrays.asList(2, 4, 6, 8);
        assertEquals(outputEsperado, Matematicas.obtenerListaPar(lista));
    }

    @Test
    void obtenerListaPar_listaSoloImpares() {
        List<Integer> lista = Arrays.asList(1, 3, 5 ,7 , 9);
        List<Integer> esperado = Collections.emptyList();
        assertEquals(esperado, Matematicas.obtenerListaPar(lista));
    }

    @Test
    void obtenerListaPar_listaSoloPares() {
        List<Integer> lista = Arrays.asList(2, 4, 6, 8);
        List<Integer> esperado = Arrays.asList(2, 4, 6, 8);
        assertEquals(esperado, Matematicas.obtenerListaPar(lista));
    }

    @Test
    void obtenerListaPar_listaVacia() {
        List<Integer> lista = Collections.emptyList();
        List<Integer> esperado = Collections.emptyList();
        assertEquals(esperado, Matematicas.obtenerListaPar(lista));
    }

    @Test
    void sumaParesLista_listaConParesEImpares() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int esperado = 2 + 4 + 6 + 8;
        assertEquals(esperado, Matematicas.sumaParesLista(lista));
    }

    @Test
    void sumaParesLista_listaSoloImpares() {
        List<Integer> lista = Arrays.asList(1, 3, 5, 7, 9);
        int esperado = 0;
        assertEquals(esperado, Matematicas.sumaParesLista(lista));
    }

    @Test
    void sumaParesLista_listaSoloPares() {
        List<Integer> lista = Arrays.asList(2, 4, 6, 8);
        int esperado = 2 + 4 + 6 + 8;
        assertEquals(esperado, Matematicas.sumaParesLista(lista));
    }

    @Test
    void sumaParesLista_listaVacia() {
        List<Integer> lista = Collections.emptyList();
        int esperado = 0;
        assertEquals(esperado, Matematicas.sumaParesLista(lista));
    }

    // ========== OPERACIONES NUMÉRICAS ==========

    @Test
    void potencia_baseCero() {
        assertEquals(0, Matematicas.potencia(0, 3));
    }

    @Test
    void potencia_exponenteCero() {
        assertEquals(1, Matematicas.potencia(5, 0));
    }

    @Test
    void potencia_basePositiva_exponentePositivo() {
        assertEquals(8, Matematicas.potencia(2, 3));
    }

    @Test
    void potencia_baseNegativa_exponentePositivo() {
        assertEquals(-8, Matematicas.potencia(-2, 3));
    }

    @Test
    void sumaNumerosConsecutivos_nPositivo() {
        assertEquals(1 + 2 + 3 + 4 + 5, Matematicas.sumaNumerosConsecutivos(5));
    }

    @Test
    void sumaNumerosConsecutivos_nCero() {
        assertEquals(0, Matematicas.sumaNumerosConsecutivos(0));
    }

    @Test
    void sumaNumerosConsecutivos_nNegativo() {
        assertEquals(0, Matematicas.sumaNumerosConsecutivos(0));
    }

    @Test
    void sumaParesHasta_limitePositivoPar() {
        assertEquals(12, Matematicas.sumaParesHasta(6));
    }

    @Test
    void sumaParesHasta_limitePositivoImpar() {
        assertEquals(0, Matematicas.sumaParesHasta(7));
    }

    @Test
    void sumaParesHasta_limiteCero() {
        assertEquals(0, Matematicas.sumaParesHasta(0));
    }

    @Test
    void sumaParesHasta_limiteNegativo() {
        assertEquals(0, Matematicas.sumaParesHasta(-1));
    }

    @Test
    void factorial_cero() {
        assertEquals(1, Matematicas.factorial(0));
    }

    @Test
    void factorial_uno() {
        assertEquals(1, Matematicas.factorial(1));
    }

    @Test
    void factorial_positivo() {
        assertEquals(5 * 4 * 3 * 2, Matematicas.factorial(5));
    }

    @Test
    void factorial_negativo() {
        assertEquals(1, Matematicas.factorial(-1));
    }

    // ========== ESTADÍSTICA ==========

    @Test
    void media_listaConNumeros() {
        List<Double> numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        assertEquals(3.0, Matematicas.media(numeros), 0.001);
    }

    @Test
    void media_listaVacia() {
        List<Double> numeros = Collections.emptyList();
        assertEquals(0.0, Matematicas.desviacionTipica(numeros), 0.001);
    }

    @Test
    void desviacionTipica_listaConNumeros() {
        List<Double> numeros = Arrays.asList(2.0, 3.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0);
        assertEquals(2.0, Matematicas.desviacionTipica(numeros), 0.001);
    }

    @Test
    void desviacionTipica_listaVacia() {
        List<Double> numeros = Collections.emptyList();
        assertEquals(0.0, Matematicas.desviacionTipica(numeros), 0.001);
    }

    @Test
    void desviacionTipica_listaConUnNumero() {
        List<Double> numeros = Arrays.asList(5.0);
        assertEquals(0.0, Matematicas.desviacionTipica(numeros), 0.001);
    }

    // ========== GENERACIÓN DE STREAMS ==========

    @Test
    void generarSecuenciaOf_verificaContenido() {
        // Verifica que la secuencia generada por of sea correcta
        IntStream secuencia = Matematicas.generarSecuenciaOf();
        int[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(esperado, secuencia.toArray(), "La secuencia generada por of debería ser [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }

    @Test
    void generarSecuenciaRange_verificaContenido() {
        // Verifica que la secuencia generada por range sea correcta
        IntStream secuencia = Matematicas.generarSecuenciaRange();
        int[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(esperado, secuencia.toArray(), "La secuencia generada por range debería ser [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }

    @Test
    void generarSecuenciaIterate_verificaContenido() {
        // Verifica que la secuencia generada por iterate sea correcta
        IntStream secuencia = Matematicas.generarSecuenciaIterate();
        int[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(esperado, secuencia.toArray(), "La secuencia generada por iterate debería ser [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }

    @Test
    void generarNumerosAleatorios_verificaCantidadYRango() {
        // Verifica que se generen 10 números aleatorios en el rango [0, 9)
        DoubleStream numerosAleatorios = Matematicas.generarNumerosAleatorios();
        long cantidad = numerosAleatorios.count();
        assertEquals(10, cantidad, "Deberían generarse 10 números aleatorios");

        // Verifica que los números estén dentro del rango [0, 9)
        numerosAleatorios = Matematicas.generarNumerosAleatorios();
        assertTrue(numerosAleatorios.allMatch(n -> n >= 0 && n < 9), "Los números aleatorios deberían estar en el rango [0, 9)");
    }

    // ========== OPERACIONES AVANZADAS PRODUCTO A ESCALAR ==========

    @Test
    void productoEscalar_vectoresMismoTamano() {
        // Cuando los vectores tienen el mismo tamaño, el producto escalar debería calcularse correctamente
        List<Integer> v1 = List.of(1, 2, 3);
        List<Integer> v2 = List.of(4, 5, 6);
        int resultado = Matematicas.productoEscalar(v1, v2);
        assertEquals(32, resultado, "El producto escalar de [1, 2, 3] y [4, 5, 6] debería ser 32");
    }

    @Test
    void productoEscalar_vectoresConNegativos() {
        // Cuando los vectores contienen números negativos, el producto escalar debería calcularse correctamente
        List<Integer> v1 = List.of(1, -2, 3);
        List<Integer> v2 = List.of(4, 5, -6);
        int resultado = Matematicas.productoEscalar(v1, v2);
        assertEquals(-24, resultado, "El producto escalar de [1, -2, 3] y [4, 5, -6] debería ser -24");
    }

    @Test
    void productoEscalar_vectoresVacios() {
        // Cuando los vectores están vacíos, el producto escalar debería ser 0
        List<Integer> v1 = List.of();
        List<Integer> v2 = List.of();
        int resultado = Matematicas.productoEscalar(v1, v2);
        assertEquals(0, resultado, "El producto escalar de vectores vacíos debería ser 0");
    }

    // ========== OPERACIONES AVANZADAS INTEGRAL ==========

    @Test
    void integral_funcionLineal() {
        // Cuando la función es lineal, el resultado debería ser el área del trapecio
        DoubleUnaryOperator funcion = x -> 2 * x; // Función lineal f(x) = 2x
        double resultado = Matematicas.integral(funcion, 0, 5, 1000);
        assertEquals(25.0, resultado, 0.01, "La integral de f(x) = 2x en [0, 5] debería ser 25");
    }

    @Test
    void integral_funcionConstante() {
        // Cuando la función es constante, el resultado debería ser el área del rectángulo
        DoubleUnaryOperator funcion = x -> 4.0; // Función constante f(x) = 4
        double resultado = Matematicas.integral(funcion, 0, 5, 1000);
        assertEquals(20.0, resultado, 0.01, "La integral de f(x) = 4 en [0, 5] debería ser 20");
    }

    @Test
    void integral_intervaloCero() {
        // Cuando el intervalo es cero (inicio == fin), el resultado debería ser 0
        DoubleUnaryOperator funcion = x -> x * x; // Función cuadrática f(x) = x^2
        double resultado = Matematicas.integral(funcion, 3, 3, 1000);
        assertEquals(0.0, resultado, 0.01, "La integral de f(x) = x^2 en [3, 3] debería ser 0");
    }

    @Test
    void integral_intervaloReverso() {
        // Cuando el intervalo es inverso (inicio > fin), el resultado debería ser negativo
        DoubleUnaryOperator funcion = x -> x; // Función lineal f(x) = x
        double resultado = Matematicas.integral(funcion, 5, 0, 1000);
        assertEquals(-12.5, resultado, 0.01, "La integral de f(x) = x en [5, 0] debería ser -12.5");
    }


    // ========== SUCESIÓN FIBONACCI ==========

    // mostrarFibonacci es void y imprime a consola, su testeo directo es más complejo.
    // Nos centraremos en terminoFibonacci

    @Test
    void terminoFibonacci_posicionCero() {
        // El término en la posición 1 de la sucesión de Fibonacci es 1
        long resultado = Matematicas.terminoFibonacci(1);
        assertEquals(1, resultado, "El término en la posición 1 de Fibonacci debería ser 1");
    }

    @Test
    void terminoFibonacci_posicionUno() {
        // El término en la posición 0 de la sucesión de Fibonacci es 0
        long resultado = Matematicas.terminoFibonacci(0);
        assertEquals(0, resultado, "El término en la posición 0 de Fibonacci debería ser 0");
    }

    @Test
    void terminoFibonacci_posicionDos() {
        // El término en la posición 2 de la sucesión de Fibonacci es 1
        long resultado = Matematicas.terminoFibonacci(2);
        assertEquals(1, resultado, "El término en la posición 2 de Fibonacci debería ser 1");
    }

    @Test
    void terminoFibonacci_posicionTres() {
        // El término en la posición 3 de la sucesión de Fibonacci es 2
        long resultado = Matematicas.terminoFibonacci(3);
        assertEquals(2, resultado, "El término en la posición 3 de Fibonacci debería ser 2");
    }

    @Test
    void terminoFibonacci_posicionDiez() {
        // El término en la posición 10 de la sucesión de Fibonacci es 55
        long resultado = Matematicas.terminoFibonacci(10);
        assertEquals(55, resultado, "El término en la posición 10 de Fibonacci debería ser 55");
    }

    // ========== UTILIDADES MATEMÁTICAS ==========

    @Test
    void generarPares_maximoPositivoPar() {
        // Cuando el máximo es positivo y par, la lista debería contener todos los pares hasta el máximo
        List<Integer> resultado = Matematicas.generarPares(8);
        assertEquals(List.of(0, 2, 4, 6, 8), resultado, "La lista debería contener los números pares hasta 8 cuando el máximo es 8");
    }

    @Test
    void generarPares_maximoPositivoImpar() {
        // Cuando el máximo es positivo e impar, la lista debería contener todos los pares hasta el máximo
        List<Integer> resultado = Matematicas.generarPares(7);
        assertEquals(List.of(0, 2, 4, 6), resultado, "La lista debería contener los números pares hasta 6 cuando el máximo es 7");
    }

    @Test
    void generarPares_maximoCero() {
        // Cuando el máximo es cero, el único número par en el rango es el 0
        List<Integer> resultado = Matematicas.generarPares(0);
        assertEquals(List.of(0), resultado, "La lista debería contener solo el número 0 cuando el máximo es 0");
    }

    @Test
    void generarPares_maximoNegativo() {
        // Cuando el máximo es negativo, no debería haber números pares en el rango
        List<Integer> resultado = Matematicas.generarPares(-5);
        assertTrue(resultado.isEmpty(), "La lista debería estar vacía cuando el máximo es negativo");
    }
}
