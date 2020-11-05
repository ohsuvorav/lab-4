import org.junit.Test;

import static org.junit.Assert.*;

public class JavaDeveloperTest {

    @Test
    public void getSkills() {
        String [] skills ={"Java","Kotlin", "SQL", "Git"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Oleg", skills);
        String[] actualArray= javaDeveloper.getSkills();
        String[] expected = skills;
        assertArrayEquals(actualArray,expected);
    }
}