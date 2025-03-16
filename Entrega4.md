# Ejercicio 34
## ¿Qué es un algoritmo?
Una secuencia finita y ordenada de pasos no ambiguos, ejecutables y que definen un proceso bien definido para resolver un problema específico o realizar una tarea.
# Ejercicio 35
##  Escriba dos algoritmos en Java y esos mismos dos algoritmos en C para resolver el mismo problema. Por ejemplo, puede escribir un algoritmo recursivo y otro iterativo (con un bucle) para resolver el problema de la suma de los n primeros números naturales.
### Función en C
```
int sumaNnaturalesFormulaC(int n) {
    if (n <= 0) {
        return 0;
    }
    return (n * (n + 1)) / 2;
  }
```
### Función en Java
```
public static int sumaNnaturalesFormulaJava(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n * (n + 1)) / 2;
    }
```
# Ejercicio 36
## Defina O(n) en términos de un límite de cociente de funciones.
Decimos que una función f(n) es O(n) si se cumple que el límite del cociente de f(n) dividido por n, cuando n tiende a infinito, es un valor finito.

# Ejercicio 37
## La fórmula para calcular el espacio recorrido por un móvil que se deja caer al vacío (suponiendo v0 = 0) es e = 1/2 gt^2, donde g es la aceleración de la gravedad en la superficie de la tierra, y t el tiempo que  está cayendo el móvil. ¿Cuál es la complejidad temporal de este cálculo en función de t?
La complejidad es constante O(1)

# Ejercicio 38
## Indique la complejidad temporal asintótica de los siguientes métodos:
```
public static String primero(ArrayList<String> lista)
{
return lista.get(0);
}
```
Complejidad O(1)
```
public static String nEsimo(ArrayList<String> lista, int n)
{
return lista.get(n);
}
```
Complejidad O(1)


# Ejercicio 39
## Calcule la complejidad temporal de los algoritmos del ejercicio 35.
Los algoritmos del ejercicio 35, independientemente de cual sea (ya que son iguales pero en distinto lenguaje) tienen complejidad O(1)

# Ejercicio 40
## Resuelva cualquiera de los apartados del ejercicio 11 y calcule su complejidad temporal.
### La suma de 0 + 1 + 2 + ... + n
```
public class suma123n {
    public static int suma123nIterativo (int n) {
        int m = 1;
        for (int i = n + 1; i <= n; i++) {
            m += i;
        }
        return (m);
    }  
}
```
Tiene complejidad O(n) porque el bucle se recorre n veces con una complejidad O(1)

# Ejercicio 41
## Calcule la complejidad temporal y espacial de cualquiera de los algoritmos (recursivos) del ejercicio 2 (salvo los referentes a la serie de Fibonacci). Compare dichas complejidades con el algoritmo iterativo para resolver el mismo problema.
```
public class Factorial {
    public static int factorial (int n) {
        if (n > 1)
            return (n *factorial (n - 1));
        else
            return (1);
    }
}
```
La complejidad es O(n) porque la recursividad ocurre n veces con una complejidad O(1)

# Ejercicio 42
## Sea un conjunto A con cardinalidad n, y sea l un algoritmo que ejecuta una instrucción para cada elemento del producto cartesiano de A × A. Calcule la complejidad temporal de l en función de n.
Si un conjunto tiene n elementos, su producto cartesiano tiene n^2 elementos, por lo que la complejidad algorítmica será O(n^2)

# Ejercicio 43
## Calcule la complejidad temporal del siguiente método:
```
public static double sumaEltosMatriz(double matriz[][])
{
    double suma = 0; //O(1)
    for(int i = 0; i < matriz.length; i++) //O(n) y contando con el bucle anidado O(n^2)
    {
        for(int j = 0; j < matriz[i].length; j++) //O(n)
        {
            suma+=matriz[i][j]; //O(1)
        }
    }
    return suma; //O(1)
}
```
La complejidad del algoritmo es O(n^2)

# Ejercicio 44
## Escriba un algoritmo que busque un número en un array de enteros. Calcule su complejidad temporal en el caso peor, en el caso mejor y en el caso promedio. Su cabecera será la siguiente:
```
public class BusquedaArray {
    public static int buscarNumeroEnArray(int[] array, int numero) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
```
En el mejor caso, el número está en la primera posición del array, por lo que es O(1)
En el caso promedio, el núemro está en la posición del medio del array, por lo que es f(1/2 * n) o simplificando O(n)
En el peor caso, el número está en la posición final del array, por lo que tiene que recorrer n posiciones y su complejidad será O(n)


# Ejercicio 46
##  Calcule las complejidades temporal y espacial del algoritmo recursivo para calcular el elemento n-ésimo de la sucesión de Fibonacci.
```
public class FibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

```
Caso promedio con una complejidad O(n) debido a que la cantidad máxima de memoria usada por la pila de recursión es proporcional a n

