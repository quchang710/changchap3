public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.0, 4.0);
        MyComplex c2 = new MyComplex(1.0, 2.0);

        System.out.println("Số phức c1: " + c1.toString());
        System.out.println("Số phức c2: " + c2.toString());

        c1.addInto(c2);
        System.out.println("Sau khi cộng c2 vào c1: " + c1.toString());
        MyComplex c3 = c1.addNew(c2);
        System.out.println("Cộng c2 và trả về số phức mới: " + c3.toString());

        System.out.println("c1 có phải là số thực? " + c1.isReal());
        System.out.println("c2 có phải là số ảo? " + c2.isImag());

        System.out.println("Độ lớn của c1: " + c1.magnitude());
    }
}
