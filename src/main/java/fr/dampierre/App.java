package fr.dampierre;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre salaire horaire : ");
    int salaireHoraire = clavier.nextInt();
    System.out.print("Entrez vos heures travaillees : ");
    int heuresTravaillees = clavier.nextInt();
    int salaireBrut = salaireHoraire * heuresTravaillees;
    System.out.println("Le salaire brut est de : " + salaireBrut);
  }
}
