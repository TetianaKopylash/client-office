package com.example.application.views.passwordupdate;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Password Update")
@Route(value = "password_update", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class PasswordUpdateView extends Composite<VerticalLayout> {

    private TextField textField = new TextField();

    private PasswordField passwordField = new PasswordField();

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private PasswordField passwordField2 = new PasswordField();

    private PasswordField passwordField3 = new PasswordField();

    private Button buttonPrimary = new Button();

    public PasswordUpdateView() {
        getContent().setHeightFull();
        textField.setLabel("Login");
        passwordField.setLabel("Temporaty password");
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        passwordField2.setLabel("New password");
        passwordField3.setLabel("Repeat new password");
        buttonPrimary.setText("Update password");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(textField);
        getContent().add(passwordField);
        getContent().add(layoutRow);
        layoutRow.add(passwordField2);
        layoutRow.add(passwordField3);
        getContent().add(buttonPrimary);
    }
}
