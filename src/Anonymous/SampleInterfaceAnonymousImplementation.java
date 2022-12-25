package Anonymous;
// implement it using an Anonymous  Class .
public class SampleInterfaceAnonymousImplementation {

    public static void main(String[] args) {
        SampleInterface si= new SampleInterface() {
            @Override
            public void sampleMethod() {
                System.out.println("Method implemented using Anonymous Class");
            }
        };
        si.sampleMethod();
    }

}
