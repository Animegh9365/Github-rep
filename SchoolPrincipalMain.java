public class SchoolPrincipalMain {
    public static void main(String[] args) {
        SchoolPrincipal principal1 = SchoolPrincipal.getInstance();
        principal1.makeAnnouncement();
        System.out.println(principal1);

        SchoolPrincipal principal2 = SchoolPrincipal.getInstance();
        principal2.makeAnnouncement();
        System.out.println(principal2);
    }
}
