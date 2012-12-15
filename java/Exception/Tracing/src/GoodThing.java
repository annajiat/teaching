public class GoodThing{
  public static void goodMethod(Object o) throws Exception{
    try{
      ((BadThing)o).badMethod();
    }catch(ParentException p){
      System.out.println("goodThing: "+p);
      throw p;
    }catch(Exception e){
      throw(e);
    }
  }
  public static void main(String[]args){
    int i=0;
    for(i=8;i<24;i+=3){
      try{
        goodMethod(new BadThing(i));
      }catch(ChildException p){
        System.out.println("main: "+p);
      }catch(RuntimeException e){
        System.out.println("Main RuntimeException");
      }catch(Exception e){
        System.out.println("Main Exception");
      }
    }
    
  }
}