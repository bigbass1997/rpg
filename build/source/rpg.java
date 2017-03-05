import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class rpg extends PApplet {

Player player;



public void setup(){

player = new Player("data/ninja_m.png", 26, 36);
background(0);
}

public void draw(){
  player.display();
}
class Player {
  PImage walk;
  PImage spriteSheet;


  //36h, 26w
  public Player(String file, int walkX, int walkY){
      spriteSheet = loadImage(file);
      walk = createImage(walkX, walkY, ARGB);
      walk.copy(spriteSheet, 0,0,walkX, walkY, 0, 0, walkX, walkY);

  }

  public void display(){
    image(walk, width/2, height/2);
  }

}
  public void settings() { 
size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "rpg" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
