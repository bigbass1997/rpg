import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import SpriteCut; 

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

player = new Player("data/ninja_m.png");
background(0);
}

public void draw(){
  player.display();
}


class Player {

  PImage walk;
  PImage spriteSheet;
          //   h    w1 w2  w3
  ArrayList<PImage> walk_left;

  //36h, 26w
  public Player(String file){
      spriteSheet = loadImage(file);
      //
      // walk = createImage(walk_left[1], walk_left[0], ARGB);
      //       // src          sx1 sy1   sx2           sy2
      // walk.copy(spriteSheet, 0, 0, walk_left[1], walk_left[0], 0, 0, walkX, walkY);

      walk_left = SpriteCut.cut(spriteSheet, 0, 0, 36,  26);

  }

  public void display(){
    image(walk_left[0], width/2, height/2);
  }

}
class SpriteCut {

  public static cut(PImage spriteSheet, int xStart, int yStart, int imgHeight,  int imgWidth){
    ArrayList<PImage> imageArray = new ArrayList<PImage>();

    for(int i = 1; i < (int)spriteSheet.width / imgWidth; i++){
      PImage temp = spriteSheet.get(xStart, yStart, imgWidth * i, imgHeight);
      imageArray.push(temp);
    }

    return imageArray;

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
