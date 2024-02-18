package test;

public class EnvTest {


    public static void main(String[] args) {

        String envVariable = System.getenv("myEnvVariable");
        System.out.println(envVariable);

    }
}
