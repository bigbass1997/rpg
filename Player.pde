class Player {
  PImage walk;
  PImage spriteSheet;


  //36h, 26w
  public Player(String file, int walkX, int walkY){
      spriteSheet = loadImage(file);
      walk = createImage(walkX, walkY, ARGB);
      walk.copy(spriteSheet, 0,0,walkX, walkY, 0, 0, walkX, walkY);

  }

  void display(){
    image(walk, width/2, height/2);
  }

}
