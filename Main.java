//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        directory.addStudent(alice, 90);
        directory.addStudent(bob, 85);
        directory.addStudent(alice, 95);

        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());

        System.out.println(directory);
    }
}