# Ejercicio 47
## Se tiene el siguiente método:
```
 public static int sumaNPrimeros(int n) {
 int suma = 0;
 for (int i = 1; i <= n; i++) {
 suma += i;
 }
 return suma;
 }
```
## Utilizando el profiler de Netbeans se han medido los tiempos de ejecución de diferentes llamadas al método (véase el cuadro 1). Explique los resultados.
| Llamada               | Tiempo de ejecución |
|-----------------------|---------------------|
| sumaNPrimeros (100)   | 0,003 ms            |
| sumaNPrimeros (1000)  | 0,013 ms            |
| sumaNPrimeros (10000) | 0,131 ms            |
| sumaNPrimeros (100000)| 1,20 ms             |
| sumaNPrimeros (1000000)| 3,27 ms             |
| sumaNPrimeros (10000000)| 6,19 ms             |
| sumaNPrimeros (100000000) | 36 ms              |
| sumaNPrimeros (1000000000)| 325 ms             |

- El método sumaNPrimeros(n) realiza la suma de los primeros n números naturales mediante un bucle for. Su complejidad temporal es 0(n) siendo un crecimiento lineal
- Para valores pequeños de n (como 100 o 1000), el tiempo de ejecución es muy bajo. Esto se debe a que el bucle se ejecuta pocas veces
- Para valores grandes de n (como 100000000 o 1000000000), el tiempo de ejecución aumenta significativamente. Lo que confirma el crecimiento lineal.

# Ejercicio 48
## Se tiene el siguiente método:
```
 public static int sumaNMPrimeros(int n) {
 int suma = 0;
 for (int i = 1; i <= n; i++) {
 for(int j = 1; j <= i; j++)
 suma += j;
 }
 return suma;
 }
```
## Utilizando el profiler de Netbeans se han medido los tiempos de ejecución de diferentes llamadas al método (véase el cuadro 2). Explique los resultados.
| Llamada                | Tiempo de ejecución |
|------------------------|---------------------|
| sumaNPrimeros (100)    | 0,085 ms            |
| sumaNPrimeros (1000)   | 2,16 ms             |
| sumaNPrimeros (10000)  | 18,1 ms             |
| sumaNPrimeros (100000) | 1531 ms             |

- Esto es una suma aritmética, lo que nos da una complejidad de 0(n^2) ya que el tiempo de ejecucion aumenta proporcionalmente con n^2 
- Para valores pequeños de n (como 100), el tiempo de ejecución es bajo. Esto se debe al numero total de interacciones que no representa una carga significativa para el procesador
- Para valores grandes de n (como 100000), el tiempo de ejecución aumenta drásticamente. Esto se debe al numero total de interacciones que representa una carga significativa para el procesador

# Ejercicio 49
## Explique la definición que se muestra a continuación Sean dos funciones T : N → N y f : N → N. Se dice que T(n) es de orden f(n), y se escribe T(n) ∈ O(f(n)), si y sólo si existen dos números naturales k yn0 tales que, para todo m, también natural, que cumpla m > n0, entonces T(m) ≤ k·f(m).
Explicación de la definición de T(n) ∈ O(f(n)). 
- Funcion T(n) → Representa el tiempo de ejecución de un algoritmo en función del tamaño de la entrada n
- Funcion f(n) → Es una función que describe un comportamiento asintótico de referencia
- Constante k → Es un factor de proporcionalidad que permite escalar la función f(n)  para que sea una cota superior de T(n)
- Umbral n0 → Es un valor de n a partir del cual la desigualdad T(m) ≤ k·f(m) se cumple para todo m > n0 
- Interpretacion de T(m) ≤ k·f(m) → Esta desigualdad indica que, para valores de m suficientemente grandes (m > n0) el tiempo de ejecucion no crece mas rapido que k

# Ejercicio 50
## Asumiendo la definición del ejercicio 48, se pide:
## Encontrar k y n0 que muestren que la siguiente función, T : N → N, es de orden O(log2(n)): T(n) = 3·log2(n) +2.
## ¿Si T(n) ∈ O(log2(n)), entonces T(n) ∈ O(n)? Justifique la respuesta.
## ¿Si T(n) ∈ O(log3(n)), entonces T(n) ∈ O(log2(n))? Justifique la res puesta.
- Con k = 4 y n0 = 4 se cumple que T(n) <= 4 * log2(n) para todo n >= 4. Por tanto T(n) ∈ O(log2(n))
- Si T(n) ∈ O(log2(n)) entonces T(n) ∈ 0(n) porque log2(n) crece mas lentamente que n
- Si T(n) ∈ O(log3(n)) entonces T(n) ∈ O(log2(n)) porque log3(n) y log2(n) estan relacionados por una consrante multiplicativa

# Ejercicio 51
## Estudie de forma comparativa entre ellas el crecimiento de las siguientes funciones reales de variable real:
## f0(x) = 1, f1(x) = x, f2(x) = x2, f3(x) = log2(x), y f4(x) = 2x
- f0(x) = 1 → No crece con x. Siempre tiene el mismo valor, independientemente de x
- f1(x) = x → Crece proporcionalmente con x. Si x se duplica f1(x) tambien se duplica
- f2(x) = x2 → Crece proporcionalmente con x^2. Si x se duplica f2(x) se cuadriplica
- f3(x) = log2(x) → Crece muy lentamente. A medida que x aumenta f3(x) aumenta, pero a un ritmo decreciente 
- f4(x) = 2x → Crece muy rápidamente. Si x aumenta en 1, f4(x) se duplica

