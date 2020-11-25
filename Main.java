class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar();
    
    tree.setShape("tree");
    tree.setNumC(10);
    tree.cutOut();

    tree.Bake(350, 12);
    tree.Decorate();
    Sugar aCookie = new Sugar();
    aCookie.Decorate();
  }
}