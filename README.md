# Aproximación de Integrales con la Regla de Simpson 1/3

## 1. Implementación de la Regla de Simpson 1/3
Se creó una función llamada `integracion` que aplica la fórmula de Simpson 1/3.  
Esta función recibe otra función como parámetro (enfoque de programación funcional) y los límites de integración.  
La fórmula utilizada fue:

\[
\frac{b-a}{6} \left[f(a) + 4f\left(\frac{a+b}{2}\right) + f(b)\right]
\]

Con esto se obtiene una aproximación eficiente del valor de la integral sin necesidad de subdividir el intervalo.

---

## 2. Cálculo del Error
El error se calculó como la diferencia absoluta entre el valor esperado (del enunciado) y el valor obtenido mediante Simpson:

\[
\text{error} = | \text{valorReal} - \text{valorObtenido} |
\]

Para esto se creó una función llamada `error` que simplemente devuelve ese valor absoluto.

---

## 3. Evaluación de las Integrales
Cada integral fue evaluada enviando su función correspondiente a `integracion`.  
Ejemplo:

```scala
integracion(x => -x*x + 8*x - 12, 3, 5)
