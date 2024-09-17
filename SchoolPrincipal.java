public class SchoolPrincipal {
    private static SchoolPrincipal principal;

    private SchoolPrincipal() {
        System.out.println("A new principal has been appointed");
    }

    public static SchoolPrincipal getInstance() {
        if(principal == null) {
            principal = new SchoolPrincipal(); 
        }
        return principal;
    }

    public void makeAnnouncement() {
        System.out.println("The principal is making an announcement.");
    }
}