Conclusion: El orden de crecimiento d elas funciones es: Constante < Logaritmica < Lineal < Cuadratica < Exponencial

# Ejercicio 52
## Calcule la complejidad temporal asintótica del método f:
```
 public static int f(int n) {
 if (n == 0) return 1;
 else if (n < 0) return-1;
 else{
 int m = 1/f(n/2) + f(n/2);
 return sumaNPrimeros(m);
 }
 }
```
##  Para los cálculos, suponga que no hay en ningún momento desbordamiento de pila, y no tenga en cuenta los efectos sobre la ejecución que pueda suponer el desbordamiento de un entero
La complejidad temporal asintótica del método f es 0(n). Esto se debe a que el método realiza dos llamadas recursivas con n/2 en cada paso, lo que resulta en un crecimiento lineal con respecto a n. La contribución de sumaNPrimeros(m) es despreciable en comparación con las llamadas recursivas, ya que m es una constante pequeña

# Ejercicio 53
## La complejidad en el caso peor de la inserción en un array list es diferente si el array list está ordenado de si no lo está. ¿Es cierta esta afirmación? Justifique la respuesta.
La afirmación es cierta. La complejidad en el caso peor de la inserción en un ArrayList es diferente si el ArrayList está ordenado o no:
- En un ArrayList no ordenado, la inserción al final tiene una complejidad de 0(1)
- En un ArrayList ordenado, la inserción tiene una complejidad de 0(n) debido a la necesidad de buscar la posición correcta y desplazar elementos.

Por lo tanto, mantener un ArrayList ordenado implica un costo adicional en la inserción de elementos

# Ejercicio 54
## Suponga que una instrucción tarda en ejecutarse 10 ns, y que el tamaño de la entrada es n = 100, se pide calcular el tiempo requerido para los siguientes números de ejecuciones:
##  log(n),  n, nlog(n), n^2, n^8 y 10^n
## Realice los cálculos anteriores, pero ahora bajo los siguientes supuestos: n =100.000,  n = 100.000 y el tiempo de instrucción (o bloque de instrucciones) 1 ms.
Caso 1
- log(n) → log(100) ≈ 4.605, T= 4.605×10ns = 46.05ns
- n → T = 100×10ns = 1000ns = 1μs
- nlog(n) → 100×log(100) ≈ 100×4.605 = 460.5, T = 460.5×10ns = 4605ns = 4.605μs
- n^2 → 100^2 =10000, T = 10000×10ns = 100000ns = 100μs
- n^8 → 100^8 = 10^16, T=10^16×10ns = 10^17ns = 10^11s ≈ 3.17×10^3 años
- 10^n → 10^100, T = 10^100x10ns = 10^101ns = 10^92s

Para n = 100 las expresiones log(n),n y nlog(n) tienen tiempos de ejecución manejables. Sin embargo, n^8 y n^10 tienen tiempos de ejecución extremadamente grandes, incluso inviables.

Caso 2
- log(n) → log(100000) ≈ 11.513, T = 11.513×1ms = 11.513ms
- n → T = 100000×1ms = 100000ms = 100s
- nlog(n) → 100000×log(100000) ≈ 100000×11.513 = 1.1513×10^6, T=1.1513×10^6×1ms = 1.1513×10^6ms = 1151.3s ≈ 19.19minutos
- n^2 → 100000^2 = 10^10, T = 10^10x1ms = 10^10ms = 10^7s ≈ 115.74 dias
- n^8 → 100000^8 = 10^40, T = 10^40x1ms = 10^40ms = 10^37s ≈ 3.17×10^29 años
- 10^n → 10^100000, T=10^100000×1ms = 10^100000ms = =10^99997s

Para n = 100000, las expresiones log(n) y n tienen tiempos de ejecución manejables. Sin embargo, nlog(n), n^2, n^8 y 10^n tienen tiempos de ejecución extremadamente grandes, lo que resalta la importancia de elegir algoritmos eficientes para problemas con entradas grandes.

# Ejercicio 55
##  Explique por qué el problema del ajedrez todavía no está resuelto
- La enorme complejidad computacional del juego, con un número astronómico de posiciones posibles.
- Las limitaciones de la tecnología actual, que no pueden manejar una búsqueda exhaustiva de todas las posiciones.
- El hecho de que, aunque teóricamente existe un valor de juego, no se ha podido determinar debido a la complejidad del ajedrez.
  
Aunque los motores de ajedrez modernos son extremadamente fuertes y pueden jugar a un nivel superhumano, resolver el ajedrez por completo (es decir, determinar el resultado perfecto con juego óptimo) sigue siendo un problema abierto en la informática y la teoría de juegos