package Principal;
import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {
    
public static void main (String[] args){
Circulo tril = new Circulo();
tril.setRaio (Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo")));

        JOptionPane.showMessageDialog(null, "A area do circulo é " + tril.getArea());
}
}