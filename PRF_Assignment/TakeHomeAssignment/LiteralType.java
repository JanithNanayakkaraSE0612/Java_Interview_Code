package PRF_Assignment.TakeHomeAssignment;

public class LiteralType {
        public static void main(String[] args) {
            int decimalLiteral = 42;         // Decimal
            int octalLiteral = 052;          // Octal (42 in decimal)
            int hexadecimalLiteral = 0x2A;    // Hexadecimal (42 in decimal)

            System.out.println(decimalLiteral);
            System.out.println(octalLiteral);
            System.out.println(hexadecimalLiteral);

            double standardNotation = 3.14;      // Standard notation
            double scientificNotation = 5.2e2;   // Scientific notation (520.0 in decimal)
            
            System.out.println(standardNotation);
            System.out.println(scientificNotation);

            char charLiteral = 'A';
            System.out.println(charLiteral);

            String stringLiteral = "Hello, Java!";
            System.out.println(stringLiteral);

            boolean trueLiteral = true;
            boolean falseLiteral = false;

            System.out.println(trueLiteral);
            System.out.println(falseLiteral);

            String nullValue = null;
            System.out.println(nullValue);

        }
}
