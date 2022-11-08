# S107  ANNOTATIONS
Annotations
Descripció
Utilitza per a tots els exercicis Eclipse o IntelliJ.
No oblidis posar sempre les classes Java dins de packages.
Pots construir projectes Maven, Gradle o només Java.
Endavant!

Nivell 1
- Exercici 1
Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.

La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,  emprant @Override. 

Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.

En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.

En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.



- Exercici 2
Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.

Nivell 2
- Exercici 1
Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java en un fitxer JSON. L’anotació ha de rebre el directori on es col·locarà el fitxer resultant.

Nivell 3
- Exercici 1
Afegeix la possibilitat que l'anotació creada en el nivell anterior sigui registrada per la Virtual Machine en temps d'execució. Demostra que s'executa la lectura de l'annotation fent servir Java Reflection.
