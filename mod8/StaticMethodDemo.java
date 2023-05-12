class StaticMethodDemo {
public void display1() {
System.out.println("One");
}
public static void display2() {
System.out.println("Two");
}
}
class TestStaticMethodDemo {
public static void main(String[] arg) {
StaticMethodDemo obj1 = new StaticMethodDemo();
obj1.display1();
StaticMethodDemo.display2();
obj1.display1();
}
}
