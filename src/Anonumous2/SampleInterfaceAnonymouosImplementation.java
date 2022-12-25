package Anonumous2;
// if we have more than one mmethod in the interface . We can implement only via Anomymous Classes but not Lambda.

public class SampleInterfaceAnonymouosImplementation {
    public static void main(String[] args) {


        SampleInterface si = new SampleInterface() {
            @Override
            public void f1() {
                System.out.println("Method F1 implemented using Anonymous Class");
            }

            @Override
            public void f2() {
                System.out.println("Method f2 implemented using Anonyomous Class");

            }
        };
        si.f1();
        si.f2();
    }
}


