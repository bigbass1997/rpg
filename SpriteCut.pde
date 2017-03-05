static class SpriteCut {
  
  static ArrayList<PImage> cut(PImage spriteSheet, int xStart, int yStart, int imgHeight,  int imgWidth){
    ArrayList<PImage> imageArray = new ArrayList<PImage>();
    
    for(int i = 1; i < (int)spriteSheet.width / imgWidth; i++){
      PImage temp = spriteSheet.get(xStart, yStart, imgWidth * i, imgHeight);
      imageArray.add(temp);
    }
    
    return imageArray;
  }
}