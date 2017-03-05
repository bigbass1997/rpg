Player player;



void setup(){
size(800,800);
player = new Player("data/ninja_m.png", 26, 36);
background(0);
}

void draw(){
  player.display();
}
