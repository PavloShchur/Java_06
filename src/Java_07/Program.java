package Java_07;

public class Program {

	public static void main(String[] args) {
		String[] lefts = { "cat", "dog", "bird", "elephant" };
        String[] rights = { "orange", "black", "blue", "grey" };

        // Loop over both arrays and display paired strings.
        for (int i = 0; i < lefts.length; i++) {
            String left = lefts[i];
            String right = rights[i];

            // Add padding to the right.
            // ... Add padding to the left.
            String value = String.format("%1$-10s %2$10s", left, right);
            System.out.println(value);
        }
//		String h = "Hello";
//	    System.out.println(String.format("%-4700s", h));
    }
	}


