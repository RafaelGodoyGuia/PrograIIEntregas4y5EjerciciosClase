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
