package principal;
import java.util.Scanner;
import java.util.ArrayList;

public class Consultante {
   private String[] delegaciones = { "Azcapotzalco", "Alvaro Obregon", "Benito Juarez", "Coyoacan",
         "Cuajimalpa de Morelos", "Cuauhtemoc", "Gustavo A. Madero", "Iztacalco", "Iztapalapa", "Magdalena Contreras",
         "Miguel Hidalgo", "Milpa Alta", "Tlalpan", "Tlahuac", "Venustiano Carranza", "Xochimilco" };
   private String nombreu, id;
   private int edad, numdelegacion;
   int prenda, tela;
   public double totalfin;
   char s;
   boolean valnumero = false;
   Scanner in;
   SoloLetras soloLetras = new SoloLetras();

   public void Registro() {
      in = new Scanner(System.in);
      do {
         System.out.println("Ingresa tu nombre");
         nombreu = in.nextLine();
         valnumero = soloLetras.esSoloLetras(nombreu);
      } while (valnumero);
      System.out.println("Ingresa tu edad");
      try
      {
         edad = in.nextInt();
      } catch (Exception e) {
         System.out.println("Solo numeros");
         in.nextLine();
      }
      System.out.println("Elije tu delegacion conforme a la siguiente lista");
      for (int i = 0; i < delegaciones.length; i++) {
         System.out.println((i + 1) + ".-" + delegaciones[i]);
      }
      numdelegacion = in.nextInt();
   }

   public Consultante() {
   }
   public Consultante(String nombreu, int edad, int numdelegacion, String id, double totalfin) {
      this.nombreu = nombreu;
      this.edad = edad;
      this.numdelegacion = numdelegacion;
      this.id = id;
      this.totalfin = totalfin;
   }

   public String GetNombreu() {
      return nombreu;
   }

   public void setNombreu(String nombreu) {
      this.nombreu = nombreu;
   }

   public void SetEdad(int edad) {
      this.edad = edad;
   }

   public int GetEdad() {
      return edad;
   }
   
   public void SetDelegaciones() {
      this.delegaciones[numdelegacion] = delegaciones[numdelegacion];
   }

   public String GetDelegaciones(int numdelegacion) {
      return delegaciones[numdelegacion];
   }

   public void SetID(String id){
      this.id = id;
   }
   public String GetID(){
      return id;
   }
   public double getTotalfin(){
      return totalfin;
}
   public void setTotalfin(){
      this.totalfin = totalfin;
}
}