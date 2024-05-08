public class AnonmyousInnerClass {
    void setup(){
        System.out.println("harsh");
    }
}
class harsh extends AnonmyousInnerClass{
    void setup(){
        System.out.println("King");
    }
}
class king{
    public static void main(String[] args) {
        AnonmyousInnerClass a=new harsh();
        a.setup();
    }
}