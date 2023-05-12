class Foo1 {
int x = 0;
int y = 0;
void p() {
int x = 1;
System.out.println("x = " + x);
System.out.println("y = " + y);
}
}
class TestFoo1 {
public static void main(String[] args) {
Foo1 myObj1 = new Foo1();
System.out.println(myObj1.x);
myObj1.p();
}
}
