public class StringProblems {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        String str2 = "java programming";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // 3. substring()
        System.out.println("Substring (2, 6): " + str.substring(2, 6));

        // 4. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 5. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 7. equals()
        System.out.println("Equals str2: " + str.trim().equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // 9. contains()
        System.out.println("Contains 'Pro': " + str.contains("Pro"));

        // 10. startsWith()
        System.out.println("Starts with '  Ja': " + str.startsWith("  Ja"));

        // 11. endsWith()
        System.out.println("Ends with 'ing  ': " + str.endsWith("ing  "));

        // 12. indexOf()
        System.out.println("Index of 'a': " + str.indexOf('a'));

        // 13. lastIndexOf()
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // 14. replace()
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));

        // 15. split()
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.print("Split result: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 16. Concatenation
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Concatenation (+): " + s1 + " " + s2);
        System.out.println("Concatenation (concat): " + s1.concat(" ").concat(s2));
    }
}

