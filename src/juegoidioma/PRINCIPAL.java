/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoidioma;

import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static juegoidioma.NuevoUsuario.consultasBD;

/**
 *
 * @author ACER-PC
 */
public class PRINCIPAL extends javax.swing.JFrame {

    public static ConsultasBD consultasBD = new ConsultasBD();
    
    Respuesta[] respuestaImagenes;
    private int numero;
    private int vida;
    private int puntaje;
    private String resultado;
    private String p;
    private AudioClip sonido;
    private BufferedImage imageActual;

    public PRINCIPAL() {
        initComponents();

        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/principal.wav"));
        sonido.play();
        armarImagenes();
        vidas.setText("5");
        txtPuntaje.setText("0");
        mostrarImagenesPantalla();
    }

    public void armarImagenes() {
        respuestaImagenes = new Respuesta[100];

        respuestaImagenes[0] = new Respuesta("mpefi", "/imagenes/trabajar.jpg", "/imagenes/trabajar1.jpg", "/imagenes/trabajar2.jpg");
        respuestaImagenes[1] = new Respuesta("heti", "/imagenes/leer.jpg", "/imagenes/leer.jpg", "/imagenes/leer.jpg");
        respuestaImagenes[2] = new Respuesta("nuni", "/imagenes/balon.jpg", "/imagenes/balon2.jpg", "/imagenes/balon3.jpg");
        respuestaImagenes[3] = new Respuesta("peni", "/imagenes/lavar.jpg", "/imagenes/lavar2.jpg", "/imagenes/lavar3.jpg");
        respuestaImagenes[4] = new Respuesta("zajua", "/imagenes/puerco.jpg", "/imagenes/puerco.jpg", "/imagenes/puerco.jpg");
        respuestaImagenes[5] = new Respuesta("kunthe,", "/imagenes/nadar.jpg", "/imagenes/nadar2.jpg", "/imagenes/nadar.jpg");
        respuestaImagenes[6] = new Respuesta("tuhu", "/imagenes/cantar.jpg", "/imagenes/cantar.jpg", "/imagenes/cantar.jpg");
        respuestaImagenes[7] = new Respuesta("ähä", "/imagenes/dormir3.jpg", "/imagenes/dormir.png", "/imagenes/dormir.jpg");
        respuestaImagenes[8] = new Respuesta("jua", "/imagenes/conejo.jpg", "/imagenes/conejo.jpg", "/imagenes/conejo.jpg");
        respuestaImagenes[9] = new Respuesta("koraso", "/imagenes/corazon.jpg", "/imagenes/corazon2.jpg", "/imagenes/corazon3.jpg");
        respuestaImagenes[10] = new Respuesta("za", "/imagenes/arbol.jpg", "/imagenes/arbol2.jpg", "/imagenes/arbol.jpg");
        respuestaImagenes[11] = new Respuesta("nei", "/imagenes/bailar.jpg", "/imagenes/bailar.jpg", "/imagenes/bailar.jpg");
        respuestaImagenes[12] = new Respuesta("nu", "/imagenes/ver.jpg", "/imagenes/ver2.jpg", "/imagenes/ver.jpg");
        respuestaImagenes[13] = new Respuesta("hñe", "/imagenes/vestirse.jpg", "/imagenes/vestirse.jpg", "/imagenes/vestirse.jpg");
        respuestaImagenes[14] = new Respuesta("de'mxi", "/imagenes/jitomate.jpg", "/imagenes/jitomate2.jpg", "/imagenes/jitomate.jpg");
        respuestaImagenes[15] = new Respuesta("arroz", "/imagenes/arroz.jpg", "/imagenes/arroz.jpg", "/imagenes/arroz.jpg");
        respuestaImagenes[16] = new Respuesta("baga", "/imagenes/vaca.jpg", "/imagenes/vaca.jpg", "/imagenes/vaca.jpg");
        respuestaImagenes[17] = new Respuesta("fani", "/imagenes/caballo.jpg", "/imagenes/caballo.jpg", "/imagenes/caballo.jpg");
        respuestaImagenes[18] = new Respuesta("ju", "/imagenes/frijol2.jpg", "/imagenes/frijol2.jpg", "/imagenes/frijol2.jpg");
        respuestaImagenes[19] = new Respuesta("tihi", "/imagenes/correr.jpg", "/imagenes/correr.jpg", "/imagenes/correr.jpg");
         //beso  
        respuestaImagenes[20] = new Respuesta("ntsütsi", "/imagenes/beso.jpg", "/imagenes/beso.jpg", "/imagenes/beso.jpg");
        //jugar 
        respuestaImagenes[21] = new Respuesta("ñ’eni", "/imagenes/jugar.jpg", "/imagenes/jugar.jpg", "/imagenes/jugar.jpg");
        //hablar
        respuestaImagenes[22] = new Respuesta("ñä", "/imagenes/hablar.png", "/imagenes/hablar.png", "/imagenes/hablar.png");
        //-brincar
        respuestaImagenes[23] = new Respuesta("n’atsi", "/imagenes/brincar.jpg", "/imagenes/brincar.jpg", "/imagenes/brincar.jpg");
        //-pensar
        respuestaImagenes[24] = new Respuesta("beni", "/imagenes/pensar.jpg", "/imagenes/pensar.jpg", "/imagenes/pensar.jpg");
        //-escribir
        respuestaImagenes[25] = new Respuesta("ofo", "/imagenes/escribir.jpg", "/imagenes/escribir.jpg", "/imagenes/escribir.jpg");
        //-dibujar
        respuestaImagenes[26] = new Respuesta("k’oi", "/imagenes/dibujar.jpg", "/imagenes/dibujar.jpg", "/imagenes/dibujar.jpg");
        //-casa
        respuestaImagenes[27] = new Respuesta("ngu", "/imagenes/casa.jpg", "/imagenes/casa.jpg", "/imagenes/casa.jpg");
        //rojo
        respuestaImagenes[28] = new Respuesta("thëni", "/imagenes/rojo.jpg", "/imagenes/rojo.jpg", "/imagenes/rojo.jpg");
        //verde
        respuestaImagenes[29] = new Respuesta(" k’angi", "/imagenes/verde.jpg", "/imagenes/verde.jpg", "/imagenes/verde.jpg");
        //azul
        respuestaImagenes[30] = new Respuesta("mok’angi", "/imagenes/azul.jpg", "/imagenes/azul.jpg", "/imagenes/azul.jpg");
        //negro
        respuestaImagenes[31] = new Respuesta("b’o", "/imagenes/negro.jpg", "/imagenes/negro.jpg", "/imagenes/negro.jpg");
        //blanco
        respuestaImagenes[32] = new Respuesta("t’axi", "/imagenes/blanco.jpg", "/imagenes/blanco.jpg", "/imagenes/blanco.jpg");
        //gris
        respuestaImagenes[33] = new Respuesta("b’ospi", "/imagenes/gris.jpg", "/imagenes/gris.jpg", "/imagenes/gris.jpg");
        // morado
        respuestaImagenes[34] = new Respuesta(" ixthëni", "/imagenes/morado.jpg", "/imagenes/morado.jpg", "/imagenes/morado.jpg");
        //amarillo
        respuestaImagenes[35] = new Respuesta("k’ast’i", "/imagenes/amarillo.jpg", "/imagenes/amarillo.jpg", "/imagenes/amarillo.jpg");
        //cafe
        respuestaImagenes[36] = new Respuesta("dëjü", "/imagenes/cafe.jpg", "/imagenes/cafe.jpg", "/imagenes/cafe.jpg");
        //anaranjado
        respuestaImagenes[37] = new Respuesta("nanxa", "/imagenes/anaranjado.jpg", "/imagenes/anaranjado.jpg", "/imagenes/anaranjado.jpg");
        //plato
        respuestaImagenes[38] = new Respuesta("mohi", "/imagenes/plato.jpg", "/imagenes/plato.jpg", "/imagenes/plato.jpg");
        //abeja
        respuestaImagenes[39] = new Respuesta("gäni", "/imagenes/abeja.jpg", "/imagenes/abeja.jpg", "/imagenes/abeja.jpg");
        //acarrear
        respuestaImagenes[40] = new Respuesta("theni", "/imagenes/acarrear.jpg", "/imagenes/acarrear.jpg", "/imagenes/acarrear.jpg");
        //adentro
        respuestaImagenes[41] = new Respuesta("mbo", "/imagenes/adentro.jpg", "/imagenes/adentro.jpg", "/imagenes/adentro.jpg");
        //adiós
        respuestaImagenes[42] = new Respuesta("nzenguatho,", "/imagenes/adios.jpg", "/imagenes/adios.jpg", "/imagenes/adios.jpg");
        //agua
        respuestaImagenes[43] = new Respuesta("dehe", "/imagenes/agua.jpg", "/imagenes/agua.jpg", "/imagenes/agua.jpg");
        //aguacate
        respuestaImagenes[44] = new Respuesta("ts'ani", "/imagenes/aguacate.jpg", "/imagenes/aguacate.jpg", "/imagenes/aguacate.jpg");
        //aguja
        respuestaImagenes[45] = new Respuesta("'yofri", "/imagenes/aguja.jpg", "/imagenes/aguja.jpg", "/imagenes/aguja.jpg");
        //ajolote
        respuestaImagenes[46] = new Respuesta("nzujuai", "/imagenes/ajolote.jpg", "/imagenes/ajolote.jpg", "/imagenes/ajolote.jpg");
        //alacran
        respuestaImagenes[47] = new Respuesta("penzu", "/imagenes/alacran.jpg", "/imagenes/alacran.jpg", "/imagenes/alacran.jpg");
        //albañil
        respuestaImagenes[48] = new Respuesta("gädo", "/imagenes/albañil.jpg", "/imagenes/albañil.jpg", "/imagenes/albañil.jpg");
        //alcohol
        respuestaImagenes[49] = new Respuesta("het'adehe", "/imagenes/alcohol.jpg", "/imagenes/alcohol.jpg", "/imagenes/alcohol.jpg");
        //algodon
        respuestaImagenes[50] = new Respuesta("algodo,", "/imagenes/algodon.jpg", "/imagenes/algodon.jpg", "/imagenes/algodon.jpg");
        //aire
        respuestaImagenes[51] = new Respuesta("ndähi", "/imagenes/aire.jpg", "/imagenes/aire.jpg", "/imagenes/aire.jpg");
        //alto
        respuestaImagenes[52] = new Respuesta("he'tsi", "/imagenes/alto.jpg", "/imagenes/alto.jpg", "/imagenes/alto.jpg");
        //amar
        respuestaImagenes[53] = new Respuesta("mädi", "/imagenes/amar.jpg", "/imagenes/amar.jpg", "/imagenes/amar.jpg");
        //amigo
        respuestaImagenes[54] = new Respuesta("migo", "/imagenes/amigo.jpg", "/imagenes/amigo.jpg", "/imagenes/amigo.jpg");
        //alumno
        respuestaImagenes[55] = new Respuesta("'yoskuela", "/imagenes/alumno.jpg", "/imagenes/alumno.jpg", "/imagenes/alumno.jpg");
        //anillo
        respuestaImagenes[56] = new Respuesta("mfo'ye", "/imagenes/anillo.jpg", "/imagenes/anillo.jpg", "/imagenes/anillo.jpg");
        //animal
        respuestaImagenes[57] = new Respuesta("zu'ue", "/imagenes/animal.jpg", "/imagenes/animal.jpg", "/imagenes/animal.jpg");
        //apestoso
        respuestaImagenes[58] = new Respuesta("nxä", "/imagenes/apestoso.jpg", "/imagenes/apestoso.jpg", "/imagenes/apestoso.jpg");
        //aplastar
        respuestaImagenes[59] = new Respuesta("pet'i", "/imagenes/aplastar.jpg", "/imagenes/aplastar.jpg", "/imagenes/aplastar.jpg");
        //apresurado
        respuestaImagenes[60] = new Respuesta("mäsoni", "/imagenes/apresurado.jpg", "/imagenes/apresurado.jpg", "/imagenes/apresurado.jpg");
        //apretar
        respuestaImagenes[61] = new Respuesta("du'ti", "/imagenes/apretar.jpg", "/imagenes/apretar.jpg", "/imagenes/apretar.jpg");
        //ardilla
        respuestaImagenes[62] = new Respuesta("minä", "/imagenes/ardilla.jpg", "/imagenes/ardilla.jpg", "/imagenes/ardilla.jpg");
        //arena
        respuestaImagenes[63] = new Respuesta("'bomu", "/imagenes/arena.jpg", "/imagenes/arena.jpg", "/imagenes/arena.jpg");
        //arete
        respuestaImagenes[64] = new Respuesta("nts'ungu", "/imagenes/arete.jpg", "/imagenes/arete.jpg", "/imagenes/arete.jpg");
        //araña
        respuestaImagenes[65] = new Respuesta("mex'e", "/imagenes/araña.jpg", "/imagenes/araña.jpg", "/imagenes/araña.jpg");
        //arreglar
        respuestaImagenes[66] = new Respuesta("hoki", "/imagenes/arreglar.jpg", "/imagenes/arreglar.jpg", "/imagenes/arreglar.jpg");
        //asesinar
        respuestaImagenes[67] = new Respuesta("hodu", "/imagenes/asesinar.jpg", "/imagenes/asesinar.jpg", "/imagenes/asesinar.jpg");
        //asesinato
        respuestaImagenes[68] = new Respuesta("thote", "/imagenes/asesinato.jpg", "/imagenes/asesinato.jpg", "/imagenes/asesinato.jpg");
        //asiento
        respuestaImagenes[69] = new Respuesta("hudi", "/imagenes/asiento.jpg", "/imagenes/asiento.jpg", "/imagenes/asiento.jpg");
        //arrojar
        respuestaImagenes[70] = new Respuesta("foge,", "/imagenes/arrojar.jpg", "/imagenes/arrojar.jpg", "/imagenes/arrojar.jpg");
        //arroyo
        respuestaImagenes[71] = new Respuesta("hñe", "/imagenes/arroyo.jpg", "/imagenes/arroyo.jpg", "/imagenes/arroyo.jpg");
        //arruga
        respuestaImagenes[72] = new Respuesta("'mahni", "/imagenes/arruga.jpg", "/imagenes/arruga.jpg", "/imagenes/arruga.jpg");
        //asustarse
        respuestaImagenes[73] = new Respuesta("ntsu,", "/imagenes/asustarse.jpg", "/imagenes/asustarse.jpg", "/imagenes/asustarse.jpg");
        //avanzar
        respuestaImagenes[73] = new Respuesta("'yombi", "/imagenes/avanzar.jpg", "/imagenes/avanzar.jpg", "/imagenes/avanzar.jpg");
        //atender
        respuestaImagenes[75] = new Respuesta("nu,", "/imagenes/atender.jpg", "/imagenes/atender.jpg", "/imagenes/atender.jpg");
        //aterrizar
        respuestaImagenes[76] = new Respuesta("hudi", "/imagenes/aterrizar.jpg", "/imagenes/aterrizar.jpg", "/imagenes/aterrizar.jpg");
        //atinar
        respuestaImagenes[77] = new Respuesta("ät'i", "/imagenes/atinar.jpg", "/imagenes/atinar.jpg", "/imagenes/atinar.jpg");
        //atole
        respuestaImagenes[78] = new Respuesta("t'ei", "/imagenes/atole.jpg", "/imagenes/atole.jpg", "/imagenes/atole.jpg");
        //atorarse
        respuestaImagenes[79] = new Respuesta("nani,", "/imagenes/atorarse.jpg", "/imagenes/atorarse.jpg", "/imagenes/atorarse.jpg");
        //averoguacion
        respuestaImagenes[80] = new Respuesta("hñähni", "/imagenes/averoguacion.jpg", "/imagenes/averoguacion.jpg", "/imagenes/averoguacion.jpg");
        //avion
        respuestaImagenes[81] = new Respuesta("avio,", "/imagenes/avion.jpg", "/imagenes/avion.jpg", "/imagenes/avion.jpg");
        //banco
        respuestaImagenes[82] = new Respuesta("thuhni", "/imagenes/banco.jpg", "/imagenes/banco.jpg", "/imagenes/banco.jpg");
        //bandido
        respuestaImagenes[83] = new Respuesta("dakate", "/imagenes/bandido.jpg", "/imagenes/bandido.jpg", "/imagenes/bandido.jpg");
        //bañar
        respuestaImagenes[84] = new Respuesta("hiti,", "/imagenes/bañar.jpg", "/imagenes/bañar.jpg", "/imagenes/bañar.jpg");
        //baño
        respuestaImagenes[85] = new Respuesta("thi", "/imagenes/baño.jpg", "/imagenes/baño.jpg", "/imagenes/baño.jpg");
        //barato
        respuestaImagenes[86] = new Respuesta("mbarato", "/imagenes/barato.jpg", "/imagenes/barato.jpg", "/imagenes/barato.jpg");
        //barbacoa
        respuestaImagenes[87] = new Respuesta("thumngo", "/imagenes/barbacoa.jpg", "/imagenes/barbacoa.jpg", "/imagenes/barbacoa.jpg");
        //barba
        respuestaImagenes[88] = new Respuesta("juni", "/imagenes/barba.jpg", "/imagenes/barba.jpg", "/imagenes/barba.jpg");
        //barda
        respuestaImagenes[89] = new Respuesta("jädo", "/imagenes/barda.jpg", "/imagenes/barda.jpg", "/imagenes/barda.jpg");
        //barrer
        respuestaImagenes[90] = new Respuesta("joki", "/imagenes/barrer.jpg", "/imagenes/barrer.jpg", "/imagenes/barrer.jpg");
        //cabello
        respuestaImagenes[91] = new Respuesta("stä", "/imagenes/cabello.jpg", "/imagenes/cabello.jpg", "/imagenes/cabello.jpg");
        //cabra
        respuestaImagenes[92] = new Respuesta("t'äxi", "/imagenes/cabra.jpg", "/imagenes/cabra.jpg", "/imagenes/cabra.jpg");
        //burro
        respuestaImagenes[93] = new Respuesta("burru", "/imagenes/burro.jpg", "/imagenes/burro.jpg", "/imagenes/burro.jpg");
        //caja
        respuestaImagenes[94] = new Respuesta("kaho", "/imagenes/caja.jpg", "/imagenes/caja.jpg", "/imagenes/caja.jpg");
        //chamarra
        respuestaImagenes[95] = new Respuesta("pat'i", "/imagenes/chamarra.jpg", "/imagenes/chamarra.jpg", "/imagenes/chamarra.jpg");
        //defender
        respuestaImagenes[96] = new Respuesta("ñäni", "/imagenes/defender.jpg", "/imagenes/defender.jpg", "/imagenes/defender.jpg");
        //descanzar
        respuestaImagenes[97] = new Respuesta("tsaya", "/imagenes/descanzar.jpg", "/imagenes/descanzar.jpg", "/imagenes/descanzar.jpg");
        //descargar
        respuestaImagenes[98] = new Respuesta("nkarga", "/imagenes/descargar.jpg", "/imagenes/descargar.jpg", "/imagenes/descargar.jpg");
        //ebrio
        respuestaImagenes[99] = new Respuesta("ti", "/imagenes/ebrio.jpg", "/imagenes/ebrio.jpg", "/imagenes/ebrio.jpg");       

     
        Random rnd = new Random();
        

        for (int i = 0; i < respuestaImagenes.length; i++) {
            int aleatorio = (int) (rnd.nextDouble() * 99);
            respuestaImagenes[i] = respuestaImagenes[aleatorio];
        }
    }

