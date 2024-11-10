public class GenericsTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set(10);
        Integer str = (Integer) type.get();
        System.out.println(str);

        GenericsTypeOld restu = new GenericsTypeOld();
        restu.set("restu");
        String rst = (String) restu.get();
        System.out.println(rst);
        // type casting, error prone and can cause ClassCastException
    }
}