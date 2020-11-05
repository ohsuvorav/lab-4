public class Main {

    public static void main(String[] args) {
        String [] skills ={"Java","Kotlin", "SQL", "Git"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Oleg", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer" + javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}