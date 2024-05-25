## Programa 5.- ¿Dónde quedó el robot?

Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y “en una matriz de 15 * 15.
8	0	X	0	0	0	0	0	0	0	0	0	0	8	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	X	0	0	0	8

- El robot comienza en la coordenada (0, 0).
- Para indicar que se mueva, acepta “5” números enteros, pueden ser positivos o negativos y guárdalos en un arreglo, estos significaran la secuencia de pasos que dará.  
INICIO	PASOS	TERMINA
14,14	5,4,-2,4,5	14,10
0,0	8,1,-5,2	0,2

- El robot SIEMPRE SIGUE LA SIGUIENTE RUTA Derecha, Abajo, Izquierda, Arriba, siempre y cuando no esté en los límites. 
- Si esta en un LIMITE o Topa mientras camina, entonces los pasos faltantes de ese trayecto los dará en la siguiente indicación.  (D, B, I, A)
- Cuando sea numero negativo, retroceda sobre los mismos pasos que ya había recorrido, si faltan pasos los realizara en la dirección que te encuentras. 
-Deberá validar que el primero número ingresado, sea positivo

