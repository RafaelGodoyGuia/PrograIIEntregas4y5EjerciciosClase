package dominio;

import java.util.List;
import java.util.Random;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Matematicas {

    // ========== OPERACIONES CON LISTAS ==========

    public static List<Integer> obtenerListaPar(List<Integer> lista) {
        return lista.stream().filter(n -> n % 2 == 0).toList();
    }

    public static int sumaParesLista(List<Integer> lista) {
        return lista.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // ========== OPERACIONES NUMÉRICAS ==========

    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return IntStream.iterate(base, n -> n).limit(exponente).reduce((a, b) -> a * b).orElse(1);
    }

    public static int sumaNumerosConsecutivos(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    public static int sumaParesHasta(int limite) {
        return IntStream.iterate(0, n -> n <= limite, n -> n + 2).sum();
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    // ========== ESTADÍSTICA ==========

    public static double media(List<Double> numeros) {
        return numeros.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static double desviacionTipica(List<Double> numeros) {
        double promedio = media(numeros);
        return Math.sqrt(
                numeros.stream()
                        .mapToDouble(n -> Math.pow(n - promedio, 2))
                        .average()
                        .orElse(0.0)
        );
    }

    // ========== GENERACIÓN DE STREAMS ==========

    public static IntStream generarSecuenciaOf() {
        return IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public static IntStream generarSecuenciaRange() {
        return IntStream.range(0, 10);
    }

    public static IntStream generarSecuenciaIterate() {
        return IntStream.iterate(0, n -> n + 1).limit(10);
    }

    public static DoubleStream generarNumerosAleatorios() {
        return new Random().doubles(10, 0, 9);
    }

    // ========== OPERACIONES AVANZADAS ==========

    public static int productoEscalar(List<Integer> v1, List<Integer> v2) {
        return IntStream.range(0, v1.size())
                .map(i -> v1.get(i) * v2.get(i))
                .sum();
    }

    public static double integral(DoubleUnaryOperator funcion, double inicio, double fin, int intervalos) {
        double paso = (fin - inicio) / intervalos;
        return IntStream.range(0, intervalos)
                .mapToDouble(i -> funcion.applyAsDouble(inicio + (i + 0.5) * paso) * paso)
                .sum();
    }

    // ========== SUCESIÓN FIBONACCI ==========

    public static void mostrarFibonacci(int terminos) {
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(terminos)
                .forEach(f -> System.out.print(f[0] + " "));
    }

    public static long terminoFibonacci(int posicion) {
        return Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .skip(posicion)
                .findFirst()
                .get()[0];
    }

    // ========== UTILIDADES MATEMÁTICAS ==========

    public static List<Integer> generarPares(int maximo) {
        return IntStream.rangeClosed(0, maximo)
                .filter(n -> n % 2 == 0)
                .boxed()
                .toList();
    }
}


