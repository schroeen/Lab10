class Sugar extends Cookie{
  public String shape;
  public boolean decor;

  //Constructors
  Sugar(){
    shape="";
    decor= false;
  }
  Sugar(String aShape, boolean aDecor){
    shape=aShape;
    decor=aDecor;
  }

  String getShape(){
    return shape;
  }
  void setShape(String aShape) {
    shape = aShape;
  }


  void cutOut() {
    
    System.out.println(numC+ " were cut into "+shape);
  }

  void Decorate(){
    if(isReady=true){
      System.out.println("The cookies were decorated");
    }
    else{
      System.out.println("Make sure to bake the cookies first");
    }
  }
}