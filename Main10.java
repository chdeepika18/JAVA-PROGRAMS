class phone {
    void call() {
        System.out.println("Calling...");
    }
}
class Smartphone extends phone {
    void browse() {
        System.out.println("Browsing internet...");
    }
}
 public class Main10 {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.call(); //inherited from phone
        sp.browse(); // own method
    }
 }