package refaccionaria.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import refaccionaria.swing.scroll.ScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Menu extends JPanel {

    private int index = -1;
    private final List<EventMenuSelected> events = new ArrayList<>();

    public Menu() {
        init();
    }

    private void init() {
        setBackground(new Color(10,17,60));
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
        addTitle("MAIN");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Principal"));
        addTitle("Seccion 1");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PEOPLE, "Proveedores","Agregar Proveedor", "Mostrar Proveedores", "Actualizar Proveedor", "Eliminar Proveedor"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.EXPOSURE, "Productos","Agregar Producto","Mostrar Productos","Actualizar Producto","Eliminar Producto"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DIRECTIONS_BIKE, "Tipo de moto","Agregar tipo","Mostrar tipo","Actualizar tipo","Eliminar tipo"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SETTINGS_REMOTE, "Servicios","Agregar servicio","Mostrar servicios","Actualizar servicio","Eliminar servicio"));
        addTitle("Seccion 2");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.MONETIZATION_ON, "Venta",  "Nueva Venta", "Buscar Venta", "Actualizar"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.BUSINESS_CENTER, "Compra",  "Nueva compra", "Buscar compra", "Actualizar"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PEOPLE, "Clientes", "Agregar Cliente", "Mostrar Cliente", "Actualizar Cliente", "Eliminar Cliente"));
        addTitle("Seccion 3");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TAB, "Usuarios",  "Agregar Usuario", "Mostrar Usuario", "Actualizar Usuario", "Eliminar Usuario"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.GROUP, "Empleados", "Agregar Empleado", "Mostar Empleado", "Actualizar Empleado", "Eliminar Empleado"));
    }

    private JScrollPane createScroll() {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBar());
        return scroll;
    }
//crea el panel del menu
    private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }
//genera panel
    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++index, menuLayout);
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (EventMenuSelected event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem(ModelMenuItem menu) {
        panelMenu.add(createMenuItem(menu), "h 35!");
    }

    public void addTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(label.getFont().deriveFont(Font.BOLD));
        label.setForeground(Color.white);
        panelMenu.add(label);
    }

    public void addSpace(int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelected() {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
}
