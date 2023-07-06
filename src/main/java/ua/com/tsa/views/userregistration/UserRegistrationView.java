package ua.com.tsa.views.userregistration;

import ua.com.tsa.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("User Registration")
@Route(value = "registration", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class UserRegistrationView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private TextField textField = new TextField();

    private EmailField emailField = new EmailField();

    private ComboBox comboBox = new ComboBox();

    private Button buttonPrimary = new Button();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    public UserRegistrationView() {
        getContent().setWidthFull();
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        textField.setLabel("Login");
        emailField.setLabel("Email");
        comboBox.setLabel("Role");
        setComboBoxSampleData(comboBox);
        buttonPrimary.setText("Register");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        getContent().add(layoutRow2);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(textField);
        layoutColumn2.add(emailField);
        layoutColumn2.add(comboBox);
        layoutColumn2.add(buttonPrimary);
        layoutRow.add(layoutColumn3);
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        comboBox.setItems("First", "Second", "Third", "Fourth");
        comboBox.setValue("Second");
    }
}
