import static org.junit.Assert.*;

public class KotlinDeveloperTest {

    @org.junit.Test
    public void writeCode() {
        KotlinDeveloper kotlinDeveloper= new KotlinDeveloper();
        String actual = kotlinDeveloper.writeCode();
        String expected ="Kotlin dev writes Kotlin code...";
        assertEquals(actual,expected);
    }
}