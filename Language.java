/*
This program tells users interesting info about certain languages
Created by Emma on March 6th, 2020
Intermediate Programming - Block 8
*/
//defines class
class Language {
  //fields
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  //constructor
  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }
  //to show info about a language
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + "." );
    System.out.println("The language follows the word order: " + this.wordOrder + ". \n");
  }
  public static void main(String[] args) {
    //new language
    Language highValyrian = new Language("High Valyrian", 822000, "Essos", "subject-object-verb");
    highValyrian.getInfo();
    //new Mayan language
    Language yucatec = new Mayan("Yucatec", 812633);
    yucatec.getInfo();
    Language kinnauri = new SinoTibetan("Kinnauri", 84000);
    kinnauri.getInfo();
    Language archaicChinese = new SinoTibetan("Archaic Chinese", 0);
    archaicChinese.getInfo();
  }
}
