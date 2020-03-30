## Packages

*Packages* sind in erster Linie dazu da um den Code zu strukturieren. 
Werden Klassen aus einem anderen Package benötigt/im Code referenziert müssen diese mit einem 
`import` Statement importiert werden. 

Weil sich die `Car` und `Mechanic` Klasse im gleichen Package `com.codersbay.gerhofer.automobiles` befinden ist im `Mechanic` kein `import` Statement notwendig und 
die Klasse `Car` kann dort einfach verwendet werden. 

In der Klasse `Main` im Package `com.codersbay.gerhofer` brauchen wir sowohl für `Car` als auch für `Mechanic` ein `import` Statement. Die `Calculator` 
Klasse befindet sich allerdings auch im gleichen Package wie die `Main` Klasse, d.h. sie kann ohne einen expliziten Import Verwendet werden.

## Access Modifier 

Alle *privaten* Variablen sind nur innerhalb der Klasse verfügbar. Das heißt das Baujahr `year` und die Zulassung `admittance` innerhabl der `Car` Klasse verfügbar.
Alle *public* Variablen sind von überall verfügbar. Das heißt `color`, `model` und `brand` eines `Car`s sind von überall verfügbar.

Besitzt eine Variable keinen Access Modifier (private, public, protected) so ist die Variable *package-private* also in allen Klassen im gleichen Package verfügbar. 
D.h. `motor`, `cylinderCount` und `oil` der `Car`-Klasse sind zwar in der `Mechanic` Klasse verfügbar, weil sie im gleichen Package wie `Car` liegt. In der `Main` Klasse hingegen
ist keine der drei Variablen `motor`, `cylinderCount` und `oil` verfügbar

## Static vs non-static

Klassen sind Baupläne oder Blue-Prints für Objekte. Wird der Konstruktor einer Klasse aufgerufen durch Verwendung des `new` Schlüsselworts wird eine Instanz dieser Klasse erstellt. 
Mit dem `static` Schlüsselwort drückt man aus, dass eine Variable oder eine Methode nicht auf einer Instanz bzw. einem Objekt existiert sondern auf der Klasse. 

In der Klasse `Mechanic` gibt es beispielsweise eine statische Variable für die Steuer `TAX`. Diese Variable ist statisch, das heißt sie hat für alle Instanzen den gleichen Wert - und selbst ohne
dass es eine Instanz der Klasse `Mechanic` gibt, gibt es diese Variable und sie hat einen Wert. 
Anstelle auf die Variable mit `oeamtcMechanic.TAX` zuzugreifen empfiehlt es sich mit `Mechanic.TAX` auf ihren Wert zuzugreifen um den Unterschied zu visualisieren,
dass es sich um eine statischeh Variable handelt. 

Ein gutes Beispiel/ein guter Anwendungsfall für statische Methoden sind `Utility`-Klassen. Also Klassen die bestimmte Logiken abbilden ohne dass sie irgendwelche Klassenvariablen brauchen. 
Ein gutes Beispiel dafür ist die `java.util.Math` Klasse die lediglich statische Variablen und Methoden die das Rechnen erleichtern besitzt. 
In der `Math`-Klasse ist sogar der Konstruktor privat, das heißt es kann keine Instanz der Math Klasse erzeugt werden.