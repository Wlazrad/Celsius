package servlet;

import javax.enterprise.context.Dependent;

@Dependent
@QStrongPasswordGenerator
public class StrongPasswordGenerator extends PasswordGenerator {
    public String generate() {
        return "A1a_+M@-K0ta";
    }
}
