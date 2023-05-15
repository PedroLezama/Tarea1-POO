package ico.fes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataformas;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataformas;
    private JTextField txtDesarrolladora;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<VideoJuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(115, 44, 194));
        lblId = new JLabel("ID");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblGenero = new JLabel("Genero");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);

        lblPeso = new JLabel("Peso (GB)");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);

        lblPlataformas = new JLabel("Plataforma");
        txtPlataformas = new JTextField(15);
        panel1.add(lblPlataformas);
        panel1.add(txtPlataformas);

        lblDesarrollador = new JLabel("Desarrollador");
        txtDesarrolladora = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrolladora);

        btnAgregar = new JButton("Agregar juego");
        panel1.add(btnAgregar);
        this.getContentPane().add(panel1,0);
        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(238, 54, 54));
        this.getContentPane().add(panel2,1);
        info = new ArrayList<>();
        info.add(new VideoJuego(1,"Minecraft", "Survival", 2.61, "Playstation,Xbox,Nintendo y PC", "Microsoft"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);




        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoEnGb(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataformas(txtPlataformas.getText());
                nuevo.setDesarrollador(txtDesarrolladora.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });
    }
}