    public void mostrarImagenesPantalla() {
        ImageIcon fondo = new ImageIcon(getClass().getResource(respuestaImagenes[numero].getDuda1()));
        imagen1.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_REPLICATE)));

        fondo = new ImageIcon(getClass().getResource(respuestaImagenes[numero].getDuda2()));
        imagen2.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_REPLICATE)));

        fondo = new ImageIcon(getClass().getResource(respuestaImagenes[numero].getDuda3()));
        imagen3.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(imagen3.getWidth(), imagen3.getHeight(), Image.SCALE_REPLICATE)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerificar = new javax.swing.JButton();
        btnRespuesta = new javax.swing.JButton();
        imagen2 = new javax.swing.JLabel();
        vidas = new javax.swing.JTextField();
        cajaRespuesta = new javax.swing.JTextField();
        imagen1 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        Carita = new javax.swing.JLabel();
        btnReproducir = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 127, 40));

        btnRespuesta.setText("Ver Respuesta");
        btnRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 127, 45));
        getContentPane().add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 0, 430, 310));

        vidas.setFont(new java.awt.Font("Swis721 Hv BT", 0, 16)); // NOI18N
        getContentPane().add(vidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 45, 51));

        cajaRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaRespuestaActionPerformed(evt);
            }
        });
        cajaRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaRespuestaKeyPressed(evt);
            }
        });
        getContentPane().add(cajaRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 180, -1));
        getContentPane().add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 86, 140));
        getContentPane().add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 97, 136));

        Carita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idioma/heart.gif"))); // NOI18N
        getContentPane().add(Carita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 60, 60));

        btnReproducir.setText("Reproducir");
        btnReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirActionPerformed(evt);
            }
        });
        getContentPane().add(btnReproducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        getContentPane().add(btnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        btnInstrucciones.setText("Instrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        btnMenu.setText("Volver al Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Swis721 Hv BT", 0, 16)); // NOI18N
        jLabel1.setText("Puntaje:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        txtPuntaje.setFont(new java.awt.Font("Swis721 Hv BT", 0, 16)); // NOI18N
        getContentPane().add(txtPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 60, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/idioma/pigeonotomilrgweb__16053.1397090012.1280.1280.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 780, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        AudioClip sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/sonidito.wav"));
        sonido1.play();
        if (cajaRespuesta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No hay palabra escrita...");
        } else if (cajaRespuesta.getText().equals(respuestaImagenes[numero].getRespuesta())) {
            JOptionPane.showMessageDialog(null, "Bien hecho...");
            
            int aum =10;
            puntaje = Integer.parseInt(txtPuntaje.getText());
            puntaje = puntaje + aum;
            p = puntaje + "";
            txtPuntaje.setText(p);
            
            numero = numero + 1;
            if (numero == 20) {
                Triunfo t = new Triunfo(Integer.parseInt(txtPuntaje.getText()));
                t.setVisible(true);
                this.setVisible(false);
                sonido.stop();

            }
            mostrarImagenesPantalla();
            cajaRespuesta.setText(null);
            int aumento = 0;
            vida = Integer.parseInt(vidas.getText());
            vida = vida + aumento;
            resultado = vida + "";
            vidas.setText(resultado);
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Sigue Intentando...");
            cajaRespuesta.setText(null);
            int descuento = 1;
            vida = Integer.parseInt(vidas.getText());
            vida = vida - descuento;
            resultado = vida + "";
            vidas.setText(resultado);
            
            if (vida == 0) {
                FinDeJuego f = new FinDeJuego(Integer.parseInt(txtPuntaje.getText()));
                f.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Perdiste");
                sonido.stop();
                
                buscarPorUsuario();
                
            }
        }
        sonido1.stop();
    }//GEN-LAST:event_btnVerificarActionPerformed

    public void buscarPorUsuario() {
        Usuarios aux = consultasBD.buscarPorUsuario("Alex");
        if(aux != null){
            consultasBD.modificarUsuario(aux.getNombre(), aux.getCorreo(), aux.getContraseña(), aux.getTipo(), Integer.parseInt(txtPuntaje.getText()));
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
        }  else{
            JOptionPane.showMessageDialog(this, "Error al Actualizar");
        }      
    }
    
    private void cajaRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaRespuestaActionPerformed
        //
    }//GEN-LAST:event_cajaRespuestaActionPerformed

    private void cajaRespuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaRespuestaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnVerificarActionPerformed(null);

        }
    }//GEN-LAST:event_cajaRespuestaKeyPressed

    private void btnRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuestaActionPerformed
        AudioClip sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/sonidito.wav"));
        sonido1.play();
        int respuesta = JOptionPane.showConfirmDialog(null, "Te costara una vida Ver la respuesta...", "", JOptionPane.YES_NO_OPTION);
        if (respuesta == YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, "La palabra es: " + respuestaImagenes[numero].getRespuesta());
            cajaRespuesta.setText(null);
            int descuento = 1;
            vida = Integer.parseInt(vidas.getText());
            vida = vida - descuento;
            resultado = vida + "";
            vidas.setText(resultado);
            //FinDeJuego f = new FinDeJuego();
            //f.setVisible(true);
            //this.setVisible(false);

        }

        sonido1.stop();
    }//GEN-LAST:event_btnRespuestaActionPerformed

    private void btnReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirActionPerformed
        sonido.play();
    }//GEN-LAST:event_btnReproducirActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        sonido.stop();
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        AudioClip sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/sonidito.wav"));
        sonido1.play();
        JOptionPane.showMessageDialog(null, "Tiene que anotar en el "
                + "\n recuadro de texto"
                + "\n el vervo de la imagen o el nombre de lo que aparece en la imagem"
                + "\n en Otomi."
                + "\n pero en otomi."
        );
        sonido1.stop();
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Juego j = new Juego();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carita;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnRespuesta;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JTextField cajaRespuesta;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JTextField txtPuntaje;
    private javax.swing.JTextField vidas;
    // End of variables declaration//GEN-END:variables
}
