package visao;


import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloControle.ModeloTabela;
import modeloDao.DaoAreadeTrabalho;
import modeloControle.ModeloAreadeTrabalho;
import modeloConection.ConexaoBD;
import modeloControle.ModeloEvento;
import modeloControle.ModeloUsuarioEstacionamento;
import modeloControle.ModeloVagas;
import modeloDao.DaoEventos;
import modeloDao.DaoTabela;
import modeloDao.DaoUsuarioEstacionamento;
import modeloDao.DaoVagas;

public class FormAreaTrabalho extends javax.swing.JFrame {

    ModeloAreadeTrabalho mod = new ModeloAreadeTrabalho();
    DaoAreadeTrabalho cont = new DaoAreadeTrabalho();
    ConexaoBD conec = new ConexaoBD();
    DaoTabela tabela = new DaoTabela();
    FormVagas vags = new FormVagas();
    DaoVagas qtdVagas = new DaoVagas();
    ModeloVagas modvagas = new ModeloVagas();
    ModeloEvento modEvento = new ModeloEvento();
    DaoEventos vagaEvento = new DaoEventos();
    ModeloUsuarioEstacionamento modEstacionamento = new ModeloUsuarioEstacionamento();
    DaoUsuarioEstacionamento daoEstacionamento= new DaoUsuarioEstacionamento();

    
    
    Date data = new Date(System.currentTimeMillis());
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatarHora = new SimpleDateFormat("HH:mm:ss");
    
    //criando uma flag diferenciar quando estou editando e salvando
    int flag =0;
   
    public FormAreaTrabalho() { 
        initComponents();
        conec.conexao();
        preencherVagas();
        preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonNovoAluno = new javax.swing.JButton();
        jButtonEditarAluno = new javax.swing.JButton();
        jButtonExcluiraluno = new javax.swing.JButton();
        jButtonSalvarAluno = new javax.swing.JButton();
        r = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPlaca = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldIdHorarioEntrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdHorarioSaida = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        VagasEspeciais = new javax.swing.JTextField();
        jComboBoxVeiculos = new javax.swing.JComboBox<>();
        jTextFieldIdData = new javax.swing.JTextField();
        jButtonSaida = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        VagasMotos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        VagasGerais = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jComboBoxBlocoSetor = new javax.swing.JComboBox<>();
        jButtonCadastrarOco = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        vagasEvento = new javax.swing.JTextField();
        jButtonbuscarmatricula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Estacionamento IESP");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Matricula");

        jLabel3.setText("Nome");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Placa");

        jTextFieldNome.setEnabled(false);

