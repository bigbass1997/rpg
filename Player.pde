import SpriteCut;

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

  void display(){
    image(walk_left[0], width/2, height/2);
  }

}
