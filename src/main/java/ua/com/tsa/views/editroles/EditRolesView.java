package ua.com.tsa.views.editroles;

import ua.com.tsa.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
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

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private H5 h5 = new H5();

    private RadioButtonGroup radioGroup = new RadioButtonGroup();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    private H5 h52 = new H5();

    private TextField textField = new TextField();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private HorizontalLayout layoutRow4 = new HorizontalLayout();

    private Button buttonPrimary = new Button();

    private HorizontalLayout layoutRow5 = new HorizontalLayout();

    private Button buttonPrimary2 = new Button();

    public EditRolesView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        h2.setText("Roles");
        layoutColumn2.setWidth(null);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutColumn3.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        h5.setText("Current roles");
        h5.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, h5);
        radioGroup.setLabel("Radio Group");
        radioGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        layoutColumn4.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        h52.setText("New role");
        h52.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, h52);
        textField.setLabel("Enter new role's name");
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidthFull();
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow3.setFlexGrow(1.0, layoutRow4);
        buttonPrimary.setText("Delete");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow3.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        buttonPrimary2.setText("Create");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(h5);
        layoutColumn3.add(radioGroup);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(h52);
        layoutColumn4.add(textField);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(layoutRow4);
        layoutRow4.add(buttonPrimary);
        layoutRow3.add(layoutRow5);
        layoutRow5.add(buttonPrimary2);
    }
}