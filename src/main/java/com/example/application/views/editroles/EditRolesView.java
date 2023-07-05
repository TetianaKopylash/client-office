package com.example.application.views.editroles;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Edit Roles")
@Route(value = "roles", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class EditRolesView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private H2 h2 = new H2();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H5 h5 = new H5();

    private MultiSelectListBox textItems = new MultiSelectListBox();

    private Button buttonPrimary = new Button();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private H5 h52 = new H5();

    private TextField textField = new TextField();

    private Button buttonPrimary2 = new Button();

    public EditRolesView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        h2.setText("Roles");
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutColumn2.setHeightFull();
        layoutColumn2.setWidth(null);
        h5.setText("Current roles");
        setTextItemsSampleData(textItems);
        buttonPrimary.setText("Delete");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        h52.setText("New role");
        textField.setLabel("Enter new role's name");
        buttonPrimary2.setText("Create");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(h5);
        layoutColumn2.add(textItems);
        layoutColumn2.add(buttonPrimary);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(h52);
        layoutColumn3.add(textField);
        layoutColumn3.add(buttonPrimary2);
    }

    private void setTextItemsSampleData(MultiSelectListBox multiSelectListBox) {
        multiSelectListBox.setItems("Show assignee", "Show due date", "Show status");
        multiSelectListBox.select("Show assignee", "Show status");
    }
}