        jButtonNovoAluno.setText("Entrada");
        jButtonNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoAlunoActionPerformed(evt);
            }
        });

        jButtonEditarAluno.setText("Editar");
        jButtonEditarAluno.setEnabled(false);
        jButtonEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAlunoActionPerformed(evt);
            }
        });

        jButtonExcluiraluno.setText("Excluir");
        jButtonExcluiraluno.setEnabled(false);
        jButtonExcluiraluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluiralunoActionPerformed(evt);
            }
        });

        jButtonSalvarAluno.setText("Salvar");
        jButtonSalvarAluno.setEnabled(false);
        jButtonSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlunoActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPlaca.setEnabled(false);

        jTextFieldMatricula.setEnabled(false);
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        jTextFieldId.setEnabled(false);

        jLabel7.setText("Data");

        jLabel8.setText("Horario Entrada");

        jTextFieldIdHorarioEntrada.setEnabled(false);
        jTextFieldIdHorarioEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdHorarioEntradaActionPerformed(evt);
            }
        });

        jLabel9.setText("Horario Saida");

        jTextFieldIdHorarioSaida.setEnabled(false);
        jTextFieldIdHorarioSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdHorarioSaidaActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vagas Especiais");

        VagasEspeciais.setEnabled(false);
        VagasEspeciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VagasEspeciaisActionPerformed(evt);
            }
        });

        jComboBoxVeiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veiculos", "Carro", "Moto", "Especial", " ", " " }));
        jComboBoxVeiculos.setEnabled(false);
        jComboBoxVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeiculosActionPerformed(evt);
            }
        });

        jTextFieldIdData.setEnabled(false);
        jTextFieldIdData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdDataActionPerformed(evt);
            }
        });

        jButtonSaida.setText("Saida");
        jButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaidaActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Vagas Motos");

        VagasMotos.setEnabled(false);
        VagasMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VagasMotosActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Vagas Gerais");

        VagasGerais.setEnabled(false);
        VagasGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VagasGeraisActionPerformed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Usuario", "Aluno", "Funcionario", "Professor", "Visitante", "Evento" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor", "Bloco A", "Bloco B", "Bloco C", "Bloco D", "Visitante", " " }));
        jComboBoxBloco.setEnabled(false);
        jComboBoxBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBlocoActionPerformed(evt);
            }
        });

        jComboBoxBlocoSetor.setForeground(new java.awt.Color(255, 0, 0));
        jComboBoxBlocoSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloco A", "Bloco B", "Bloco C", "Bloco D", "Visitantes", " " }));
        jComboBoxBlocoSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBlocoSetorActionPerformed(evt);
            }
        });

        jButtonCadastrarOco.setForeground(new java.awt.Color(255, 0, 0));
        jButtonCadastrarOco.setText("Ocorrencia");
        jButtonCadastrarOco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarOcoActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Eventos");

        vagasEvento.setEnabled(false);
        vagasEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vagasEventoActionPerformed(evt);
            }
        });

        jButtonbuscarmatricula.setText("Buscar");
        jButtonbuscarmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarmatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxBlocoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(VagasEspeciais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(VagasMotos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(VagasGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonbuscarmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonCadastrarOco)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonExcluiraluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(591, 591, 591)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldIdHorarioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldIdHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldIdData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 34, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VagasEspeciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VagasMotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VagasGerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBlocoSetor)
                    .addComponent(jButtonNovoAluno)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vagasEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSaida)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldMatricula)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo)
                            .addComponent(jButtonbuscarmatricula))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPlaca)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditarAluno)
                            .addComponent(jButtonSalvarAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldIdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldIdHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastrarOco))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdHorarioSaida)
                            .addComponent(jLabel9)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonExcluiraluno))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAluno);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(914, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlunoActionPerformed
       
        //validando os campos
       
        if(jTextFieldMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha a matricula para continuar");
            jTextFieldMatricula.requestFocus();
        } 
        else if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo nome Senha para continuar");
            jTextFieldNome.requestFocus();
        }
        else if(jTextFieldPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo placa para continuar");
            jTextFieldPlaca.requestFocus();
        }
        else{
  
        //salvando dados
        if(flag == 1){
                 
            mod.setMatricula_Aluno(jTextFieldMatricula.getText());
            mod.setNome_Aluno(jTextFieldNome.getText());
            mod.setTipo((String)jComboBoxTipo.getSelectedItem());
            mod.setPlaca(jTextFieldPlaca.getText());
            mod.setVeiculo((String) jComboBoxVeiculos.getSelectedItem());
            mod.setData(jTextFieldIdData.getText());
            mod.setHorario_entrada(jTextFieldIdHorarioEntrada.getText());
            mod.setHoraio_saida(jTextFieldIdHorarioSaida.getText());
            mod.setSetor((String)jComboBoxBloco.getSelectedItem());
   
            //chamando o metodo salvar
            cont.Salvar(mod);
            
            
             if("Moto".equals(jComboBoxVeiculos.getSelectedItem().toString().replaceAll("\t",""))){
                if("Professor".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))||"Funcionario".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))){
                    modvagas.setVagaEspeciais(Integer.parseInt(VagasEspeciais.getText())-1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaEspeciais(modvagas);
                preencherVagas();
                }else{
                     modvagas.setVagaMoto(Integer.parseInt(VagasMotos.getText())-1);
                     modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                     qtdVagas.QTDVagaMoto(modvagas);
                     preencherVagas();
                }
            }
            else if("Carro".equals(jComboBoxVeiculos.getSelectedItem().toString().replaceAll("\t",""))){
               if("Professor".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))||"Funcionario".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))){
                    modvagas.setVagaEspeciais(Integer.parseInt(VagasEspeciais.getText())-1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaEspeciais(modvagas);
                    preencherVagas();
               }else{
                    modvagas.setVagaGerais(Integer.parseInt(VagasGerais.getText())-1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaCarro(modvagas);
                    preencherVagas();
                 }
            }
            else if("Especial".equals(jComboBoxVeiculos.getSelectedItem().toString().replaceAll("\t",""))){
                modvagas.setVagaEspeciais(Integer.parseInt(VagasEspeciais.getText())-1);
                modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                qtdVagas.QTDvagaEspeciais(modvagas);
                preencherVagas();
            }
          
            else if("Evento".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))){
                modEvento.setQtdVagas(Integer.parseInt(vagasEvento.getText())-1);
                modEvento.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                vagaEvento.QTDvagaEvento(modEvento);
                preencherVagas();
            }
         
            
            //Atualizando os dados da tabela
            preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");   
        }
        //Alterando os dados
        else{
         
            mod.setId_Aluno(Integer.parseInt(jTextFieldId.getText()));
            mod.setMatricula_Aluno(jTextFieldMatricula.getText());
            mod.setNome_Aluno(jTextFieldNome.getText());
            mod.setTipo((String)jComboBoxTipo.getSelectedItem());
            mod.setPlaca(jTextFieldPlaca.getText());
            mod.setVeiculo((String) jComboBoxVeiculos.getSelectedItem());
            mod.setData(jTextFieldIdData.getText());
            mod.setHorario_entrada(jTextFieldIdHorarioEntrada.getText());
            mod.setHoraio_saida(jTextFieldIdHorarioSaida.getText());
            mod.setSetor((String)jComboBoxBloco.getSelectedItem());
            
            //chamando metodo editar
            cont.Editar(mod);
            
           //desabilitando os campos
            jTextFieldMatricula.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldPlaca.setEnabled(false);       
            jTextFieldIdHorarioEntrada.setEnabled(false);
            jTextFieldIdHorarioSaida.setEnabled(false);
            jComboBoxVeiculos.setEnabled(false);
            jComboBoxBloco.setEnabled(false);
            
            //atualizando a tabela
            preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");
        }
     }
    jTextFieldId.setText("");
    jTextFieldMatricula.setText("");
    jTextFieldNome.setText("");
    jComboBoxTipo.setSelectedItem("");
    jTextFieldPlaca.setText("");
    jTextFieldIdData.setText("");
    jTextFieldIdHorarioEntrada.setText("");
    jTextFieldIdHorarioSaida.setText("");
    jComboBoxVeiculos.setSelectedItem("");
    jComboBoxBloco.setSelectedItem("");
    jTextFieldMatricula.setEnabled(false);
    jTextFieldNome.setEnabled(false);
    jTextFieldPlaca.setEnabled(false);
    jTextFieldIdData.setEnabled(false);
    jTextFieldIdHorarioEntrada.setEnabled(false);
    jTextFieldIdHorarioSaida.setEnabled(false);
    jComboBoxVeiculos.setSelectedItem(false);
    jButtonCancelar.setEnabled(false);
    jButtonSalvarAluno.setEnabled(false);
    jComboBoxBloco.setEnabled(false);
    jButtonNovoAluno.setEnabled(true);
        
        
    }//GEN-LAST:event_jButtonSalvarAlunoActionPerformed

    private void jButtonNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoAlunoActionPerformed
        
        //liberando os campos e passando data e hora.
        flag =1;
        
        jTextFieldIdData.setText(formatarDate.format(data));
        jTextFieldIdHorarioEntrada.setText(formatarHora.format(data));
        jButtonSalvarAluno.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldMatricula.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jTextFieldPlaca.setEnabled(true);      
        jTextFieldIdHorarioSaida.setEnabled(false);
        jComboBoxVeiculos.setEnabled(true);
        jComboBoxBloco.setEnabled(true);
        jComboBoxTipo.setEnabled(true);

        //limpando os campos
        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldPlaca.setText("");
        jTextFieldId.setText(""); 
        jTextFieldIdHorarioSaida.setText("");
        jComboBoxVeiculos.setSelectedItem("");
        jComboBoxBloco.setSelectedItem("");
        jComboBoxTipo.setSelectedItem("");
  
    }//GEN-LAST:event_jButtonNovoAlunoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        //limpamdo os campos
       
        jTextFieldMatricula.setText("");
        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldPlaca.setText("");
        jTextFieldId.setText(""); 
        jTextFieldIdData.setText("");
        jTextFieldIdHorarioEntrada.setText("");
        jTextFieldIdHorarioSaida.setText("");
        jComboBoxVeiculos.setSelectedItem("");
        jComboBoxBloco.setSelectedItem("");
       
        r.setText("");
        
        //Bloqueando os campos
        jButtonSalvarAluno.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jTextFieldMatricula.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jTextFieldPlaca.setEnabled(!true);
        jButtonNovoAluno.setEnabled(true);
        jButtonEditarAluno.setEnabled(false);
        jButtonExcluiraluno.setEnabled(false);
        jTextFieldIdHorarioEntrada.setEnabled(false);
        jTextFieldIdHorarioSaida.setEnabled(false);
        jTextFieldIdData.setEnabled(false);
        jComboBoxVeiculos.setEnabled(false);
        jComboBoxBloco.setEnabled(false);
        preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");   
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAlunoActionPerformed
        
        //Liberando campos necessario para edição
        
        flag = 2;
        jButtonSalvarAluno.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldMatricula.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jComboBoxTipo.setSelectedItem(true);
        jTextFieldPlaca.setEnabled(true);
        jTextFieldIdData.setEditable(true);
        jTextFieldIdHorarioEntrada.setEnabled(true);
        jTextFieldIdHorarioSaida.setEnabled(true);
        jComboBoxVeiculos.setEnabled(true);
        jButtonEditarAluno.setEnabled(false);
        jComboBoxBloco.setEnabled(true);
     
    }//GEN-LAST:event_jButtonEditarAlunoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        //passando resultado da pesquisa para os campos
        
        mod.setPesquisa(r.getText());
        ModeloAreadeTrabalho model = cont.buscaAluno(mod);
        
        jTextFieldId.setText(String.valueOf(model.getId_Aluno()));
        jTextFieldMatricula.setText(model.getMatricula_Aluno());
        jTextFieldNome.setText(model.getNome_Aluno());
        jTextFieldPlaca.setText(model.getPlaca_Aluno());
        jComboBoxVeiculos.setSelectedItem(model.getVeiculo());
        jTextFieldIdData.setText(model.getData());
        jTextFieldIdHorarioEntrada.setText(model.getHorario_entrada());
        jTextFieldIdHorarioSaida.setText(model.getHoraio_saida());
        jComboBoxBloco.setSelectedItem(model.getSetor());
        jComboBoxTipo.setSelectedItem(model.getSetor());
        
        
        //Atualizando tabela
        preencherTabela("select  \"Id_aluno\", \"matricula_Aluno\", \"Nome_Aluno\", \"Placa_Aluno\", \"veiculo\", \"data\", \"horario_entrada\", \"horario_saida\", \"setor\", \"tipo\" from aluno where \"Nome_Aluno\" like '%"+mod.getPesquisa()+"%'");

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jButtonExcluiralunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluiralunoActionPerformed
      
       //Excluindo dados do BD
       int resposta;
       resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente exluir");
       
       //perguntado para o usuario 
       if (resposta == JOptionPane.YES_OPTION){
           mod.setId_Aluno(Integer.parseInt(jTextFieldId.getText()));
           cont.Excluir(mod);
           
           jTextFieldId.setText("");
           jButtonCancelar.setEnabled(false);
           jButtonEditarAluno.setEnabled(false);
           jButtonExcluiraluno.setEnabled(false);
           jButtonSalvarAluno.setEnabled(false);
           jButtonNovoAluno.setEnabled(true);
           preencherTabela("SELECT * FROM public.aluno order by \"Nome_Aluno\"");
       }
    }//GEN-LAST:event_jButtonExcluiralunoActionPerformed

    private void jButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaidaActionPerformed
         int resposta;
         flag= 2;
         
    if(!jTextFieldIdHorarioSaida.getText().trim().isEmpty()){
       JOptionPane.showMessageDialog(null,"veiculo ja foi dado saida");
    }
    else{
         resposta = JOptionPane.showConfirmDialog(rootPane,"deseja realmente dar saida nesse veiculo");
         jTextFieldIdHorarioSaida.setText(formatarHora.format(data));
          
          
          if (resposta == JOptionPane.YES_OPTION){
            mod.setId_Aluno(Integer.parseInt(jTextFieldId.getText()));
            mod.setMatricula_Aluno(jTextFieldMatricula.getText());
            mod.setNome_Aluno(jTextFieldNome.getText());
            mod.setTipo((String)jComboBoxTipo.getSelectedItem());
            mod.setPlaca(jTextFieldPlaca.getText());
            mod.setVeiculo((String) jComboBoxVeiculos.getSelectedItem());
            mod.setData(jTextFieldIdData.getText());
            mod.setHorario_entrada(jTextFieldIdHorarioEntrada.getText());
            mod.setHoraio_saida(jTextFieldIdHorarioSaida.getText());
            mod.setSetor((String)jComboBoxBloco.getSelectedItem());
            
            //chamando metodo editar
            cont.Editar(mod);
              
             if("Moto".equals(jComboBoxVeiculos.getSelectedItem().toString().replaceAll("\t",""))){
                if("Professor".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))||"Funcionario".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))){
                    modvagas.setVagaEspeciais(Integer.parseInt(VagasEspeciais.getText())+1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaEspeciais(modvagas);
                preencherVagas();
                }else{
                     modvagas.setVagaMoto(Integer.parseInt(VagasMotos.getText())+1);
                     modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                     qtdVagas.QTDVagaMoto(modvagas);
                     preencherVagas();
                }
            }
            else if("Carro".equals(jComboBoxVeiculos.getSelectedItem().toString().replaceAll("\t",""))){
               if("Professor".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))||"Funcionario".equals(jComboBoxTipo.getSelectedItem().toString().replaceAll("\t",""))){
                    modvagas.setVagaEspeciais(Integer.parseInt(VagasEspeciais.getText())+1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaEspeciais(modvagas);
                    preencherVagas();
               }else{
                    modvagas.setVagaGerais(Integer.parseInt(VagasGerais.getText())+1);
                    modvagas.setSetor((String)jComboBoxBloco.getSelectedItem()); 
                    qtdVagas.QTDvagaCarro(modvagas);
                    preencherVagas();
                 }
            }
          }
           flag = 2;
           
           jTextFieldIdHorarioSaida.setText(formatarHora.format(data));
           jComboBoxVeiculos.setEnabled(false);
           jButtonCancelar.setEnabled(true);
           jButtonEditarAluno.setEnabled(false);
           jButtonExcluiraluno.setEnabled(false);
           jButtonSalvarAluno.setEnabled(true);
           jButtonNovoAluno.setEnabled(false);
           jTextFieldMatricula.setEnabled(false);
           jTextFieldNome.setEnabled(false);
           jTextFieldPlaca.setEnabled(false);
           jComboBoxTipo.setEnabled(false);
           jComboBoxBloco.setEnabled(false);
           jComboBoxVeiculos.setEnabled(false);
          }    
    }//GEN-LAST:event_jButtonSaidaActionPerformed

    private void jTextFieldIdHorarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdHorarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdHorarioEntradaActionPerformed

    private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
          
        //pasando dados da tabela para os campos
        String nome_Aluno= ""+jTableAluno.getValueAt(jTableAluno.getSelectedRow(),2);
           conec.conexao();
           conec.executasql("select  \"Id_aluno\", \"matricula_Aluno\", \"Nome_Aluno\",\"Placa_Aluno\", \"veiculo\", \"data\", \"horario_entrada\", \"horario_saida\", \"setor\", \"tipo\" from aluno where \"Nome_Aluno\" = '"+ nome_Aluno +"'");
        try {
            conec.rs.first();
            jTextFieldId.setText(String.valueOf(conec.rs.getInt("Id_aluno")));
            jTextFieldMatricula.setText(conec.rs.getString("matricula_Aluno"));
            jTextFieldNome.setText(conec.rs.getString("Nome_Aluno"));
            jTextFieldPlaca.setText(conec.rs.getString("placa_Aluno"));
            jComboBoxVeiculos.setSelectedItem(conec.rs.getString("veiculo").replaceAll(" ","").trim());
            jTextFieldIdHorarioEntrada.setText(conec.rs.getString("horario_entrada"));
            jTextFieldIdHorarioSaida.setText(conec.rs.getString("horario_saida").trim());
            jTextFieldIdData.setText(conec.rs.getString("data"));
            jComboBoxBloco.setSelectedItem(conec.rs.getString("setor").toString().replaceAll("\t","").trim());
            jComboBoxTipo.setSelectedItem(conec.rs.getString("tipo").toString().replaceAll("\t","").trim());
              
                        
            jButtonExcluiraluno.setEnabled(true);
            jButtonSalvarAluno.setEnabled(true);
            jButtonEditarAluno.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(FormAreaTrabalho.class.getName()).log(Level.SEVERE, null, ex);
        }  
           conec.desconecta();
    }//GEN-LAST:event_jTableAlunoMouseClicked

    private void VagasEspeciaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VagasEspeciaisActionPerformed
 
    }//GEN-LAST:event_VagasEspeciaisActionPerformed

    private void VagasMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VagasMotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VagasMotosActionPerformed

    private void VagasGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VagasGeraisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VagasGeraisActionPerformed

    private void jTextFieldIdDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdDataActionPerformed

    private void jComboBoxBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBlocoActionPerformed

    private void jComboBoxVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVeiculosActionPerformed

    private void jComboBoxBlocoSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBlocoSetorActionPerformed
       preencherVagas();      
    }//GEN-LAST:event_jComboBoxBlocoSetorActionPerformed

    private void jButtonCadastrarOcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarOcoActionPerformed
        FormCadastroOcorrencia tela = new FormCadastroOcorrencia();
        tela.setVisible(true);  
    }//GEN-LAST:event_jButtonCadastrarOcoActionPerformed

    private void vagasEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vagasEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vagasEventoActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jButtonbuscarmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarmatriculaActionPerformed
         try {
            conec.conexao();
            conec.executasql("select * from estacionamento where \"est_matricula\" = '"+ jTextFieldMatricula.getText() +"'");
            conec.rs.first();
            conec.desconecta();

            if(conec.rs.getString("est_matricula").replace(" ","").equals(jTextFieldMatricula.getText())){
              modEstacionamento.setPesquisa(jTextFieldMatricula.getText());
              ModeloUsuarioEstacionamento model = daoEstacionamento.buscaUsuarioMatricula(modEstacionamento);
           
              jComboBoxTipo.setSelectedItem(model.getTipoUsuarioEstacionamento().trim());
              jTextFieldId.setText(String.valueOf(model.getIdEstacionamento()));
              jTextFieldMatricula.setText(model.getMatricula());
              jTextFieldNome.setText(model.getNome());
               
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuario nao cadastrado de entrada como visitante");
                jButtonbuscarmatricula.setEnabled(false);
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuario nao cadastrado de entrada como visitante");
        }
    }//GEN-LAST:event_jButtonbuscarmatriculaActionPerformed

    private void jTextFieldIdHorarioSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdHorarioSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdHorarioSaidaActionPerformed

    //metodos para preencher minhas vagas
    public void preencherVagas(){
      
        String setor = (String) jComboBoxBlocoSetor.getSelectedItem();
        ModeloVagas model = qtdVagas.buscaVagas(setor);     
        ModeloEvento modevento = vagaEvento.buscaEventoSetor(setor);
        
       int qtdVagasEventos = model.getVagaGerais()- modevento.getQtdVagas();
             
             jTextFieldId.setText(String.valueOf(model.getId_vaga()));
             VagasEspeciais.setText(String.valueOf(model.getVagaEspeciais()));
             VagasGerais.setText(String.valueOf(qtdVagasEventos));
             VagasMotos.setText(String.valueOf(model.getVagaMoto()));
             vagasEvento.setText("");       
             
        if(model.getSetor().toString().toUpperCase().replaceAll("\t","").equals(modevento.getSetor().toString().toUpperCase().replaceAll("\t",""))){
              vagasEvento.setText(String.valueOf(modevento.getQtdVagas()));
        }
        else{
              vagasEvento.setText("");
        }
         if(formatarDate.format(data).equals(modevento.getDataInicial())){
        } 
    }
    //Criando tabela
    public void preencherTabela(String Sql){
        
            ModeloTabela modelo = tabela.preencherTabelaAluno(Sql);  
            jTableAluno.setModel(modelo);
            jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(33);
            jTableAluno.getColumnModel().getColumn(0).setResizable(false);
            jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTableAluno.getColumnModel().getColumn(1).setResizable(false);      
            jTableAluno.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTableAluno.getColumnModel().getColumn(2).setResizable(false);
            jTableAluno.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTableAluno.getColumnModel().getColumn(3).setResizable(false);
            jTableAluno.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTableAluno.getColumnModel().getColumn(4).setResizable(false);
            jTableAluno.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTableAluno.getColumnModel().getColumn(5).setResizable(false);
            jTableAluno.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableAluno.getColumnModel().getColumn(6).setResizable(false);
            jTableAluno.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableAluno.getColumnModel().getColumn(7).setResizable(false);
            jTableAluno.getColumnModel().getColumn(8).setPreferredWidth(90);
            jTableAluno.getColumnModel().getColumn(8).setResizable(false);
            jTableAluno.getColumnModel().getColumn(9).setPreferredWidth(90);
            jTableAluno.getColumnModel().getColumn(9).setResizable(false);
            
            jTableAluno.getTableHeader().setReorderingAllowed(false);
            jTableAluno.setAutoResizeMode(jTableAluno.AUTO_RESIZE_OFF);
            jTableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
  
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
            java.util.logging.Logger.getLogger(FormAreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAreaTrabalho().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VagasEspeciais;
    private javax.swing.JTextField VagasGerais;
    private javax.swing.JTextField VagasMotos;
    private javax.swing.JButton jButtonCadastrarOco;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditarAluno;
    private javax.swing.JButton jButtonExcluiraluno;
    private javax.swing.JButton jButtonNovoAluno;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSaida;
    private javax.swing.JButton jButtonSalvarAluno;
    private javax.swing.JButton jButtonbuscarmatricula;
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JComboBox<String> jComboBoxBlocoSetor;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdData;
    private javax.swing.JTextField jTextFieldIdHorarioEntrada;
    private javax.swing.JTextField jTextFieldIdHorarioSaida;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField r;
    private javax.swing.JTextField vagasEvento;
    // End of variables declaration//GEN-END:variables

}
