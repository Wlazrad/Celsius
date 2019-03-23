package servlet;

import javax.enterprise.context.Dependent;

@Dependent
@QWeekPasswordGenerator
public class WeekPasswordGenerator extends PasswordGenerator{
    public String generate() {
        return "AlaMaKota";
    }
}
