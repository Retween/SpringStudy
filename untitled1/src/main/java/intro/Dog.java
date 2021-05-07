package intro;

public class Dog implements Pet {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private void init(){
        System.out.println("init");
    }

    protected void destroy(){
        System.out.println("destroy");
    }
    public Dog() {
        System.out.println("Dog bean");
    }

    public void say() {
        System.out.println("Bark");
    }
}
