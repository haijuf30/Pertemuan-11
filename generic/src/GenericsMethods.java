public class GenericsMethods {
    // Java Generic Method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Jufri");
        
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        
        // Print the comparison result
        System.out.println("g1 and g2 are equal: " + isEqual);
        
        // Using type inference (no need to specify <String> explicitly)
        boolean isEqualInference = GenericsMethods.isEqual(g1, g2);
        
        // Print the comparison result using type inference
        System.out.println("g1 and g2 are equal (with type inference): " + isEqualInference);
    }
}