public sealed abstract class Command 
permits SuperUserCommand, PrivilegeCommand, NormalCommand {
    public abstract void executeMe();
}