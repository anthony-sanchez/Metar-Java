/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.ihm;

import fr.epsi.interfaces.AbstractController;
import fr.epsi.metar_codes.Stations.Station;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Antho
 */
public class MetarView extends javax.swing.JFrame {

    private AbstractController controller;
    private JLabel jLabelWallpaper;
    private Image wallPaper;
    private List<Station> listStations;

    public MetarView(AbstractController controller) {
        initComponents();
        this.controller = controller;
        this.jComboStation.addActionListener(new StationListener());
        centerScreen();
    }

    public void setTemperature(String temp) {
        this.jLabelTemp.setText(temp + "�C");
    }

    public void setDewpoint(String dew) {
        this.jLabelDewPoint.setText(dew + "�C");
    }

    public void setInformationTime(String info) {
        this.jLabelTime.setText(info);
    }

    public void setSkyConditions(String conditions) {
        ImageIcon imgIcon = new ImageIcon("src/fr/epsi/images/" + conditions + ".png");
        jLabeSkyCond.setIcon(imgIcon);
        jLabeSkyCond.setSize(imgIcon.getIconWidth(),imgIcon.getIconHeight());
        jPanelWallPaper.add(jLabeSkyCond);
    }

    public void setWindDirection(String direction) {
        this.jLabelWindDirection.setText(direction + "�");
    }

    public void setWindSpeed(String speed) {
        this.jLabelWindSpeed.setText(speed + " nds");
    }

    public void setObservationDate(String infos) {
        this.jLabelTime.setText(infos);
    }

    private void setWallpaper() {
        jLabelWallpaper = new JLabel(new ImageIcon(wallPaper));
        jLabelWallpaper.setSize(this.getWidth(), this.getHeight());
        jPanelWallPaper.add(jLabelWallpaper);
        jLabelWallpaper.setVisible(true);
    }

    private void populateComboBox() {
        for (Station s : listStations) {
            this.jComboStation.addItem(s.getName());
        }
    }

