　　class A {
　　}
　　public class Instance1 {
　　public static void main(String args[]) {
　　try {
　　Class cls = Class.forName("A");
　　boolean b1 = cls.isInstance(new Integer(37));
　　System.out.println(b1);
　　boolean b2 = cls.isInstance(new A());
　　System.out.println(b2);
　　} catch (Throwable e) {地方撒地方
　　System.err.println(e);
　}
　　}
　　}