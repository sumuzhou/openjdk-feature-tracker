public sealed class PrivilegeCommand implements Command permits InfraCommand {
    public void executeMe() {
        System.out.println("Sounds cool to have some privileges.\n");
    }
}