    public void setListStations(List<Station> listStations) {
        this.listStations = listStations;
        Collections.sort(listStations, new Comparator<Station>() {
            @Override
            public int compare(Station st1, Station st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
        populateComboBox();
    }

    public void razInterface() {
        this.jLabelDewPoint.setText("-�C");
        this.jLabelTemp.setText("-�C");
        this.jLabelWindDirection.setText("-�");
        this.jLabelWindSpeed.setText("-nds");
        this.jLabelTitle.setText("Metar");
        this.jLabelTime.setText("no information");
    }

    public int getFramewidth() {
        return this.getWidth();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWallPaper = new javax.swing.JPanel();
        jLabelTemp = new javax.swing.JLabel();
        jComboStation = new javax.swing.JComboBox();
        jLabelWindSpeed = new javax.swing.JLabel();
        jLabelWindDirection = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabelWindSpeedLabel = new javax.swing.JLabel();
        jLabelWindDirectionLabel = new javax.swing.JLabel();
        jLabelDewPointLabel = new javax.swing.JLabel();
        jLabelDewPoint = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabeSkyCond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metar Informations");
        setMaximumSize(new java.awt.Dimension(910, 500));
        setMinimumSize(new java.awt.Dimension(910, 500));

        jPanelWallPaper.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTemp.setFont(new java.awt.Font("Arial", 0, 110)); // NOI18N
        jLabelTemp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTemp.setText("-�C");

        jComboStation.setBackground(new java.awt.Color(102, 102, 102));
        jComboStation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboStation.setForeground(new java.awt.Color(255, 255, 255));
        jComboStation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stations" }));
        jComboStation.setBorder(null);

        jLabelWindSpeed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelWindSpeed.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWindSpeed.setText("- nds");

        jLabelWindDirection.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelWindDirection.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWindDirection.setText("-�");

        jLabelTitle.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Metar");

        jButtonPrevious.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPrevious.setText("<");
        jButtonPrevious.setToolTipText("");
        jButtonPrevious.setAlignmentY(0.0F);
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNext.setText(">");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabelWindSpeedLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelWindSpeedLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWindSpeedLabel.setText("Wind speed");

        jLabelWindDirectionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelWindDirectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWindDirectionLabel.setText("Wind direction");

        jLabelDewPointLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDewPointLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDewPointLabel.setText("Dewpoint");

        jLabelDewPoint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDewPoint.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDewPoint.setText("-�C");

        jLabelTime.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTime.setText("no information");

        jLabeSkyCond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/images/brouillard.png"))); // NOI18N

        javax.swing.GroupLayout jPanelWallPaperLayout = new javax.swing.GroupLayout(jPanelWallPaper);
        jPanelWallPaper.setLayout(jPanelWallPaperLayout);
        jPanelWallPaperLayout.setHorizontalGroup(
            jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle)
                            .addComponent(jLabelTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNext)
                        .addGap(56, 56, 56))
                    .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboStation, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                        .addComponent(jLabelTemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWindSpeedLabel)
                            .addComponent(jLabelWindSpeed))
                        .addGap(58, 58, 58)
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWindDirectionLabel)
                            .addComponent(jLabelWindDirection))
                        .addGap(43, 43, 43)
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDewPointLabel)
                            .addComponent(jLabelDewPoint))
                        .addGap(124, 124, 124)
                        .addComponent(jLabeSkyCond, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelWallPaperLayout.setVerticalGroup(
            jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                        .addComponent(jComboStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPrevious)
                            .addComponent(jButtonNext)))
                    .addGroup(jPanelWallPaperLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTime)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWallPaperLayout.createSequentialGroup()
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDewPointLabel)
                            .addComponent(jLabelWindDirectionLabel)
                            .addComponent(jLabelWindSpeedLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDewPoint)
                            .addComponent(jLabelWindDirection)
                            .addComponent(jLabelWindSpeed))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWallPaperLayout.createSequentialGroup()
                        .addGroup(jPanelWallPaperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTemp)
                            .addComponent(jLabeSkyCond, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWallPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWallPaper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeWallPaper() {
        if (jLabelWallpaper != null) {
            jLabelWallpaper.setSize(0, 0);
        }
    }

    private void preparePrevousNextButtons() {
        this.jButtonPrevious.setEnabled(this.controller.hasPreviousPhoto());
        this.jButtonNext.setEnabled(this.controller.hasMorePhoto());
    }

    private void centerScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x, y);
    }

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        if (this.controller.hasPreviousPhoto()) {
            wallPaper = this.controller.getPreviousPhoto();
            preparePrevousNextButtons();
            removeWallPaper();
            if (wallPaper != null) {
                setWallpaper();
            }
        }
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if (this.controller.hasMorePhoto()) {
            wallPaper = this.controller.getNextPhoto();
            preparePrevousNextButtons();
            removeWallPaper();
            if (wallPaper != null) {
                setWallpaper();
            }
        }
    }//GEN-LAST:event_jButtonNextActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JComboBox jComboStation;
    private javax.swing.JLabel jLabeSkyCond;
    private javax.swing.JLabel jLabelDewPoint;
    private javax.swing.JLabel jLabelDewPointLabel;
    private javax.swing.JLabel jLabelTemp;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWindDirection;
    private javax.swing.JLabel jLabelWindDirectionLabel;
    private javax.swing.JLabel jLabelWindSpeed;
    private javax.swing.JLabel jLabelWindSpeedLabel;
    private javax.swing.JPanel jPanelWallPaper;
    // End of variables declaration//GEN-END:variables

    class StationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = jComboStation.getSelectedIndex() - 1;
            if (jLabelWallpaper != null) {
                jLabelWallpaper.setSize(0, 0);
            }
            if (index >= 0) {
                System.out.println(listStations.get(index).getName() + " " + listStations.get(index).getId());
                jLabelTitle.setText(listStations.get(index).getName() + " " + listStations.get(index).getId());
                controller.setStation(listStations.get(index).getId());
                wallPaper = controller.getFirstPhoto(listStations.get(index).getName().toLowerCase());
                preparePrevousNextButtons();
                if (wallPaper != null) {
                    setWallpaper();
                }
            }
        }
    }
}
