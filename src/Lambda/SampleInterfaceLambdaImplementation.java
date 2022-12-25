package Lambda;
//implementation using anonymous fuction and Lambda
public class SampleInterfaceLambdaImplementation {
    public static void main(String[] args) {
        SampleInterface st=()->{//anonymous function ;
            System.out.println("Method implemented using lambda Expression");
        };
        st.sampleMethod();

    }
}
