package InterfacePractice;
public class TestClient {
    public static int getVal() {
        return 42;
    }
    public static void main(String[] arsgs) {
        InterfaceA a = new X();
        a.foo(); 
        a.bar(); 
    }
 }