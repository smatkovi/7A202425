
/**
 * Beschreiben Sie hier die Klasse Complex.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Complex
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
  private double re;
  private double im;
  
  public Complex()
    {
      re = 0;
      im = 0;
    }
  
  public Complex(double r, double j)
    {
        re = r;
        im = j;
    }
  
  public double getRe()
    {
      return re;
    }
    
  public double getIm()
    {
      return im;
    }
    
  public void setRe(double a)
    {
      re = a;
    }
    
  public void setIm(double b)
    {
      im = b;
    }
    
  public void add(Complex z_two) //hat kein argument und setzt immer re auf 0
    {
      this.re = this.re + z_two.getRe(); 
      this.im += z_two.getIm();  
    }  
    
  public Complex mult(Complex z_two) //hat kein argument und setzt immer re auf 0
    {
      double reRes = this.re*z_two.getRe() - this.im*z_two.getIm(); 
      double imRes = this.re*z_two.getIm() + this.im*z_two.getRe(); 
      return new Complex(reRes, imRes);
    }  
                      
}
