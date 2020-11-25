class Cookie {
  public int numC;
  public double tempC;
  public int timeC;
  public boolean isReady;


  Cookie(){
    numC= 0;
    tempC= 0.0;
    timeC= 0;
    isReady= false;
  }
  Cookie(int aNumC, double aTempC, int aTimeC, boolean aIsReady){
    numC= aNumC;
    tempC= aTempC;
    timeC= aTimeC;
    isReady= aIsReady;
  }
  boolean getIsReady(){
    return isReady;
  }
  void setNumC(int aNumC) {
    numC = aNumC;
  }

  void Bake(double aTempC, int aTimeC){
    System.out.println(numC+" cookies were baked at "+aTempC+" degrees F for "+aTimeC+" minutes");

    isReady=true;
  }
}