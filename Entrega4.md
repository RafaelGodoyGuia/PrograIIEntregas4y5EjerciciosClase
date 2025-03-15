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
