import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BACKUP {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Linha108\\Desktop\\marcos antonio\\rs codigo\\codigo e imagem\\sinpetra.png");
String nomeb = (String) JOptionPane.showInputDialog(null, "Qual a data das pastas?", " Central de Controle e Monitoramento", JOptionPane.QUESTION_MESSAGE, icon, null, null);
        
        String input = (String) JOptionPane.showInputDialog(null, "Quantas ocorrências?", "Central de Controle e Monitoramento", JOptionPane.QUESTION_MESSAGE, icon, null, null);
        int npastas;
        while (true) {
            try {
                npastas = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: entrada inválida. Por favor, digite um número.");
                input = (String) JOptionPane.showInputDialog(null, "Quantas ocorrências?" , "Central de Controle e Monitoramento", JOptionPane.QUESTION_MESSAGE, icon, null, null); 
            }
        }

        String caps = (String) JOptionPane.showInputDialog(null, "CAP ", "Central de Controle e Monitoramento", JOptionPane.QUESTION_MESSAGE, icon, null, null);
        String end = "C:\\Users\\Linha108\\Desktop\\marcos antonio\\rs codigo\\pastas do backup";

        File dirBase = new File(end);

        if (!dirBase.exists()) {
            dirBase.mkdirs();
        }

        for (int i = 1; i <= npastas; i++) {
            String nomedapasta = nomeb + " - " + i + " - CAP " + caps;
            File pasta = new File(dirBase, nomedapasta);

            if (pasta.mkdir()) {
                System.out.println("deu certo" + pasta.getAbsolutePath());
            } else {
                System.out.println("deu merda criando" + pasta.getAbsolutePath());
            }
        }
    }
}