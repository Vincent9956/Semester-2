# Lernzettel: Grundlagen der Digitaltechnik

## Übersicht
- Zahlen und Zahlensysteme
  - Aufbau und Wandlung von Zahlensystemen
  - Rechnen mit Binärwerten
- Codes und Logische Verknüpfungen
- Schaltalgebra und Schaltungssynthese
- Sequenzielle Schaltungen und Halbleiter

## Zahlen und Zahlensysteme

### Grundlagen der Zahlen
- Zahlen sind mathematische Objekte, die zur Messung und Zählung verwendet werden.
- Sie können addiert und subtrahiert werden und haben physikalische Bezüge zur realen Welt.
- Natürliche Zahlen, ganze Zahlen und ihre Erweiterungen (z.B. negative Zahlen).

### Zahlensysteme
- **Dezimalsystem (Basis 10)**
  - Verwendet Ziffern 0-9
- **Binärsystem (Basis 2)**
  - Verwendet Ziffern 0 und 1
  - Grundlegend für Computertechnologie
- **Hexadezimalsystem (Basis 16)**
  - Verwendet Ziffern 0-9 und Buchstaben A-F
  - Nützlich in der Computertechnik
- **Oktalsystem (Basis 8)**
  - Verwendet Ziffern 0-7
  - Verwendet in bestimmten Bereichen der Informatik

### Wandlung von Zahlensystemen
- **Dezimal zu Binär:** Fortgesetzte Division durch 2
- **Dezimal zu Hexadezimal:** Fortgesetzte Division durch 16
- **Binär zu Dezimal:** Multiplikation der Ziffern mit 2^n
- **Hexadezimal zu Binär:** Auflösung in 4er-Bündel

### Rechnen mit Binärwerten
- **Addition:**
  - 0 + 0 = 0
  - 0 + 1 = 1
  - 1 + 1 = 10 (mit Übertrag)
- **Subtraktion:**
  - 0 - 0 = 0
  - 1 - 0 = 1
  - 1 - 1 = 0
  - 0 - 1 = 1 (mit Entlehnung)
- **Multiplikation:**
  - 0 * 0 = 0
  - 1 * 0 = 0
  - 1 * 1 = 1
- **Division:**
  - 1 : 1 = 1
  - 0 : 1 = 0

## Codes

### Arten von Codes
- **BCD (Binary Coded Decimal):**
  - Dezimalziffern werden in 4-Bit-Binärzahlen codiert.
- **Gray-Code:**
  - Benachbarte Zahlen unterscheiden sich nur in einem Bit.
  - Nützlich zur Fehlervermeidung in sequentiellen Schaltungen.

### Codierung und Decodierung
- **Codierung:** Umwandlung von Daten in ein spezielles Format zur effizienten Übertragung oder Speicherung.
- **Decodierung:** Rückumwandlung des codierten Formats in das ursprüngliche Datenformat.
- **ASCII:** 7-Bit-Zeichenkodierung zur Darstellung von Text.

## Logische Verknüpfungen

### Grundverknüpfungen
- **UND (AND):** Ergebnis ist wahr, wenn alle Eingangsvariablen wahr sind.
- **ODER (OR):** Ergebnis ist wahr, wenn mindestens eine Eingangsvariable wahr ist.
- **NICHT (NOT):** Kehrt den Zustand der Eingangsvariable um.

### Erweiterte Verknüpfungen
- **NAND:** Negiertes UND
- **NOR:** Negiertes ODER
- **XOR:** Exklusiv ODER (true, wenn ungerade Zahl der Eingangsvariablen true sind)
- **XNOR:** Äquivalenz (true, wenn gerade Zahl der Eingangsvariablen true sind)

## Schaltalgebra

### Gesetze der Booleschen Algebra
- **Identitätsgesetz:** A + 0 = A, A * 1 = A
- **Null- und Einsgesetz:** A + 1 = 1, A * 0 = 0
- **Komplementärgesetz:** A + ¬A = 1, A * ¬A = 0
- **Idempotenzgesetz:** A + A = A, A * A = A
- **Distributivgesetz:** A * (B + C) = (A * B) + (A * C)
- **De Morgansche Gesetze:** ¬(A + B) = ¬A * ¬B, ¬(A * B) = ¬A + ¬B

## Schaltungssynthese

### Normalformen
- **Disjunktive Normalform (DNF):** ODER-Verknüpfung von UND-Verknüpfungen
- **Konjunktive Normalform (KNF):** UND-Verknüpfung von ODER-Verknüpfungen

### Minimierung von Schaltfunktionen
- Ziel ist es, die Schaltfunktion so zu vereinfachen, dass der Aufwand bei der technischen Realisierung minimal ist.
- **Karnaugh-Veitch-Diagramm:** Methode zur Vereinfachung logischer Ausdrücke.

## Sequenzielle Schaltungen und Halbleiter
- **Sequenzielle Schaltungen:** Verarbeiten von Signalen basierend auf der Reihenfolge und dem Zeitpunkt der Eingabe.
- **Halbleiter:** Materialbasis für elektronische Bauelemente, die in digitalen Schaltungen verwendet werden.

Dieser Lernzettel fasst die wesentlichen Inhalte der Digitaltechnik aus der Präsentation zusammen. Weitere Vertiefungen und Beispiele sind in der originalen Präsentation zu finden.
