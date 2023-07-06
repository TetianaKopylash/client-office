package ua.com.tsa.views.editprofile;

import ua.com.tsa.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Edit Profile")
@Route(value = "profile", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class EditProfileView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private H2 h2 = new H2();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H3 h3 = new H3();

    private TextField textField = new TextField();

    private EmailField emailField = new EmailField();

    private PasswordField passwordField = new PasswordField();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private PasswordField passwordField2 = new PasswordField();

    private PasswordField passwordField3 = new PasswordField();

    private Button buttonPrimary = new Button();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    public EditProfileView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        h2.setText("Profile Settings");
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidthFull();
        h3.setText("Basic Information");
        textField.setLabel("Login");
        emailField.setLabel("Email");
        passwordField.setLabel("Old password");
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        passwordField2.setLabel("New password");
        passwordField3.setLabel("Repeat new password");
        buttonPrimary.setText("Save settings");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(textField);
        layoutColumn2.add(emailField);
        layoutColumn2.add(passwordField);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(passwordField2);
        layoutColumn2.add(passwordField3);
        layoutColumn2.add(buttonPrimary);
        getContent().add(layoutRow3);
    }
}
