package servlet;

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private User user;

    @Inject @QWeekPasswordGenerator
    private IPasswordGenerator weakPasswordGenerator;

    @Inject @QStrongPasswordGenerator
    private IPasswordGenerator strongPasswordGenerator;

}
