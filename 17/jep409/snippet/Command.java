public sealed interface Command 
permits SuperUserCommand, PrivilegeCommand, NormalCommand {
    void executeMe();
}
