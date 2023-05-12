class StaticVariableDemo {
public int x = 0;
public static int y = 7;
public final int Z = 123;
}
class TestStaticVariableDemo {
public static void main(String[] args) {
StaticVariableDemo obj1 = new StaticVariableDemo();
StaticVariableDemo obj2 = new StaticVariableDemo();
System.out.println("Initialize condition");
System.out.println("\tx1 = " + obj1.x);
System.out.println("\ty1 = " + obj1.y);
System.out.println("\tZ1 = " + obj1.Z);
System.out.println();
System.out.println("\tx2 = " + obj2.x);
System.out.println("\ty2 = " + obj2.y);
System.out.println("\tZ2 = " + obj2.Z);
System.out.println();
obj1.x = 1;
obj1.y = 1;
System.out.println("After update obj1");
System.out.println("\tx1 = " + obj1.x);
System.out.println("\ty1 = " + obj1.y);
System.out.println("\tZ1 = " + obj1.Z);
System.out.println();
System.out.println("\tx2 = " + obj2.x);
System.out.println("\ty2 = " + obj2.y);
System.out.println("\tZ2 = " + obj2.Z);
System.out.println();
obj2.x = 2;
obj2.y = 2;
System.out.println("After update obj2");
System.out.println("\tx1 = " + obj1.x);
System.out.println("\ty1 = " + obj1.y);
System.out.println("\tZ1 = " + obj1.Z);
System.out.println();
System.out.println("\tx2 = " + obj2.x);
System.out.println("\ty2 = " + obj2.y);
System.out.println("\tZ2 = " + obj2.Z);
System.out.println();
System.out.println("Value of static variable, y");
System.out.println("\ty = " + StaticVariableDemo.y);
}
}

